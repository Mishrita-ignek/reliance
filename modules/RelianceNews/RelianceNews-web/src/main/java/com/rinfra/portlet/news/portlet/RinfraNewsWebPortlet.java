package com.rinfra.portlet.news.portlet;

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

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.rinfra.news.model.PressNews;
import com.rinfra.news.model.PressNewsWrapper;
import com.rinfra.news.service.PressNewsLocalService;

/**
 * @author BO00136
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=RelianceNews-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RinfraNewsWebPortlet extends MVCPortlet {
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {
		renderRequest.setAttribute("years", this._pressNewsLocalService.getSetOfYear());
		super.render(renderRequest, renderResponse);
	}
	
	
	 public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			    throws IOException, PortletException
			  {
			    if ((Validator.isNotNull(resourceRequest.getResourceID())) && (resourceRequest.getResourceID().equals("fetchNewsList")))
			    {
			      int year = ParamUtil.getInteger(resourceRequest, "year");
			      int month = ParamUtil.getInteger(resourceRequest, "month");
			      ThemeDisplay themeDisplay = (ThemeDisplay)resourceRequest.getAttribute("LIFERAY_SHARED_THEME_DISPLAY");
			      if (year != -1 && month!=-1)
			      {
			    	List<PressNews> newsRoomWrappers = _pressNewsLocalService.filterNewsByYearAndMonth(year,month);
			        //RInfraNewsUtil.generateDownloadURL(newsRoomWrappers, themeDisplay);
			        resourceRequest.setAttribute("newsRoomWrappers",newsRoomWrappers );
			      }else if(month==-1)
			      {
			    	  List<PressNews> newsRoomWrappers = _pressNewsLocalService.getNewsByYear(year);
			    	 // RInfraNewsUtil.generateDownloadURL(newsRoomWrappers, themeDisplay);
			    	  resourceRequest.setAttribute("newsRoomWrappers",newsRoomWrappers );
			      }
			      PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/news_details.jsp");
			      dispatcher.include(resourceRequest, resourceResponse);
			    }
			  }
	
	
	
	@Reference(cardinality=ReferenceCardinality.MANDATORY)
	protected  PressNewsLocalService _pressNewsLocalService;	
}