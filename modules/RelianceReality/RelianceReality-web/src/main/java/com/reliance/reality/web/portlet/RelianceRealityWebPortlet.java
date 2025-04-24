package com.reliance.reality.web.portlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.reliance.reality.model.RealityPropertyMaster;
import com.reliance.reality.model.RelianceReality;
import com.reliance.reality.service.RealityPropertyMasterLocalServiceUtil;
import com.reliance.reality.service.RelianceRealityLocalServiceUtil;

/**
 * @author BO00136
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true", "javax.portlet.display-name=RelianceReality-web Portlet",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class RelianceRealityWebPortlet extends MVCPortlet {
	private final Log log = LogFactoryUtil.getLog(RelianceRealityWebPortlet.class);

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		Set<String> city = RealityPropertyMasterLocalServiceUtil.getCity();
		renderRequest.setAttribute("city", city);
		super.render(renderRequest, renderResponse);
	}

	@ProcessAction(name = "register")
	public void register(ActionRequest actionRequest, ActionResponse actionResponse) {
		String result = "";
		String existCandidate = null;

		String city = ParamUtil.getString(actionRequest, "city");
		String email = ParamUtil.getString(actionRequest, "email");
		String days = ParamUtil.getString(actionRequest, "days");
		String empcode = actionRequest.getParameter("empcode");
		String mobNumber = actionRequest.getParameter("mobNumberber");
		String name = actionRequest.getParameter("name");
		String companyName = actionRequest.getParameter("companyName");
		String funding = ParamUtil.getString(actionRequest, "funding");
		String[] bids = ParamUtil.getParameterValues(actionRequest, "bid");
		List<String> bid = Arrays.asList(bids);
		List<String> priceList = new ArrayList<String>();
		for (String b : bid) {
			// System.out.println("B - "+b+" | City - "+city);
			String offerPrice = ParamUtil.getString(actionRequest, "offerPrice" + b);
			System.out.println("RelianceRealityWebPortlet.register( offerPrice ) - " + offerPrice);
			priceList.add(offerPrice);
			List<RealityPropertyMaster> propertyMasterList = RealityPropertyMasterLocalServiceUtil
					.getPropertyRecord(city);
			// System.out.println(propertyMasterList);
			for (RealityPropertyMaster master : propertyMasterList) {
				// System.out.println(b.equals(""+master.getPropertyBid()));
				if (b.equals("" + master.getPropertyBid())) {
					Long caId = Long.valueOf(CounterLocalServiceUtil.increment());

					RelianceReality relianceReality = RelianceRealityLocalServiceUtil
							.createRelianceReality(caId.longValue());

					relianceReality.setCity(city);
					relianceReality.setEmail_id(email);
					relianceReality.setDays(Long.parseLong(days));
					relianceReality.setEmpcode(empcode);
					relianceReality.setMobile(mobNumber);
					relianceReality.setName(name);
					relianceReality.setGroupCompanyName(companyName);
					relianceReality.setFunding(funding);
					relianceReality.setLocation(master.getLocation());
					relianceReality.setAddress(master.getAddress());
					relianceReality.setArea(master.getArea());
					relianceReality.setType(master.getType());
					relianceReality.setGuidancePrice(Long.parseLong(master.getGuidancePrice()));
					relianceReality.setAgeOfProperty(master.getAgeOfProperty());
					relianceReality.setOfferPrice(""+offerPrice);
					relianceReality.setPropertyId("" + master.getProperty_ID());

					// System.out.println(relianceReality.toString());
					RelianceRealityLocalServiceUtil.saveRelianceRealityForm(relianceReality);
					
					sendMail(relianceReality);

				}
			}
		}
		actionResponse.setRenderParameter("mvcPath", "/thankyou.jsp");
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		String flag = resourceRequest.getParameter("flag");

		if ("checkExistRecord".equals(flag)) {
			String empCode = resourceRequest.getParameter("empcode");
			String propertyIds[] = resourceRequest.getParameterValues("bids");
			List<String> bids = Arrays.asList(propertyIds);
			List<String> property = new ArrayList<>();
			for (String propertyId : bids) {
				List<RelianceReality> list = RelianceRealityLocalServiceUtil.getExistRecord(empCode, propertyId);
				if (!list.isEmpty()) {
					property.add(propertyId);
				}
			}
		} else {

			List<RealityPropertyMaster> propertyList = new ArrayList<RealityPropertyMaster>();
			String city = ParamUtil.getString(resourceRequest, "city");
			log.info("ServeResource called for propertyList ::  " + city);
			List<RealityPropertyMaster> propertyMasterList = RealityPropertyMasterLocalServiceUtil
					.getPropertyRecord(city);
			long id = 1;
			for (RealityPropertyMaster master : propertyMasterList) {
				master.setPropertyBid(id);
				propertyList.add(master);
				id++;
			}
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute("LIFERAY_SHARED_THEME_DISPLAY");
			resourceRequest.setAttribute("realityPropertyMaster", propertyList);
			PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/cityData.jsp");
			dispatcher.include(resourceRequest, resourceResponse);
		}
		super.serveResource(resourceRequest, resourceResponse);
	}
	
	public void sendMail(RelianceReality relianceReality){
		
		
		
		//RelianceRealityLocalServiceUtil.sendMail(msg, frommailid, tomailid, subject);
	}
}