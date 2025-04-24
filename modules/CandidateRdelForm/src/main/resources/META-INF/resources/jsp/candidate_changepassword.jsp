<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletSession"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<portlet:actionURL name="logout" var="logoutURL" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%		
	PortletSession session1 = renderRequest.getPortletSession();
	String userId = (String) session1.getAttribute("userId", PortletSession.APPLICATION_SCOPE);
	PortletURL home = renderResponse.createRenderURL();
	home.setParameter("mvcPath", "/jsp/candidatehome.jsp");
	PortletURL candidateChangePassword = renderResponse.createRenderURL();
	candidateChangePassword.setParameter("mvcPath", "/jsp/candidate_changepassword.jsp");
	PortletURL update = renderResponse.createRenderURL();
	update.setParameter("mvcPath", "/jsp/updatecandidateregform.jsp");
	PortletURL view = renderResponse.createRenderURL();
	view.setParameter("mvcPath", "/jsp/candidateDeteils.jsp");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<portlet:actionURL name="candidatechangepassword" var="candidatechangepasswordURL" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<script	src="<%=request.getContextPath()%>/js/jquery.min.js"></script>

  <script src="<%=request.getContextPath()%>/js/sweetalert.min.js"></script>
  <link rel="stylesheet" href="<%=request.getContextPath()%>/css/sweetalert.min.css">
  <style type="text/css">
  .lfr-alert-container {
    display: none !important;
}
  .portlet-content {
border:none !important;
}
  .btn {
    margin-bottom: 0;
    font-size: 14px;
    font-weight: 400;
    line-height: 1.42857143;
    text-align: center;
    white-space: nowrap;
    vertical-align: middle;
    -ms-touch-action: manipulation;
    touch-action: manipulation;
    cursor: pointer;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
    background-image: none;
    border: 1px solid transparent;
    border-radius: 4px;
}
</style>
</head>
<body>
	<div class="container">
		<div id="passwordreset" style="margin-top: 50px"
			class="">
			<div class="panel panel-primary">
			<a class="btn btn-primary" style="float:right;" href="${logoutURL}">Logout</a>
			<a class="btn btn-primary" style="float:right;" href="<%=candidateChangePassword.toString()%>">Change Password</a>
			<a class="btn btn-primary" style="float:right;" href="<%=update.toString()%>">Update Profile</a>
			<a class="btn btn-primary" style="float:right;" href="<%=view.toString()%>">View Profile</a>
			<a class="btn btn-primary" style="float:right;" href="<%=home.toString()%>">Home</a>	
				<div class="panel-heading">
					<div class="panel-title">Change Password</div>
				</div>
				<div class="panel-body">
			<%
				if(userId != null){
			%>
					<form id="signupform" class="form-horizontal" role="form" name="candidatechangepasswordForm">					
					<input type="hidden" name=<portlet:namespace/>emailId value="<%=userId%>">
						<div class="form-group">
							<label for="email" class=" control-label col-sm-3">Old Password</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" id="oldpassword"  name="<portlet:namespace/>oldpassword"
									placeholder="Please input your old password">
							</div>
						</div>
						<div class="form-group">
							<label for="email" class=" control-label col-sm-3">New
								password</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" id="password" name="<portlet:namespace/>password"
									placeholder="create your new password">
							</div>
						</div>
						<div class="form-group">
							<label for="email" class=" control-label col-sm-3">Confirm
								password</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" id="passwordconfirmation" 
									name="<portlet:namespace/>passwordconfirmation"
									placeholder="confirm your new password">
							</div>
						</div>
						<div class="form-group">
							<!-- Button -->
							<div class="  col-sm-offset-3 col-sm-9">
								<button id="btn-signup" type="button" class="btn btn-success" onclick="return validChangepassword();">Submit</button>
								<button id="btn-signup" type="button" class="btn btn-success" onclick="return validResetChangepassword();">Cancel</button>
							</div>
						</div>
					</form>
				<%		
					}else{
						actionResponse.setRenderParameter("mvcPath", "/jsp/candidate_login.jsp");
					}
				%>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
function validChangepassword(){	
	var oldpassword = document.getElementById("oldpassword").value;
	 if(oldpassword == "" || oldpassword == "null"){
		alert("Enter Old Password.");
		document.getElementById("oldpassword").focus();
		return false;
	}  
	
	var password = document.getElementById("password").value;
	if(password == "" || password == "null"){
		alert("Enter New Password.");
		document.getElementById("password").focus();
		return false;
	}
	
	var passwordconfirmation = document.getElementById("passwordconfirmation").value;
	if(passwordconfirmation == "" || passwordconfirmation == "null"){
		alert("Enter Confirmation Password.");
		document.getElementById("passwordconfirmation").focus();
		return false;
	} 
	
	if(password != passwordconfirmation){
		alert("Invalid Confirm Password.");
		document.getElementById("password").focus();
		document.getElementById("password").value="";
		document.getElementById("passwordconfirmation").value="";
		return false;
	}
	
	if(oldpassword == password || oldpassword == passwordconfirmation){
		alert("Old Password Cannot be used.");
		document.getElementById("oldpassword").focus();
		document.getElementById("oldpassword").value="";
		document.getElementById("password").value="";
		document.getElementById("passwordconfirmation").value="";
	   return false;
	} 
	
	document.candidatechangepasswordForm.method="POST";
	document.candidatechangepasswordForm.action="${candidatechangepasswordURL}";
	document.candidatechangepasswordForm.submit();
}

function validResetChangepassword(){	
	var oldpassword = document.getElementById("oldpassword").value="";
	var password = document.getElementById("password").value="";
	var passwordconfirmation = document.getElementById("passwordconfirmation").value="";
	return false;
}
</script>
<script>
var changePassWrongResponse="<%=request.getAttribute("changePassWrongResponse")%>";
if(changePassWrongResponse != "null"){	
	swal("", "Entered Old Password is Wrong.", "warning");
}
</script>
</html>
