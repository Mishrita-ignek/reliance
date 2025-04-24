package com.rinfra.share.doc.portlet;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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

import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletConfig;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.rinfra.share.doc.constants.RinfraShareDocPortletKeys;

import rinfra.share.holders.doc.model.ShareHolders;
import rinfra.share.holders.doc.model.ShareHoldersDoc;
import rinfra.share.holders.doc.service.ShareHoldersDocLocalServiceUtil;
import rinfra.share.holders.doc.service.ShareHoldersLocalServiceUtil;

/**
 * @author CBT151521
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true", "javax.portlet.display-name=rinfra-share-doc Portlet",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + RinfraShareDocPortletKeys.RinfraShareDoc,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class RinfraShareDocPortlet extends MVCPortlet {
	
	private static Log log = LogFactoryUtil.getLog(RinfraShareDocPortlet.class);
	
	@ProcessAction(name = "rinfraShareHoldersDoc")
	public void getRinfraShareHoldersDoc(ActionRequest actionRequest, ActionResponse actionResponse) {
		PortletSession session ;
		try {
			String folioNo = ParamUtil.getString(actionRequest, "searchInputParam");
			actionRequest.setAttribute("searchInputParam", folioNo);
			log.info("searchInputParam----------" + folioNo);
			
			ShareHolders shareHolders = (ShareHolders) ShareHoldersLocalServiceUtil.getShareHolders(folioNo);
			String no = shareHolders.getFOLIO_NO();
			List<ShareHoldersDoc> docList = null ;
			Set<String> heading = new LinkedHashSet<>();
			log.info("rinfra shareHolders - "+shareHolders);
			String flag = "N";
			if(folioNo.equals(no)){
				docList = ShareHoldersDocLocalServiceUtil.getShareHoldersDocs(-1, -1);
				for(ShareHoldersDoc doc : docList){
					heading.add(doc.getHeading());
				}
				//log.info("heading  - "+heading);
				log.info("docList - "+docList.size());
//				session = actionRequest.getPortletSession();
//				session.setAttribute("show","Y", PortletSession.APPLICATION_SCOPE);
//				session.setAttribute("docList", docList, PortletSession.APPLICATION_SCOPE);
				flag = "Y";
			}
			
			actionRequest.setAttribute("docList", docList);
			actionRequest.setAttribute("heading", heading);
			actionRequest.setAttribute("flag", flag);
			actionResponse.setRenderParameter("mvcPath", "/view.jsp");
		} catch (Exception e) {
			log.info("RinfraShareDocPortlet.exception - ");

			log.info("Captcha Exception " + e);
			e.printStackTrace();
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
	
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		try {
			CaptchaUtil.serveImage(resourceRequest, resourceResponse);
			log.info("captcha loaded...");
		} catch (Exception e) {
			log.info("RinfraShareDocPortlet captcha - "+e.getMessage());
		}
	}
}