<%@page import="javax.portlet.PortletSession"%>
<%@ include file="/init.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%><%@
taglib
	uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%><%@
taglib
	uri="http://liferay.com/tld/theme" prefix="liferay-theme"%><%@
taglib
	uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<portlet:resourceURL var="getNewAndMediaUrl">
</portlet:resourceURL>
<portlet:resourceURL var="getPublicationUrl">
</portlet:resourceURL>
<html>
<head>
<style type="text/css">.active_menu1 span, .cssm_m0 , .active_breadcrumbs , .link {
  color: #034ea2 !important;
}
a {
    color:#333333;
}
/*.nav #m7
    {display:block!important;padding:0 12px!important;width:110px!important;height:67px!important;background:url(/o/Reliance-MumbaiMetro-Theme/css/custom/images/menu_icon_sprint.png) no-repeat -152px -352px #ab218e!important;}*/

</style>
<style type="text/css">.smalltxt_inner {
    font-family: Arial, Helvetica, sans-serif;
    float: left;
    width: 100%;
    color: #565656;
    margin: 5px 0 0 0;
}

#main_heading{
    width: 100%;
    border-bottom: 2px solid #bababa;
    margin-bottom: 15px;
}
#main_heading span {
    display:inline-block;
    font-family: Helvetica condensed, Helvetica;
    font-style: italic;
    color: #4a4a4a;
    font-size: 28px;
    padding: 0px 20px;
    background: #bababa none repeat scroll 0 0;
}
.news_media .news_media_select1 {
    width: 190px;
    float: left;
    padding: 3px 3px;
    color: #000;
    border: 1px solid #ccc;
    margin: 10px 0px;
    transition: 4s;
}
.news_media_select2 {
    width: 190px;
    float: left;
    padding: 3px 3px;
    color: #000;
    border: 1px solid #ccc;
    margin: 10px 20px;
    transition: 4s;
}
.news_media .news_media_select3 {
    width: 190px;
    float: left;
    padding: 3px 3px;
    color: #000;
    border: 1px solid #ccc;
    margin: 10px 0px;
    transition: 4s;
}
.news_media_button {
    width: 50px;
    display: block;
    float: left;
    padding: 3px;
    margin: 10px 0px 10px 10px;
    background: #0F75BD;
    color: #fff;
    border: none;
    transition: .4s;
}
.news_media{    
	padding-top: 5px;
}
</style>

</head>
<body>

<p id="main_heading"><span>NEWS &amp; MEDIA</span></p>

<div class="news_media">
	<select class="news_media_select1" id="year" name="year">
		<option value="2019">&nbsp;&nbsp; 2019 &nbsp;&nbsp;</option>
		<option value="2018">&nbsp;&nbsp; 2018 &nbsp;&nbsp;</option>
		<option value="2017">&nbsp;&nbsp; 2017 &nbsp;&nbsp;</option>
		<option value="2016">&nbsp;&nbsp; 2016 &nbsp;&nbsp;</option>
		<option value="2015">&nbsp;&nbsp; 2015 &nbsp;&nbsp;</option>
		<option value="2014">&nbsp;&nbsp; 2014 &nbsp;&nbsp;</option>
		<option value="2013">&nbsp;&nbsp; 2013 &nbsp;&nbsp;</option> 
	</select> 
	<select class="news_media_select2" id="month" name="month" onchange="getPublicationByAjax();">
				<option value="">&nbsp;&nbsp;-Select Month- &nbsp;&nbsp;</option>
				<option value="01">&nbsp;&nbsp; January &nbsp;&nbsp;</option>
				<option value="02">&nbsp;&nbsp; February &nbsp;&nbsp;</option>
				<option value="03">&nbsp;&nbsp; March &nbsp;&nbsp;</option>
				<option value="04">&nbsp;&nbsp; April &nbsp;&nbsp;</option>
				<option value="05">&nbsp;&nbsp; May &nbsp;&nbsp;</option>
				<option value="06">&nbsp;&nbsp; June &nbsp;&nbsp;</option>
				<option value="07">&nbsp;&nbsp; July &nbsp;&nbsp;</option>
				<option value="08">&nbsp;&nbsp; August &nbsp;&nbsp;</option>
				<option value="09">&nbsp;&nbsp; September &nbsp;&nbsp;</option>
				<option value="10">&nbsp;&nbsp; October &nbsp;&nbsp;</option>
				<option value="11">&nbsp;&nbsp; November &nbsp;&nbsp;</option>
				<option value="12">&nbsp;&nbsp; December &nbsp;&nbsp;</option>
	</select>
	<%-- <%
			PortletSession portletSession2 = renderRequest.getPortletSession();
			String attributeValue = (String) portletSession2.getAttribute("flag", PortletSession.APPLICATION_SCOPE);
			System.out.println("flag : "+attributeValue);
			if(!"1".equals(attributeValue)){
			}
	%> --%>	
	<div id="publicationList">
	<select class="news_media_select3" id="publication" name="publication">
 			<option value="">&nbsp;&nbsp; -Select Publication- &nbsp;&nbsp;</option> 
	
	</select> 
	</div>
	<%//}else if("1".equals(attributeValue)){ %>	
 	
	<%//} %>	
 	<input class="news_media_button" name="search" onclick="monthValidate();" type="button" value="Go" />
 	
 	<div id="newsTable" style="width:100%">
 	
    </div>
   <!--  <div id="newsTable" style="width:100%">
 	
    </div> -->
<!-- <div class="clear">&nbsp;</div>

<table id="newsMediaTbl" style="display:none">
	<tbody>
		<tr class="table_head">
			<td style="width: 169px;">Publication</td>
			<td style="width: 166px;">Date</td>
			<td style="width: 434px;">Headline</td>
			<td style="width: 156px;">Download</td>
		</tr>
	</tbody>
</table>

<div id="ajaxResults" style="margin-top: -20px;">&nbsp;</div>
</div> -->

</body>
<script>
function monthValidate(){
	    var month = document.getElementById('month');
	    if(!month.value) {  
	        window.alert('Please select month!');  
	        return false;  
	    }
	    getNewAndMediaUrlByAjax();
}

</script>

<aui:script>
	//get Publication AJAX Starts Here
	var flag;
	
	Liferay.provide(window, 'getPublicationByAjax', function() {
		var A = AUI();
		//var datePickerAjaxResourceUrl = '<%= getPublicationUrl.toString().replace("http", "https") %>';
		var datePickerAjaxResourceUrl = '<%= getPublicationUrl.toString() %>';
		datePickerAjaxResourceUrl=datePickerAjaxResourceUrl.replace("http","https");
		//var monthSelect = A.one("#<portlet:namespace />month");
		var yearSelect = A.one("#year").get("value");
		var monthSelect = A.one("#month").get("value");
		//alert(yearSelect+"-"+monthSelect);
		flag = 1;
		A.io.request(
		// the resource URL to fetch words
		datePickerAjaxResourceUrl, {
			data : {
				// request parameters to be sent to the Server
				<portlet:namespace />yeared : yearSelect,
				<portlet:namespace />monthed : monthSelect,
				<portlet:namespace />flag : flag
			},
			on : {
				success : function() {
					var resp = this.get('responseData');
					A.one("#publicationList").empty()
							.append(this.get('responseData'));
				}
			}
		});

	});

	//get Publication AJAX ENDS Here

	//get NewandMedia AJAX Starts Here
	
	Liferay.provide(window, 'getNewAndMediaUrlByAjax', function() {
		
		var A = AUI();
		//var datePickerAjaxResourceUrl = '<%= getNewAndMediaUrl.toString().replace("http", "https") %>';
		var datePickerAjaxResourceUrl = '<%= getNewAndMediaUrl.toString() %>';
		datePickerAjaxResourceUrl=datePickerAjaxResourceUrl.replace("http","https");
		//var monthSelect = A.one("#<portlet:namespace />month");
		var yearSelect = A.one("#year").get("value");
		var monthSelect = A.one("#month").get("value");
		var publication = A.one("#publication").get("value");
		flag = 2;
		A.io.request(
		// the resource URL to fetch words
		datePickerAjaxResourceUrl, {
			data : {
				// request parameters to be sent to the Server
				<portlet:namespace />yeared : yearSelect,
				<portlet:namespace />monthed : monthSelect,
				<portlet:namespace />publication : publication,
				<portlet:namespace />flag : flag
			},
			on : {
				success : function() {
					var resp = this.get('responseData');
					A.one("#newsTable").empty()
							.append(this.get('responseData'));
				}
			}
		});

	});

	//get NewandMedia AJAX ENDS Here
</aui:script>
	
	

	
	
</html>