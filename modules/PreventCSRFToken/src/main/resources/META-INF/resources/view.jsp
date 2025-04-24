<%@page import="javax.portlet.PortletSession"%>
<%@page import="java.util.UUID"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%><%@
taglib
	uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%><%@
taglib
	uri="http://liferay.com/tld/theme" prefix="liferay-theme"%><%@
taglib
	uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />


<portlet:actionURL var="csrfToken" name="csrfToken"></portlet:actionURL>

<%
	 String token = UUID.randomUUID().toString();
     portletSession.setAttribute("CSRF_TOKEN", token, PortletSession.APPLICATION_SCOPE); 
%>

<body>
	<form action="<%=csrfToken%>" method="post"
		enctype="multipart/form-data">
		<input type="hidden" name='<portlet:namespace/>csrfToken'
			value="<%=token%>">
		<button id="submitBtn" type="submit" class="btn btn-primary">Submit</button>

	</form>

</body>


