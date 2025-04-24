<%@page import="com.redlatm.form.service.CandidateFormLocalServiceUtil"%>
<%@page import="com.redlatm.form.model.CandidateForm"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="org.apache.taglibs.standard.tag.el.core.ForEachTag"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<portlet:renderURL var="editGreetingURL">
	<portlet:param name="jspPage" value="/jsp/candidate_login.jsp" />
</portlet:renderURL>
<%-- <p><a href="<%= editGreetingURL %>">Candidate Login Form </a></p> --%>
<portlet:resourceURL var="CandidateApplicationForm" />
<portlet:actionURL name="updateCandidateForm" var="updateCandidateForm">
</portlet:actionURL>
<!DOCTYPE html5>
<html>
<head>
<style>
.portlet-content {
	border: none !important;
}

.lfr-alert-container {
	display: none !important;
}
</style>
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
<style>
.lableF {
	color: red;
	margin-left: 197px;
}

.astrx {
	color: red;
}

select.ui-datepicker-month {
	color: black;
}

select.ui-datepicker-year {
	color: black;
}

.ui-widget-header {
	border: 1px solid #337AB7;
	background: #337AB7 url(images/ui-bg_gloss-wave_35_f6a828_500x100.png)
		50% 50% repeat-x;
}
</style>
<style type="text/css">
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

.uppercase {
	text-transform: uppercase;
}
</style>
</head>
<body>
	<%
		/* Long caId = null;
		String userId = null;
		PortletSession sessionScope = renderRequest.getPortletSession();
		CandidateForm applicationForm = null;
		List<CandidateForm> candidateList = (List) sessionScope.getAttribute("candidateForm",
				PortletSession.APPLICATION_SCOPE);
		//System.out.println("CandidateForm || updatecandidateregform.jsp || CandidateList(List) : " + candidateList);
		for (CandidateForm form : candidateList) {
			caId = form.getCaId();
			userId = form.getEmailAddress();
			applicationForm = form;
		}
		CandidateForm candidateForm = CandidateFormLocalServiceUtil.getCandidateForm(caId);
		//System.out.println("CandidateForm || updatecandidateregform.jsp || ApplicationForm : " + applicationForm);

		request.setAttribute("candidate", applicationForm);
		String redirect = ParamUtil.getString(request, "backURL");

		PortletSession sessionScope2 = renderRequest.getPortletSession();
		sessionScope2.setAttribute("userId", userId, PortletSession.APPLICATION_SCOPE); */
		
		PortletSession sessionScope2 = renderRequest.getPortletSession();
		String email = (String) sessionScope2.getAttribute("userId", PortletSession.APPLICATION_SCOPE);
		CandidateForm candidateForm = null;
		List<CandidateForm> candidateList = CandidateFormLocalServiceUtil.viewCandidateProfile(email);
		//System.out.println("CandidateForm || updatecandidateregform.jsp || candidateList : " + candidateList);
		for (CandidateForm candidateApplicationForm : candidateList) {
			candidateForm = candidateApplicationForm;
		}
		request.setAttribute("candidate", candidateForm);
		String redirect=ParamUtil.getString(request, "backURL");
	%>
	<div class="panel panel-primary">
		<a class="btn btn-primary" style="float: right;" href="${logoutURL}">Logout</a>
		<a class="btn btn-primary" style="float: right;"
			href="<%=candidateChangePassword.toString()%>">Change Password</a> <a
			class="btn btn-primary" style="float: right;"
			href="<%=update.toString()%>">Update Profile</a> <a
			class="btn btn-primary" style="float: right;"
			href="<%=view.toString()%>">View Profile</a> <a
			class="btn btn-primary" style="float: right;"
			href="<%=home.toString()%>">Home</a>
		<div class="panel-heading">
			<h3 class="panel-title">&nbsp</h3>
		</div>
		<div class="panel-body">

			<h2 align="center">Candidate Application Form</h2>

			<br>
			<p>Reliance Defence and Engineering Limited operates an
				integrated shipbuilding and Engineering facility - Reliance Shipyard
				at Pipavav, District Amreli (Near Rajula) Gujarat.</p>

			<p>Reliance Shipyard has a great infrastructure and highly
				capable professionals.</P>

			<p>It is in the business of</P>
			<p>&nbsp&nbsp1. Designing and Constructing new Ships for Indian
				Navy, Indian Coast Guard, ONGC and a major international client.</P>
			<p>&nbsp&nbsp2. Repairs and Refit of Indian Naval Ships and Oil
				Rigs of ONGC</P>

			<p>The company commenced construction of ships during January
				2011 and thereafter have delivered 19 New Builds to foreign as well
				as domestic clients. The product line ranged from large bulk
				carriers to offshore supply and support vessels.</P>

			<p>The company also completed repairs and modifications of 09
				Mobile Offshore Drilling Units for domestic and foreign clients. The
				company is presently carrying out major modifications of 2 Oil rigs.</P>

			<p>The company is the private sector shipyard in India to receive
				order for Naval Combat ships from Indian Navy. Presently, the
				company has an order book of 20 defence and para defence ships for
				the Ministry of Defence, Government of India.</P>

			<p>As a part of Honorable Prime Minister Shri Narendra Modi's
				program of 'Skill India' we want to create Reliance Shipyard as a
				Centre of Excellence.</P>

			<p>For this purpose, we want all young, skilled and capable men
				and women, to be a part of this journey. We have professional
				Technical Partners who would be providing services to us and you can
				also form a part of their team.</P>

			<p>This offers not only an opportunity to earn your livelihood,
				but also enables you to grow and build new capabilities. Most
				importantly, it allows you to participate and realise Honorable
				Prime Minister Shri Narendra Modi's vision of 'Make in India'.</P>

			<p>So, we request you to please register yourself on our
				web-portal with your complete details so that we can match your
				skill-sets and our Technical Partners can be in touch with you. You
				may please register below.</P>

			<p>
				In case of any query, please email to <a
					href="mailto:Jignesh.Dhandhalya@RelianceADA.com" target="_top">Jignesh.Dhandhalya@RelianceADA.com</a>
			</P>

			<b><strong>Caution:</strong></b>
			<p>We wish to caution job seekers and educational institutions at
				large that Reliance Group, as a policy, does not charge or collect
				fees of any kind from educational institutions or from candidates
				for participation in a recruitment event or to receive Offers of
				employment.</P>

			</br>
		</div>
	</div>
	<form class="form-horizontal" action="<%=updateCandidateForm%>"
		method="post" enctype="multipart/form-data">

		<!-- Identification -->
		<input type="hidden" class="form-control" id="caId"
			name="<portlet:namespace/>caId"
			value="<%=candidateForm.getCaId()%>">
		<%-- <h2> Application ID: <%=applicationForm.getCaId() %></h2> --%>

		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title">Identification</h3>
			</div>
			<div class="panel-body">

				<span class="lableF"> All fields marked * are mandatory </span> </br>
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">First
						Name:</label>
					<div class="col-sm-8">
						<%-- <label class="control-label" ><%=applicationForm.getFirstName()%> </label> --%>
						<input type="text" class="form-control" id="firstName"
							name="<portlet:namespace/>firstName"
							value="<%=candidateForm.getFirstName()%>" readonly="readonly">
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Surname:</label>
					<div class="col-sm-8">
						<%-- <label class="control-label" ><%=applicationForm.getSurname()%> </label> --%>
						<input type="text" class="form-control" id="surname"
							name="<portlet:namespace/>surname"
							value="<%=candidateForm.getSurname()%>" readonly="readonly">
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Father /
						Spouse Name:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="fatherOrSpouse"
							name="<portlet:namespace/>fatherOrSpouse"
							placeholder="Father / Spouse Name"
							value="<%=candidateForm.getFather_SpouseName()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="AadharNo">Aadhar
						Card No:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control numberOnly" id="AadharNo"
							name="<portlet:namespace/>AadharNo" maxlength="12"
							value="<%=candidateForm.getAadharCardNo()%>" readonly="readonly">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="panNumber">PAN
						Card No:<strong class="astrx">*</strong>
					</label>
					<div class="col-sm-8">
						<input type="text" class="form-control uppercase" id="panNumber"
							name="<portlet:namespace/>panNumber" placeholder="PAN Card No."
							maxlength="10" value="<%=candidateForm.getPanCardNo()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Bank
						Account No:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="BankAcNo"
							name="<portlet:namespace/>BankAcNo"
							placeholder="Bank Account No."
							value="<%=candidateForm.getBankAccountNo()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Employment
						Exchange Regn No:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="EmpExResgnNo"
							name="<portlet:namespace/>EmpExResgnNo"
							placeholder="Employment Exchange Regn No."
							value="<%=candidateForm.getEmploymentExRegnNo()%>">
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Date of
						Birth:</label>
					<div class="col-sm-8">
						<%--  <input type="text" value="" id="dob" name="<portlet:namespace/>dob" /> --%>

						<input type="text" class="datepicker-13 form-control"
							name="<portlet:namespace/>dob"
							value="<%=candidateForm.getDateOfBirth()%>" />

					</div>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Native
					Location:</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="NativeLoc"
						name="<portlet:namespace/>NativeLoc"
						placeholder="Native Location."
						value="<%=candidateForm.getNativeLocation()%>">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Mother
					Tongue:</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="motherTongue"
						name="<portlet:namespace/>motherTongue"
						placeholder="Mother Tongue."
						value="<%=candidateForm.getMotherTongue()%>">
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Identification
					mark:</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="identificationMark"
						name="<portlet:namespace/>identificationMark"
						placeholder="Identification mark."
						value="<%=candidateForm.getIdentificationMark()%>">
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Domicile:</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="domicile"
						name="<portlet:namespace/>domicile" placeholder="Domicile."
						value="<%=candidateForm.getDomicile()%>">
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Languages
					known:</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="languagesKnown"
						name="<portlet:namespace/>languagesKnown"
						placeholder="Languages known."
						value="<%=candidateForm.getLanguagesKnown()%>">
				</div>
			</div>			

			<%
				String compani = candidateForm.getRelCompany();
				String location = candidateForm.getRelLocation();
				String role = candidateForm.getRelRole();
				String fromDate = candidateForm.getRelFromDate();
				String toDate = candidateForm.getRelToDate();
				String leavingReason = candidateForm.getRelLeavingReason();			

				if(!("".equals(compani)) || !("".equals(location)) || !("".equals(role)) || !("".equals(fromDate)) || !("".equals(toDate)) || !("".equals(leavingReason))){
								
				/* if (languagesKnown != "" || languagesKnown != null || location != "" || location != null || role != null
						|| role != "" || fromDate != "" || fromDate != null || toDate != "" || toDate != null
						|| leavingReason != "" || leavingReason != null) {	 */				
			%>
			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Have you
					worked with Reliance earlier:</label>
				<div class="col-sm-8">
					<input type="radio" name="workOption" id="r_Yes" checked="checked">Yes &nbsp;
					<input type="radio" name="workOption" id="r_No"
						onclick="return resetEmployee()">No
				</div>
			</div>


			<!-- Previous work exp fields strat-->
			<div id="previousExped">
				<div class="form-group">
					<label class="control-label col-sm-2" for="">Company:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="Company"
							name="<portlet:namespace/>Company" placeholder="Company."
							value="<%=candidateForm.getRelCompany()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="location">Location:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="location"
							name="<portlet:namespace/>location" placeholder="Location."
							value="<%=candidateForm.getRelLocation()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="role">Role:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="Role"
							name="<portlet:namespace/>Role" placeholder="Role."
							value="<%=candidateForm.getRelRole()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="fromEx">From :</label>
					<div class="col-sm-4">
						<%--  <input type="text" class="form-control" id="fromEx" name="<portlet:namespace/>fromEx" placeholder="From Date"> --%>
						<input type="text" class="datepicker-13 form-control" id="fromEx"
							name="<portlet:namespace/>fromEx"
							value="<%=candidateForm.getRelFromDate()%>">
					</div>
					<label class="control-label col-sm-2" for="toEx">To :</label>
					<div class="col-sm-4">
						<%-- <input type="text" class="form-control" id="toEx" name="<portlet:namespace/>toEx" placeholder="To Date"> --%>
						<input type="text" class="datepicker-13 form-control" id="toEx"
							name="<portlet:namespace/>toEx"
							value="<%=candidateForm.getRelToDate()%>" />
					</div>
				</div>



				<div class="form-group">
					<label class="control-label col-sm-2" for="reasonLeaving">Reason
						for leaving :</label>
					<div class="col-sm-8">
						<textarea class="form-control" rows="4" id="reasonLeaving"
							name="<portlet:namespace/>reasonLeaving"
							placeholder="Reason for leaving." value=""><%=candidateForm.getRelLeavingReason()%></textarea>
					</div>
				</div>
			</div>	
				<%
					}else{						
					
				%>
				<div class="form-group">
				<label class="control-label col-sm-2" for="email">Have you
					worked with Reliance earlier:</label>
				<div class="col-sm-8">
					<input type="radio" name="workOption" id="r_Yes">Yes &nbsp;
					<input type="radio" name="workOption" id="r_No"
						onclick="return resetEmployee()" checked="checked">No
				</div>
			</div>


			<!-- Previous work exp fields strat-->
			<div id="previousExp">
				<div class="form-group">
					<label class="control-label col-sm-2" for="">Company:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="Company"
							name="<portlet:namespace/>Company" placeholder="Company."
							value="<%=candidateForm.getRelCompany()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="location">Location:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="location"
							name="<portlet:namespace/>location" placeholder="Location."
							value="<%=candidateForm.getRelLocation()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="role">Role:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="Role"
							name="<portlet:namespace/>Role" placeholder="Role."
							value="<%=candidateForm.getRelRole()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="fromEx">From :</label>
					<div class="col-sm-4">
						<%--  <input type="text" class="form-control" id="fromEx" name="<portlet:namespace/>fromEx" placeholder="From Date"> --%>
						<input type="text" class="datepicker-13 form-control" id="fromEx"
							name="<portlet:namespace/>fromEx"
							value="<%=candidateForm.getRelFromDate()%>">
					</div>
					<label class="control-label col-sm-2" for="toEx">To :</label>
					<div class="col-sm-4">
						<%-- <input type="text" class="form-control" id="toEx" name="<portlet:namespace/>toEx" placeholder="To Date"> --%>
						<input type="text" class="datepicker-13 form-control" id="toEx"
							name="<portlet:namespace/>toEx"
							value="<%=candidateForm.getRelToDate()%>" />
					</div>
				</div>



				<div class="form-group">
					<label class="control-label col-sm-2" for="reasonLeaving">Reason
						for leaving :</label>
					<div class="col-sm-8">
						<textarea class="form-control" rows="4" id="reasonLeaving"
							name="<portlet:namespace/>reasonLeaving"
							placeholder="Reason for leaving." value=""><%=candidateForm.getRelLeavingReason()%></textarea>
					</div>
				</div>
			</div>	
				
				<%
					}
				%>



			
			<!-- Previous work exp end -->

			<%
					String hanidcap = candidateForm.getHandicapDetail();
					if(!("".equals(hanidcap))){											
			%>
				<div class="form-group">
				<label class="control-label col-sm-2" for="email">Physically
					Handicapped:</label>
				<div class="col-sm-8">
					<input type="radio" name="phOption" id="ph_Yes" checked="checked">Yes &nbsp;
					<input type="radio" name="phOption" id="ph_No" onclick="return resetPhyHandicap();">No
				</div>
			</div>	
			
			<div class="form-group" id="phyState">
				<label class="control-label col-sm-2" for="ph_State">Please
					state type and extent of handicap :</label>
				<div class="col-sm-8">
					<textarea class="form-control" rows="3" id="ph_State"
						name="<portlet:namespace/>ph_State"
						value=""><%=candidateForm.getHandicapDetail()%></textarea>
				</div>
			</div>
			<%
					}else{							
			%>
					<div class="form-group">
				<label class="control-label col-sm-2" for="email">Physically
					Handicapped:</label>
				<div class="col-sm-8">
					<input type="radio" name="phOption" id="ph_Yes">Yes &nbsp;
					<input type="radio" name="phOption" id="ph_No" onclick="return resetPhyHandicap();" checked="checked">No
				</div>
			</div>

			<!-- Ph option start-->

			<div class="form-group" id="phState">
				<label class="control-label col-sm-2" for="ph_State">Please
					state type and extent of handicap :</label>
				<div class="col-sm-8">
					<textarea class="form-control" rows="3" id="ph_State"
						name="<portlet:namespace/>ph_State"
						value=""><%=candidateForm.getHandicapDetail()%></textarea>
				</div>
			</div>
			<!-- Ph option start-->
			<%
					}
			%>
			
			<div class="form-group">
				<label class="control-label col-sm-2" for="religion">Religion:</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="religion"
						name="<portlet:namespace/>religion" placeholder="Religion."
						value="<%=candidateForm.getReligion()%>">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Caste:</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="caste"
						name="<portlet:namespace/>caste" placeholder="Caste."
						value="<%=candidateForm.getCaste()%>">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Sub caste:</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="subCast"
						name="<portlet:namespace/>subCast" placeholder="Sub caste."
						value="<%=candidateForm.getSubCaste()%>">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="maritalStatus">Marital
					Status:</label>
				<div class="col-sm-8">		
					<%
						String maritalStatus =candidateForm.getMaritalStatus();
						if(maritalStatus.equals("Bachelor")){						
					%>			
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Bachelor" id="Bachelor" checked="checked">Bachelor &nbsp; 					
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Married" id="ph_No">Married &nbsp; 					
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Divorced" id="ph_Yes">Divorced &nbsp;
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Widow" id="ph_No">Widow
					<%					
						}else if(maritalStatus.equals("Married")){							
					%>
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Bachelor" id="Bachelor">Bachelor &nbsp; 					
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Married" id="ph_No" checked="checked">Married &nbsp; 					
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Divorced" id="ph_Yes">Divorced &nbsp;
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Widow" id="ph_No">Widow
					<%
						}else if(maritalStatus.equals("Divorced")){
					%>
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Bachelor" id="Bachelor">Bachelor &nbsp; 					
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Married" id="ph_No">Married &nbsp; 					
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Divorced" id="ph_Yes" checked="checked">Divorced &nbsp;
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Widow" id="ph_No">Widow
					<%
						}else if(maritalStatus.equals("Widow")){
					%>
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Bachelor" id="Bachelor">Bachelor &nbsp; 					
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Married" id="ph_No">Married &nbsp; 					
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Divorced" id="ph_Yes">Divorced &nbsp;
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Widow" id="ph_No" checked="checked">Widow
					<%
						}else{
					%>
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Bachelor" id="Bachelor">Bachelor &nbsp; 					
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Married" id="ph_No">Married &nbsp; 					
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Divorced" id="ph_Yes">Divorced &nbsp;
					<input type="radio" name="<portlet:namespace/>mrtOption" value="Widow" id="ph_No">Widow
					<% 
						}
					%>
					
				</div>
			</div>


			<%
				String abletojoin = candidateForm.getAbleToJoin();		    
			    if(("Immediately".equals(abletojoin))){			    
			%>
			<div class="form-group">
				<label class="control-label col-sm-2" for="email">I will be
					able to join:</label>
				<div class="col-sm-8">
					<input type="radio" name="<portlet:namespace/>joinOption" value="Immediately" id="npImm" checked="checked" onclick="return resetJoining()">Immediately &nbsp;
					<input type="radio" name="<portlet:namespace/>joinOption" value="After"	id="npAfter">After &nbsp;
				</div>
			</div>

			<!-- np satrt -->
			<div class="form-group" id="np">
				<label class="control-label col-sm-2" for="npMonth">Month :</label>
				<div class="col-sm-4">
					<!--   <input type="textarea" class="form-control" id="npMonth" placeholder="To Date"> -->
					<select class="form-control" id="npMonth"
						name="<portlet:namespace/>npMonth">
						<option value="">Month</option>
						<option value="0">0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="10">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
					</select>


				</div>
				<label class="control-label col-sm-2" for="npDays">Days :</label>
				<div class="col-sm-4">
					<!--  <input type="textarea" class="form-control" id="npDays" placeholder="From Date"> -->

					<select class="form-control" id="npDays"
						name="<portlet:namespace/>npDays">
						<option value="">Days</option>
						<option value="0">0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="10">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
						<option value="13">13</option>
						<option value="14">14</option>
						<option value="15">15</option>
						<option value="110">16</option>
						<option value="17">17</option>
						<option value="18">18</option>
						<option value="19">19</option>
						<option value="20">20</option>
						<option value="21">21</option>
						<option value="22">22</option>
						<option value="23">23</option>
						<option value="24">24</option>
						<option value="25">25</option>
						<option value="210">26</option>
						<option value="27">27</option>
						<option value="28">28</option>
						<option value="29">29</option>
						<option value="30">30</option>
					</select>
				</div>

			</div>
			<%
			    }else if(("After".equals(abletojoin))){		    	
			%>
			<div class="form-group">
				<label class="control-label col-sm-2" for="email">I will be
					able to join:</label>
				<div class="col-sm-8">
					<input type="radio" name="<portlet:namespace/>joinOption" value="Immediately" id="npImm" onclick="return resetJoining()">Immediately &nbsp;
					<input type="radio" name="<portlet:namespace/>joinOption" value="After"	id="npAfter" checked="checked">After &nbsp;
				</div>
			</div>

			<!-- np satrt -->
			<div class="form-group" id="nped">
				<label class="control-label col-sm-2" for="npMonth">Month :</label>
				<div class="col-sm-4">
					<!--   <input type="textarea" class="form-control" id="npMonth" placeholder="To Date"> -->
					<select class="form-control" id="npMonth"
						name="<portlet:namespace/>npMonth">
						<option value="<%=candidateForm.getAbleToDays()%>"><%=candidateForm.getAbleToDays()%></option>
						<option value="0">0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="10">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
					</select>


				</div>
				<label class="control-label col-sm-2" for="npDays">Days :</label>
				<div class="col-sm-4">
					<!--  <input type="textarea" class="form-control" id="npDays" placeholder="From Date"> -->

					<select class="form-control" id="npDays"
						name="<portlet:namespace/>npDays">
						<option value="<%=candidateForm.getAbleToMonth()%>"><%=candidateForm.getAbleToMonth()%></option>
						<option value="0">0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="10">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
						<option value="13">13</option>
						<option value="14">14</option>
						<option value="15">15</option>
						<option value="110">16</option>
						<option value="17">17</option>
						<option value="18">18</option>
						<option value="19">19</option>
						<option value="20">20</option>
						<option value="21">21</option>
						<option value="22">22</option>
						<option value="23">23</option>
						<option value="24">24</option>
						<option value="25">25</option>
						<option value="210">26</option>
						<option value="27">27</option>
						<option value="28">28</option>
						<option value="29">29</option>
						<option value="30">30</option>
					</select>
				</div>

			</div>
			<%		
			    }else{			    
			%>
				<div class="form-group">
				<label class="control-label col-sm-2" for="email">I will be
					able to join:</label>
				<div class="col-sm-8">
					<input type="radio" name="<portlet:namespace/>joinOption" value="Immediately" id="npImm" onclick="return resetJoining()">Immediately &nbsp;
					<input type="radio" name="<portlet:namespace/>joinOption" value="After"	id="npAfter">After &nbsp;
				</div>
			</div>

			<!-- np satrt -->
			<div class="form-group" id="np">
				<label class="control-label col-sm-2" for="npMonth">Month :</label>
				<div class="col-sm-4">
					<!--   <input type="textarea" class="form-control" id="npMonth" placeholder="To Date"> -->
					<select class="form-control" id="npMonth"
						name="<portlet:namespace/>npMonth">
						<option value="">Month</option>
						<option value="0">0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="10">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
					</select>


				</div>
				<label class="control-label col-sm-2" for="npDays">Days :</label>
				<div class="col-sm-4">
					<!--  <input type="textarea" class="form-control" id="npDays" placeholder="From Date"> -->

					<select class="form-control" id="npDays"
						name="<portlet:namespace/>npDays">
						<option value="">Days</option>
						<option value="0">0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="10">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
						<option value="13">13</option>
						<option value="14">14</option>
						<option value="15">15</option>
						<option value="110">16</option>
						<option value="17">17</option>
						<option value="18">18</option>
						<option value="19">19</option>
						<option value="20">20</option>
						<option value="21">21</option>
						<option value="22">22</option>
						<option value="23">23</option>
						<option value="24">24</option>
						<option value="25">25</option>
						<option value="210">26</option>
						<option value="27">27</option>
						<option value="28">28</option>
						<option value="29">29</option>
						<option value="30">30</option>
					</select>
				</div>

			</div>
			<%
			    }
			%>
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
					<%-- <div class="col-sm-8">
						<text type="text" class="form-control" rows="3" id="Address"
							name="<portlet:namespace/>Address" placeholder="Address"
							value="<%=candidateForm.getAddress()%>"></textarea>
					</div> --%>
					<div class="col-sm-8">
						<input type="text" class="form-control" rows="3" id="Address"
							name="<portlet:namespace/>Address" placeholder="Address"
							value="<%=candidateForm.getAddress()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="email">City:<strong
						class="astrx">*</strong></label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="city"
							name="<portlet:namespace/>city" placeholder="City"
							required="required" value="<%=candidateForm.getCity()%>">
					</div>
				</div>

				<%	
					String state = candidateForm.getState();
					if("".equals(state)){							
				%>
				<div class="form-group">
					<label class="control-label col-sm-2" for="InState">State:<strong
						class="astrx">*</strong></label>
					<div class="col-sm-8">
						<select class="form-control" id="InState" name="<portlet:namespace/>InState" required="required">
							<option value="">Select State</option>
							<option value="Andhra Pradesh">Andhra Pradesh</option>
							<option value="Arunachal Pradesh">Arunachal Pradesh</option>
							<option value="Assam">Assam</option>
							<option value="Bihar">Bihar</option>
							<option value="Chhattisgarh">Chhattisgarh</option>
							<option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
							<option value="Daman and Diu">Daman and Diu</option>
							<option value="Delhi">Delhi</option>
							<option value="Goa">Goa</option>
							<option value="Gujarat">Gujarat</option>
							<option value="Haryana">Haryana</option>
							<option value="Himachal Pradesh">Himachal Pradesh</option>
							<option value="Jammu and Kashmir">Jammu and Kashmir</option>
							<option value="Jharkhand">Jharkhand</option>
							<option value="Karnataka">Karnataka</option>
							<option value="Kerala">Kerala</option>
							<option value="Madhya Pradesh">Madhya Pradesh</option>
							<option value="Maharashtra">Maharashtra</option>
							<option value="Manipur">Manipur</option>
							<option value="Meghalaya">Meghalaya</option>
							<option value="Mizoram">Mizoram</option>
							<option value="Nagaland">Nagaland</option>
							<option value="Orissa">Orissa</option>
							<option value="Puducherry">Puducherry</option>
							<option value="Punjab">Punjab</option>
							<option value="Rajasthan">Rajasthan</option>
							<option value="Sikkim">Sikkim</option>
							<option value="Tamil Nadu">Tamil Nadu</option>
							<option value="Telangana">Telangana</option>
							<option value="Tripura">Tripura</option>
							<option value="Uttar Pradesh">Uttar Pradesh</option>
							<option value="Uttarakhand">Uttarakhand</option>
							<option value="West Bengal">West Bengal</option>
						</select>
					</div>
				</div>
				<%
					}else{					
				%>
				<div class="form-group">
					<label class="control-label col-sm-2" for="InState">State:<strong
						class="astrx">*</strong></label>
					<div class="col-sm-8">
						<select class="form-control" id="InState" name="<portlet:namespace/>InState" required="required">
							<option value="<%=candidateForm.getState()%>"><%=candidateForm.getState()%></option>
							<option value="">Select State</option>
							<option value="Andhra Pradesh">Andhra Pradesh</option>
							<option value="Arunachal Pradesh">Arunachal Pradesh</option>
							<option value="Assam">Assam</option>
							<option value="Bihar">Bihar</option>
							<option value="Chhattisgarh">Chhattisgarh</option>
							<option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
							<option value="Daman and Diu">Daman and Diu</option>
							<option value="Delhi">Delhi</option>
							<option value="Goa">Goa</option>
							<option value="Gujarat">Gujarat</option>
							<option value="Haryana">Haryana</option>
							<option value="Himachal Pradesh">Himachal Pradesh</option>
							<option value="Jammu and Kashmir">Jammu and Kashmir</option>
							<option value="Jharkhand">Jharkhand</option>
							<option value="Karnataka">Karnataka</option>
							<option value="Kerala">Kerala</option>
							<option value="Madhya Pradesh">Madhya Pradesh</option>
							<option value="Maharashtra">Maharashtra</option>
							<option value="Manipur">Manipur</option>
							<option value="Meghalaya">Meghalaya</option>
							<option value="Mizoram">Mizoram</option>
							<option value="Nagaland">Nagaland</option>
							<option value="Orissa">Orissa</option>
							<option value="Puducherry">Puducherry</option>
							<option value="Punjab">Punjab</option>
							<option value="Rajasthan">Rajasthan</option>
							<option value="Sikkim">Sikkim</option>
							<option value="Tamil Nadu">Tamil Nadu</option>
							<option value="Telangana">Telangana</option>
							<option value="Tripura">Tripura</option>
							<option value="Uttar Pradesh">Uttar Pradesh</option>
							<option value="Uttarakhand">Uttarakhand</option>
							<option value="West Bengal">West Bengal</option>
						</select>
					</div>
				</div>
				<%	
					}
				%>

				<div class="form-group">
					<label class="control-label col-sm-2" for="pinNumber">PIN:<strong
						class="astrx">*</strong></label>
					<div class="col-sm-8">
						<input type="text" class="form-control numberOnly" maxlength="6"
							id="pinNumber" name="<portlet:namespace/>pinNumber"
							placeholder="Pin" required="required"
							value="<%=candidateForm.getPin()%>">
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Email
						Address:</label>
					<div class="col-sm-8">
						<%-- <label class="control-label" ><%=applicationForm.getEmailAddress()%> </label> --%>
						<input type="email" class="form-control" id="emailId"
							name="<portlet:namespace/>emailId"
							value="<%=candidateForm.getEmailAddress()%>" readonly="readonly">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="AlEmailId">Alternate
						Email ID:</label>
					<div class="col-sm-8">
						<input type="email" class="form-control" id="AlEmailId"
							name="<portlet:namespace/>AlEmailId"
							placeholder="Alternate email Address"
							value="<%=candidateForm.getAlternateEmailID()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="mobNumberber">Mobile:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control numberOnly" maxlength="10"
							id="mobNumberber" name="<portlet:namespace/>mobNumberber"
							value="<%=candidateForm.getMobile()%>">
					</div>
				</div>



				<div class="form-group">
					<label class="control-label col-sm-2" for="AlMobNumberber">Alternate
						Mobile:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control numberOnly" maxlength="10"
							id="AlMobNumberber" name="<portlet:namespace/>AlMobNumberber"
							placeholder="Alternate Mobile"
							value="<%=candidateForm.getAlternateMobile()%>">
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-sm-2" for="ALPersonName">Name
						of person whose Alternate No given:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="ALPersonName"
							name="<portlet:namespace/>ALPersonName"
							placeholder="Name of person whose Alternate No given:" value="<%=candidateForm.getPersonAlternateNoGiven()%>">
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
					<label class="control-label col-sm-2" for="mobNumberber">Qualification
						:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control numberOnly" maxlength="10"
							id="mainQualification"
							name="<portlet:namespace/>mainQualification"
							value="<%=candidateForm.getMainQualification()%>"
							readonly="readonly">
					</div>
				</div>

				<%--  <div class="form-group">
      <label class="control-label col-sm-2" for="mainQualification">Main Qualification:</label>
      <div class="col-sm-8">
      <Select class="form-control" id="mainQualification" name="<portlet:namespace/>mainQualification" >
       <option value="-1">Select Qualification</option>
          <option value="Not Pursuing Graduation">Not Pursuing Graduation</option>
          <option value="B.A">B.A</option>
          <option value="B.Arch">B.Arch</option>
          <option value="B.Des.">B.Des.</option>
          <option value="B.El.Ed">B.El.Ed</option>
          <option value="B.P.Ed">B.P.Ed</option>
          <option value="B.U.M.S">B.U.M.S</option>
          <option value="BAMS">BAMS</option>
          <option value="BCA">BCA</option>
          <option value="B.B.A/ B.M.S">B.B.A/ B.M.S</option>
          <option value="B.Com">B.Com</option>
          <option value="B.Ed">B.Ed</option>
          <option value="BDS">BDS</option>
          <option value="BFA">BFA</option>
          <option value="BHM">BHM</option>
          <option value="B.Pharma">B.Pharma</option>
          <option value="B.Sc">B.Sc</option>
          <option value="B.Tech/B.E.">B.Tech/B.E.</option>
          <option value="BHMS">BHMS</option>
          <option value="BVSC">BVSC</option>
          <option value="Diploma Engineering">Diploma Engineering</option>
          <option value="Diploma">Diploma</option>
          <option value="ITI">ITI</option>
          <option value="LLB">LLB</option>
          <option value="MBBS">MBBS</option>
          <option value="M.Tech/M.E">M.Tech/M.E</option>
          <option value="Other">Other</option>
      </select>
      </div>
    </div>

   <div class="form-group" id="OtherQaul">
      <label class="control-label col-sm-2" for="OtherQaul">Other:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control" id="OtherQaul" name="<portlet:namespace/>OtherQaul" placeholder="Other Qualification">
      </div>
    </div> --%>


				<div class="form-group">
					<label class="control-label col-sm-2" for="specialization">Specialization:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="specialization"
							name="<portlet:namespace/>specialization"
							value="<%=candidateForm.getSpecialization()%>"
							readonly="readonly">
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-sm-2" for="mainQualification">Trade:</label>
					<div class="col-sm-8">
						<Select class="form-control" id="trade"
							name="<portlet:namespace/>trade">
							<option value="<%=candidateForm.getTrade()%>"><%=candidateForm.getTrade()%></option>
							<option value="">Select Trade</option>
							<option value="Welder">Welder</option>
							<option value="Pipe Welder">Pipe Welder</option>
							<option value="Hull Fitter">Hull Fitter</option>
							<option value="Pipe Fabricator">Pipe Fabricator</option>
							<option value="Pipe Fitter">Pipe Fitter</option>
							<option value="Engineering Fitter">Engineering Fitter</option>
							<option value="Machinist">Machinist</option>
							<option value="Electrician">Electrician</option>
							<option value="Blaster/Painter">Blaster/Painter</option>
							<option value="Bender">Bender</option>
							<option value="Line Heater">Line Heater</option>
							<option value="Scaffolders">Scaffolders</option>
							<option value="Machine Operator">Machine Operator</option>
							<option value="Crane Operator">Crane Operator</option>
							<option value="Rigger">Rigger</option>
							<option value="Accommodation Fitter">Accommodation
								Fitter</option>
							<option value="Carpenter">Carpenter</option>
							<option value="Insulation Fitter">Insulation Fitter</option>
							<option value="Flooring Man">Flooring Man</option>
							<option value="Sheet Metal Fitter">Sheet Metal Fitter</option>
							<option value="PVC Pipe Fitter">PVC Pipe Fitter</option>
							<option value="Al-Fitter">Al-Fitter</option>
							<option value="AL-Welder">AL-Welder</option>
							<option value="HVAC Duct Fabricator">HVAC Duct
								Fabricator</option>
							<option value="HVAC Technician">HVAC Technician</option>
							<option value="Hatch Cover Technician">Hatch Cover
								Technician</option>
							<option value="Store Keeper">Store Keeper</option>
							<option value="Office Assistant">Office Assistant</option>
							<option value="Design Assistant">Design Assistant</option>
							<option value="Safety Assistant">Safety Assistant</option>
							<option value="Health Assistant">Health Assistant</option>
						</select>


					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="totalExp">Total
						Years of Experience:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control numberOnly" maxlength="2"
							id="totalExp" name="<portlet:namespace/>totalExp" placeholder=""
							value="<%=candidateForm.getTotalYrExperience()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="skillLevel">Skill
						Level / Proficiency:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="skillLevel"
							name="<portlet:namespace/>skillLevel"
							placeholder="Skill Level / Proficiency"
							value="<%=candidateForm.getSkill_Proficiency()%>">
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-sm-2" for="securityClearance">Security
						Clearance:</label>
					<div class="col-sm-8">

						<div class="form-group">
							<label class="control-label col-sm-2" for="scFrom">From:</label>
							<div class="col-sm-8">
								<textarea type="text" class="form-control" id="scFrom"
									name="<portlet:namespace/>scFrom" rows="4"
									placeholder="Police Station address"><%=candidateForm.getSECURITYCLEARFROM()%></textarea>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-sm-2" for="ScvalidTill">Valid
								till:</label>
							<div class="col-sm-8">
								<%--  <input type="text" class="form-control" id="ScvalidTill" name="<portlet:namespace/>ScvalidTill" placeholder="Valid till"> --%>
								<input type="text" class="datepicker-14 form-control"
									name="<portlet:namespace/>ScvalidTill" value="<%=candidateForm.getSECURITYCLEARTILL()%>"/>
							</div>
						</div>

					</div>
				</div>




				<div class="form-group">
					<label class="control-label col-sm-2" for="medicalFitness">Medical
						Fitness:</label>
					<div class="col-sm-8">




						<div class="form-group">
							<label class="control-label col-sm-2" for="docName">Doctor's
								name:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="docName"
									name="<portlet:namespace/>docName" placeholder="Doctor's name"
									value="<%=candidateForm.getMEDICALFITDOCNAME()%>">
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-sm-2" for="docAddres">Doctor's
								address:</label>
							<div class="col-sm-8">
								<textarea class="form-control" id="docAddres"
									name="<portlet:namespace/>docAddres"
									placeholder="Doctor's address"
									value=""><%=candidateForm.getMEDICALFITDOCADDR()%></textarea>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-sm-2" for="docRegnNo">Doctor's
								Regn No.:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="docRegnNo"
									name="<portlet:namespace/>docRegnNo"
									placeholder="Doctor's Regn No."
									value="<%=candidateForm.getMEDICALFITDOCREGNNO()%>">
							</div>
						</div>




						<div class="form-group">
							<label class="control-label col-sm-2" for="mFvalidTill">Valid
								till:</label>
							<div class="col-sm-8">
								<%--  <input type="text" class="form-control" id="mFvalidTill" name="<portlet:namespace/>mFvalidTill" placeholder="Valid till"> --%>
								<input type="text" class="datepicker-14 form-control"
									name="<portlet:namespace/>mFvalidTill"
									value="<%=candidateForm.getMEDICALFITDOCTILL()%>" />
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
					<label class="control-label col-sm-2" for="CEName">Current
						Company Name:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="CEName"
							name="<portlet:namespace/>cCompany" placeholder="Company Name"
							value="<%=candidateForm.getCurrentCompanyName()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="CEaddress ">Company
						Address:</label>
					<div class="col-sm-8">
						<textarea type="text" class="form-control" id="CEaddress"
							name="<portlet:namespace/>CEaddress" placeholder="Address"
							value=""><%=candidateForm.getCurrentCompanyAddress()%></textarea>

					</div>
				</div>



				<div class="form-group">
					<label class="control-label col-sm-2" for="workingSince">Working
						since:</label>
					<div class="col-sm-8">
						<%-- <input type="text" class="form-control" id="workingSince" name="<portlet:namespace/>workingSince" placeholder="Working since"> --%>
						<input type="text" class="datepicker-13 form-control"
							name="<portlet:namespace/>workingSince"
							value="<%=candidateForm.getWorkingSinceDate()%>" />
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-sm-2" for="designation">Designation:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="designation"
							name="<portlet:namespace/>designation" placeholder="Designation"
							value="<%=candidateForm.getDesignation()%>">
					</div>
				</div>
				

				<div class="form-group">
					<label class="control-label col-sm-2" for="ctcFixed">Fixed
						CTC (Rs. lakhs pa):</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="ctcFixed"
							name="<portlet:namespace/>ctcFixed"
							placeholder="Fixed CTC (Rs. lakhs pa)"
							value="<%=candidateForm.getCTCFixed()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="ctcVariable ">Variable
						CTC (Rs. lakhs pa):</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="ctcVariable"
							name="<portlet:namespace/>ctcVariable"
							placeholder="Variable CTC (Rs. lakhs pa)"
							value="<%=candidateForm.getCTCVariable()%>"></input>

					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="ctcTotal ">Total
						CTC (Rs. lakhs pa):</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="ctcTotal"
							name="<portlet:namespace/>ctcTotal"
							placeholder="Total CTC (Rs. lakhs pa)"
							value="<%=candidateForm.getCTCTotal()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="role">Role:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="role"
							name="<portlet:namespace/>role" placeholder="Role"
							value="<%=candidateForm.getRole()%>">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="Location">Location:</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="Location"
							name="<portlet:namespace/>Location" placeholder="Location"
							value="<%=candidateForm.getLocation()%>">
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-sm-2" for="npDuration">Notice
						Period &nbsp&nbsp(in months) :</label>
					<div class="col-sm-8">

						<select class="form-control" id="npDuration"
							name="<portlet:namespace/>npDuration">
							<option value="<%=candidateForm.getNoticePeriod()%>"><%=candidateForm.getNoticePeriod()%></option>
							<option value="">Notice Period</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="10">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
						</select>
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
							<td><input name="<portlet:namespace/>f_company_name_1"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getFirstCompanyName()%>"></td>
							<td>
								<%--  <input name="<portlet:namespace/>f_from_1" placeholder="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp14929380173410"> --%>
								<input type="text" class="datepicker-13 form-control"
								name="<portlet:namespace/>f_from_1"
								value="<%=candidateForm.getFirstFromDate()%>" />
							</td>
							<td>
								<%--  <input name="<portlet:namespace/>f_to_1" placeholder="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017347"> --%>
								<input type="text" class="datepicker-13 form-control"
								name="<portlet:namespace/>f_to_1"
								value="<%=candidateForm.getFirstToDate()%>" />
							</td>
							<td><input name="<portlet:namespace/>f_location_1"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getFirstCLocation()%>"></td>
							<td><input name="<portlet:namespace/>f_designation_1"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getFirstCDesignation()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_fixed_1"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getFirstFixedCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_variable_1"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getFirstVariableCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_total_1"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getFirstTotalCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_remark_1"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getFirstRemarkIfAny()%>"></td>
						</tr>

						<tr>
							<td>2</td>
							<td><input name="<portlet:namespace/>f_company_name_2"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getSecoundCompanyName()%>"></td>
							<td>
								<%--  <input name="<portlet:namespace/>f_from_2" placeholder="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017348"> --%>
								<input type="text" class="datepicker-13 form-control"
								name="<portlet:namespace/>f_from_2"
								value="<%=candidateForm.getSecoundFromDate()%>" />
							</td>
							<td>
								<%--  <input name="<portlet:namespace/>f_to_2" placeholder="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017349"> --%>
								<input type="text" class="datepicker-13 form-control"
								name="<portlet:namespace/>f_to_2"
								value="<%=candidateForm.getSecoundToDate()%>" />
							</td>
							<td><input name="<portlet:namespace/>f_location_2"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getSecoundCLocation()%>"></td>
							<td><input name="<portlet:namespace/>f_designation_2"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getSecoundCDesignation()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_fixed_2"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getSecoundFixedCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_variable_2"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getSecoundVariableCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_total_2"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getSecoundTotalCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_remark_2"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getSecoundRemarkIfAny()%>"></td>
						</tr>

						<tr>
							<td>3</td>
							<td><input name="<portlet:namespace/>f_company_name_3"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getThirdCompanyName()%>"></td>
							<td>
								<%--   <input name="<portlet:namespace/>f_from_3" placeholder="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017350"> --%>
								<input type="text" class="datepicker-13 form-control"
								name="<portlet:namespace/>f_from_3"
								value="<%=candidateForm.getThirdFromDate()%>" />
							</td>
							<td>
								<%--  <input name="<portlet:namespace/>f_to_3" placeholder="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017351"> --%>
								<input type="text" class="datepicker-13 form-control"
								name="<portlet:namespace/>f_to_3"
								value="<%=candidateForm.getThirdToDate()%>" />
							</td>
							<td><input name="<portlet:namespace/>f_location_3"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getThirdCLocation()%>"></td>
							<td><input name="<portlet:namespace/>f_designation_3"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getThirdCDesignation()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_fixed_3"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getThirdFixedCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_variable_3"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getThirdVariableCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_total_3"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getThirdTotalCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_remark_3"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getThirdRemarkIfAny()%>"></td>
						</tr>

						<tr>
							<td>4</td>
							<td><input name="<portlet:namespace/>f_company_name_4"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getForthCompanyName()%>"></td>
							<td>
								<%--   <input name="<portlet:namespace/>f_from_4" placeholder="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017352"> --%>
								<input type="text" class="datepicker-13 form-control"
								name="<portlet:namespace/>f_from_4"
								value="<%=candidateForm.getForthFromDate()%>" />
							</td>
							<td>
								<%--  <input name="<portlet:namespace/>f_to_4" placeholder="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017353"> --%>
								<input type="text" class="datepicker-13 form-control"
								name="<portlet:namespace/>f_to_4"
								value="<%=candidateForm.getForthToDate()%>" />
							</td>
							<td><input name="<portlet:namespace/>f_location_4"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getForthCLocation()%>"></td>
							<td><input name="<portlet:namespace/>f_designation_4"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getForthCDesignation()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_fixed_4"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getForthFixedCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_variable_4"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getForthVariableCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_total_4"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getForthTotalCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_remark_4"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getForthRemarkIfAny()%>"></td>
						</tr>

						<tr>
							<td>5</td>
							<td><input name="<portlet:namespace/>f_company_name_5"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getFifthCompanyName()%>"></td>
							<td>
								<%--  <input name="<portlet:namespace/>f_from_5" placeholder="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017354"> --%>
								<input type="text" class="datepicker-13 form-control"
								name="<portlet:namespace/>f_from_5"
								value="<%=candidateForm.getFifthFromDate()%>" />
							</td>
							<td>
								<%-- <input name="<portlet:namespace/>f_to_5" placeholder="dd/mm/yyyy" class="datepicker hasDatepicker" type="text" id="dp1492938017355"> --%>
								<input type="text" class="datepicker-13 form-control"
								name="<portlet:namespace/>f_to_5"
								value="<%=candidateForm.getFifthToDate()%>" />
							</td>
							<td><input name="<portlet:namespace/>f_location_5"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getFifthCLocation()%>"></td>
							<td><input name="<portlet:namespace/>f_designation_5"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getFifthCDesignation()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_fixed_5"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getFifthFixedCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_variable_5"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getFifthVariableCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_ctc_total_5"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getFifthTotalCTC()%>"></td>
							<td><input name="<portlet:namespace/>f_remark_5"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getFifthRemarkIfAny()%>"></td>
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
							<th>Sr.no</th>
							<th>Qualification</th>
							<th>University / Institute</th>
							<th>Month & Year of Passing</th>
							<th>% / Grade</th>

						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td><input name="<portlet:namespace/>f_qualification_1"
								class="form-control input-sm" type="text" value="SSC (10th)"
								readonly="true" ></td>
							<td><input name="<portlet:namespace/>f_Institute_1"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getSSCUniversityInstitute()%>"></td>
							<td><input name="<portlet:namespace/>f_year_1"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getSSCYearOfPassing()%>"></td>
							<td><input name="<portlet:namespace/>f_grade_1"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getSSCGrade()%>"></td>

						</tr>
						<tr>
							<td>2</td>
							<td><input name="<portlet:namespace/>f_qualification_2"
								class="form-control input-sm" type="text" value="HSC (12th)"
								readonly="true"></td>
							<td><input name="<portlet:namespace/>f_Institute_2"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getHSCUniversityInstitute()%>"></td>
							<td><input name="<portlet:namespace/>f_year_2"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getHSCYearOfPassing()%>"></td>
							<td><input name="<portlet:namespace/>f_grade_2"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getHSCGrade()%>"></td>

						</tr>
						<tr>
							<td>3</td>
							<td><input name="<portlet:namespace/>f_qualification_3"
								class="form-control input-sm" type="text"
								value="Basic/Graduation"
								readonly="true"></td>
							<td><input name="<portlet:namespace/>f_Institute_3"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getGradUniversityInstitute()%>"></td>
							<td><input name="<portlet:namespace/>f_year_3"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getGradYearOfPassing()%>"></td>
							<td><input name="<portlet:namespace/>f_grade_3"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getGradGrade()%>"></td>

						</tr>


						<tr>
							<td>4</td>
							<td><input name="<portlet:namespace/>f_qualification_4"
								class="form-control input-sm" type="text"
								value="Post Graduation" readonly="true"
								></td>
							<td><input name="<portlet:namespace/>f_Institute_4"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getPGUniversityInstitute()%>"></td>
							<td><input name="<portlet:namespace/>f_year_4"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getPGYearOfPassing()%>"></td>
							<td><input name="<portlet:namespace/>f_grade_4"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getPGGrade()%>"></td>

						</tr>

						<tr>
							<td>5</td>
							<td><input name="<portlet:namespace/>f_qualification_5"
								class="form-control input-sm" type="text"
								value="Doctorate/Ph.D." readonly="true"
								></td>
							<td><input name="<portlet:namespace/>f_Institute_5"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getPhDUniversityInstitute()%>"></td>
							<td><input name="<portlet:namespace/>f_year_5"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getPhDYearOfPassing()%>"></td>
							<td><input name="<portlet:namespace/>f_grade_5"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getPhDGrade()%>"></td>

						</tr>




						<tr>
							<td>6</td>
							<td><input name="<portlet:namespace/>f_qualification_10"
								class="form-control input-sm" type="text" placeholder="Other1"
								value="<%=candidateForm.getOther1Qualification()%>"></td>
							<td><input name="<portlet:namespace/>f_Institute_10"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getOther1UniversityInstitute()%>"></td>
							<td><input name="<portlet:namespace/>f_year_10"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getOther1YearOfPassing()%>"></td>
							<td><input name="<portlet:namespace/>f_grade_10"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getOther1Grade()%>"></td>

						</tr>


						<tr>
							<td>7</td>
							<td><input name="<portlet:namespace/>f_qualification_7"
								class="form-control input-sm" type="text" placeholder="Other2"
								value="<%=candidateForm.getOther2Qualification()%>"></td>
							<td><input name="<portlet:namespace/>f_Institute_7"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getOther2UniversityInstitute()%>"></td>
							<td><input name="<portlet:namespace/>f_year_7"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getOther2YearOfPassing()%>"></td>
							<td><input name="<portlet:namespace/>f_grade_7"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getOther2Grade()%>"></td>

						</tr>
						<tr>
							<td>8</td>
							<td><input name="<portlet:namespace/>f_qualification_8"
								class="form-control input-sm" type="text" placeholder="Other3"
								value="<%=candidateForm.getOther3Qualification()%>"></td>
							<td><input name="<portlet:namespace/>f_Institute_8"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getOther3UniversityInstitute()%>"></td>
							<td><input name="<portlet:namespace/>f_year_8"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getOther3YearOfPassing()%>"></td>
							<td><input name="<portlet:namespace/>f_grade_8"
								class="form-control input-sm" type="text"
								value="<%=candidateForm.getOther3Grade()%>"></td>

						</tr>



					</tbody>
				</table>
			</div>
		</div>



		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title">File Upload</h3>
			</div>
			<div class="panel-body">
				<div class="form-group">
					<label class="control-label col-sm-2" for="fileUpload">Upload
						Profile:</label>
					<div class="col-sm-8">
						<input type="file" name="<portlet:namespace/>file">
					</div>
				</div>
			</div>
		</div>


		<button id="submitBtn" type="submit" class="btn btn-primary">Submit</button>

	</form>




</body>
<script type="text/javascript">
function resetEmployee(){	
	document.getElementById("Company").value="";
	 document.getElementById("location").value="";
	  document.getElementById("Role").value="";
	  document.getElementById("fromEx").value="";
	  document.getElementById("toEx").value="";
	  document.getElementById("reasonLeaving").value="";	 
}
function resetPhyHandicap(){
	document.getElementById("ph_State").value="";
}

function resetJoining(){
	document.getElementById("npMonth").value="";
	document.getElementById("npDays").value="";
}	
</script>


<script type="text/javascript">
  $(document).ready(function(){
    /*defualt hidden fields strat*/
    $("#previousExp").hide();
    $("#phState").hide();
      $("#np").hide();
      $("#OtherQaul").hide();
    /*defualt hidden fields strat*/
 $("#previousExped").show();
 $("#phyState").show();
 $("#nped").show();



 /* 
    $("#AadharNo").keyup(function(){
        var $this = $(this);
        if ((($this.val().length+1) % 5)==0){
            $this.val($this.val() + " ");
        }
    });        */ 


/*aadhar number formate validation only*/


 $(".numberOnly").keydown(function (e) {
        // Allow: backspace, delete, tab, escape, enter and .
        if ($.inArray(e.keyCode, [410, 8, 9, 27, 13, 110, 190]) !== -1 ||
             // Allow: Ctrl+A, Command+A
            (e.keyCode === 105 && (e.ctrlKey === true || e.metaKey === true)) || 
             // Allow: home, end, left, right, down, up
            (e.keyCode >= 35 && e.keyCode <= 40)) {
                 // let it happen, don't do anything
                 return;
        }
        // Ensure that it is a number and stop the keypress
        if ((e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 910 || e.keyCode > 105)) {
            e.preventDefault();
        }
    });



/*radio button Have you worked with Reliance earlier*/

$("#r_Yes").click(function () {
        $("#previousExped").show();
    });

        $("#r_No").click(function () {
        $("#previousExped").hide();
    });


$("#r_Yes").click(function () {
        $("#previousExp").show();
    });

        $("#r_No").click(function () {
        $("#previousExp").hide();
    });


$("#npAfter").click(function () {
        $("#np").show();
    });

        $("#npImm").click(function () {
        $("#np").hide();
    });

        $("#npAfter").click(function () {
            $("#nped").show();
        });

            $("#npImm").click(function () {
            $("#nped").hide();
        });
    



/*Physically Handicapped strt */
$("#ph_Yes").click(function () {
        $("#phyState").show();
    });

        $("#ph_No").click(function () {
        $("#phyState").hide();
    });

$("#ph_Yes").click(function () {
        $("#phState").show();
    });

        $("#ph_No").click(function () {
        $("#phState").hide();
    });


/*Physically Handicapped strt */



$("#submitBtn").click(function(){
    //alert("The paragraph was clicked.");
var panVal = $('#panNumber').val();
var regpan = /^([a-zA-Z]){5}([0-9]){4}([a-zA-Z]){1}?$/;
if(!(regpan.test(panVal))){
alert("Please enter valid PAN number.");
  return false;
}
});


 $("#mobNumberber").on("blur", function(){
        var mobNumber = $(this).val();
        var filter = /^\d*(?:\.\d{1,2})?$/;

          if (filter.test(mobNumber)) {
            if(mobNumber.length==10){
                  return true;
                  
             } else {
                alert('Please put 10  digit mobile number');
                return false;
              }
            }
            else {
              alert('Not a valid number');
              return false;
           }
    
  });



 $("#AlMobNumberber").on("blur", function(){
        var mobNumber = $(this).val();
        var filter = /^\d*(?:\.\d{1,2})?$/;

          if (filter.test(mobNumber)) {
            if(mobNumber.length==10){
                  return true;
                  
             } else {
                alert('Please put 10  digit mobile number');
                return false;
              }
            }
            else {
              alert('Not a valid number');
              return false;
           }
    
  });

$('#mainQualification').on('change', function() {

  if(this.value=="Other"){
      $("#OtherQaul").show();
  }else{
      $("#OtherQaul").hide();
  }
})


$(document).ready(function(){
	$(".datepicker-13").datepicker({
		 dateFormat:"dd/mm/yy",
	        changeMonth: true,
	        changeYear: true,
	        yearRange: "-100:+0",
	        maxDate: new Date()
     });
	
	$(".datepicker-14").datepicker({
		 dateFormat:"dd/mm/yy",
	        changeMonth: true,
	        changeYear: true,
	        yearRange: "-100:+100",
    });
});

}); 
  /*PAN card validation part*/
</script>
</html>