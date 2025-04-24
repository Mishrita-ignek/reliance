<%@page import="rpower.shareholders.doc.model.RpowerShareHoldersDoc"%>
<%@page import="java.util.Set"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha" %> 

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<liferay-ui:error exception="<%= CaptchaTextException.class %>" message="text-verification-failed" />
<liferay-ui:error key="folio.not.valid" message="Please Enter Valid DP ID/ Client ID/ Folio No." />
<%@page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>
<%@page import="com.liferay.portal.kernel.captcha.CaptchaMaxChallengesException"%>
<portlet:resourceURL var="loadCaptchaURL" />
<portlet:actionURL name="rinfraShareHoldersDoc" var="rinfraShareHoldersDocUrl" />
<%-- <portlet:actionURL name="logout" var="logoutUrl" /> --%>

<style>
 color: #034ea2 !important;
}
#breadcrumbs a {
    color: #333333;
}
.smalltxt_inner {
    font-family: Arial, Helvetica, sans-serif;
    float: left;
    width: 100%;
    color: #565656;
    margin: 5px 0 0 0;
}

#breadcrumbs{
    font-family: Arial, Helvetica, sans-serif;
    font-size: 14px;
    font-weight: normal;
    color: #333;
    float: left;
    width: 100%;
    border-bottom: 1px solid #034ea2;
    padding-bottom: 11px;
    margin-bottom: 15px;
}
#main_heading{
        font-family: Arial, Helvetica, sans-serif;
    font-size: 18px;
    font-weight: normal;
    color: #034ea2;
    float: left;
    width: 100%;
    padding-bottom: 11px;
}
a {
    color: #034ea2;
    text-decoration: none;
}
a:hover, a:focus {
    color: #034ea2;
    text-decoration: underline;
}

.contentData {
    font-family: Arial, Helvetica, sans-serif !Important;
    font-size: 14px !Important;
    color: #3b3b3b !Important;
}
.tableG, .tableG td, .tableG th {
    border: 1px solid #cccccc;
    padding: 2px 2px 2px 2px;
}

.tableG {
    border-collapse: collapse;
    padding: 2px 2px 2px 2px;
    text-align: left;
    font-size: 11px;
}


#heading{
    font-size: 18px;
	font-weight: normal;
	color: #424953;
	margin-left: 17px;
}

#chkLable {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 13px;
	color: #58595B;
	margin-left: 12px;
}

.form-control {
	display: block;
	width: 50%;
    height: 33px;
	padding: 6px 12px;
	font-size: 14px;
	line-height: 1.42857143;
	color: #555;
	background-color: #fff;
	background-image: none;
	border: 1px solid black;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	-webkit-transition: border-color ease-in-out .15s, -webkit-box-shadow
		ease-in-out .15s;
	-o-transition: border-color ease-in-out .15s, box-shadow ease-in-out
		.15s;
	transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
}

.form-horizontal .custome-control-label {
	text-align: left;
	width:40%;
	margin-bottom: 0;
	padding-top: 7px;
	color: #635e5e;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 13px;
	padding-left: 11px;
    margin-left: 22px;
}

.form-horizontal .head-label {
	text-align: left;
	margin-bottom: 0;
	padding-top: 7px;
	color: #635e5e;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 15px;
	margin-left: 17px;
}

.control-label {
	display: none;
}

.form-group.form-inline.input-checkbox-wrapper {
	margin-top: -24px;
	margin-right: 3px !important;
}

.brdcrumb_gray {
    font-family: Arial, Helvetica, sans-serif;
    font-size: 12px;
    color: #474747;
}
th {
    background: #EEEEEE;
    font-weight: bold;
}

td {
    font-size: 15px;
}


</style>
<!-- <p><span id="breadcrumbs"><a href="index">Home</a> - Investor Relations - Stock Information - <span class="active_breadcrumbs">Unpaid Unclaimed Shares</span></span></p>

<p><span id="main_heading">Unpaid Unclaimed Shares</span></p>
 -->

<p>
</p>

<%
/* 
PortletSession session1 = renderRequest.getPortletSession();
String value = (String) session1.getAttribute("show", PortletSession.APPLICATION_SCOPE);

List<ShareHoldersDoc> docs = (List<ShareHoldersDoc>) session1.getAttribute("docList", PortletSession.APPLICATION_SCOPE); */

String flag = (String)request.getAttribute("flag");
List<RpowerShareHoldersDoc> docList = (List<RpowerShareHoldersDoc>)request.getAttribute("docList");
Set<String> heading = (Set<String>)request.getAttribute("heading");
System.out.println("flag "+flag);
//System.out.println("doc "+docs);
%>

<div>&nbsp;</div>

<%-- <table id="customers" class="table table-hover table-striped bg-white">
	<thead style="background-color:#EAEAEA">
		<aui:form action="${logoutUrl}"  >
		<tr style="height: 45px;">
			<td width="5%">&nbsp;</td>
			<td width="80%"></td>
			<td width="10%"><button type="submit" class="btn btn-default" >Submit</button></td>
		</tr>
		</aui:form>
		<tr style="height: 45px;">
			<th width="5%">&nbsp;</th>
			<th width="80%">Particulars</th>
			<th width="10%">Download</th>
		</tr>
	</thead>
	<tbody>
	<%
	for(ShareHoldersDoc doc : docs){
		//System.out.println("doc "+doc.getFileURL()));
	%>
	<c:forEach var="doc" items="${docs}">  
		<tr style="height: 45px;">
			<td scope="row" width="5%" style=" padding-left: 15px;"><img src="<%=request.getContextPath()%>/image/arrow_hvr.png"></td>
			<td width="80%"><%=doc.getDescription()%></td>
			<td width="10%" style=" padding-left: 15px;"><a href="<%=doc.getFileURL()%>" target="_blank" ><img src="<%=request.getContextPath()%>/image/pdf.png"></a></td>
		</tr>
		</c:forEach> 
		<%} %>
	</tbody>
</table>
	

<%}%> --%>

<table id="txtcontent1" style="margin-left: 5px" width="100%" cellspacing="0" cellpadding="0" border="0" class="table table-hover table-striped bg-white">
	<tbody><tr>
		<td colspan="2" class="tr1">
		<aui:form action="${rinfraShareHoldersDocUrl}"  >
		<table width="98%" cellspacing="0" cellpadding="4" border="0">
			<tbody>
			<tr>
				<td height="30" align="left" width="43%" valign="middle">
				<p style=" font-size: 16px; margin-top: -8px;">Enter your DP ID/ Client ID/ Folio No</p>
				</td>
				<td height="30" align="left" valign="middle">
				<aui:input name="searchInputParam" id="searchInputParam">
				  <aui:validator name="required" errorMessage="Plesae enter your DP ID/ Client ID/ Folio No"/>
				</aui:input></td>
			</tr>

			<tr>
			<td><strong>Enter Captcha (captcha letters are case
					sensitive) </strong></td>
			<td id="img_td">
				<liferay-ui:error key="errorMessage"/> 
			    <liferay-captcha:captcha url="<%=loadCaptchaURL%>" />  
			</td>
			</tr>
			
			<tr>
				<td></td>
				<td>&nbsp;</td>
				<td>&nbsp;<sup class="blue"></sup></td>
			</tr>
			<tr><td></td>
				<td><button type="submit" class="btn btn-default">Submit</button>
				</td>
			</tr>
		</tbody></table>
		</aui:form>
		</td>
	</tr>
</tbody></table>

<div class="clear_0">&nbsp;</div>

<%if(Validator.isNotNull(docList) && "Y".equalsIgnoreCase(flag)){%>

<div>&nbsp;</div>
<c:forEach var="hd" items="${heading}">  
		<p><strong>${hd}</strong></p>
<table id="customers" class="table table-hover table-striped bg-white" style="border: solid 1px; border-color: darkgray;">
	<thead style="background-color:#EAEAEA">
		<tr style="height: 45px;">
			<th width="5%">&nbsp;</th>
			<th width="80%">Particulars</th>
			<th width="10%">Download</th>
		</tr>
	</thead>
	<tbody>
	<%-- <%
	for(ShareHoldersDoc doc : docs){
		//System.out.println("doc "+doc.getFileURL()));
	%> --%>
	<c:forEach var="doc" items="${docList}">  
	<c:if test="${hd == doc.heading}">
		<tr style="height: 45px;">
			<td scope="row" width="5%" style=" padding-left: 15px;"><img src="<%=request.getContextPath()%>/image/arrow_hvr.png"></td>
			<td width="80%">${doc.description}</td>
			<td width="10%" style=" padding-left: 15px;"><a href="${doc.fileURL}" target="_blank" ><img src="<%=request.getContextPath()%>/image/pdf.png"></a></td>
		</tr>
		</c:if>
		</c:forEach> 
		<%-- <%} %> --%>
	</tbody>
</table>
</c:forEach>

<%}%>

<p>&nbsp;</p>

<!-- <script>
function logout(){
	alert("logout");
}
</script> -->
