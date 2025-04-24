<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />


<portlet:defineObjects />
<%
PortletURL addPressRelase= renderResponse.createRenderURL();
addPressRelase.setParameter("mvcPath", "/add_pressRelease.jsp");
%>
<%
PortletURL updatePressRelase= renderResponse.createRenderURL();
updatePressRelase.setParameter("mvcPath", "/pressUpdate_by_id.jsp");
%>


<a href="<%=addPressRelase.toString()%>">Add Press Release</a><br/>
<%-- <a href="<%=updatePressRelase.toString()%>">Update  Press Release</a><br/> --%>
