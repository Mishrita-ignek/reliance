  <%@ include file="/init.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<style>
label.control-label {
    display: none !important;
}
#txtcontent1 {
    font-family: Arial, Helvetica, sans-serif;
    font-size: 13px;
    color: #58595B;
}
.form-control {
    display: block;
    width:50%;
    height: 42px !important;
    padding: -20px 54px;
    font-size: 14px;
    margin: 0px 0px;
    line-height: 1.42857;
    color: #000;
    border-radius: 0px;	
    background-color: #fff;
    background-image: none;
    border: 1px solid #ccc;
    -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,0.075);
    box-shadow: inset 0 1px 1px rgba(0,0,0,0.075);
    -webkit-transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
    -o-transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
    transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
}
.brdcrumb {
    font-family: Arial, Helvetica, sans-serif;
    font-size: 14px;
    color: #0563bb;
    padding: 4px 0 15px 0px;
    margin: 0;
}
.inner_heading {
    font-family: Arial, Helvetica, sans-serif;
    font-size: 18px;
    color: #3b3b3b;
    padding: 8px 0px;
    margin: 0;
}

</style>
<portlet:resourceURL var="loadCaptchaURL" />


<portlet:actionURL name="addShareholdersSurvey" var="addShareholdersSurvey">
	<portlet:actionURL var="validateCaptchaURL" name="validateCaptcha" />
</portlet:actionURL>

<div class="inner_main-box_right">
<div class="right_menu_box">
<p class="brdcrumb">Reliance Infrastructure Limited</p>
<p class="inner_heading">Shareholders Satisfaction Survey 2019</p>
<p class="inner_para"><strong> Dear Shareowners,</strong><br>
<br>
We have been constantly endeavouring to extend the best possible
services to our shareowners and we seek your feedback on the same.
Please fill the response form and click 'SUBMIT' button provided at the
end of the form. <br>
<br>
</p>

<table id="txtcontent1" style="margin-left: 5px" width="100%" cellspacing="0" cellpadding="0" border="0">
	<tbody><tr>
		<td colspan="2" class="tr1">
		<aui:form action="${addShareholdersSurvey}"  >
		<table width="98%" cellspacing="0" cellpadding="4" border="0">
			<tbody><tr>
				<td colspan="2"><strong>All fields marked * are
				mandatory</strong></td>
			</tr>
			<tr>
				<td height="30" align="left" width="43%" valign="middle"><strong>Name
				of sole / first Holder*:</strong></td>
				<td height="30" align="left" valign="middle"><aui:input name="firstHolder" >
				<aui:validator name="required" errorMessage="Please enter your First Holder." />
                <aui:validator name="custom"  errorMessage="You can enter a maximum of 30 characters and special( only . and space )">
                <aui:validator name="maxLength">30</aui:validator>
                function (val, fieldNode, ruleValue) {
                var returnValue = true;
                var iChars = "~`!@#$%^&*+-()_=[]\\\';,/{}|\":<>?1234567890";
                              for (var i = 0; i < val.length; i++) {
                                  if (iChars.indexOf(val.charAt(i)) != -1) {                
                                   returnValue = false;
                                  }
                              }
                              return returnValue;
                      }
                  </aui:validator>
                </aui:input>
				</td>
			</tr>
			<tr>
				<td height="30"><strong>Folio Number:</strong></td>
				<td height="30" valign="middle">
				<aui:input name="folioNumber">
				<aui:validator name="maxLength">30</aui:validator>
				</aui:input></td>
			</tr>

			<tr>
				<td height="24">&nbsp;</td>
				<td height="24" valign="middle">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				OR</td>
			</tr>
			<tr>
				<td height="25"><strong>DP ID No.: </strong></td>
				<td height="25" valign="middle">
				<aui:input name="dpIdNo" id="dpIdNo" >
				<aui:validator name="maxLength">30</aui:validator>
				</aui:input></td>
			</tr>

			<tr>
				<td height="25"><strong>Client ID No. :</strong></td>
				<td height="25" valign="middle">
				<aui:input name="clientIdNo" >
				<aui:validator name="maxLength">30</aui:validator>
				</aui:input></td>
			</tr>
			<tr>
				<td height="25"><strong>Mobile No. :</strong></td>
				<td width="57%"><aui:input name="mobileNo"  >
				<aui:validator  name="maxLength">10</aui:validator>
				<aui:validator name="number"></aui:validator>
				</aui:input></td>
			</tr>
			<tr>
				<td height="25"><strong>Telephone No. :</strong></td>
				<td width="57%"><aui:input name="telephoneNo" >
				<aui:validator name="maxLength">12</aui:validator>
				<aui:validator name="number"></aui:validator>
				</aui:input></td>
			</tr>

			<tr>
				<td align="left"></td>
				<td valign="middle">
				<div id="otherDiv" style="display: none;" align="center">
				<table align="left" border="0">
					<tbody><tr>

						<td class="styled" height="29" align="left"><input maxlength="25" name="otherType" id="otherType" class="medtxtbox" type="text"></td>
					</tr>
				</tbody></table>
				</div>
				</td>
			</tr>

			<tr>
				<td height="56"><strong>Email ID: </strong></td>
				<td>
				<div class="middle"><aui:input name="emailId">
				<aui:validator name="email"></aui:validator>
				</aui:input></div>
				<span id="checkEmailId"></span></td>
			</tr>
			<tr>
				<td colspan="2" height="37"><strong>Kindly rate our
				services in following areas </strong></td>
			</tr>
			<tr>
				<td>
				<table width="100%" cellspacing="0" cellpadding="0" border="0">
					<tbody><tr>
						<td height="40" width="17%">&nbsp;</td>
					</tr>
					<tr>
						<td height="40" width="17%">1. Responses to
						queries/complaints</td>
					</tr>
					<tr>
						<td height="40">2. Your Overall rating of our investor
						service</td>
					</tr>
					<tr>
						<td height="40">3. Presentation of information on Company's
						<br>
						website : www.rinfra.com</td>
					</tr>
					<tr>
						<td height="40">4. Quality &amp; Contents of Annual Report
						(2015-16)</td>
					</tr>
					<tr>
						<td height="40">5. Do you have any grievance which has not
						been addressed so far:</td>
					</tr>
				</tbody></table>
				</td>
				<td valign="top">
				<table width="100%" cellspacing="0" cellpadding="0" border="0">
					<tbody><tr>
						<td height="40" align="center" width="17%">Excellent</td>
						<td align="center" width="15%">Good</td>
						<td align="center" width="45%">Needs improvement</td>
						<td align="center" width="23%">&nbsp;</td>
					</tr>
					<tr>
						<td height="40" align="center" width="17%"><input type="radio" name="<portlet:namespace/>responce" value="excellent"><br></td>
						<td align="center" width="15%"><input type="radio" name="<portlet:namespace/>responce" value="good"><br/></td>
						<td align="center" width="45%"><input type="radio" name="<portlet:namespace/>responce" value="improvement"><br/></td>
						<td align="center">&nbsp;</td>
					</tr>
						<td height="40" align="center" width="17%"><input type="radio" name="<portlet:namespace/>responce1" value="excellent"><br></td>
						<td align="center" width="15%"><input type="radio" name="<portlet:namespace/>responce1" value="good"><br/></td>
						<td align="center" width="45%"><input type="radio" name="<portlet:namespace/>responce1" value="improvement"><br/></td>
						<td align="center">&nbsp;</td>
					<tr>
						<td height="40" align="center" width="17%"><input type="radio" name="<portlet:namespace/>responce2" value="excellent"><br></td>
						<td align="center" width="15%"><input type="radio" name="<portlet:namespace/>responce2" value="good"><br/></td>
						<td align="center" width="45%"><input type="radio" name="<portlet:namespace/>responce2" value="improvement"><br/></td>
						<td align="center">&nbsp;</td>
					</tr>
						<td height="40" align="center" width="17%"><input type="radio" name="<portlet:namespace/>responce3" value="excellent"><br></td>
						<td align="center" width="15%"><input type="radio" name="<portlet:namespace/>responce3" value="good"><br/></td>
						<td align="center" width="45%"><input type="radio" name="<portlet:namespace/>responce3" value="improvement"><br/></td>
						<td align="center">&nbsp;</td>
					<tr>
					</tr>
					<tr>
						<td height="40" align="center" width="17%"><input type="radio" name="<portlet:namespace/>GRIEVANCE" onclick="toggleDescription('Y');" value="yes"><span style="line-height: 25px;"> Yes
						</span></td>
						<td align="center" width="15%"><input type="radio" name="<portlet:namespace/>GRIEVANCE" onclick="toggleDescription('N');" value="no"><span style="line-height: 25px;"> No
						</span></td>
						<td height="40" align="center">&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
				</tbody></table>
				</td>
			</tr>
			<tr>
				<td style="display: none;" class="tr_description">
					<strong>If yes,please furnish details in brief: </strong>
					</td>
				<td style="display: none;" class="tr_description">
				<div class="middle">
				<aui:input type="textarea" rows="5" cols="30" name="description" />
				</td>
			</tr>
			<tr>
				<td><strong>6. Your suggestions and comments for
				improvement in our services </strong></td>
				<td>
				<div class="middle">
				<aui:input type="textarea" rows="5" cols="30" name="comments" />
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>
				</td>
			</tr>
			<tr>
				<td><strong>Enter Captcha (captcha letters are case
				sensitive) </strong></td>
				<td>
				<div class="middle">
				<liferay-ui:error key="errorMessage"
					message="Enter correct data as shown in the image" />
				<liferay-captcha:captcha url="<%=loadCaptchaURL%>" />
				
				<%-- <liferay-ui:captcha url="<%=loadCaptchaURL%>" /> --%>
				</div>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>&nbsp;</td>
				<td>&nbsp;<sup class="blue"></sup></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
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
</div>

<script>

function toggleDescription(gType){	
	
	if(gType=="Y"){
		$(".tr_description").show();
	}else if(gType=="N"){
		$(".tr_description").hide();
	}
}


</script>