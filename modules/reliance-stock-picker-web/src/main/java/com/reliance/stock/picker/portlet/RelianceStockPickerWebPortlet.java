package com.reliance.stock.picker.portlet;

import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.reliance.stock.picker.cache.SimpleCache;
import com.reliance.stock.picker.constants.RelianceStockPickerWebPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import javax.portlet.*;
import com.reliance.stock.picker.preferences.RelianceStockPickerConfiguration;
import com.reliance.stock.picker.util.StockFormatterUtil;
import okhttp3.*;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import java.io.IOException;
import java.util.Map;

/**
 * @author ignek
 */
@Component(
	immediate = true,
			property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=RelianceStockPickerWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + RelianceStockPickerWebPortletKeys.RELIANCESTOCKPICKERWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)

public class RelianceStockPickerWebPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		PortletPreferences preferences = renderRequest.getPreferences();
		String symbol = preferences.getValue("symbol", "");
		String keyPrefix = symbol + "_";
		String currentPrice = SimpleCache.get(keyPrefix+"currentStockPrice");

		_log.info("currentPrice: "+currentPrice);

		if (Validator.isNotNull(currentPrice)) {
			String change = SimpleCache.get(keyPrefix+"change");
			String percent_change = SimpleCache.get(keyPrefix+"percentChange");
			String direction = SimpleCache.get(keyPrefix+"direction");

			_log.info("Using cached currentPrice: " + currentPrice);

			renderRequest.setAttribute("stockPrice", currentPrice);
			renderRequest.setAttribute("change", change);
			renderRequest.setAttribute("percentChange", percent_change);
			renderRequest.setAttribute("direction", direction);

		} else {
			try {
				String fetchedPriceDetails = getStockData(symbol);

				if (Validator.isNotNull(fetchedPriceDetails)) {

					JSONObject stockDataJson = JSONFactoryUtil.createJSONObject(fetchedPriceDetails);
					String price = stockDataJson.getString("price");
					String price_change = stockDataJson.getString("change");
					String percentChange = stockDataJson.getString("percent_change");

					String formattedPrice = String.format("%.2f", Double.parseDouble(price));
					String formattedPercentChange = String.format("%.2f", Double.parseDouble(percentChange));
					String formattedChange = String.format("%.2f", Double.parseDouble(price_change));

					String direction = StockFormatterUtil.detectDirection(price_change);

					renderRequest.setAttribute("stockPrice", formattedPrice);
					renderRequest.setAttribute("change", formattedChange);
					renderRequest.setAttribute("percentChange", formattedPercentChange);
					renderRequest.setAttribute("direction", direction);

					// Update caches
					SimpleCache.put(keyPrefix + "currentStockPrice", formattedPrice, 60 * 1000);
					SimpleCache.put(keyPrefix + "change", formattedChange, 60 * 1000);
					SimpleCache.put(keyPrefix + "percentChange", formattedPercentChange, 60 * 1000); // 1 min
					SimpleCache.put(keyPrefix + "direction", direction, 60 * 1000); // 1 min

				}
			} catch (Exception e) {
				_log.error("Unable to fetch stock data", e);
			}
		}

		super.render(renderRequest, renderResponse);
	}

	@Activate
	@Modified
	protected void activate(Map<String, Object> properties) {
		relianceStockPickerConfiguration = ConfigurableUtil.createConfigurable(RelianceStockPickerConfiguration.class, properties);
	}

	public static String getStockData(String symbol) throws JSONException, IOException {
		if (_log.isDebugEnabled()) {
			_log.debug("Fetching stock data for symbol: " + symbol);
		}

		OkHttpClient client = new OkHttpClient();
		String priceUrl = "https://api.twelvedata.com/price?symbol=" + symbol + "&apikey=318c9270521c4ccbb3ed66311748b6c4";
		Request priceRequest = new Request.Builder()
				.url(priceUrl)
				.get()
				.build();
		String currentPriceStr;
		try (Response response = client.newCall(priceRequest).execute()) {
			if (!response.isSuccessful() || response.body() == null) {
				throw new IOException("Failed to fetch price: " + response.code());
			}
			JSONObject priceJson = JSONFactoryUtil.createJSONObject(response.body().string());
			currentPriceStr = priceJson.getString("price");
		}

		String quoteUrl = "https://api.twelvedata.com/quote?symbol=" + symbol + "&apikey=318c9270521c4ccbb3ed66311748b6c4";
		Request quoteRequest = new Request.Builder().url(quoteUrl).get().build();

		String previousCloseStr;
		try (Response response = client.newCall(quoteRequest).execute()) {
			if (!response.isSuccessful() || response.body() == null) {
				throw new IOException("Failed to fetch quote: " + response.code());
			}
			JSONObject quoteJson = JSONFactoryUtil.createJSONObject(response.body().string());
			previousCloseStr = quoteJson.getString("close");

			double currentPrice = Double.parseDouble(currentPriceStr);
			double previousClose = Double.parseDouble(previousCloseStr);
			double change = currentPrice - previousClose;
			double percentChange = (change / previousClose) * 100;

			JSONObject result = JSONFactoryUtil.createJSONObject();
			result.put("price", currentPriceStr);
			result.put("change", String.format("%.2f", change));
			result.put("percent_change", String.format("%.2f", percentChange));

			return result.toString();
		} catch (IOException | JSONException e) {
			_log.error("Error fetching stock data", e);
			throw e;
		}
	}

	private volatile RelianceStockPickerConfiguration relianceStockPickerConfiguration;
	private static final Log _log = LogFactoryUtil.getLog(RelianceStockPickerWebPortlet.class);

}