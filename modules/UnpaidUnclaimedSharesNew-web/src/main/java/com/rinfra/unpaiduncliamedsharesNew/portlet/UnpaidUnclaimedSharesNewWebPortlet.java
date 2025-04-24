package com.rinfra.unpaiduncliamedsharesNew.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.rinfra.unpaidunclaimedshares.model.unpaidUnclaimedDevidend;
import com.rinfra.unpaidunclaimedshares.service.unpaidUnclaimedDevidendLocalServiceUtil;

/**
 * @author BO00136
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true", "javax.portlet.display-name=UnpaidUnclaimedSharesNew-web Portlet",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class UnpaidUnclaimedSharesNewWebPortlet extends MVCPortlet {
	@ProcessAction(name = "unpaidDividendHolders")
	public void getUnpaidDividendHolders(ActionRequest actionRequest, ActionResponse actionResponse) {
		try {
			String FOLIO_NO_OF_ITIES = ParamUtil.getString(actionRequest, "searchInputParam");
			actionRequest.setAttribute("searchInputParam", FOLIO_NO_OF_ITIES);
			System.out.println("searchInputParam----------" + FOLIO_NO_OF_ITIES);

			List<unpaidUnclaimedDevidend> unpaidUnclaimedDevidendRecords = unpaidUnclaimedDevidendLocalServiceUtil
					.getFolioDetailsCustomSql(FOLIO_NO_OF_ITIES);
			System.out.println("==============" + unpaidUnclaimedDevidendRecords);
			System.out.println("getUnpaidDividendHolders");
			CaptchaUtil.check(actionRequest);
			System.out.println("Captcha verification success1::");

			String addr = "";
			String name = "";
			String JT1 = null;
			String JT2 = null;
			String JT3 = null;
			String dueShareNo = "";
			if ((Validator.isNotNull(unpaidUnclaimedDevidendRecords)) && (!unpaidUnclaimedDevidendRecords.isEmpty())) {
				for (unpaidUnclaimedDevidend _unpaidUnclaimedDevidends : unpaidUnclaimedDevidendRecords) {
					addr = _unpaidUnclaimedDevidends.getADD1() + " " + _unpaidUnclaimedDevidends.getADD2() + " "
							+ _unpaidUnclaimedDevidends.getADD3() + " " + _unpaidUnclaimedDevidends.getADD4() + " "
							+ _unpaidUnclaimedDevidends.getADD4() + " " + _unpaidUnclaimedDevidends.getADD5() + " "
							+ _unpaidUnclaimedDevidends.getADD6();
					name = _unpaidUnclaimedDevidends.getNAME();
					JT1 = _unpaidUnclaimedDevidends.getJT1();
					JT2 = _unpaidUnclaimedDevidends.getJT2();
					JT3 = _unpaidUnclaimedDevidends.getJT3();
					dueShareNo = _unpaidUnclaimedDevidends.getSHARES();
				}
				actionRequest.setAttribute("addr", addr);
				actionRequest.setAttribute("name", name);
				actionRequest.setAttribute("JT1", JT1);
				actionRequest.setAttribute("JT2", JT2);
				actionRequest.setAttribute("JT3", JT3);
				actionRequest.setAttribute("dueShareNo", dueShareNo);

				actionRequest.setAttribute("unpaidUnclaimedDevidendRecords", unpaidUnclaimedDevidendRecords);

				actionResponse.setRenderParameter("mvcPath", "/view.jsp");
			}
		} catch (Exception e) {
			System.out.println("UnpaidunclaimeddividendWebPortlet.getUnpaidDividendHolders()::exception");

			System.out.println("CaptchaTextException " + e);
			SessionErrors.add(actionRequest, e.getClass(), e);
		}
	}

	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		try {
			CaptchaUtil.serveImage(resourceRequest, resourceResponse);
			System.out.println("captcha loaded...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}