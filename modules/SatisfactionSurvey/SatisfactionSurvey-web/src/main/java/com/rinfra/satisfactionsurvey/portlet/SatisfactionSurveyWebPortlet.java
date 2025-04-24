package com.rinfra.satisfactionsurvey.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.captcha.CaptchaException;
import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.rinfra.satisfactionsurvey.model.Shareholders;
import com.rinfra.satisfactionsurvey.service.ShareholdersLocalServiceUtil;
import com.rinfra.util.MailSend;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author BO00118
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true", "javax.portlet.display-name=SatisfactionSurvey-web Portlet",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class SatisfactionSurveyWebPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.render(renderRequest, renderResponse);
	}

	@ProcessAction(name = "addShareholdersSurvey")
	public void addShareholdersSurvey(ActionRequest actionRequest, ActionResponse actionResponse) {
		System.out.println("SatisfactionSurveyWebPortlet.addShareholdersSurvey()");
		try {
			int result = 0;
			long ShareholdersId = CounterLocalServiceUtil.increment();
			CaptchaUtil.check(actionRequest);
			String soleName = ParamUtil.getString(actionRequest, "firstHolder");
			Long soleID = ParamUtil.getLong(actionRequest, "folioNumber");
			Long dpIdNo = ParamUtil.getLong(actionRequest, "dpIdNo");
			Long actualId = null;
			if (soleID != null) {
				actualId = soleID;
			} else {
				actualId = dpIdNo;
			}
			Long clientIdNo = ParamUtil.getLong(actionRequest, "clientIdNo");
			Long mobileNo = ParamUtil.getLong(actionRequest, "mobileNo");
			Long telephoneNo = ParamUtil.getLong(actionRequest, "telephoneNo");
			String emailId = ParamUtil.getString(actionRequest, "emailId");
			String responce = ParamUtil.getString(actionRequest, "responce");
			String responce1 = ParamUtil.getString(actionRequest, "responce1");
			String responce2 = ParamUtil.getString(actionRequest, "responce2");
			String responce3 = ParamUtil.getString(actionRequest, "responce3");
			String GRIEVANCE = ParamUtil.getString(actionRequest, "GRIEVANCE");
			String description = ParamUtil.getString(actionRequest, "description");
			String comments = ParamUtil.getString(actionRequest, "comments");

			System.out.println("ShareholderSatisfactionWebPortlet.addShareholdersSurvey()");
			System.out.println("CAPTCHA validated successfully");

			if (soleName != null) {
				Long id=CounterLocalServiceUtil.increment();
				System.out.println("shareholders_id :: "+id);
				Shareholders shareholders = ShareholdersLocalServiceUtil.createShareholders(id);
				shareholders.setSHAREHOLDERSID(id);
				shareholders.setSOLE_NAME(soleName);
				shareholders.setSOLE_ID(actualId);
				shareholders.setID_NUMBER(clientIdNo);
				shareholders.setMOBILE(mobileNo);
				shareholders.setTELEPHONE(telephoneNo);
				shareholders.setEMAIL(emailId);
				shareholders.setQUERY_RESPONSE(responce);
				shareholders.setOVERALL_RATING(responce1);
				shareholders.setCOMP_INFORMATION(responce2);
				shareholders.setQUALITY_REPORT(responce3);
				shareholders.setDESCRIPTION(description);
				shareholders.setCOMMENTS(comments);
				shareholders.setGRIEVANCE(GRIEVANCE);
				ShareholdersLocalServiceUtil.addShareholders(shareholders);
				result = ShareholdersLocalServiceUtil.saveShareholdersSurvey(ShareholdersId, soleName, actualId,
						clientIdNo, mobileNo, telephoneNo, emailId, responce, responce1, responce2, responce3,
						GRIEVANCE, description, comments);
				System.out.println("CAPTCHA validated successfully");
				if (result == 1) {
					actionResponse.setRenderParameter("mvcPath", "/thankYou.jsp");
				}
			}
		} catch (CaptchaException e) {
			SessionErrors.add(actionRequest, "errorMessage");
		}
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		try {
			CaptchaUtil.serveImage(resourceRequest, resourceResponse);
			System.out.println("captcha loaded...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub
		super.serveResource(resourceRequest, resourceResponse);
	}
}