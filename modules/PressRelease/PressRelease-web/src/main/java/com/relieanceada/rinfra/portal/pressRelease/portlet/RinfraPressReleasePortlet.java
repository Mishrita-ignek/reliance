package com.relieanceada.rinfra.portal.pressRelease.portlet;

 import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.relieanceada.rinfra.portal.pressRelease.model.PressRelease;
import com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalService;
import com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalServiceUtil;

/**
 * @author VIPIN SINGH
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PressRelease-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RinfraPressReleasePortlet extends MVCPortlet {
 private final Log _log = LogFactoryUtil.getLog(RinfraPressReleasePortlet.class);
	 
	 @Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		 _log.info("RinfraPressReleasePortlet.render()");
		  List<String> newsYearList=_pressReleaseLocalService.getNewsYearList();
		  System.out.println(newsYearList);
		  System.out.println(newsYearList.get(0));
		  renderRequest.setAttribute("NewsYearList", newsYearList);
		  super.render(renderRequest, renderResponse);
	}
	 
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		String selectedNewsYear = ParamUtil.getString(resourceRequest, "selectedNewsYear");
	    this._log.info("ServeResource called for News Year:: ::  " + selectedNewsYear);
	    List<PressRelease> pressReleaseList=PressReleaseLocalServiceUtil.findByselectedNewsYear(selectedNewsYear);
	    this._log.info("ServeResource pressReleaseList:: ::  " + pressReleaseList);
	    ThemeDisplay themeDisplay = (ThemeDisplay)resourceRequest.getAttribute("LIFERAY_SHARED_THEME_DISPLAY");
	    //pressReleaseList = PressReleasePortletUtil.generateDownloadURL(pressReleaseList, themeDisplay);
	    resourceRequest.setAttribute("pressReleaseList", pressReleaseList);
	    PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/pressRelease.jsp");
	    dispatcher.include(resourceRequest, resourceResponse);
		super.serveResource(resourceRequest, resourceResponse);
	}
	 
	 
@Reference(cardinality=ReferenceCardinality.MANDATORY)
protected PressReleaseLocalService _pressReleaseLocalService;
 
}