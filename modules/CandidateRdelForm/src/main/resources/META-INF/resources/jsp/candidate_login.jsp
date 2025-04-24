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
<%
	PortletURL candidateRegisterPage = renderResponse.createRenderURL();
	candidateRegisterPage.setParameter("mvcPath", "/view.jsp");
	
	PortletURL candidateForgetpasswordPage = renderResponse.createRenderURL();
	candidateForgetpasswordPage.setParameter("mvcPath", "/jsp/candidate_forgetpassword.jsp");
%>
<portlet:actionURL name="userlogin" var="userloginURL"></portlet:actionURL>
<!DOCTYPE html5>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/sweetalert.min.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/sweetalert.min.css">
<style type="text/css">
.lfr-alert-container {
    display: none !important;
}
.alink{
	color: #fff;
	text-decoration: none;
}

.portlet-content {
border:none !important;
}

.lfr-alert-container {
    display: none !important;
}
</style>
</head>
<body>
	<div class="container">
		<div id="loginbox" style="margin-top: 50px;"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="panel-title">Sign In</div>
					<div
						style="float: right; font-size: 80%; position: relative; top: -10px">
						<a class="alink"  href="<%=candidateForgetpasswordPage.toString()%>">Forgot password?</a>
					</div>
				</div>

				<div style="padding-top: 30px" class="panel-body">

					<div style="display: none" id="login-alert"
						class="alert alert-danger col-sm-12"></div>

					<form id="loginform" class="form-horizontal" name="userloginForm">
						<div id="signupalert" style="display: none"
							class="alert alert-danger">
							<p>Error:</p>
							<span></span>
						</div>
						
						<div style="margin-bottom: 25px" class="input-group">
								<% String msg=request.getParameter("msg");
    									if("0".equals(msg)&& msg!=null){
    							%>
    							<label class="control-label" ><font color="red" style=" font-size: 12px;" >Enter valid user name and password.</font></label>     
								<%    
									}
  								%>
						</div>
						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input id="username"
								type="email" class="form-control" name="<portlet:namespace/>username" value=""
								placeholder="username or email">
						</div>

						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-lock"></i></span> <input id="password"
								type="password" class="form-control" name="<portlet:namespace/>password" placeholder="password">
						</div>

						<div style="margin-top: 10px" class="form-group">
							<!-- Button -->

							<div class="col-sm-12 controls">
							
								<button id="btn-login" type="button" class="btn btn-success" onclick="return validuserLogin();">
									&nbsp; Login
									
								</button>
								
								<button id="btn-login" type="button" class="btn btn-success" onclick="return validuserReset();">
									&nbsp; Reset
								</button>
								
							</div>
						</div>					
						<div class="form-group">
							<div class="col-md-12 control">
								<div
									style="border-top: 1px solid #888; padding-top: 15px; font-size: 85%">
									Don't have an account! <a
										href="<%=candidateRegisterPage.toString()%>"
										onClick="$('#loginbox').hide(); $('#signupbox').show()">
										Sign Up Here </a>
								</div>
							</div>
						</div>					
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
function validuserLogin(){	
	var username = document.getElementById("username").value;
	if(username == "" || username == "null"){
		alert("Enter User Name.")
		document.getElementById("username").focus();
		return false;
	} 
	
	var password = document.getElementById("password").value;
	if(password == "" || password == "null"){
		alert("Enter Password.")
		document.getElementById("password").focus();
		return false;
	}
	document.userloginForm.method="POST";
	document.userloginForm.action="${userloginURL}";
	document.userloginForm.submit();
}

function validuserReset(){	
	var r = confirm("Are you sure you want to reset.");
	   if (r == true) {
		   var username = document.getElementById("username").value="";
		   var password = document.getElementById("password").value="";
	   } 
}
</script>
<script>
var successfullyRegister="<%=request.getAttribute("successfullyRegister")%>";
if(successfullyRegister != "null"){	
	swal("Congratulations", successfullyRegister, "success");
}
</script>
<script>
var successfullyLogout="<%=request.getAttribute("successfullyLogout")%>";
if(successfullyLogout != "null"){	
	swal("", "Successfully logged you out", "success");
}
</script>
</html>