<%@page import="javax.portlet.PortletSession"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="org.apache.taglibs.standard.tag.el.core.ForEachTag"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<liferay-theme:defineObjects />
<portlet:defineObjects />
<portlet:actionURL name="logout" var="logoutURL" />
<%
PortletURL home = renderResponse.createRenderURL();
home.setParameter("mvcPath", "/jsp/candidatehome.jsp");
PortletURL candidateChangePassword = renderResponse.createRenderURL();
candidateChangePassword.setParameter("mvcPath", "/jsp/candidate_changepassword.jsp");
PortletURL update = renderResponse.createRenderURL();
update.setParameter("mvcPath", "/jsp/updatecandidateregform.jsp");
PortletURL view = renderResponse.createRenderURL();
view.setParameter("mvcPath", "/jsp/candidateDeteils.jsp");
%>
<html>
<head>
<style>
.portlet-content {
border:none !important;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>RDEL ATM</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>
 <script src="<%=request.getContextPath()%>/js/sweetalert.min.js"></script>
  <link rel="stylesheet" href="<%=request.getContextPath()%>/css/sweetalert.min.css">
  <style>
  .lfr-alert-container {
    display: none !important;
}
  </style>
</head>
<body>

<div class="panel panel-primary">
	<a class="btn btn-primary" style="float:right;" href="${logoutURL}">Logout</a>
	<a class="btn btn-primary" style="float:right;" href="<%=candidateChangePassword.toString()%>">Change Password</a>
	<a class="btn btn-primary" style="float:right;" href="<%=update.toString()%>">Update Profile</a>
	<a class="btn btn-primary" style="float:right;" href="<%=view.toString()%>">View Profile</a>
	<a class="btn btn-primary" style="float:right;" href="<%=home.toString()%>">Home</a>
        <div class="panel-heading">
            <h3 class="panel-title">&nbsp</h3>
        </div>
   <div class="panel-body">

<div style="height:700px">
<h2></h2>
<h2></h2>
<h1 align="center" style=" padding-top: 91px; " > Thanks for Registration </h1>
</div>

</br>
</div>
</div>

</body>
</html>