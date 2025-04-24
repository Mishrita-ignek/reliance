package PreventCSRFToken.portlet;

import java.io.StringBufferInputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletSession;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * @author BO00136
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true", "javax.portlet.display-name=PreventCSRFToken Portlet",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class PreventCSRFTokenPortlet extends MVCPortlet {
	private static Log log = LogFactoryUtil.getLog(PreventCSRFTokenPortlet.class);

	@ProcessAction(name = "csrfToken")
	public String CSRFToken(ActionRequest actionRequest, ActionResponse actionResponse) {
		log.info("PreventCSRFTokenPortlet.CSRFToken()");
		PortletSession session = actionRequest.getPortletSession();
		String token = (String)session.getAttribute("CSRF_TOKEN", PortletSession.APPLICATION_SCOPE);
		String csrfToken = ParamUtil.getString(actionRequest, "csrfToken");
		log.info(" Token1 : "+token+" CSRFToken1 : "+csrfToken);
		
		if((token != null && csrfToken != null) && (token.equals(csrfToken))){
			log.info(" Token : "+token+" CSRFToken : "+csrfToken);
		}
		 
		
		return null;
	}
}