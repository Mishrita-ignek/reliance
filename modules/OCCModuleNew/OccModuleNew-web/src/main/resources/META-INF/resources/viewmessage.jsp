<%@ include file="/init.jsp"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<portlet:actionURL name="logout" var="logoutURL" />
<portlet:actionURL name="back" var="backURL" />
<portlet:resourceURL var="getMessageUrl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reliance Mumbai Metro - SMS and Email alert system for
	OCC</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/jquery-ui.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>
<style type="text/css">
#footer {
	display: none;
}

.portlet-title-text {
	display: none;
}
</style>
<style type="text/css">
textarea.form-control {
	height: 70px;
}

.btn-info {
	color: #fff;
	background-color: #337ab7;
	border-color: #337ab7;
}

.portlet-content-container {
	margin-top: 125px;
}
.portlet-content{
	border: none !important;
}
td, th {
	padding: 10px 25px;
}
.navbar-header{
	display: none !important;
}
.navbar{
	display: none !important;
}
.fieldset{
	display: none !important;
} 
.rel-logo{
	margin-top: -296px;
	margin-bottom: 126px;
}
.collapse navbar-collapse{
	display: none !important;
}

</style>

</head>
<%
	PortletURL home = renderResponse.createRenderURL();
	home.setParameter("mvcPath", "/mailsend.jsp");
%>
<body>
 <div class="rel-logo">
	<a href="">
		<img src="<%=request.getContextPath()%>/image/reliance_logo.png" alt="Reliance Logo" border="0"></a>
</div>

	<div class="panel panel-primary" style="width: 92%;margin-left: 51px;">
		<a class="btn btn-primary" style="float: right;" href="${logoutURL}">Logout</a>
		<a class="btn btn-primary" style="float: right;"
			href="${backURL}">Back</a>    <%-- <%=home.toString()%> --%>
		<div class="panel-heading">
			<h3 class="panel-title">View Posted Message</h3>
		</div>
		<div class="panel-body">
			<div class="form-group">
				<table>
					<tr>
						 <td><input type="radio" name="<portlet:namespace/>listName" value="G-1" onclick="getMessage();">G-1 </td>
						<td><input type="radio" name="<portlet:namespace/>listName" value="G-2" onclick="getMessage();">G-2</td>
						<td><input type="radio" name="<portlet:namespace/>listName" value="MMOPL Group" onclick="getMessage();">MMOPL Group</td>
						<%-- <td><input type="radio" name="<portlet:namespace/>listName" value="CEOMSG"  onclick="getMessage();">CEOMSG </td> --%>
						<td><input type="radio" name="<portlet:namespace/>listName" value="Testing-1" onclick="getMessage();">Testing-1</td>
						<td><input type="radio" name="<portlet:namespace/>listName" value="Testing-2" onclick="getMessage();">Testing-2</td> 
					</tr>
				</table>
							
			<br>
			<div class="form-group">
				<div id="postedMessage">
				
				</div>
			</div>

			<div class="form-group" style="margin-top: 40px; margin-left: 215px;">
				<a class="btn btn-primary" style="float: right;"
					href="<%=home.toString()%>">Back</a>
			</div>

		</div>

	</div>
</body>
<aui:script>
	Liferay.provide(window, 'getMessage', function() {
		var A = AUI();
		var getListUrl = '<%=getMessageUrl.toString()%>';
		// selecting the sourceSelect drop-down to get the current value
		var listName = A.one("input[name=<portlet:namespace/>listName]:checked").get("value");
		var flag = "1";
		
		//alert(flag+"-"+listName);
		A.io.request(
		// the resource URL to fetch words
		getListUrl, {
			data : {
				// request parameters to be sent to the Server
				<portlet:namespace />selectList : listName,
				<portlet:namespace />flagV : flag
			},
			on : {
				success : function() {
					var resp = this.get('responseData');
					A.one("#postedMessage").empty().append(
							this.get('responseData'));
				}
			}

		});
	});
</aui:script>
	


</html>