package com.metro.mediarelease.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.metro.mediarelease.model.MetroMediaRelease;
import com.metro.mediarelease.service.MetroMediaReleaseLocalServiceUtil;

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

/**
 * @author BO00118
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MetroMediaRelease-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MetroMediaReleaseWebPortlet extends MVCPortlet {
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
	//String yearMonth = "2017-05";
	//List<MetroMediaRelease> media =  MetroMediaReleaseLocalServiceUtil.getPublication(yearMonth);
		super.render(renderRequest, renderResponse);
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		String year = resourceRequest.getParameter("yeared");
		String month = resourceRequest.getParameter("monthed");
		System.out.println("Year : "+year +" Month : "+month);
		//'06/%/2014';
		//String yearMonth = year+"-"+month+"-%";
		String yearMonth = month+"/%/"+year;
		List<MetroMediaRelease> mediaList = MetroMediaReleaseLocalServiceUtil.getMediaRelease(yearMonth);
		System.out.println("MediaList :: "+mediaList);
		resourceRequest.setAttribute("mediaList::", mediaList);
		PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/mediaRelease.jsp");
	    dispatcher.include(resourceRequest, resourceResponse);

		super.serveResource(resourceRequest, resourceResponse);
	}
}