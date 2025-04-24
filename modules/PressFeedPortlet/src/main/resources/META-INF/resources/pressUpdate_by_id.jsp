<%@page import="com.liferay.portal.kernel.backgroundtask.BackgroundTask"%>
<%@page import="com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalServiceUtil"%>
<%@page import="com.relieanceada.rinfra.portal.pressRelease.model.PressRelease"%>
<%@page import="java.util.List"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />

<%
PortletURL homeURL=renderResponse.createRenderURL();
PortletURL updatePressReleaseURL = renderResponse.createRenderURL();
updatePressReleaseURL.setParameter("mvcPath", "/updatePressRelease.jsp");
%>

<%
List<PressRelease> pressReleases=PressReleaseLocalServiceUtil.getPressReleases(-1, -1);
%>

<a href="<%=homeURL.toString()%>">Home</a>
<h1>Please select press release to be update</h1>
<form action="<%=updatePressReleaseURL%>" name="pressReleaseForm" method="POST">
<select name="<portlet:namespace/>pressId">
<option value="-1">--select--</option>
<% for(PressRelease pressRelease:pressReleases){%>
  <option value="<%=pressRelease.getPressId()%>" >
<%=pressRelease.getPressId()%></option>
  <%} %>
</select>

 <input type="submit" value="Update"/>
</form>

