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

		_log.info("keyPrefix:"+keyPrefix);

		String currentPrice = SimpleCache.get(keyPrefix+"currentStockPrice");
		String previousPrice = SimpleCache.get(keyPrefix+"previousStockPrice");
		String lastPriceDiff = SimpleCache.get(keyPrefix + "lastPriceDiff");

		_log.info("currentPrice: "+currentPrice);
		_log.info("previousPrice: "+previousPrice);

		if (Validator.isNotNull(currentPrice)) {
			_log.info("Using cached currentPrice: " + currentPrice);

			String priceDiffToUse = "same";

			if ("same".equals(getPriceDiff(previousPrice, currentPrice))) {
				if (Validator.isNotNull(lastPriceDiff)) {
					priceDiffToUse = lastPriceDiff;
				}
			} else {
				priceDiffToUse = getPriceDiff(previousPrice, currentPrice);
			}

			renderRequest.setAttribute("stockPrice", currentPrice);
			renderRequest.setAttribute("priceDiff", priceDiffToUse);
			_log.info("priceDiff"+ priceDiffToUse);


		} else {
			try {
				String fetchedPrice = getStockData(symbol);
				if (Validator.isNotNull(fetchedPrice)) {
					_log.info("Fetched new stock price: " + fetchedPrice);

					String priceDiffCalculated = getPriceDiff(previousPrice, fetchedPrice);
					String priceDiffToUse = priceDiffCalculated;

					if ("same".equals(priceDiffCalculated) && Validator.isNotNull(lastPriceDiff)) {
						priceDiffToUse = lastPriceDiff; // keep old color
					}

					renderRequest.setAttribute("stockPrice", fetchedPrice);
						renderRequest.setAttribute("priceDiff", priceDiffToUse);
					_log.info("priceDiff"+ priceDiffToUse);

					// Update caches
					SimpleCache.put(keyPrefix + "currentStockPrice", fetchedPrice, 60 * 1000); // 1 min
					if (!fetchedPrice.equals(previousPrice)) {
						SimpleCache.put(keyPrefix + "previousStockPrice", fetchedPrice, Long.MAX_VALUE); // never expire
					}

					// Cache last priceDiff for next time
					SimpleCache.put(keyPrefix + "lastPriceDiff", priceDiffToUse, Long.MAX_VALUE);
				}
			} catch (Exception e) {
				_log.error("Unable to fetch stock data", e);
			}
		}

		super.render(renderRequest, renderResponse);
	}

	private String getPriceDiff(String oldPrice, String newPrice) {
		try {
			if (Validator.isNotNull(oldPrice) && Validator.isNotNull(newPrice)) {
				double oldVal = Double.parseDouble(oldPrice);
				double newVal = Double.parseDouble(newPrice);

				if (newVal > oldVal) return "up";
				if (newVal < oldVal) return "down";
			}
		} catch (NumberFormatException e) {
			_log.warn("Invalid price comparison", e);
		}
		return "same";
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
		String url = "https://api.twelvedata.com/price?symbol=" + symbol + "&apikey=318c9270521c4ccbb3ed66311748b6c4";
		Request request = new Request.Builder()
				.url(url)
				.get()
				.build();

		try (Response response = client.newCall(request).execute()) {
			String responseString = response.body() != null ? response.body().string() : StringPool.BLANK;

			if (!response.isSuccessful()) {
				throw new IOException("Unexpected response: " + response.code() + " - " + responseString);
			}

			JSONObject jsonObject = JSONFactoryUtil.createJSONObject(responseString);
			String price = jsonObject.getString("price");


				_log.info("Fetched stock price: " + price);


			return price;
		} catch (IOException | JSONException e) {
			_log.error("Error fetching stock data", e);
			throw e;
		}
	}



	private volatile RelianceStockPickerConfiguration relianceStockPickerConfiguration;
	private static final Log _log = LogFactoryUtil.getLog(RelianceStockPickerWebPortlet.class);

}