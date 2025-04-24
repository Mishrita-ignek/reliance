<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<portlet:actionURL name="mediaQuery" var="mediaQueryURL" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Media Query</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<script src="<%=request.getContextPath()%>/js/jquery.min.js">
	
</script>
<style type="text/css">
.portlet-content {
	border: none !important;
}

.lableF {
	color: red;
	margin-left: 197px;
}

.astrx {
	color: red;
}

.alink {
	color: #f5f5f5;
	text-decoration: none;
}
</style>

<style type="text/css">
.lableF {
	color: red;
	margin-left: 197px;
}

.astrx {
	color: red;
}
</style>


</head>
<body>
	<div class="container">
		<div id="loginbox" style="margin-top: 50px;" class="">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="panel-title"> ONLY FOR JOURNALISTS / MEDIA QUERIES </div>

				</div>

				<div style="padding-top: 30px" class="panel-body">

					<div style="display: none" id="login-alert" class="alert alert-danger col-sm-12"></div>

					<form id="signupform" class="form-horizontal" role="form" method="post" action=""
						name="mediaQueryForm">

						<div class="form-group">
							<label for="email" class="col-md-3 control-label">Name of Journalist :<strong
								class="astrx">*</strong>
							</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="<portlet:namespace />journalistName"
									placeholder="Enter Journalist Name" id="journalistName" onkeypress="return Stringonly();">
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="col-md-3 control-label">News Organisation's Name<strong
								class="astrx">*</strong></label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="<portlet:namespace />newsOrganisationName"
									placeholder="Enter Organisation Name" id="newsOrganisationName"
									onkeypress="return Stringonly();">
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-3 control-label" for="mainQualification">Type of News
								Organisation :<strong
								class="astrx">*</strong></label>
							<div class="col-sm-7">
								<Select class="form-control" id="organisationType"
									name="<portlet:namespace/>organisationType">
									<option value="">Choose One</option>
									<option value="Print Media">Print Media</option>
									<option value="Electronic Media">Electronic Media</option>
									<option value="Online Media">Online Media</option>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label for="firstname" class="col-md-3 control-label">Email :<strong class="astrx">*</strong>
							</label>
							<div class="col-md-7">
								<input type="email" class="form-control" name="<portlet:namespace />email"
									placeholder="Enter Email" id="email" >
								
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="col-md-3 control-label">Mobile :<strong class="astrx">*</strong>
							</label>
							<div class="col-md-7">
								<input type="text" class="form-control numberOnly" maxlength="10" id="mobile"
									name="<portlet:namespace/>mobile" placeholder="Mobile Number" required="required"
									onkeypress="return numbersonly();">
							</div>
						</div>

						<div class="form-group">
							<label for="lastname" class="col-md-3 control-label">Subject :<strong class="astrx">*</strong>
							</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="<portlet:namespace />subject"
									placeholder="Enter Subject" id="subject">
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-3" for="Address">Media Query :<strong
								class="astrx">*</strong></label>
							<div class="col-sm-7">
								<textarea type="text" class="form-control" rows="3" id="mediaQuery"
									name="<portlet:namespace/>mediaQuery" placeholder="mediaQuery" value=""></textarea>
							</div>
						</div>

						<!-- ------------------------->

						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<button id="btn-signup" type="button" class="btn btn-info"
									onclick="return validMediaQueryForm();">
									<i class="icon-hand-right"></i> &nbsp SEND
								</button>
							</div>
						</div>
						<div class="form-group">
							<span class="lableF"> All fields marked * are mandatory </span>
    					</div>
					</form>
				</div>
			</div>
		</div>
</body>
<script type="text/javascript">
	function validMediaQueryForm() {

		var jname = document.getElementById("journalistName").value;
		if (jname == "" || jname == "null") {
			alert("Enter Journalist Name.")
			document.getElementById("journalistName").focus();
			return false;
		}
		
		var newsOrganisationName = document.getElementById("newsOrganisationName").value;
		if (newsOrganisationName == "" || newsOrganisationName == "null") {
			alert("Enter Organisation Name.")
			document.getElementById("newsOrganisationName").focus();
			return false;
		}

		var organisationType = document.getElementById("organisationType").value;
		if (mediaQuery == "" || mediaQuery == "null") {
			alert("Choose Type of News Organisation.")
			document.getElementById("organisationType").focus();
			return false;
		}
		
		var email = document.getElementById("email").value;
		if (email == "" || email == "null") {
			alert("Enter Email.")
			document.getElementById("email").focus();
			return false;
		}

		e_pat = /^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
		if (!e_pat.test(email)) {
			alert("Invalid Email Id.");
			document.getElementById("email").value = "";
			document.getElementById("email").focus();
			return false;
		}
		
		var mobile = document.getElementById("mobile").value;
		if (mobile == "" || mobile == "null") {
			alert("Enter Mobile Number.")
			document.getElementById("mobile").focus();
			return false;
		}

		m_pat = /^[7-9][0-9]{9}$/;
		if (!m_pat.test(mobile)) {
			alert("Invalid Mobile Number");
			document.getElementById("mobile").focus();
			return false;
		}

		var subject = document.getElementById("subject").value;
		if (subject == "" || subject == "null") {
			alert("Enter Subject.")
			document.getElementById("subject").focus();
			return false;
		}

		var mediaQuery = document.getElementById("mediaQuery").value;
		if (mediaQuery == "" || mediaQuery == "null") {
			alert("Enter Media Query.")
			document.getElementById("mediaQuery").focus();
			return false;
		}

		document.mediaQueryForm.method = "POST";
		document.mediaQueryForm.action = "${mediaQueryURL}";
		document.mediaQueryForm.submit();
	}

	function Stringonly() {
		var key;
		var keychar;
		if (window.event)
			key = window.event.keyCode;
		else
			return true;
		keychar = String.fromCharCode(key);
		if ((key == null) || (key == 0) || (key == 8) || (key == 9)
				|| (key == 13) || (key == 27))
			return true;
		else if ((("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz' ")
				.indexOf(keychar) > -1))
			return true;
		else
			alert("Please Enter Characters only!");
		return false;
	}
	function numbersonly() {
		var key;
		var keychar;
		if (window.event)
			key = window.event.keyCode;
		else
			return true;
		keychar = String.fromCharCode(key);
		if ((key == null) || (key == 0) || (key == 8) || (key == 9)
				|| (key == 13) || (key == 27))
			return true;
		else if ((("0123456789").indexOf(keychar) > -1))
			return true;
		else
			alert("Please Enter Only Number!");
		return false;
	}
</script>

</html>