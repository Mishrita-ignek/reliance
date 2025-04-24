package com.occnewmoduleweb.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletSession;
import javax.portlet.ProcessAction;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;

import OCCModuleNew.model.OccMessageNew;
import OCCModuleNew.model.OccNew;
import OCCModuleNew.service.OccMessageNewLocalServiceUtil;
import OCCModuleNew.service.OccNewLocalServiceUtil;

/**
 * @author CBT141327
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=OccModuleNew-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class OccModuleNewWebPortlet extends MVCPortlet {
	
	@ProcessAction(name="checkUser")
	public void checkUser(ActionRequest actionRequest, ActionResponse actionResponse){
		System.out.println("OccModuleNewWebPortlet.checkUser()");
		System.out.println("OCCModuleWebPortlet.checkUser()");
		String userName = actionRequest.getParameter("userId");
		String pass = actionRequest.getParameter("pass");
		
		if("occadmin".equals(userName) && "@cc@dm!n".equals(pass)){
			/*PortletSession portletSession = actionRequest.getPortletSession();
			portletSession.setAttribute( "userId",userName,PortletSession.APPLICATION_SCOPE);
			portletSession.setAttribute( "pass",pass,PortletSession.APPLICATION_SCOPE);*/
			actionResponse.setRenderParameter("mvcPath", "/mailsend.jsp");
		}
		else{
			actionResponse.setRenderParameter("msg", "0");
			actionResponse.setRenderParameter("mvcPath", "/view.jsp");
		}
		
	}
	
	@ProcessAction(name="back")
	public void pageBack(ActionRequest actionRequest, ActionResponse actionResponse){
			actionResponse.setRenderParameter("mvcPath", "/mailsend.jsp");
	}
	
	@ProcessAction(name="mailSend")
	public void mailSend(ActionRequest actionRequest, ActionResponse actionResponse){
		
		System.out.println("OccModuleNewWebPortlet.MailSend()");
		String msg = actionRequest.getParameter("textmsg");
		String listName = ParamUtil.getString(actionRequest, "listName"); 
		String severity = ParamUtil.getString(actionRequest, "severity"); 
		System.out.println("severity check::"+severity);
		msg = msg.replaceAll("\\s+", " ");
		int updateMsg = OccMessageNewLocalServiceUtil.saveMsg(msg, listName,severity);
		if(updateMsg == 1)
			System.out.println("Message Saved");
		else
			System.out.println("Message not save");
		int result = OccNewLocalServiceUtil.sendMail(msg, listName);
		
		if(result==1){
			System.out.println("mail send");
		}else{
			System.out.println("mail send failed");
		}
		actionResponse.setRenderParameter("mvcPath", "/mailsend.jsp");
		
	}
	
	@ProcessAction(name="postedMsgList")
	public void postedMsgList(ActionRequest actionRequest, ActionResponse actionResponse){
		
		System.out.println("OCCModuleWebPortlet.postedMsgList()");
		actionResponse.setRenderParameter("mvcPath", "/viewmessage.jsp");
		
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		System.out.println("OccModuleNewWebPortlet.serveResource()");
		String selectedListName = resourceRequest.getParameter("selectedList");
		String selectList = resourceRequest.getParameter("selectList");
		String flag = resourceRequest.getParameter("flagV");
		//List<OccMessageNew> messageList1 = OccMessageNewLocalServiceUtil.getMsgList(selectList);
		System.out.println("messageList1 ");
		
	    if("1".equals(flag)){
	    	System.out.println("inside if");
	    	List<OccMessageNew> messageList = OccMessageNewLocalServiceUtil.getMsgList(selectList);
	    	System.out.println("Message List :: "+messageList);
		    resourceRequest.setAttribute("messageList", messageList);
		    PortletRequestDispatcher requestDispatcher = getPortletContext().getRequestDispatcher("/messageList.jsp");
		    requestDispatcher.forward(resourceRequest, resourceResponse);
	    }else {
	    	List<OccNew> emailList = OccNewLocalServiceUtil.getList(selectedListName);
	    	System.out.println("emailList"+emailList);
		    ThemeDisplay themeDisplay = (ThemeDisplay)resourceRequest.getAttribute("LIFERAY_SHARED_THEME_DISPLAY");
		    //pressReleaseList = PressReleasePortletUtil.generateDownloadURL(pressReleaseList, themeDisplay);
		    resourceRequest.setAttribute("emailList", emailList);
		    PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/recepientsList.jsp");
		    dispatcher.forward(resourceRequest, resourceResponse);
	    }
		super.serveResource(resourceRequest, resourceResponse);
	}
	
	@ProcessAction(name="logout")
	public void logout(ActionRequest actionRequest,ActionResponse actionResponse){
		PortletSession portletSession=actionRequest.getPortletSession();	
		portletSession.invalidate();
		System.out.println("session in validated");
		actionResponse.setRenderParameter("mvcPath", "/view.jsp");
	}

	
}