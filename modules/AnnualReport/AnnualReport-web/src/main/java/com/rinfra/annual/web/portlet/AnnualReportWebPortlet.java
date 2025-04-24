package com.rinfra.annual.web.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.rinfra.annual.model.AnnualReport;
import com.rinfra.annual.service.AnnualReportLocalService;
import com.rinfra.annual.service.AnnualReportLocalServiceUtil;

import java.io.IOException;
import java.util.List;
import java.util.Set;

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

/**
 * @author BO00118
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=AnnualReport-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AnnualReportWebPortlet extends MVCPortlet {
	
	private static final Log log =LogFactoryUtil.getLog(AnnualReportWebPortlet.class);
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		//renderRequest.setAttribute("annualReportYears",this._annualReportLocalService.getAnnualReport());
		Set<String> annualReportsYear=(Set<String>) AnnualReportLocalServiceUtil.getAnnualReport();
		renderRequest.setAttribute("annualReportsYear", annualReportsYear);
		log.info("annualReportsYear ::"+annualReportsYear);
		super.render(renderRequest, renderResponse);
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		System.out.println("AnnualReportWebPortlet.getYearReports()");
		String selectedReportYear = ParamUtil.getString(resourceRequest, "selectedReportYear");
		List<AnnualReport> annualRports=AnnualReportLocalServiceUtil.findByFINANCIAL_YEARS(selectedReportYear);
		resourceRequest.setAttribute("annualRports", annualRports);
		log.info("annualRport ::"+annualRports);
		PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/annualreport.jsp");
	    dispatcher.forward(resourceRequest, resourceResponse);
		super.serveResource(resourceRequest, resourceResponse);
	}
	
	
	@Reference(cardinality=ReferenceCardinality.MANDATORY)
	protected  AnnualReportLocalService _annualReportLocalService;	
	
	
}