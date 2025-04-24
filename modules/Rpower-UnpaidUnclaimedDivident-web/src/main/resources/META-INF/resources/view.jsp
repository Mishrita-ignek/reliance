

<%@page import="com.rinfra.unpaid.unclaimed.devidend.model.RpowerUnpaidUnclaimedDevidend"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.TreeSet"%>
<%@page import="java.util.Set"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.List"%>
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
<%@page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>
<%@page import="com.liferay.portal.kernel.captcha.CaptchaMaxChallengesException"%>
<portlet:resourceURL var="loadCaptchaURL" />
<portlet:actionURL name="unpaidDividendHolders" var="unpaidDividendHoldersUrl" />
<style>


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

a {
    color: #black !important;
    }
</style>
<div class="inner_main-box_right">
<div class="right_menu_box">
<!-- <span class="brdcrumb"><span class="brdcrumb_gray">Stock Information  -</span> Unpaid-Unclaimed Dividend Holders </span> -->
<!-- <p><span id="breadcrumbs"><a href="index">Home</a> - Investor Relations - Stock Information - <span class="active_breadcrumbs">Unpaid-Unclaimed Dividend Holders</span></span></p> -->
<p><span id="main_heading">Unpaid-Unclaimed Dividend Holders</span></p>
<p style="font-size: 14px;font-family: Arial, Helvetica, sans-serif;color: #3b3b3b;">

	<strong>Statement of unclaimed and unpaid amounts to be transferred to IEPF</strong>
</p>

<!-- <p style="font-size: 12px;font-family: Arial, Helvetica, sans-serif;color: #3b3b3b;">
	<strong>Statement of unclaimed and unpaid amounts as on September 30, 2019.</strong>
</p> -->
<p>
</p>
<table id="txtcontent1" style="margin-left: 5px" width="100%" cellspacing="0" cellpadding="0" border="0">
	<tbody><tr>
		<td colspan="2" class="tr1">
		<aui:form action="${unpaidDividendHoldersUrl}"  >
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
				<%-- <liferay-ui:captcha url="${loadCaptchaURL}" /> --%>
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
</div>

<%
List<RpowerUnpaidUnclaimedDevidend> unpaidUnclaimedDevidendRecords=(List<RpowerUnpaidUnclaimedDevidend>)request.getAttribute("unpaidUnclaimedDevidendRecords");
Double tempAmountDue=(Double)request.getAttribute("tempAmountDue");
List<Integer> years= (List)request.getAttribute("years");
String name=(String)request.getAttribute("name");
String searchInputParam=(String)request.getAttribute("searchInputParam");
System.out.println("Rpower bsearchInputParam "+searchInputParam);
System.out.println("Rpower unpaidUnclaimedDevidendRecords "+unpaidUnclaimedDevidendRecords);
%>

<%
if(Validator.isNotNull(unpaidUnclaimedDevidendRecords)){%>
<table width="60%" border="0" cellspacing="0" cellpadding="0"
	align="center" style="font-size: 12px;">
	<tr>
	<td width="50%" valign="middle">Name:</td>
		<td valign="middle"><%= name%></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td valign="middle">DP ID/ Client ID/ Folio No</td>
		<td valign="middle">
		<c:forEach var="unpaidUnclaimedDevidendRecords" begin="0" end="0" items="${unpaidUnclaimedDevidendRecords}">  
   		 <c:out value="${unpaidUnclaimedDevidendRecords.FOLIO_NO_OF_ITIES}" />  
		</c:forEach>  
		</td>
	</tr>
</table>
<div>&nbsp;</div>



<table width="60%" border="0" cellpadding="0" cellspacing="0"
	class="tableG contentData" align="center">
	<tr>
		<th>
		<div align="center">SI No.<br />
		</div>
		</th>
		<th>
		<div align="center">Year of Dividend</div>
		</th>
		<th>
		<div align="center">Proposed Date of Transfer to IEPF</div>
		</th>
		<th>
		<div align="center">Amount Due(In Rs.)</div>
		</th>
	</tr>
	
<%int count=0; %>
<c:forEach items="${unpaidUnclaimedDevidendRecords}" var="devidend">

<c:if test="${not empty devidend}">
<%
count=count+1;
%>
<tr>
		<td>
		<div align="center"><%=count%></div>
		</td>
		<td>
		<div align="center"><%=years.get(count-1) %></div>
		</td>
		<td>
		<div align="center"><fmt:formatDate pattern="dd-MMM-yyyy" value="${devidend.PROPOSED_DATE_TRANSFER_IPEF}"/></div>
		</td>
		<td>
		<div align="center">${devidend.AMOUNT_DUE_IN_RS}</div>
		</td>
	</tr>
</c:if>
</c:forEach>
<tr>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
		<td>
		<div align="center">Total</div>
		</td>
		<td>
		<div align="center">${tempAmountDue}</div>
		</td>
	</tr>
</table>
<p>&nbsp;</p>
	<p style="text-align: justify;">In case, the above dividend(s)
is/are not claimed by you till date, please forward a letter duly signed
by all the registered holder(s) giving your address details to our RTA
Karvy Computershare Private Limited , Unit: 
<br />
<br />
Reliance Infrastructure Limited
<br />
Plot No.13 & 13C, Madhapur Village
<br />
Hyderabad 500 081
<br />
Andra Pradesh Tel. no. + 91 40 4030 8000
<br />
Fax No. +91 40 2342 0859
<br />
Toll Free No.:1800 4250 999
<br />
Mail to cird@karvy.com
<br />
<br />
Requesting for issuance of duplicate warrant(s).
</p>

<%}else if(unpaidUnclaimedDevidendRecords==null && searchInputParam!=null ) {%>
<table align="center">
	<tr>

		<td><font color="red" size="+1">Data not found</font></td>
	</tr>

</table>

<%}%>
<p>&nbsp;</p>

</div>

