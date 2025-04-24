<%@ include file="/init.jsp" %>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html5>
<portlet:actionURL name="checkUser" var="checkUserUrl">
</portlet:actionURL>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Reliance Mumbai Metro - SMS and Email alert system for OCC</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>
<style type="text/css">
#footer {
    display: none;
}
/* label, .control-label {
    display: none;
} */
.portlet-title-text {
    display: none;
}
</style>
<style type="text/css">
 .portlet-content {
border:none !important;
} 
.lableF{
	color: red;
    margin-left: 197px;
}
.astrx{
	color: red;
}
.alink{
    color: #f5f5f5;
    text-decoration: none;
}
.container{
	width: 525px;
	margin-top: 115px;
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
</style>
<script type="text/javascript">
		function validLogin(){			
			var fname = document.getElementById("userId").value;
			if(fname == "" || fname == "null"){
				alert("Enter User Name.")
				document.getElementById("userId").focus();
				return false;
			}
			
			var passwd = document.getElementById("pass").value;
			if(passwd == "" || passwd == "null"){
				alert("Enter Password.")
				document.getElementById("pass").focus();
				return false;
			}
			document.registrationForm.method="POST";
			document.registrationForm.action="${checkUserUrl}";
			document.registrationForm.submit();
		}
</script>
	<style type="text/css">
	.lableF{
	color: red;
    margin-left: 197px;
}
.astrx{
	color: red;
}
	</style>
	
	
</head>

<body>
 <div style="margin-top: -45px;">
	<a href="">
		<img src="<%=request.getContextPath()%>/image/reliance_logo.png" alt="Reliance Logo" border="0"></a>
</div> 
	<div class="container">
		<div id="loginbox" style="margin-top: 50px;"
			class="">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="panel-title">Sign In</div>
				</div>

				<div style="padding-top: 30px" class="panel-body">

					<div style="display: none" id="login-alert"
						class="alert alert-danger col-sm-12"></div>

					<form id="signupform" class="form-horizontal" role="form" method="post" action="" name="registrationForm" >
						<div class="form-group">
      						<%String error=request.getParameter("msg");
    							if("0".equals(error)&& error!=null){
    						%>
    						<font color="red" style="margin-left: 137px;">Enter valid user name and password.</font>
				 			<%    }
   							 %>
    					</div>
						
						<br>
						<div class="form-group">
							<label for="email" class="col-md-3 control-label">User Name : </label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="<portlet:namespace />userId"
									placeholder="Enter User Name" id="userId">
							</div>
						</div>
											
						<div class="form-group">
							<label for="lastname" class="col-md-3 control-label">Password : </label>
							<div class="col-md-7">
								<input type="password" class="form-control" name="<portlet:namespace />pass"
									placeholder="Enter Password" id="pass">
							</div>
						</div>
						
				
						
						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<button id="btn-signup" type="button" class="btn btn-info" onclick="return validLogin();">
									<i class="icon-hand-right" ></i> &nbsp Sign in
								</button>
								<span style="margin-left: 8px;"></span> <span
									style="margin-left: 8px;"></span>
								<button id="btn-signup" type="button" class="btn btn-info" onclick="return resetRegistrationForm();">
									<i class="icon-hand-right"></i> &nbsp Reset
								</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
</body>

</html>