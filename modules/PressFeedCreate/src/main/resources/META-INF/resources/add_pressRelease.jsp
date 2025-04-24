<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />

<%
PortletURL homeURL = renderResponse.createRenderURL();
PortletURL addPressReleaseActionURL = renderResponse.createActionURL();
addPressReleaseActionURL.setParameter(ActionRequest.ACTION_NAME, "addPressRelease");
%>

<script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
    <link href = "https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
         rel = "stylesheet">
<style>
      select.ui-datepicker-month {
    		color: black;
		}
		select.ui-datepicker-year {
    	color: black;
		}
		


.ui-widget-header {
    border: 1px solid #337AB7;
    background: #337AB7 url(images/ui-bg_gloss-wave_35_f6a828_500x100.png) 50% 50% repeat-x;
    }
.form-control {
	display: block;
	width: 100%;
	height: 43px;
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
</style>
<h2>Add Press Release here !</h2>
<a href="<%=homeURL.toString()%>">Home</a>
<br />
<br />
<aui:form action="<%=addPressReleaseActionURL.toString()%>" name="pressRelaseForm" method="POST">
	<div class="form-horizontal">
		<div class="form-group">
			<label for="inputEmail3" class="col-sm-6 head-label">All
				fields marked * are mandatory </label>
			<div class="col-sm-4"></div>
		</div>

		<div class="form-group">
			<label for="inputEmail3" class="col-sm-2 custome-control-label">Press Date:</label>
			<div class="col-sm-4">
				<%-- <aui:input name="newsDate" placeholder="MM-DD-YYYY"> --%>
				<%-- <aui:validator name="required" errorMessage="Please enter press date." /> --%>
				<aui:input id="newsDate" type="date" label=""  name="newsDate"><aui:validator name="required" errorMessage="This field is required."/>
				</aui:input> 
				 <!--  <input type = "text" id = "datepicker-13" ></p> -->
				<%-- </aui:input>  --%>
			</div>
		</div>
		<div class="form-group">
			<label for="inputEmail3" class="col-sm-2 custome-control-label">Description:</label>
			<div class="col-sm-4">
				<aui:input name="description">
				</aui:input>
			</div>
		</div>
		<div class="form-group">
			<label for="inputPassword3" class="col-sm-2 custome-control-label">file URL:</label>
			<div class="col-sm-4">
				<aui:input name="fileURL" id="fileURL" ><aui:validator name="required" errorMessage="Please enter File URL." />
				</aui:input>
			</div>
		</div>

	<div class="form-group">
			<label for="inputEmail3" class="col-sm-2 custome-control-label">Press Release Year:</label>
			<div class="col-sm-4">
				<aui:input name="newsYear" placeholder="YYYY">
				</aui:input>
			</div>
		</div>
		<%-- <div class="form-group">
			<label for="inputPassword3" class="col-sm-2 custome-control-label">Show*: </label>
			<div class="col-sm-4">
				<aui:select name="show">
					<aui:option value="">-------Select-------</aui:option>
					<aui:option value="T">True</aui:option>
					<aui:option value="F">False</aui:option>	
				</aui:select>
			</div>
		</div> --%>
		<aui:button type="submit" name="" value="Submit"></aui:button>
</aui:form>

<script>
$(document).ready(function(){
	$("#datepicker-13").datepicker({
        dateFormat:"mm-dd-yy",
        changeMonth: true,
        changeYear: true,
        yearRange: "-100:+0",
        maxDate: new Date()
     });
});
</script>
