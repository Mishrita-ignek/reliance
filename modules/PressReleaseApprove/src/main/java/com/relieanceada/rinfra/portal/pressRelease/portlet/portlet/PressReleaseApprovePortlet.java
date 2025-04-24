package com.relieanceada.rinfra.portal.pressRelease.portlet.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
//import com.relieanceada.rinfra.portal.pressRelease.portlet.RinfraPressReleasePortlet;
import com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalService;
import com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalServiceUtil;
import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author BO00136
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PressReleaseApprove Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PressReleaseApprovePortlet extends MVCPortlet {
	 private final Log _log = LogFactoryUtil.getLog(PressReleaseApprovePortlet.class);
	@Reference(cardinality=ReferenceCardinality.MANDATORY)
	protected PressReleaseLocalService _pressReleaseLocalService;
	 
	
	 @Override
		public void render(RenderRequest renderRequest, RenderResponse renderResponse)
				throws IOException, PortletException {
			 _log.info("RinfraPressReleasePortlet.render()");
			  List<String> newsYearList=_pressReleaseLocalService.getNewsYearList();
			  System.out.println(newsYearList);
			  System.out.println(newsYearList.get(0));
			  List<PressRelease> pressReleaseList=PressReleaseLocalServiceUtil.getPressReleases(-1, -1);
			  _log.info("RinfraPressReleasePortlet.render()"+pressReleaseList);
			  renderRequest.setAttribute("NewsYearList", newsYearList);
			  renderRequest.setAttribute("pressReleaseList", pressReleaseList);
			  super.render(renderRequest, renderResponse);
		}
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		String selectedNewsYear = ParamUtil.getString(resourceRequest, "selectedNewsYear");
		System.out.println("selectedNewsYear==="+selectedNewsYear);
		String resourceId = resourceRequest.getResourceID();
		String approve = ParamUtil.getString(resourceRequest, "approve");
		String reject = ParamUtil.getString(resourceRequest, "reject");
		
		long pressId=0;
		String flag="";
		if (reject != "") {
			
			pressId=Long.parseLong(reject);
			flag="F";
		}
		else
		{
			pressId=Long.parseLong(approve);
			flag="T";
		}
		System.out.println("reject==="+reject);
		System.out.println("approve==="+approve);
		System.out.println("pressId==="+pressId);
		System.out.println("PressfeedportletPortlet.updatePressRelease()::start");
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
	
		
		PressRelease pressRelease=null;
		Date newsDate=new Date();
		try {
			 pressRelease=PressReleaseLocalServiceUtil.getPressRelease(pressId);
			  newsDate=pressRelease.getNewsDate();
			  System.out.println("pressRelease.getNewsDate()==="+pressRelease.getNewsDate());
			  System.out.println("newsDate==="+newsDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(pressRelease!=null){
			pressRelease.setDescription(pressRelease.getDescription());
			pressRelease.setShow(flag);
			pressRelease.setFileURL(pressRelease.getFileURL());
			pressRelease.setNewsYear(pressRelease.getNewsYear());
			pressRelease.setNewsDate(newsDate);
			pressRelease= PressReleaseLocalServiceUtil.updatePressRelease(pressRelease);
			System.out.println("data updted successfuly..");
		/*List<PressRelease> pressReleaseList=PressReleaseLocalServiceUtil.findByselectedNewsYear(selectedNewsYear);
	    ThemeDisplay themeDisplay = (ThemeDisplay)resourceRequest.getAttribute("LIFERAY_SHARED_THEME_DISPLAY");
	    //pressReleaseList = PressReleasePortletUtil.generateDownloadURL(pressReleaseList, themeDisplay);
	    resourceRequest.setAttribute("pressReleaseList", pressReleaseList);
	    PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/pressRelease.jsp");
	    dispatcher.forward(resourceRequest, resourceResponse);*/
			//String MESSAGE = "<html><body><font face='Verdana' size='2'> <br><br>The new press release has been added and sent for review & publish in website.<br><br><a href='http://localhost:8080/web/guest/demo '> Back <br><br> </body></html>";
			//resourceRequest.setAttribute("pressReleaseList", "HI");
		    PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/pressRelease.jsp");
		    dispatcher.forward(resourceRequest, resourceResponse);
		    
		//super.serveResource(resourceRequest, resourceResponse);
		    /*PrintWriter out=resourceResponse.getWriter();
		    //System.out.println(usersJsonArray.toString());
		    out.print("The new press release has been added and sent for review & publish in website.");
		   resourceResponse.getWriter().print("hi");*/
		}
}
}
