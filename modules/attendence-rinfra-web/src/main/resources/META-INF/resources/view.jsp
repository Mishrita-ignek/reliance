<%@page import="com.liferay.portal.kernel.util.Validator"%>
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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<portlet:actionURL name="getEmp" var="getEmpURL" />
<portlet:actionURL var="sendCookieURL" name="sendCookie" />
<portlet:resourceURL var="checkOtpURL" id="checkOtp" />
<portlet:resourceURL var="sendOtpURL" id="sendOtp" />

<%
	String otp = (String) request.getAttribute("otpError");
	//boolean showOTP = (boolean)request.getAttribute("showOTP");
	String empCode = (String) request.getAttribute("empCode");
	String name = "";
	String code = "";
	//System.out.println("empCode - " + empCode);
         Cookie cookie = null;
         Cookie[] cookies = null;
         // Get an array of Cookies associated with the this domain
         cookies = request.getCookies();
         if( cookies != null ) {
            cookie = cookies[0];
           	name = cookie.getName( );
           	code = cookie.getValue( );
         }
        
      %>

<html>
<head>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Attendence Login</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/jquery-ui.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/bootstrap.min.css">
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
<body onload="accessCookie();">
	<div>
		<%-- <img alt="" src="<%=request.getContextPath()%>/image/logo.png"> --%>
	</div>
	<div class="" style="width: 100%;">
		<div id="loginbox" style="margin-top: 50px;" class="">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="panel-title">Attendence Login</div>
					<div style="float: right; position: relative; top: -21px"></div>
				</div>

				<div style="padding-top: 30px" class="panel-body">

					<div style="display: none" id="login-alert"
						class="alert alert-danger col-sm-12"></div>

					<form id="registrationForm" class="form-horizontal" role="form"
						method="post" action="" name="registrationForm">

						<%
							if (Validator.isNotNull(otp)) {
						%>
						<p style="color: red;">Please Enter valid OTP.</p>
						<%
							}
						%>

						<%
							if (Validator.isNotNull(empCode)) {
						%>
						<p style="color: red;"><%=empCode%></p>
						<%
							}
						%>

						<div id="signupalert" style="display: none"
							class="alert alert-danger">
							<p>Error:</p>
						</div>

						<div class="form-group">
							<label class="control-label col-md-3" for="Empcode">Employee
								Code : <strong class="astrx">*</strong>
							</label>
							<div class="col-sm-3">
								<input type="text" class="form-control numberOnly" rows="3"
									id="empcode" name="<portlet:namespace/>empcode"
									placeholder="Employee Code" value=""> </input>
							</div>

						</div>

						<%-- <c:if test="${not empty mobile and mobile ne 0 and showOTP}"> --%>
						<div class="form-group" id="showOtp" style="display: none;">
							<label for="firstname" class="col-md-3 control-label">Enter
								OTP :<strong class="astrx">*</strong>
							</label>
							<div class="col-md-3">
								<input type="email" class="form-control"
									name="<portlet:namespace />otp" placeholder="Enter OTP"
									id="otp">
							</div>

						</div>
						<div class="form-group" id="submitOtp" style="display: none;">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<button id="btn-signup" type="button" class="btn btn-info"
									onclick="return validEmpForm();">
									<i class="icon-hand-right"></i> &nbsp Submit
								</button>
							</div>
						</div>

						<!-- ------------------------->
						<div class="form-group" id="getOtp">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<button id="btn-signup" type="button" class="btn btn-info"
									onclick="return validRegistrationForm();">
									<i class="icon-hand-right"></i> &nbsp Submit
								</button>
							</div>
						</div>

					</form>
					<%if(Validator.isNotNull(name) && Validator.isNotNull(code)){ %>
					<form id="empForm" role="form" method="post" action="" name="empForm">
						<input type="hidden" id="empname" name="<portlet:namespace/>empname" value="<%=name %>" readonly="readonly" >
						<input type="hidden" id="empcode" name="<portlet:namespace/>empcode" value="<%=code %>" readonly="readonly" >
						
					</form>
					<%} %>
				</div>

			</div>
		</div>
	</div>
</body>
<script type="text/javascript">

	function validRegistrationForm() {

		var empcode = document.getElementById("empcode").value;
		if (empcode == "" || empcode == "null") {
			alert("Please Enter Empcode.")
			document.getElementById("empcode").focus();
			return false;
		}
		getExistRecord(empcode);

	}
	function validEmpForm() {

		var otp = document.getElementById("otp").value;
		if (otp == "" || otp == "null") {
			alert("Please Enter OTP.")
			document.getElementById("otp").focus();
			return false;
		} else {
			 checkOtp(otp);
			 	/* document.registrationForm.method = "POST";
				document.registrationForm.action = "${getEmpURL}";
				document.registrationForm.submit(); */
		}
	}
	
	function accessCookie(cookieName)
	{
	  var name = cookieName + "=";
	  var allCookieArray = document.cookie.split(';');
	
	  for(var i=0; i<allCookieArray.length; i++)
	  {
	    var temp = allCookieArray[i].trim();
	    var c = temp.split('=');
	    var name = c[0];
	    var code = c[1];
	    var t = allCookieArray[1].trim();
	    var m = t.split('=');
	    var date = m[0];
	    var mode = m[1];
	   //alert(" name - "+c[0]);
	   if("CookieName"===c[0]){
	    	document.empForm.method = "POST";
			document.empForm.action = "${sendCookieURL}";
			document.empForm.submit();
	    }
	    if (temp.indexOf(name)==0)
	    return temp.substring(name.length,temp.length);
		  }
		return "";
	}
	
</script>

<aui:script>
	Liferay.provide(window, 'checkOtp', function(otp) {
		var A = AUI();
		var fetchPropertyURL = '<%= checkOtpURL.toString() %>';
		//alert(empcode);
		var empcode = document.getElementById("empcode").value;
		A.io.request(fetchPropertyURL, {
			data : {
				<portlet:namespace />otp : otp,
				<portlet:namespace />empcode : empcode
			},
			on : {
				success : function(response) {
					var response = this.get('responseData');
					//alert(response);
					var res = JSON.parse(response);
					if (res != null) {
						if ('valid' === res.otp) {
							document.registrationForm.method = "POST";
							document.registrationForm.action = "${getEmpURL}";
							document.registrationForm.submit();
						} else if ('inValid' === res.otp) {
							alert("Please Enter valid OTP.");
						} 
					} else {
						alert("This employee code is not registered for online attendance.");
					}
				}
			}
		});
	});
</aui:script>

<aui:script>
	Liferay.provide(window, 'getExistRecord', function(empcode) {
		var A = AUI();
		var fetchPropertyURL = '<%= sendOtpURL.toString() %>';
		//alert(empcode);
		A.io.request(fetchPropertyURL, {
			data : {
				<portlet:namespace />empCode : empcode
			},
			on : {
				success : function(response) {
					var response = this.get('responseData');
					//alert(response);
					var res = JSON.parse(response);
					
					if (res != null) {
						if ('send' === res.sms) {
							alert("OTP has been sent on your mobile.");
							//$("#registrationForm").find("input[name='mobile']").val(mobile);
							$('#getOtp').hide();
							$('#showOtp').show();
							$('#submitOtp').show();
						} else if ('no' === res.code) {
							alert("This employee code is not registered for online attendance.");
						} else if ('no' === res.sms){
							alert("Error occurred while sending OTP, Pls try again.");
						}
					} else {
						alert("This employee code is not registered for online attendance.");
					}
				}
			}
		});
	});
</aui:script>
	
</html>