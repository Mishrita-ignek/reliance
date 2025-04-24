package com.unpaid.unclaimed.dividend.holders.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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

import com.liferay.portal.kernel.captcha.CaptchaMaxChallengesException;
import com.liferay.portal.kernel.captcha.CaptchaTextException;
import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders;
import com.unpaid.unclaimed.dividend.holders.service.UnpaidUnclaimedDevidendHoldersLocalServiceUtil;

/**
 * @author BO00136
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=UnpaidUnclaimedDividendHolders-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class UnpaidUnclaimedDividendHoldersWebPortlet extends MVCPortlet {
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.render(renderRequest, renderResponse);
	}

	@ProcessAction(name = "unpaidDividendHolders")
	public void getUnpaidDividendHolders(ActionRequest actionRequest, ActionResponse actionResponse) {
		try {
			System.out.println("getUnpaidDividendHolders");
			CaptchaUtil.check(actionRequest);
			System.out.println("Captcha verification success1::");

			String FOLIO_NO_OF_ITIES = ParamUtil.getString(actionRequest, "searchInputParam");
			actionRequest.setAttribute("searchInputParam", FOLIO_NO_OF_ITIES);
			System.out.println("searchInputParam-----2018-----" + FOLIO_NO_OF_ITIES);
			//List<UnpaidUnclaimedDevidendHolders> unpaidUnclaimedDevidendRecords = UnpaidUnclaimedDevidendHoldersLocalServiceUtil.getUnpaidUnclaimedDevidendData(FOLIO_NO_OF_ITIES);
			List<UnpaidUnclaimedDevidendHolders> unpaidUnclaimedDevidendRecords = UnpaidUnclaimedDevidendHoldersLocalServiceUtil.getUnpaidUnclaimedDevidendHolderData(FOLIO_NO_OF_ITIES);
			
			System.out.println("======2018========" + unpaidUnclaimedDevidendRecords);
			List years = new ArrayList<>();
			Double tempAmountDue = Double.valueOf(0.0D);
			String name = "";
			if ((Validator.isNotNull(unpaidUnclaimedDevidendRecords)) && (!unpaidUnclaimedDevidendRecords.isEmpty())) {
				for (UnpaidUnclaimedDevidendHolders _unpaidUnclaimedDevidends : unpaidUnclaimedDevidendRecords) {
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(_unpaidUnclaimedDevidends.getPROPOSED_DATE_TRANSFER_IPEF());
					years.add(Integer.valueOf(Integer.valueOf(calendar.get(1)).intValue() - 7));
					tempAmountDue = Double.valueOf(tempAmountDue.doubleValue() + _unpaidUnclaimedDevidends.getAMOUNT_DUE_IN_RS());
					System.out.println("Proposed Date of Transfer to IEPF :: "+ _unpaidUnclaimedDevidends.getPROPOSED_DATE_TRANSFER_IPEF());
					System.out.println("Amount due " + _unpaidUnclaimedDevidends.getAMOUNT_DUE_IN_RS());
					System.out.println("FOLIO_NO_OF_ITIES " + _unpaidUnclaimedDevidends.getFOLIO_NO_OF_ITIES());
					name = _unpaidUnclaimedDevidends.getFIRST_NAME() + " " + _unpaidUnclaimedDevidends.getMIDDLE_NAME()+ " " + _unpaidUnclaimedDevidends.getLAST_NAME();
					System.out.println("name" + name);
				}
				actionRequest.setAttribute("years", years);
				actionRequest.setAttribute("name", name);
				actionRequest.setAttribute("unpaidUnclaimedDevidendRecords", unpaidUnclaimedDevidendRecords);
				actionRequest.setAttribute("tempAmountDue", tempAmountDue);

				System.out.println("year_of_divedend" + years);
				System.out.println("due amount" + tempAmountDue);

				actionResponse.setRenderParameter("mvcPath", "/view.jsp");
			}
			System.out.println("customList " + unpaidUnclaimedDevidendRecords);
		} catch (Exception e) {
			System.out.println("UnpaidUnclaimedDividendHoldersWebPortlet.getUnpaidDividendHolders() :: Exception");
			System.out.println("UnpaidUnclaimedDividendHoldersWebPortlet Exception is : "+e);
			if (((e instanceof CaptchaTextException)) || ((e instanceof CaptchaMaxChallengesException))) {
				System.out.println("CaptchaTextException ");
				SessionErrors.add(actionRequest, e.getClass(), e);
			}
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