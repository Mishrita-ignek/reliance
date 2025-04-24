<%@page import="com.redlatm.form.service.CandidateFormLocalServiceUtil"%>
<%@page import="com.redlatm.form.model.CandidateForm"%>
<%@ include file="/init.jsp" %>
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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RDEL ATM</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/jquery-ui.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>
<script src="<%=request.getContextPath()%>/js/sweetalert.min.js"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/sweetalert.min.css">
	
<style type="text/css">
.lfr-alert-container {
    display: none !important;
}
.col-sm-8 {
    width: 70.666667%;
}

.portlet-content {
border:none !important;
}

input {
    margin-bottom: 15px;
}
.alert-success {
    display: none !important;
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
<script>
var changePassResponse="<%=request.getAttribute("changePassResponse")%>";
if(changePassResponse != "null"){	
	swal("", changePassResponse, "success");
}
</script>
</head>

<body>
<%
Long caId = null;
String userId = null;
PortletSession sessionScope = renderRequest.getPortletSession();
List<CandidateForm> candidateList = (List) sessionScope.getAttribute("candidateForm", PortletSession.APPLICATION_SCOPE);
for(CandidateForm form : candidateList){
	caId = form.getCaId();
	userId = form.getEmailAddress();
	System.out.println(" Candidate Id : "+caId);
	System.out.println(" updateForm || caId : "+caId);
}
CandidateForm applicationForm=CandidateFormLocalServiceUtil.getCandidateForm(caId);
request.setAttribute("candidate", applicationForm);
String redirect=ParamUtil.getString(request, "backURL");
%>
<%
	PortletSession sessionScope2 = renderRequest.getPortletSession();
	sessionScope2.setAttribute("userId",userId, PortletSession.APPLICATION_SCOPE);
	PortletURL home = renderResponse.createRenderURL();
	home.setParameter("mvcPath", "/jsp/candidatehome.jsp");
	PortletURL candidateChangePassword = renderResponse.createRenderURL();
	candidateChangePassword.setParameter("mvcPath", "/jsp/candidate_changepassword.jsp");
	PortletURL update = renderResponse.createRenderURL();
	update.setParameter("mvcPath", "/jsp/updatecandidateregform.jsp");
	PortletURL view = renderResponse.createRenderURL();
	view.setParameter("mvcPath", "/jsp/candidateDeteils.jsp");
%>

	<div class="panel panel-primary">
	<a class="btn btn-primary" style="float:right;" href="${logoutURL}">Logout</a>
	<a class="btn btn-primary" style="float:right;" href="<%=candidateChangePassword.toString()%>">Change Password</a>
	<a class="btn btn-primary" style="float:right;" href="<%=update.toString()%>">Update Profile</a>
	<a class="btn btn-primary" style="float:right;" href="<%=view.toString()%>">View Profile</a>
	<a class="btn btn-primary" style="float:right;" href="<%=home.toString()%>">Home</a>
		<div class="panel-heading">
			<h3 class="panel-title" style="padding-right: 950px;">Candidate Profile</h3>
		</div>
		
		    <div class="panel-body">
		    <div class="form-group">
			<label class="control-label col-sm-2" for="email">First Name:</label>
			<div class="col-sm-8">
				<%-- <label class="control-label" ><%=applicationForm.getFirstName()%> </label> --%>
				<input type="text" class="form-control" id="firstName"
					name="<portlet:namespace/>firstName"
					value="<%=applicationForm.getFirstName()%>" readonly="readonly">
			</div>
		</div>
		 <div class="form-group">
      <label class="control-label col-sm-2" for="AadharNo">Aadhar Card No:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control numberOnly" id="AadharNo" name="<portlet:namespace/>AadharNo" maxlength="14" value="<%=applicationForm.getAadharCardNo()%>" readonly="readonly" >
      </div>
    </div>
    
    
   <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email Address:</label>
      <div class="col-sm-8">
        <%-- <label class="control-label" ><%=applicationForm.getEmailAddress()%> </label> --%>
		<input type="email" class="form-control" id="emailId" name="<portlet:namespace/>emailId" value="<%=applicationForm.getEmailAddress()%>" readonly="readonly" > 
      </div>
    </div>
    
     <div class="form-group">
      <label class="control-label col-sm-2" for="mobNumberber">Mobile:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control numberOnly" maxlength="10" id="mobNumberber" name="<portlet:namespace/>mobNumberber" value="<%=applicationForm.getMobile()%>" readonly="readonly" >
      </div>
    </div>
    
     <div class="form-group">
      <label class="control-label col-sm-2" for="mobNumberber">Qualification :</label>
      <div class="col-sm-8">
        <input type="text" class="form-control numberOnly" maxlength="10" id="mainQualification" name="<portlet:namespace/>mainQualification" value="<%=applicationForm.getMainQualification()%>" readonly="readonly" >
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="specialization">Specialization:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="specialization" name="<portlet:namespace/>specialization" value="<%=applicationForm.getSpecialization()%>" readonly="readonly" >
      </div>
    </div>
	    </div>
	</div>

</body>
<script>
var successfullyLogin="<%=request.getAttribute("successfullyLogin")%>";
if(successfullyLogin != "null"){	
	swal("Welcome", "<%=applicationForm.getFirstName()%>", "success");
}
</script>
</html>