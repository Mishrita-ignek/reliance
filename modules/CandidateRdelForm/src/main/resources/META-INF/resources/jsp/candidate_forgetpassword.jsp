<%@page import="javax.portlet.PortletURL"%>
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
<!DOCTYPE html5>
<portlet:resourceURL var="forgotpasswordAjaxResourceUrl"></portlet:resourceURL>
<portlet:actionURL name="forgotpassword" var="forgotpasswordURL" />
<%
PortletURL candidateSignUp = renderResponse.createRenderURL();
candidateSignUp.setParameter("mvcPath", "/view.jsp");
PortletURL candidateLoginPage = renderResponse.createRenderURL();
candidateLoginPage.setParameter("mvcPath", "/jsp/candidate_login.jsp");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/font-awesome.min.css">
 <script src="<%=request.getContextPath()%>/js/sweetalert.min.js"></script>
  <link rel="stylesheet" href="<%=request.getContextPath()%>/css/sweetalert.min.css">
<!-- jQuery library -->
<script	src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
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
.panel-primary {
    border-color: #337ab7;
    width: 80%;
    margin-left: 137px;
}
.input-group {
    position: relative;
    display: table;
    border-collapse: separate;
    width: 699px;
    padding-left: 190px;
}
.alink{
    color: #fff;
    text-decoration: none;
}
</style>
</head>
<body>
	<div class="form-gap"></div>
	<div class="container">
		<div class="row">
			<div class="">
				<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="panel-title"><a href="<%=candidateSignUp.toString()%>" class="alink">Sign Up</a></div>
					<div
						style="float: right; position: relative; top: -21px">
						<a href="<%=candidateLoginPage.toString()%>" class="alink">Sign In</a>
					</div>
				</div>
					<div class="panel-body">
						<div class="text-center">
							<h3>
								<i class="icon-unlock-alt fa-4x"></i>
							</h3>
							<h2 class="text-center">Forgot Password?</h2>
							<p>You can get your password here.</p>
							<div class="panel-body">

								<form id="register-form" role="form" autocomplete="off"	class="form" name="forgotPwd">

									<div class="form-group">
										<div class="input-group">
											<span class="input-group-addon">
											<i class="glyphicon glyphicon-envelope color-blue"></i></span> <input
												id="email" name="<portlet:namespace />email" placeholder="email address"
												class="form-control" type="email">
										</div>
									</div>
									<div class="form-group">
										<input  name="recover-submit" style="width:511px; margin-left: 190px; " class="btn btn-lg btn-primary btn-block" value="Get Password" type="button" onclick="resetPassword();">
									</div>									
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	function resetPassword(){		
	var email = document.getElementById("email").value;
		if(email == "" || email == "null"){
			alert("Enter Email.");
			document.getElementById("email").focus();
			return false;
		}
		
		e_pat = /^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
        if(!e_pat.test(email))
        {
            alert("Please Enter Your Valid Email.");
            document.getElementById("email").value="";
            document.getElementById("email").focus();
            return false;
        } 
		
		document.forgotPwd.method="POST";
		document.forgotPwd.action="${forgotpasswordURL}";
		document.forgotPwd.submit();
	}
</script>
<script>
var incorrectemail="<%=request.getAttribute("incorrectemail")%>";
if(incorrectemail != "null"){	
	swal("Error", incorrectemail, "warning");
}
</script>
</html>
