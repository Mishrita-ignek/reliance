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
<%-- <liferay-ui:error exception="<%= CaptchaTextException.class %>" message="text-verification-failed" /> --%>
<liferay-ui:error key="folio.not.valid" message="Please Enter Valid DP ID/ Client ID/ Folio No." />
<%@page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>
<%@page import="com.liferay.portal.kernel.captcha.CaptchaMaxChallengesException"%>
<portlet:resourceURL var="loadCaptchaURL" />
<portlet:actionURL name="rinfraShareHolder" var="rinfraShareHolderUrl" />
<portlet:resourceURL  var="rinfraShareHoldeUrl" />

<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/fancybox/3.5.7/jquery.fancybox.min.js"></script> 
<script src="https://cdnjs.cloudflare.com/ajax/libs/fancybox/3.5.7/jquery.fancybox.js"></script>  -->
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
.fancybox-video {
  display: none;
}

</style>

<p>
</p>

<%
String flag = (String)request.getAttribute("flag");
%>

<div>&nbsp;</div>

<table id="txtcontent1" style="margin-left: 5px" width="100%" cellspacing="0" cellpadding="0" border="0" class="table table-hover table-striped bg-white">
	<tbody><tr>
		<td colspan="2" class="tr1">
		<aui:form action=""  >  <%-- ${rinfraShareHolderUrl} --%>
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

			<%-- <tr>
			<td><strong>Enter Captcha (captcha letters are case
					sensitive) </strong></td>
			<td id="img_td">
				<liferay-ui:error key="errorMessage"/> 
			    <liferay-captcha:captcha url="<%=loadCaptchaURL%>" />  
			</td>
			</tr> --%>
			
			<tr>
				<td></td>
				<td>&nbsp;</td>
				<td>&nbsp;<sup class="blue"></sup></td>
			</tr>
			<tr><td></td>
				<td><button type="button" class="btn btn-default" onclick="getVideoByAjax();" >Submit</button>
				</td>
			</tr>
		</tbody></table>
		</aui:form>
		</td>
	</tr>
</tbody></table>

<div class="clear_0">&nbsp;</div>

<div id="newsTable" style="display: none;">
<table border="0" class="table table-hover table-striped bg-white">
    <tbody>
        <tr style="background-color:#ccc">
            <td><strong>Description</strong></td>
            <td style="width: 104px; display:block;"><strong>Play Video</strong></td>
        </tr>
        <tr>
            <td width="100%">Video Recording of Annual General Meeting held on June 23, 2020</td>
            <td align="center" style="width: 104px;"><a class="fancybox" href="#AnnualGeneralMeeting"><img src="http://www.rinfra.com/documents/1142822/1189652/video.jpg" /></a></td>
        </tr>
    </tbody>
</table>
<div class="fancybox-video" id="AnnualGeneralMeeting" >
<video controls="" height="auto" width="100%"><source src="http://www.rinfra.com/documents/1142822/9520339/Reliance_Infrastructure.mp4" type="video/mp4" /></video>
</div>
</div>

<%if("Y".equalsIgnoreCase(flag)){%>

<%}%>

<p>&nbsp;</p>



<script>
    $(document).ready(function() {
      $(".fancybox").fancybox({
        afterShow: function() {
          this.content.find('video').trigger('play')
        },
        afterClose: function () {
                parent.location.reload(true);
            }
      });
    });
</script>
<script>

getVideoByAjax = function() {
	var searchInputParam = document.getElementById("<portlet:namespace />searchInputParam").value;
	//alert(searchInputParam);
			jQuery.ajax({
						url : '${rinfraShareHoldeUrl}',
						type : 'POST',
						async : false,
						dataType : 'json',
						data : {
							"<portlet:namespace/>searchInputParam" : searchInputParam
						},
						success : function(response) {
								if ("Y" == response.flag) {
									 $("#newsTable").show();
								}else{
									$("#newsTable").hide();
									alert("Please Enter Valid DP ID/ Client ID/ Folio No.");
								}
						}
					});
		}

</script>


<aui:script>
	Liferay.provide(window, 'getVideoByAjaxgghhhh', function() {
		var A = AUI();
		var datePickerAjaxResourceUrl = '<%= rinfraShareHoldeUrl.toString()%>'; 
		//datePickerAjaxResourceUrl=datePickerAjaxResourceUrl.replace("http","https");
		//var searchInputParam = A.one("#searchInputParam").get("value");
		var searchInputParam = document.getElementById("<portlet:namespace />searchInputParam").value;
		A.io.request(
		datePickerAjaxResourceUrl, {
			data : {
				<portlet:namespace />searchInputParam : searchInputParam
			},
			on : {
				success : function() {
					var resp = this.get('responseData');
					alert(resp.split('#'));
					A.one("#newsTable").empty().append(this.get('responseData'));
					
					/* alert(resp);
					if("flag"==resp){
						alert("if");
						A.one("#newsTable").set('visible',true);
					}
					A.one("#newsTable").set('visible',true); */
				}
			}
		});
	});
</aui:script>