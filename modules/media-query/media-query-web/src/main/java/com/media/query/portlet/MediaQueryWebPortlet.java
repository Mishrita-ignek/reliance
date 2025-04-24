package com.media.query.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.media.query.constants.MediaQueryWebPortletKeys;
import com.media.query.model.MediaQuery;
import com.media.query.model.impl.MediaQueryImpl;
import com.media.query.service.MediaQueryLocalServiceUtil;

/**
 * @author CBT151521
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=media-query-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MediaQueryWebPortletKeys.MediaQueryWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MediaQueryWebPortlet extends MVCPortlet {
	
	private static final Log log = LogFactoryUtil.getLog(MediaQueryWebPortlet.class);
	
	
	@ProcessAction(name = "mediaQuery")
	public void getMediaQuery(ActionRequest actionRequest, ActionResponse actionResponse) {
		
			log.info("MediaQueryWebPortlet.getMediaQuery()");
			String result = "";
			
			String journalistName = ParamUtil.getString(actionRequest, "journalistName");
			String newsOrganisationName = ParamUtil.getString(actionRequest, "newsOrganisationName");
			String organisationType = ParamUtil.getString(actionRequest, "organisationType");
			String email = ParamUtil.getString(actionRequest, "email");
			String mobile = ParamUtil.getString(actionRequest, "mobile");
			String subject = ParamUtil.getString(actionRequest, "subject");
			String query = ParamUtil.getString(actionRequest, "mediaQuery");
			
			log.info(journalistName+"|"+newsOrganisationName+"|"+organisationType+"|"+email+"|"+mobile+"|"+subject+"|"+query);
			
			Long srNo = Long.valueOf(CounterLocalServiceUtil.increment());
			MediaQuery mediaQuery = MediaQueryLocalServiceUtil.createMediaQuery(srNo.longValue());

			mediaQuery.setJournalistName(journalistName);
			mediaQuery.setNewsOrganisationName(newsOrganisationName);
			mediaQuery.setOrganisationType(organisationType);
			mediaQuery.setEmail(email);
			mediaQuery.setMobile(mobile);
			mediaQuery.setSubject(subject);
			mediaQuery.setMediaQuery(query);
	        
	        //result = 
	        if (result == "SUCCESS")
	        {
	          actionRequest.setAttribute("successfullyRegister", "You have Successfully Registered.");
	          actionResponse.setRenderParameter("mvcPath", "/jsp/candidate_login.jsp");
	        }
	        else
	        {
	          actionResponse.setRenderParameter("mvcPath", "/jsp/error.jsp");
	        }
			
			
			
		
	}

	
}