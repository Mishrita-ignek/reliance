package com.news.media.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.news.media.model.NewsAndMedia;
import com.news.media.service.NewsAndMediaLocalServiceUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletSession;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author BO00118
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true", "javax.portlet.display-name=NewsAndMedia Portlet",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class NewsAndMediaPortlet extends MVCPortlet {

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		System.out.println("NewsAndMediaPortlet.serveResource()");
		String flag = resourceRequest.getParameter("flag");
		String year = resourceRequest.getParameter("yeared");
		String month = resourceRequest.getParameter("monthed");
		String publication = resourceRequest.getParameter("publication");
		if ("1".equals(flag)) {
			System.out.println(year + "-" + month);
			//(HDATE,'MM/DD/YYYY') '09/%/2014'
			//String yearMonth = year + "-" + month + "-%";
			String yearMonth = month+"/%/"+year;
			List<NewsAndMedia> List = NewsAndMediaLocalServiceUtil.getPublicationList(yearMonth);
			List<String> publicationList = new ArrayList();
			Set<String> list = new HashSet();
			for (NewsAndMedia newsAndMedia : List) {
				list.add(newsAndMedia.getPUBLICATION());
			}
			publicationList.addAll(list);
			resourceRequest.setAttribute("publicationList", publicationList);
			/*
			 * PortletSession session = resourceRequest.getPortletSession();
			 * String flag = "1"; session.setAttribute("flag",flag,
			 * PortletSession.APPLICATION_SCOPE);
			 */
			PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/publicationlist.jsp");
			dispatcher.forward(resourceRequest, resourceResponse);
		} else if ("2".equals(flag)) {
			if (publication == null || publication == "" ) {
				//String yearMonth = year + "-" + month + "-%";
				String yearMonth = month+"/%/"+year;
				List<NewsAndMedia> newsList = NewsAndMediaLocalServiceUtil.getPublicationList(yearMonth);
				System.out.println("publicationList :: " + newsList);
				resourceRequest.setAttribute("newsList", newsList);
				PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/newsandmedialist.jsp");
				dispatcher.include(resourceRequest, resourceResponse);
			}else if((publication != null)) {
				System.out.println("Publicatin : " + publication);
				// String yearMonth = year + "-" + month + "-%";
				String yearMonth = month+"/%/"+year;
				List<NewsAndMedia> newsList = NewsAndMediaLocalServiceUtil.getNewsList(yearMonth, publication);
				System.out.println("publicationList :: " + newsList);
				resourceRequest.setAttribute("newsList", newsList);
				PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/newsandmedialist.jsp");
				dispatcher.include(resourceRequest, resourceResponse);
				
			}

		} else {
			System.out.println("else : " + flag);
		}
		super.serveResource(resourceRequest, resourceResponse);
	}
}