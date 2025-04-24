<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.Set"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.List"%>
<%@ include file="init.jsp" %>
<portlet:resourceURL var="fetchAnnualReportURL" >
</portlet:resourceURL>

<html>
<head>

<title>Rinfra</title>

<style type="text/css">
.inner_main-box_right {
    width: 100%;
    float: left;
    height: 600px;
}
body {
    font-family: Arial, Helvetica, sans-serif;
    font-size: .8em;
    letter-spacing: 0;
}
.right_menu_box {
    float: left;
    width: 100%;
}
.clear {
    clear: both;
}
h4 {
    color: #3b3b3b;
    font-family: Arial, Helvetica, sans-serif;
    font-size: 2.4em;
    font-weight: 400;
    font-variant: normal;
    text-transform: none;
    letter-spacing: 0;
}
h1, h2, h3, h4, h5, h6 {
    margin: 0 0 20px;
    padding: 0;
    line-height: normal;
}
table {
    border-collapse: collapse;
    border-spacing: 0;
    width: 100%;
}
.brdcrumb {
    font-family: Arial, Helvetica, sans-serif;
    font-size: 14px;
    color: #0563bb;
    padding: 4px 0 15px 10px;
    margin: 0;
}
.inner_heading {
    font-family: Arial, Helvetica, sans-serif;
    font-size: 18px;
    color: #3b3b3b;
    padding: 8px 10px;
    margin: 0;
}
.brdcrumb_gray{
font-family: Arial,Helvetica,sans-serif;
font-size: 14px;
color: #4e5154;
}
.form-group {
    margin-bottom: -29px;
    margin-left: 11px;
}
.blank_div{
height: 250px;
}
.form-control {
    display: inline;
}

</style>
</head>
<body>

<%
Set<String> annualReportYears=(Set<String>) request.getAttribute("annualReportsYear");
System.out.println("annualReportYears :: "+annualReportYears);
%>
<div class="">
<p class="brdcrumb"><span class="brdcrumb_gray">Financials  -</span> Annual Report for Last 10 Years </p>

<p class="inner_heading">See how we have worked year after year, to bring about a tangible change. </p>


<aui:select id="annualYear"  name="<portlet:namespace />" class="styled"  style='width: 120px; height: 33px;font-size: 12px;background: #fff;padding: 3px 2px 2px 9px; ' >
  	<option value="-1">Select Year</option>
<%
							if(Validator.isNotNull(annualReportYears)){
							for (String reportYear : annualReportYears){ 
								%>
								<option value="<%=reportYear %>"><%=reportYear%></option>
								<%}
							}%>		     
</aui:select>

<input src="<%=request.getContextPath()%>/images/go_arrow_btn.gif"  onclick="fetchAnnualReportList();" type="image"  value="Submit" style= "margin-left: 145px; margin-top: 0px;" height="25" >


<div id="AnnualReportTable">

	</div>

<div class="blank_div">

</div>
</div>    <!-- main div -->

<aui:script>

Liferay.provide(
		window,
		'fetchAnnualReportList',
		function(){
			var A = AUI();
			var fetchInvestorReleaseURL = '<%=fetchAnnualReportURL.toString()%>';
			//alert(fetchInvestorReleaseURL);
            var selectedReportYear = A.one("#<portlet:namespace />annualYear");
            //alert("selectedReportYear "+selectedReportYear);
            A.io.request (
                    fetchInvestorReleaseURL.replace("http", "https"), {
            			data: {
                            <portlet:namespace />selectedReportYear : selectedReportYear.val()
    		},
    		on: {
                success: function() {
                var resp = this.get('responseData');
                A.one("#AnnualReportTable").empty().append(this.get('responseData'));
             }
       }
    
	});
});



</aui:script>

</body>
</html>