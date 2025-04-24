package com.rinfra.pressfeed.portlet;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.relianceada.energy.portal.email.api.EmailApi;
import com.relieanceada.rinfra.portal.pressRelease.model.PressRelease;
//import com.relieanceada.rinfra.portal.pressRelease.model.impl.PressReleaseImpl;
import com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalServiceUtil;

/**
 * @author BO00136
 */
@Component(
	immediate = true,
	property = {
			"com.liferay.portlet.display-category=category.sample",
			"com.liferay.portlet.instanceable=true",
			"javax.portlet.display-name=PressFeedCreate Portlet",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/view.jsp",
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user"

	},
	service = Portlet.class
)
public class PressFeedCreatePortlet extends MVCPortlet {
	
	private EmailApi emailServiceApi;

	@Reference
	public void setEmailApi(EmailApi emailService) {
		emailServiceApi = emailService;
	}
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
		// Date newsDate=ParamUtil.getString(actionRequest, "newsYear");
		String newsDate1=ParamUtil.getString(actionRequest, "newsDate");
		System.out.println("newsDate1=="+newsDate1);
		String sDate1=newsDate1;
		Date newsdate=new Date();
		try {
			// date1=new SimpleDateFormat("YYYY-MM-dd").parse(sDate1);
			// System.out.println("date1=="+date1);
			 DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			 newsdate = (Date) formatter.parse(newsDate1);

				 System.out.println("newsdate=="+newsdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String fileURL=ParamUtil.getString(actionRequest, "fileURL");
		System.out.println("pressId"+pressId);		
		System.out.println("description "+description);
		System.out.println("show"+show);
		System.out.println("newsYear"+newsYear);
		System.out.println("newsYear"+newsDate1);
		/*DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date startDate=ParamUtil.getDate(actionRequest,"pressNewsDate", dateFormat);*/
		PressRelease pressRelease = null;
		pressRelease = PressReleaseLocalServiceUtil.createPressRelease(pressId);
		System.out.println("pressRelease"+pressRelease);
		pressRelease.setDescription(description);
		//pressRelease.setNewsDate(startDate);
		pressRelease.setShow("F");
		pressRelease.setFileURL(fileURL);
		pressRelease.setNewsYear(newsYear);
		//DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		// Date newsDate=ParamUtil.getDate(actionRequest,"newsDate", dateFormat);
		// System.out.println("newsDate ::"+newsDate);
		System.out.println("PressfeedportletPortlet.addPressRelase()::data persisted");
		pressRelease.setNewsDate(newsdate);
		PortletSession portletSession = actionRequest.getPortletSession();
		String MESSAGE = "<html><body><font face='Verdana' size='2'>A new press release has been added for review and publish in RInfra website.<br><br>Please check and approve the release to display on website. <a href='http://10.8.48.129/user/rinfrapressreview'>http://10.8.48.129/user/rinfrapressreview </a> <br><br> <br><br> <br><br> Regards.<br><br>Team Rinfra Team Care<br><br><br><br><br>Note: This is a system generated mail from Rinfra Website </body></html>";
		StringBuffer sb = new StringBuffer();

		sb.append(new StringBuilder(MESSAGE).toString());

		String message = (new StringBuilder()).append(sb.toString()).toString();
		StringWriter outputWriter = new StringWriter();
		outputWriter.write(message);
		System.out.println("PressfeedportletPortlet.MESSAGE():"+MESSAGE);
		//emailServiceApi.sendEmailWithTemplate("rel.website@relianceada.com", "sumit.panjiyar@relianceada.com", " A new press release has been added for review and publish in RInfra website", outputWriter);
		
		PressReleaseLocalServiceUtil.addPressRelease(pressRelease);
		//SessionErrors.add(actionRequest, "invalid-otp");

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
			pressRelease.setShow("F");
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