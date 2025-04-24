package com.rinfra.pressfeed.portlet;

import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import com.relieanceada.rinfra.portal.pressRelease.model.PressRelease;
import com.relieanceada.rinfra.portal.pressRelease.model.impl.PressReleaseImpl;
import com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalServiceUtil;

/**
 * @author BO00136
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PressFeedPortlet Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PressfeedportletPortlet extends MVCPortlet {
	
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		super.render(renderRequest, renderResponse);
	}
	
	public void addPressRelease(ActionRequest actionRequest,ActionResponse actionResponse)throws IOException,PortletException
	{
		long pressId = CounterLocalServiceUtil.increment();
		/*String newsDate=ParamUtil.getString(request, param)*/
		String description=ParamUtil.getString(actionRequest, "description");
		String show=ParamUtil.getString(actionRequest, "show");
		String newsYear=ParamUtil.getString(actionRequest, "newsYear");
		String fileURL=ParamUtil.getString(actionRequest, "fileURL");
		System.out.println("pressId"+pressId);		
		System.out.println("description "+description);
		System.out.println("show"+show);
		System.out.println("newsYear"+newsYear);
		System.out.println("fileURL"+fileURL);
		/*DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date startDate=ParamUtil.getDate(actionRequest,"pressNewsDate", dateFormat);*/
		PressRelease pressRelease = null;
		pressRelease = PressReleaseLocalServiceUtil.createPressRelease(pressId);
		System.out.println("pressRelease"+pressRelease);
		pressRelease.setDescription(description);
		//pressRelease.setNewsDate(startDate);
		pressRelease.setShow(show);
		pressRelease.setFileURL(fileURL);
		pressRelease.setNewsYear(newsYear);
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		 Date newsDate=ParamUtil.getDate(actionRequest,"newsDate", dateFormat);
		 System.out.println("newsDate ::"+newsDate);
		System.out.println("PressfeedportletPortlet.addPressRelase()::data persisted");
		pressRelease.setNewsDate(newsDate);
		
			
		
		PressReleaseLocalServiceUtil.addPressRelease(pressRelease);
		actionResponse.setRenderParameter("mvcPath",
			    "/view.jsp");
	}
	
	public void updatePressRelease(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException,
	   PortletException, SystemException, PortalException{
		System.out.println("PressfeedportletPortlet.updatePressRelease()::start");
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		long pressId=ParamUtil.getLong(actionRequest, "pressId");
		String description=ParamUtil.getString(actionRequest, "description");
		String show=ParamUtil.getString(actionRequest, "show");
		String newsYear=ParamUtil.getString(actionRequest, "newsYear");
		String fileURL=ParamUtil.getString(actionRequest, "fileURL");
		Date newsDate=ParamUtil.getDate(actionRequest,"newsDate", dateFormat);
		PressRelease pressRelease=PressReleaseLocalServiceUtil.getPressRelease(pressId);
		if(pressRelease!=null){
			pressRelease.setDescription(description);
			pressRelease.setShow(show);
			pressRelease.setFileURL(fileURL);
			pressRelease.setNewsYear(newsYear);
			pressRelease.setNewsDate(newsDate);
			pressRelease= PressReleaseLocalServiceUtil.updatePressRelease(pressRelease);
			System.out.println("data updted successfuly..");
			actionResponse.setRenderParameter("mvcPath",
				    "/view.jsp");
		}
	}
	
}