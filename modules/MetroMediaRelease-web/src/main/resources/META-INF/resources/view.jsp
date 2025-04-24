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
<portlet:resourceURL var="getMediaReleaseUrl">
</portlet:resourceURL>

<%-- <div class="news_media">
	<aui:select name="<portlet:namespace />year" id="year"
		class="news_media_select1">
		<aui:option value="2017">&nbsp;&nbsp; 2017 &nbsp;&nbsp;</aui:option>
		<aui:option value="2016">&nbsp;&nbsp; 2016 &nbsp;&nbsp;</aui:option>
		<aui:option value="2015">&nbsp;&nbsp; 2015 &nbsp;&nbsp;</aui:option>
		<aui:option value="2014">&nbsp;&nbsp; 2014 &nbsp;&nbsp;</aui:option>
		<aui:option value="2013">&nbsp;&nbsp; 2013 &nbsp;&nbsp;</aui:option>
	</aui:select>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

	<aui:select id="month" name="<portlet:namespace />month"
		class="news_media_select2">
		<aui:option value="">&nbsp;&nbsp;-Select Month- &nbsp;&nbsp;</aui:option>
		<aui:option value="JAN">&nbsp;&nbsp; January &nbsp;&nbsp;</aui:option>
		<aui:option value="FEB">&nbsp;&nbsp; February &nbsp;&nbsp;</aui:option>
		<aui:option value="MAR">&nbsp;&nbsp; March &nbsp;&nbsp;</aui:option>
		<aui:option value="APR">&nbsp;&nbsp; April &nbsp;&nbsp;</aui:option>
		<aui:option value="MAY">&nbsp;&nbsp; May &nbsp;&nbsp;</aui:option>
		<aui:option value="JUN">&nbsp;&nbsp; June &nbsp;&nbsp;</aui:option>
		<aui:option value="JUL">&nbsp;&nbsp; July &nbsp;&nbsp;</aui:option>
		<aui:option value="AUG">&nbsp;&nbsp; August &nbsp;&nbsp;</aui:option>
		<aui:option value="SEP">&nbsp;&nbsp; September &nbsp;&nbsp;</aui:option>
		<aui:option value="OCT">&nbsp;&nbsp; October &nbsp;&nbsp;</aui:option>
		<aui:option value="NOV">&nbsp;&nbsp; November &nbsp;&nbsp;</aui:option>
		<aui:option value="DEC">&nbsp;&nbsp; December &nbsp;&nbsp;</aui:option>
	</aui:select>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="button"
		class="news_media_button" onclick="getMediaReleasesByAjax();"
		name="search" value="Go" /> <br />
</div>
<div id="newsTable">

</div>
 --%>

<style type="text/css">
.active_menu1 span, .cssm_m0, .active_breadcrumbs, .link {
	color: #034ea2 !important;
}

a {
	color: #333333;
}

/*.nav #m7 {
	display: block !important;
	padding: 0 12px !important;
	width: 110px !important;
	height: 67px !important;
	background:
		url(/o/Reliance-MumbaiMetro-Theme/css/custom/images/menu_icon_sprint.png)
		no-repeat -152px -352px #ab218e !important;
}*/

</style>
<br>
<br>
<p id="main_heading">
	<span>MEDIA RELEASES</span>
</p>

<div class="inner_main">
	<div class="inner_wrapper mission_spacer">
		<div class="news_media">
			<select class="news_media_select1" id="year"
				name="year">
				<option value="2018">&nbsp;&nbsp; 2019 &nbsp;&nbsp;</option>
				<option value="2018">&nbsp;&nbsp; 2018 &nbsp;&nbsp;</option>
				<option value="2017">&nbsp;&nbsp; 2017 &nbsp;&nbsp;</option>
				<option value="2016">&nbsp;&nbsp; 2016 &nbsp;&nbsp;</option>
				<option value="2015">&nbsp;&nbsp; 2015 &nbsp;&nbsp;</option>
				<option value="2014">&nbsp;&nbsp; 2014 &nbsp;&nbsp;</option>
				<option value="2013">&nbsp;&nbsp; 2013 &nbsp;&nbsp;</option>
			</select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
			<select class="news_media_select2" id="month"
				name="month" required>
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
			</select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
			<input
				class="news_media_button" name="search"
				onclick="monthValidate();" type="button" value="Go" />

			<div class="fixedDiv" id="newsTable" style="margin-top:20px;">&nbsp;</div>
		</div>
	</div>
</div>
<script>
function monthValidate(){
	    var month = document.getElementById('month');
	    if(!month.value) {  
	        window.alert('Please select month!');  
	        return false;  
	    }
	    getMediaReleasesByAjax();
}
	</script>
<aui:script>
	//get MediaReleases AJAX Starts Here
	
	Liferay.provide(window, 'getMediaReleasesByAjax', function() {
		
		var A = AUI();
		var datePickerAjaxResourceUrl = '<%= getMediaReleaseUrl.toString()%>'; 
	//	datePickerAjaxResourceUrl=datePickerAjaxResourceUrl.replace("http","https");
		/* .replace("http", "https")  */

		//var monthSelect = A.one("#<portlet:namespace />month");
		var yearSelect = A.one("#year").get("value");
		var monthSelect = A.one("#month").get("value");
		
		A.io.request(
		// the resource URL to fetch words
		datePickerAjaxResourceUrl, {
			data : {
				// request parameters to be sent to the Server
				<portlet:namespace />yeared : yearSelect,
				<portlet:namespace />monthed : monthSelect
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

	//get MediaReleases AJAX ENDS Here
</aui:script>
	



<style type="text/css">
.smalltxt_inner {
	font-family: Arial, Helvetica, sans-serif;
	float: left;
	width: 100%;
	color: #565656;
	margin: 5px 0 0 0;
}

#main_heading {
	width: 98%;
    border-bottom: 2px solid #bababa;
    margin-bottom: 15px;
    margin-left: 10px;
}
    

#main_heading span {
	display: inline-block;
	font-family: Helvetica condensed, Helvetica;
	font-style: italic;
	color: #4a4a4a;
	font-size: 28px;
	padding: 0px 20px;
	/* margin-left: 50px; */
	background: #bababa none repeat scroll 0 0;
}
</style>
