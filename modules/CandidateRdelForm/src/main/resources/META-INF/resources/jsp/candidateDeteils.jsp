<%@page import="com.redlatm.form.service.CandidateFormLocalServiceUtil"%>
<%@page import="com.redlatm.form.model.CandidateForm"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>
<%@page import="javax.portlet.PortletSession"%>
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
<liferay-theme:defineObjects />
<portlet:defineObjects />
<portlet:actionURL name="logout" var="logoutURL" />
<portlet:resourceURL var="uplodedFileNameURL"></portlet:resourceURL>
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
</head>
<body>
<style type="text/css">
.lfr-alert-container {
    display: none !important;
}
input {
    pointer-events: none;
    opacity: 0.9;
}
</style>
<style type="text/css">
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
<%
PortletSession sessionScope2 = renderRequest.getPortletSession();
String email = (String) sessionScope2.getAttribute("userId", PortletSession.APPLICATION_SCOPE);
CandidateForm applicationForm = null;
List<CandidateForm> candidateList = CandidateFormLocalServiceUtil.viewCandidateProfile(email);
for (CandidateForm candidateApplicationForm : candidateList) {
	applicationForm = candidateApplicationForm;
}
request.setAttribute("candidate", applicationForm);
String redirect=ParamUtil.getString(request, "backURL");
/* String fileName = applicationForm.getUPLOADFILE();
PortletSession sessionfile = actionRequest.getPortletSession();
sessionfile.setAttribute("fileName",fileName, PortletSession.APPLICATION_SCOPE); */
%>

<form class="form-horizontal" action="" method="post" enctype="multipart/form-data" >

<!-- Identification -->

 
 <div class="panel panel-primary">
 			<a class="btn btn-primary" style="float:right;" href="${logoutURL}">Logout</a>
			<a class="btn btn-primary" style="float:right;" href="<%=candidateChangePassword.toString()%>">Change Password</a>
			<a class="btn btn-primary" style="float:right;" href="<%=update.toString()%>">Update Profile</a>
			<a class="btn btn-primary" style="float:right;" href="<%=view.toString()%>">View Profile</a>
        	<a class="btn btn-primary" style="float:right;" href="<%=home.toString()%>">Home</a>
        <div class="panel-heading">
            <h3 class="panel-title" align="left">Identification</h3>
            
        </div>
        <div class="panel-body">
        
   
        </br>
     <div class="form-group">
      <label class="control-label col-sm-2" for="email">First Name:<strong class="astrx">*</strong></label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="firstName" value="<%=applicationForm.getFirstName()%>" >
      </div>
    </div>


      <div class="form-group">
      <label class="control-label col-sm-2" for="email">Surname:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="surname" value="<%=applicationForm.getSurname()%>" >
      </div>
    </div>


      <div class="form-group">
      <label class="control-label col-sm-2" for="email">Father / Spouse Name:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="fatherOrSpouse" value="<%=applicationForm.getFather_SpouseName()%>" >
      </div>
    </div>

      <div class="form-group">
      <label class="control-label col-sm-2" for="AadharNo">Aadhar Card No:<strong class="astrx"></strong></label>
      <div class="col-sm-8">
        <input type="text" class="form-control numberOnly" id="AadharNo" value="<%=applicationForm.getAadharCardNo()%>" maxlength="14" >
      </div>
    </div>

      <div class="form-group">
      <label class="control-label col-sm-2" for="panNumber">PAN Card No:<strong class="astrx">*</strong></label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="panNumber" value="<%=applicationForm.getPanCardNo().toUpperCase()%>">
      </div>
    </div>

      <div class="form-group">
      <label class="control-label col-sm-2" for="email">Bank Account No:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="BankAcNo" value="<%=applicationForm.getBankAccountNo()%>">
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Employment Exchange Regn No:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="EmpExResgnNo" value="<%=applicationForm.getEmploymentExRegnNo()%>">
      </div>
    </div>


    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Date of Birth:</label>
      <div class="col-sm-8">
      <%--  <input type="text" value="" id="dob" value="<%=applicationForm.dob%>" /> --%>
       
        <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getDateOfBirth()%>" / >
            
    </div>
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Native Location:</label>
      <div class="col-sm-8"> 
        <input type="text" class="form-control" id="NativeLoc" value="<%=applicationForm.getNativeLocation()%>">
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Mother Tongue:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="motherTongue" value="<%=applicationForm.getMotherTongue()%>" >
      </div>
    </div>


    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Identification mark:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="identificationMark" value="<%=applicationForm.getIdentificationMark()%>" >
      </div>
    </div>


    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Domicile:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="domicile" value="<%=applicationForm.getDomicile()%>" >
      </div>
    </div>


    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Languages known:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="languagesKnown" value="<%=applicationForm.getLanguagesKnown()%>">
      </div>
    </div>


    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Have you worked with Reliance earlier:</label>
      <div class="col-sm-8">
         <!--  extra-->
         
    
  <% 
  String relCompany=(String)applicationForm.getRelCompany();
  String relLocation=(String)applicationForm.getRelLocation();
  if("".equals(relCompany) && "".equals(relLocation)){
  %>       
  
         <strong>  
         <%!
         String relEx="no";
         %>
          No</strong>
     <%
	} else{%>
		
	<strong>
	Yes </strong>
	<% }%>
	
 
            	
         
      </div>
    </div>


<!-- Previous work exp fields strat-->
<div  id="previousExp" class="<%=relEx%>">
  <div class="form-group">
      <label class="control-label col-sm-2" for="">Company:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="Company" value="<%=applicationForm.getRelCompany()%>" >
      </div>
    </div>

      <div class="form-group">
      <label class="control-label col-sm-2" for="location">Location:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="location" value="<%=applicationForm.getRelLocation()%>"  >
      </div>
    </div>

      <div class="form-group">
      <label class="control-label col-sm-2" for="role">Role:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="Role" value="<%=applicationForm.getRelRole()%>" >
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="fromEx">From :</label>
      <div class="col-sm-4">
       <%--  <input type="text" class="form-control" id="fromEx" value="<%=applicationForm.fromEx%>"             ="From Date"> --%>
        <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getRelFromDate()%>" />
      </div>
        <label class="control-label col-sm-2" for="toEx">To :</label>
      <div class="col-sm-4">
        <%-- <input type="text" class="form-control" id="toEx" value="<%=applicationForm.toEx%>"             ="To Date"> --%>
        <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getRelToDate()%>" />
      </div>
    </div>

 

      <div class="form-group">
      <label class="control-label col-sm-2" for="reasonLeaving">Reason for leaving :</label>
      <div class="col-sm-8">
           <label class="control-label"  id="reasonLeaving"  ><%=applicationForm.getRelLeavingReason()%></label>
      </div>
    </div>

</div>
<!-- Previous work exp end -->


<div class="form-group">
      <label class="control-label col-sm-2" for="email">Physically Handicapped:</label>
      <div class="col-sm-8">
          <% 
  String ph_status=(String)applicationForm.getHandicapDetail();
  if("".equals(ph_status)){
  %>       
         <strong>   No</strong>
     <%
	} else{%>
		
	<strong>	Yes </strong>
	<% }%>
	
 
           
      </div>
    </div>

<!-- Ph option start-->

 <div class="form-group" id="phState">
      <label class="control-label col-sm-2" for="ph_State">Please state type and extent of handicap :</label>
      <div class="col-sm-8">
         <label class="control-label" id="ph_State"><%=applicationForm.getHandicapDetail()%></label>
      </div>
    </div>
<!-- Ph option start-->


    

    <div class="form-group">
      <label class="control-label col-sm-2" for="religion">Religion:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="religion" value="<%=applicationForm.getReligion()%>"  >
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Caste:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="caste" value="<%=applicationForm.getCaste()%>" >
      </div>
    </div>

     <div class="form-group">
      <label class="control-label col-sm-2" for="email">Sub caste:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="subCast" value="<%=applicationForm.getSubCaste()%>" >
      </div>
    </div>



    <div class="form-group">
      <label class="control-label col-sm-2" for="maritalStatus">Marital Status:</label>
      <div class="col-sm-8">
         <input type="text" value="<%=applicationForm.getMaritalStatus()%>" id="Bachelor">
         
      </div>
    </div>



    <div class="form-group">
      <label class="control-label col-sm-2" for="email">I will be able to join:</label>
      <div class="col-sm-8">
      <%--   <input type="radio" value="<%=applicationForm.getAbleToJoin()%>" value="Immediately" id="npImm">Immediately &nbsp;
         <input type="radio" value="<%=applicationForm.getAbleToJoin()%>" value="After" id="npAfter">After &nbsp;
          --%>
                 
  <% 
  String monthNp=(String)applicationForm.getAbleToMonth();
  String daysNp=(String)applicationForm.getAbleToDays();
  if("-1".equals(monthNp) && "-1".equals(daysNp)){
  %>       
         <strong> Immediately</strong>
     <%
	} else{%>
		
	<strong>	After </strong>
	<% }%>
	
 
         
         
         
      </div>
    </div>

<!-- np satrt -->
    <div class="form-group" id="np">
       <label class="control-label col-sm-2" for="npMonth">Month :</label>
      <div class="col-sm-4">
      <input class="form-control" id="npMonth" value="<%=applicationForm.getAbleToMonth()%>" />
      </div>
      <label class="control-label col-sm-2" for="npDays">Days :</label>
      <div class="col-sm-4">

        <input class="form-control" id="npDays" value="<%=applicationForm.getAbleToDays()%>" />
      </div>
     
    </div>
<!-- np ends -->

        </div>
  <!-- </div>->  



<!-- Gender -->


<div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">Contact Details</h3>
        </div>
        <div class="panel-body">
          
             <div class="form-group">
      <label class="control-label col-sm-2" for="Address">Address:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" rows="3" id="Address" value="<%=applicationForm.getAddress()%>"  >  
        <%-- <label class="control-label" for="Address" ><%=applicationForm.getAddress()%></label> --%>
      </div>
    </div>

       <div class="form-group">
      <label class="control-label col-sm-2" for="email">City:<strong class="astrx">*</strong></label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="city" value="<%=applicationForm.getCity()%>" >
      </div>
    </div>

 <div class="form-group">
      <label class="control-label col-sm-2" for="InState">State:<strong class="astrx">*</strong></label>
      <div class="col-sm-8">
      <input  type="text" class="form-control" id="InState" value="<%=applicationForm.getState()%>" />
      
      </div>
    </div>

   <div class="form-group">
      <label class="control-label col-sm-2" for="pinNumber">PIN:<strong class="astrx">*</strong></label>
      <div class="col-sm-8">
        <input type="text" class="form-control numberOnly" maxlength="6" id="pinNumber" value="<%=applicationForm.getPin()%>">
      </div>
    </div>


   <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email Address:<strong class="astrx">*</strong></label>
      <div class="col-sm-8">
        <input type="email" class="form-control" id="emailId" value="<%=applicationForm.getEmailAddress()%>" >
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="AlEmailId">Alternate Email ID:</label>
      <div class="col-sm-8">
        <input type="email" class="form-control" id="AlEmailId" value="<%=applicationForm.getAlternateEmailID()%>">
      </div>
    </div>

 <div class="form-group">
      <label class="control-label col-sm-2" for="mobNumberber">Mobile:<strong class="astrx">*</strong></label>
      <div class="col-sm-8">
        <input type="text" class="form-control numberOnly" maxlength="10" id="mobNumberber" value="<%=applicationForm.getMobile()%>" >
      </div>
    </div>

          

<div class="form-group">
      <label class="control-label col-sm-2" for="AlMobNumberber">Alternate Mobile:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control numberOnly" maxlength="10" id="AlMobNumberber" value="<%=applicationForm.getAlternateMobile()%>" >
      </div>
    </div>


   <div class="form-group">
      <label class="control-label col-sm-2" for="ALPersonName">Name of person whose Alternate No given:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="ALPersonName" value="<%=applicationForm.getPersonAlternateNoGiven()%>" >
      </div>
    </div>

        </div>
    </div>

    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">Skill Set</h3>
        </div>
        <div class="panel-body">
      
      <div class="form-group">
      <label class="control-label col-sm-2" for="mainQualification">Main Qualification:</label>
      <div class="col-sm-8">
      <input class="form-control" id="mainQualification" value="<%=applicationForm.getMainQualification()%>" />
      </div>
    </div>


<!--check-->
  <%--  <div class="form-group" id="OtherQaul">
      <label class="control-label col-sm-2" for="OtherQaul">Other:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="OtherQaul" value="<%=applicationForm.getOtherQ%>"             ="Other Qualification">
      </div>
    </div> --%>


   <div class="form-group">
      <label class="control-label col-sm-2" for="specialization">Specialization:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="specialization" value="<%=applicationForm.getSpecialization()%>">
      </div>
    </div>


  <div class="form-group">
      <label class="control-label col-sm-2" for="mainQualification">Trade:</label>
      <div class="col-sm-8">
      <input class="form-control" id="trade" value="<%=applicationForm.getTrade()%>" />
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="totalExp">Total Years of Experience:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control numberOnly" maxlength="5" id="totalExp" value="<%=applicationForm.getTotalYrExperience()%>">
      </div>
    </div>

   <div class="form-group">
      <label class="control-label col-sm-2" for="skillLevel">Skill Level / Proficiency:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="skillLevel" value="<%=applicationForm.getSkill_Proficiency()%>" >
      </div>
    </div>


   <div class="form-group">
      <label class="control-label col-sm-2" for="securityClearance">Security Clearance:</label>
      <div class="col-sm-8">
       
<div class="form-group">
      <label class="control-label col-sm-2" for="scFrom">From:</label>
      <div class="col-sm-8">
        <label  class="control-label" id="scFrom" ><%=applicationForm.getSECURITYCLEARFROM()%></label>
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="ScvalidTill">Valid till:</label>
      <div class="col-sm-8">
       <%--  <input type="text" class="form-control" id="ScvalidTill" value="<%=applicationForm.ScvalidTill%>"             ="Valid till"> --%>
        <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getSECURITYCLEARTILL()%>" />
      </div>
    </div>

      </div>
    </div>




   <div class="form-group">
      <label class="control-label col-sm-2" for="medicalFitness">Medical Fitness:</label>
      <div class="col-sm-8">
       

        

   <div class="form-group">
      <label class="control-label col-sm-2" for="docName">Doctor's name:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="docName" value="<%=applicationForm.getMEDICALFITDOCNAME()%>" >
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="docAddres">Doctor's address:</label>
      <div class="col-sm-8">
        <label class="control-label" id="docAddres" ><%=applicationForm.getMEDICALFITDOCADDR()%></label>
      </div>
    </div>

<div class="form-group">
      <label class="control-label col-sm-2" for="docRegnNo">Doctor's Regn No.:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="docRegnNo" value="<%=applicationForm.getMEDICALFITDOCREGNNO()%>" >
      </div>
    </div>

	
	

    <div class="form-group">
      <label class="control-label col-sm-2" for="mFvalidTill">Valid till:</label>
      <div class="col-sm-8">
       <%--  <input type="text" class="form-control" id="mFvalidTill" value="<%=applicationForm.mFvalidTill%>"             ="Valid till"> --%>
        <input type ="text"  class="datepicker-13 form-control" value="<%=applicationForm.getMEDICALFITDOCTILL()%>" />
      </div>
    </div>

      </div>
    </div>

        </div>
    </div>


    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">Current Employer Details</h3>
        </div>
        <div class="panel-body">
          

	  
       
   <div class="form-group">
      <label class="control-label col-sm-2" for="CEName">Current Company Name:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="CEName" value="<%=applicationForm.getCurrentCompanyName()%>"  >
      </div>
    </div>

   <div class="form-group">
      <label class="control-label col-sm-2" for="CEaddress ">Company Address:</label>
      <div class="col-sm-8">
        <label  class="control-label" id="CEaddress"  ><%=applicationForm.getCurrentCompanyAddress()%></label>

      </div>
    </div>

   
   
   <div class="form-group">
      <label class="control-label col-sm-2" for="workingSince">Working since:</label>
      <div class="col-sm-8">
        <%-- <input type="text" class="form-control" id="workingSince" value="<%=applicationForm.workingSince%>"             ="Working since"> --%>
         <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getWorkingSinceDate()%>" />
      </div>
    </div>


 <div class="form-group">
      <label class="control-label col-sm-2" for="designation">Designation:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="designation" value="<%=applicationForm.getDesignation()%>" >
      </div>
    </div>







       
   <div class="form-group">
      <label class="control-label col-sm-2" for="ctcFixed">Fixed CTC (Rs. lakhs pa):</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="ctcFixed" value="<%=applicationForm.getCTCFixed()%>"   >
      </div>
    </div>

   <div class="form-group">
      <label class="control-label col-sm-2" for="ctcVariable ">Variable CTC (Rs. lakhs pa):</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="ctcVariable" value="<%=applicationForm.getCTCVariable()%>"   ></input>

      </div>
    </div>

   <div class="form-group">
      <label class="control-label col-sm-2" for="ctcTotal ">Total CTC (Rs. lakhs pa):</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="ctcTotal" value="<%=applicationForm.getCTCTotal()%>"   >
      </div>
    </div>

   <div class="form-group">
      <label class="control-label col-sm-2" for="role">Role:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="role" value="<%=applicationForm.getRole()%>"     >
      </div>
    </div>

      <div class="form-group">
      <label class="control-label col-sm-2" for="Location">Location:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="Location" value="<%=applicationForm.getLocation()%>" >
      </div>
    </div>


      <div class="form-group">
      <label class="control-label col-sm-2" for="npDuration">Notice Period  &nbsp&nbsp(in months) :</label>
      <div class="col-sm-8">
        
         <input class="form-control" id="npDuration" value="<%=applicationForm.getNoticePeriod()%>" />
      </div>
    </div>

  

    


        </div>
    </div>


    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">Previous Employer Details</h3>
        </div>
        <div class="panel-body">
          
          <table class="table table-bordered">
    <thead>
        <tr>
            <th>Sr.no</th>
            <th>Company Name</th>
            <th>From date</th>
            <th>To date</th>
            <th>Location</th>
            <th>Designation</th>
            <th>Fixed CTC (Rs. lakhs pa)</th>
            <th>Variable CTC (Rs. lakhs pa)</th>
            <th>Total CTC (Rs. lakhs pa)</th>
            <th>Remark, if any</th>

        </tr>
    </thead>
    <tbody>
        <tr>
            <td>1</td>
            <td>
                <input value="<%=applicationForm.getFirstCompanyName()%>" class="form-control input-sm" type="text"  >
            </td>
            <td>
               <%--  <input value="<%=applicationForm.f_from_1%>"             ="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp14929380173410"> --%>
                <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getFirstFromDate()%>" />
            </td>
            <td>
               <%--  <input value="<%=applicationForm.f_to_1%>"             ="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017347"> --%>
                <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getFirstToDate()%>" />
            </td>
            <td>
                <input value="<%=applicationForm.getFirstCLocation()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getFirstCDesignation()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getFirstFixedCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getFirstVariableCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getFirstTotalCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getFirstRemarkIfAny()%>" class="form-control input-sm" type="text">
            </td>
        </tr>

        <tr>
            <td>2</td>
            <td>
                <input value="<%=applicationForm.getSecoundCompanyName()%>" class="form-control input-sm" type="text">
            </td>
            <td>
               <%--  <input value="<%=applicationForm.f_from_2%>"             ="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017348"> --%>
                 <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getSecoundFromDate()%>" />
            </td>
            <td>
               <%--  <input value="<%=applicationForm.f_to_2%>"             ="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017349"> --%>
                 <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getSecoundToDate()%>" />
            </td>
            <td>
                <input value="<%=applicationForm.getSecoundCLocation()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getSecoundCDesignation()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getSecoundFixedCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getSecoundVariableCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getSecoundTotalCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getSecoundRemarkIfAny()%>" class="form-control input-sm" type="text">
            </td>
        </tr>

        <tr>
            <td>3</td>
            <td>
                <input value="<%=applicationForm.getThirdCompanyName()%>" class="form-control input-sm" type="text">
            </td>
            <td>
              <%--   <input value="<%=applicationForm.f_from_3%>"             ="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017350"> --%>
                 <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getThirdFromDate()%>" />
            </td>
            <td>
               <%--  <input value="<%=applicationForm.f_to_3%>"             ="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017351"> --%>
                 <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getThirdToDate()%>" />
            </td>
            <td>
                <input value="<%=applicationForm.getThirdCLocation()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getThirdCDesignation()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getThirdFixedCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getThirdVariableCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getThirdTotalCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getThirdRemarkIfAny()%>" class="form-control input-sm" type="text">
            </td>
        </tr>

        <tr>
            <td>4</td>
            <td>
                <input value="<%=applicationForm.getForthCompanyName()%>" class="form-control input-sm" type="text">
            </td>
            <td>
              <%--   <input value="<%=applicationForm.f_from_4%>"             ="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017352"> --%>
               <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getForthFromDate()%>" />
            </td>
            <td>
               <%--  <input value="<%=applicationFormf_to_4 %>"             ="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017353"> --%>
                <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getForthToDate()%>" />
            </td>
            <td>
                <input value="<%=applicationForm.getForthCLocation()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getForthCDesignation()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getForthFixedCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getForthVariableCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getForthTotalCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getForthRemarkIfAny()%>" class="form-control input-sm" type="text">
            </td>
        </tr>

        <tr>
            <td>5</td>
            <td>
                <input value="<%=applicationForm.getFifthCompanyName()%>" class="form-control input-sm" type="text">
            </td>
            <td>
               <%--  <input value="<%=applicationForm.f_from_5%>"             ="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017354"> --%>
                 <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getFifthFromDate()%>" />
            </td>
            <td>
                <%-- <input value="<%=applicationForm. %>f_to_5"             ="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017355"> --%>
                 <input type ="text" class="datepicker-13 form-control" value="<%=applicationForm.getFifthToDate()%>" />
            </td>
            <td>
                <input value="<%=applicationForm.getFifthCLocation()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getFifthCDesignation()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getFifthFixedCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getFifthVariableCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getFifthTotalCTC()%>" class="form-control input-sm" type="text">
            </td>
            <td>
                <input value="<%=applicationForm.getFifthRemarkIfAny()%>" class="form-control input-sm" type="text">
            </td>
        </tr>

    </tbody>
</table>


    
        </div>
    </div>


    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">Education Details</h3>
        </div>
        <div class="panel-body">
          
          <table class="table table-bordered">
  <thead>
    <tr>
<th> Sr.no</th>
<th>Qualification</th>
<th> University / Institute   </th>
<th>Month & Year of Passing</th>
<th>% / Grade</th>

    </tr>
  </thead>
  <tbody>
    <tr>
<td>1</td>
<td><input class="form-control input-sm" type="text" value="SSC (10th)" readonly=""></td>
<td><input value="<%=applicationForm.getSSCUniversityInstitute()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getSSCYearOfPassing()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getSSCGrade()%>" class="form-control input-sm" type="text"></td>

    </tr>
      <tr>
<td>2</td>
<td><input class="form-control input-sm" type="text" value="HSC (12th)" readonly=""></td>
<td><input value="<%=applicationForm.getHSCUniversityInstitute()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getHSCYearOfPassing()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getHSCGrade()%>" class="form-control input-sm" type="text"></td>

    </tr>
    <tr>
<td>3</td>
<td><input class="form-control input-sm" type="text" value="Basic/Graduation" readonly=""></td>
<td><input value="<%=applicationForm.getGradUniversityInstitute()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getGradYearOfPassing()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getGradGrade()%>" class="form-control input-sm" type="text"></td>

    </tr>


    <tr>
<td>4</td>
<td><input class="form-control input-sm" type="text" value="Post Graduation" readonly=""></td>
<td><input value="<%=applicationForm.getPGUniversityInstitute()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getPGYearOfPassing()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getPGGrade()%>" class="form-control input-sm" type="text"></td>

    </tr>
    
      <tr>
<td>5</td>
<td><input class="form-control input-sm" type="text" value="Doctorate/Ph.D." readonly=""></td>
<td><input value="<%=applicationForm.getPhDUniversityInstitute()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getPhDYearOfPassing()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getPhDGrade()%>" class="form-control input-sm" type="text"></td>

    </tr>

  <tr>
<td>6</td>
<td><input value="<%=applicationForm.getOther1Qualification()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getOther1UniversityInstitute()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getOther1YearOfPassing()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getOther1Grade()%>" class="form-control input-sm" type="text"></td>

    </tr>




    <tr>
<td>7</td>
<td><input value="<%=applicationForm.getOther2Qualification()%>" class="form-control input-sm" type="text" ></td>
<td><input value="<%=applicationForm.getOther2UniversityInstitute()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getOther2YearOfPassing()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getOther2Grade()%>" class="form-control input-sm" type="text"></td>

    </tr>


    <tr>
<td>8</td>
<td><input value="<%=applicationForm.getOther3Qualification()%>" class="form-control input-sm" type="text"  ></td>
<td><input value="<%=applicationForm.getOther3UniversityInstitute()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getOther3YearOfPassing()%>" class="form-control input-sm" type="text"></td>
<td><input value="<%=applicationForm.getOther3Grade()%>" class="form-control input-sm" type="text"></td>

    </tr>
 
  </tbody>
  </table>
        </div>
    </div>
 
  <%-- <div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">File Download</h3>
        </div>
        <div class="panel-body">
   			 <div class="form-group">
     			 <label class="control-label col-sm-2 file" for="fileUpload">Download Candidate Profile:</label>
      			<div class="col-sm-8">
       			 	<a href="<portlet:resourceURL/>" onclick="uplodedFileNameURL">Download file</a> 
       			 	<aui:button type="" name="mainFileName" value="<%=applicationForm.getUPLOADFILE()%>">Download file </aui:button>
       			 	
      			</div>
    		</div>
     	</div>
    </div> --%>

</form>
</body>

</html>