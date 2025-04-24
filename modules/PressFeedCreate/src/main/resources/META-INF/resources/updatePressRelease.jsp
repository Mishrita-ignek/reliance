<%@page import="com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalServiceUtil"%>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="java.util.List"%>
<%@page import="com.relieanceada.rinfra.portal.pressRelease.model.PressRelease" %>
<%@page import="com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalService"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />


<%
PortletURL homeURL=renderResponse.createRenderURL();
PortletURL updatePressReleaseActionURL=renderResponse.createActionURL();
updatePressReleaseActionURL.setParameter(ActionRequest.ACTION_NAME, "updatePressRelease");
%>

<%
List<PressRelease> pressReleases=PressReleaseLocalServiceUtil.getPressReleases(-1, -1);
String pressId=request.getParameter("pressId");
PressRelease pressRelease=PressReleaseLocalServiceUtil.getPressRelease(Long.parseLong(pressId));
%>

<a href="<%=homeURL.toString()%>">Home</a>

<form action="<%=updatePressReleaseActionURL.toString()%>" method="POST" name="pressUpdateForm">
 <input name="<portlet:namespace/>pressId" value="<%=pressId%>" type="hidden" />
<div class="form-horizontal">
		<div class="form-group">
			<label for="inputEmail3" class="col-sm-6 head-label">All
				fields marked * are mandatory </label>
			<div class="col-sm-4"></div>
		</div>

		<div class="form-group">
			<label for="inputEmail3" class="col-sm-2 custome-control-label">News Date:</label>
			<div class="col-sm-4">
				<aui:input name="<portlet:namespace/>newsDate" placeholder="DD-MM-YYYY" value="<%=pressRelease.getNewsDate() %>" type="text">
				<aui:validator name="required" errorMessage="Please enter news date." />
				</aui:input> 
			</div>
		</div>
		<div class="form-group">
			<label for="description" class="col-sm-2 custome-control-label">Description:</label>
			<div class="col-sm-4">
				<aui:input name="<portlet:namespace/>description" value="<%=pressRelease.getDescription()%>" type="text">
				</aui:input>
			</div>
		</div>
		<div class="form-group">
			<label for="fileURL" class="col-sm-2 custome-control-label">file URL:</label>
			<div class="col-sm-4">
				<aui:input name="<portlet:namespace/>fileURL" id="fileURL" value="<%=pressRelease.getFileURL()%>" type="text"><aui:validator name="required" errorMessage="Please enter your Last Name." />
				</aui:input>
			</div>
		</div>

	<div class="form-group">
			<label for="inputEmail3" class="col-sm-2 custome-control-label">Press Release Year:</label>
			<div class="col-sm-4">
				<aui:input name="<portlet:namespace/>newsYear" value="<%=pressRelease.getNewsYear()%>" type="text" placeholder="YYYY">
				</aui:input>
			</div>
		</div>
		<div class="form-group">
			<label for="inputPassword3" class="col-sm-2 custome-control-label">Show*: </label>
			<div class="col-sm-4">
				<aui:select name="<portlet:namespace/>show" value="<%=pressRelease.getShow()%>">
					<aui:option value="">-------Select-------</aui:option>
					<aui:option value="T">True</aui:option>
					<aui:option value="F">False</aui:option>	
				</aui:select>
			</div>
		</div>
		<aui:button type="submit" name="" value="Update"></aui:button>
</form>