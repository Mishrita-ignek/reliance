package rinfra.agm.video.portlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.ProcessAction;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.captcha.CaptchaException;
import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletConfig;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import rinfra.agm.video.constants.RinfraAgmVideoPortletKeys;
import rinfra.share.holders.doc.model.ShareHolders;
import rinfra.share.holders.doc.service.ShareHoldersLocalServiceUtil;

/**
 * @author CBT151521
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=rinfra-agm-video Portlet", "javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + RinfraAgmVideoPortletKeys.RinfraAgmVideo, "javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class RinfraAgmVideoPortlet extends MVCPortlet {

	private static Log log = LogFactoryUtil.getLog(RinfraAgmVideoPortlet.class);

	@ProcessAction(name = "rinfraShareHolder")
	public void getRinfraShareHolder(ActionRequest actionRequest, ActionResponse actionResponse) {
		try {

			String flag = "N";
			String folioNo = ParamUtil.getString(actionRequest, "searchInputParam");
			actionRequest.setAttribute("searchInputParam", folioNo);
			log.info("searchInputParam----------" + folioNo);
			ShareHolders shareHolders = (ShareHolders) ShareHoldersLocalServiceUtil.getShareHolders(folioNo);
			String no = shareHolders.getFOLIO_NO();
			log.info("holders.getFOLIO_NO()----------" + no);
			if (folioNo.equals(no)) {

				flag = "Y";
			}
			actionRequest.setAttribute("flag", flag);
			actionResponse.setRenderParameter("mvcPath", "/view.jsp");
		} catch (Exception e) {
			log.info("getRinfraShareHolder - Captcha Exception " + e);
			SessionErrors.add(actionRequest, "folio.not.valid");

			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, ((LiferayPortletConfig) portletConfig).getPortletId() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		}
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(actionRequest, ((LiferayPortletConfig) portletConfig).getPortletId() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	@ProcessAction(name = "logout")
	public void userLogout(ActionRequest actionRequest, ActionResponse actionResponse) {

		log.info("logout");
		PortletSession portletSession = actionRequest.getPortletSession();
		portletSession.invalidate();

		actionResponse.setRenderParameter("mvcPath", "/view.jsp");

	}

	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {

		/*try {
			CaptchaUtil.serveImage(resourceRequest, resourceResponse);
			log.info("captcha loaded...");
		} catch (Exception e) {
			log.info("RinfraShareDocPortlet captcha - "+e.getMessage());
		}*/
		
		String folioNo = ParamUtil.getString(resourceRequest, "searchInputParam");
		log.info("searchInputParam----------" + folioNo);
		ShareHolders shareHolders = null;
		PrintWriter out1 = resourceResponse.getWriter();
		JSONObject json = JSONFactoryUtil.createJSONObject();
		String flag = "N";
		if (Validator.isNotNull(folioNo)) {
			try {
				shareHolders = (ShareHolders) ShareHoldersLocalServiceUtil.getShareHolders(folioNo);
				log.info("shareHolders----------" + shareHolders);
				if (Validator.isNotNull(shareHolders)) {
					String no = shareHolders.getFOLIO_NO();
					log.info("holders.getFOLIO_NO()----------" + no);
					if (folioNo.equals(no)) {
						flag = "Y";
					}
				}
				
				log.info("flag----------" + flag);
				json.put("flag", flag);
				log.info("flag");
				out1.write(json.toString());
				out1.flush();
			} catch (Exception e) {
				json.put("flag", flag);
				log.info("flag");
				out1.write(json.toString());
				out1.flush();
				log.info("getRinfraShareHolder - Exception " + e);
				SessionErrors.add(resourceRequest, "folio.not.valid");
				PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
				SessionMessages.add(resourceRequest, ((LiferayPortletConfig) portletConfig).getPortletId() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			}
		}
		super.serveResource(resourceRequest, resourceResponse);
	}

}