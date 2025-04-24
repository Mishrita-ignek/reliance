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
<liferay-ui:success key="request-submitted" message="${requestMsg}" />
<portlet:actionURL name="emp" var="EmpURL" />
<portlet:resourceURL var="sendOtpURL" />
<%
String requestMsg = (String)request.getAttribute("requestMsg");
String code = (String)request.getAttribute("code");
String name = (String)request.getAttribute("name");
String mode = (String)request.getAttribute("mode");
String mobile = (String)request.getAttribute("mobile");
String submit = (String)request.getAttribute("submit");

//System.out.println("submit - "+submit+" mode - "+mode);
/* if(Validator.isNotNull(requestMsg)){
	
	   Cookie empname = new Cookie("name", name);
	   Cookie empcode = new Cookie("code", code);
	   
	    //Set expiry date after 24 Hrs for both the cookies.
	   empname.setMaxAge(60*60*24); 
	   empcode.setMaxAge(60*60*24); 
	   
	   // Add both the cookies in the response header.
	   response.addCookie( empname );
	   response.addCookie( empcode );
	   System.out.println("Cookie added");
} */

%>


<html>
<head>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

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
<body >
	<div>
		<%-- <img alt="" src="<%=request.getContextPath()%>/image/logo.png"> --%>
	</div>
	<div class="" style="width: 100%;">
		<div id="loginbox" style="margin-top: 50px;" class="">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="panel-title">Please update your attendance status for today</div>
					<div style="float: right; position: relative; top: -21px"></div>
				</div>

				<div style="padding-top: 30px" class="panel-body">

					<div style="display: none" id="login-alert"
						class="alert alert-danger col-sm-12"></div>
						<% if(Validator.isNotNull(submit) && "ok".equalsIgnoreCase(submit)){ %>
						<p style="color: red;margin-left: 65px;font-size: 20px;" >Your attendance status for today is updated.</p>
						<%	} %> 

					<form id="registrationForm" class="form-horizontal" role="form"
						method="post" action="" name="registrationForm">
						
						<div id="signupalert" style="display: none"
							class="alert alert-danger">
							<p>Error:</p>
						</div>

						<div class="form-group">
							<label class="control-label col-md-3" for="Empcode">Employee Name
								: <strong class="astrx">*</strong>
							</label>
							<div class="col-sm-3">
								<input type="text"   class="form-control numberOnly"  
									rows="3" id="empname" name="<portlet:namespace/>empname" 
									placeholder="Employee Code" value="<%=name %>"  readonly="readonly" style="color: black;">
								</input>
							</div>
							
						</div>
						
						<div class="form-group">
							<label class="control-label col-md-3" for="Empcode">Employee Code
								: <strong class="astrx">*</strong>
							</label>
							<div class="col-sm-3">
								<input type="text"   class="form-control numberOnly"  
									rows="3" id="empcode" name="<portlet:namespace/>empcode" 
									placeholder="Employee Code" value="<%=code %>" readonly="readonly" style="color: black;">
								</input>
								<input type="hidden" id="mobile" name="<portlet:namespace/>mobile" value="<%=mobile %>" readonly="readonly" >
								</input>
								
								
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3" for="Empcode">Attendence Mode
								: <strong class="astrx">*</strong>
							</label>
							<%if(Validator.isNull(mode)){ %>
							<div class="col-sm-3">
										<select name="<portlet:namespace/>attendenceMode" id="attendenceMode" class="form-control">
												<option value="">Select</option>
												<option value="Working From Home">Working From Home</option>
												<option value="On Leave">On Leave</option>
												<option value="Outside Duty">Outside Duty</option>
												<option value="Working From Other Office">Working From Other Office</option>
												<option value="Present">Present</option>
										</select>
						</div>
						<div class="form-group" id="submit" >
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<button id="btn-signup" type="button" class="btn btn-info"
									onclick="return validEmpForm();" style="margin-top: 21px;">
									<i class="icon-hand-right"></i> &nbsp Submit
								</button>
							</div>
						</div>
						<%} else{ %>
						<div class="col-sm-3">
										<select name="<portlet:namespace/>attendenceMode" id="attendenceMode" class="form-control">
												<option value="<%=mode%>"><%= mode%></option>
										</select>
						</div>
						
						<%} %>
						</div>
						<% if(Validator.isNull(submit) && !"ok".equalsIgnoreCase(submit)){ %>
						
						<%} %>
					</form>
				</div>
				
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">

	function btn(){
		var attendenceMode = $('#attendenceMode').find(":selected").text();
		//alert(attendenceMode);
		if (attendenceMode != "" || attendenceMode != "null") {
			//$('#btn-signup').hide();
		}
	}
	
	function validEmpForm() {
        
			var attendenceMode = $('#attendenceMode').find(":selected").text();
			//alert(attendenceMode);
			if (attendenceMode == "Select" || attendenceMode == "null") {
				alert("Please Select Attendence Mode.")
				document.getElementById("attendenceMode").focus();
				return false;
			}
			var empcode = document.getElementById("empcode").value;
			var empname = document.getElementById("empname").value;
			
	        var today = new Date(); 
	        var dd = today.getDate(); 
	        var mm = today.getMonth() + 1; 
	        var yyyy = today.getFullYear(); 
	        if (dd < 10) { 
	            dd = '0' + dd; 
	        } 
	        if (mm < 10) { 
	            mm = '0' + mm; 
	        } 
	        var today = dd + '/' + mm + '/' + yyyy; 
	        
			createCookie("CookieName",empcode,'365');
			//createCookie(attendenceMode,today,'1');
			document.registrationForm.method = "POST";
			document.registrationForm.action = "${EmpURL}";
			document.registrationForm.submit(); 
			$('#btn-signup').hide();
			
	}
	
	function createCookie(cookieName,cookieValue,daysToExpire)
    {
	  //alert(cookieName+"|"+cookieValue+"|"+daysToExpire);
      var date = new Date();
      date.setTime(date.getTime()+(daysToExpire*24*60*60*1000));
      document.cookie = cookieName + "=" + cookieValue + "; expires=" + date.toGMTString();
    }
	
	function getDate(){
		
		
        
        
	}

</script>

</html>