<%@ include file="/init.jsp" %>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.PortletSession"%>
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
<portlet:actionURL name="mailSend" var="mailSendUrl" />
<portlet:resourceURL var="getListUrl"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reliance Mumbai Metro - SMS and Email alert system for OCC</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>
<style type="text/css">
#footer {
    display: none;
}
.portlet-content{
	border: none !important;
}
/* label, .control-label {
    display: none;
} */
.portlet-title-text {
    display: none;
}
</style>
<style type="text/css">
textarea.form-control {
    height: 70px;
}
.btn-info {
    color: #fff;
    background-color: #337ab7;
    border-color: #337ab7;
}
.portlet-content-container{
	 margin-top: 125px;
}
  
.navbar-header{
	display: none !important;
}
.navbar{
	display: none !important;
}
.fieldset{
	display: none !important;
} 
.rel-logo{
	margin-top: -296px;
	margin-bottom: 126px;
}
.collapse navbar-collapse{
	display: none !important;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
	var text_max = 130;
    $('#text_count').html(text_max + ' characters remaining');

    $('#textmsg').keyup(function() {
        var text_length = $('#textmsg').val().length;
        var text_remaining = text_max - text_length;

        $('#text_count').html(text_remaining + ' characters remaining');
    });
	
	
 	$("#submit").css("opacity", "0.5");
	$("#submit").css("pointer-events", "none");
$("#textmsg").keyup(function(){
       var flag = $("#textmsg").val().length;
       if(parseInt(flag)>0 && parseInt(flag)<131){
 		    $("#submit").css("opacity", "1");
            $("#submit").css("pointer-events", "visible");
 		}else if(parseInt(flag)==0){
        	$("#submit").css("opacity", "0.5");
			$("#submit").css("pointer-events", "none");
        }else if(parseInt(flag)>130){
        	alert("character should be less than 130 ");
        	$("#submit").css("opacity", "0.5");
			$("#submit").css("pointer-events", "none");
        }
    });
});

$(function(){
	 
	$('#textmsg').keyup(function()
	{
		var yourInput = $(this).val();
		re = /[`~!@#$%^&*()_|+\-=?;:'"<>\{\}\[\]\\\/]/gi;
		var isSplChar = re.test(yourInput);
		if(isSplChar)
		{
			alert("special character not allow ");
			var no_spl_char = yourInput.replace(/[`~!@#$%^&*()_|+\-=?;:'"<>\{\}\[\]\\\/]/gi, '');
			$(this).val(no_spl_char);
		}
	});
 
});
</script>
</head>
<%
	PortletURL view = renderResponse.createRenderURL();
	view.setParameter("mvcPath", "/viewmessage.jsp");
%>
<body>
<div class="rel-logo">
	<a href="">
		<img src="<%=request.getContextPath()%>/image/reliance_logo.png" alt="Reliance Logo" border="0"></a>
</div>
<div class="container">
<div class="panel panel-primary">
	<a class="btn btn-primary" style="float:right;" href="${logoutURL}">Logout</a>
	<a class="btn btn-primary" style="float:right;" href="<%=view.toString()%>">View</a>
		<div class="panel-heading">
			<h3 class="panel-title">SMS and Email</h3>
		</div>
		<div class="panel-body">
		<form action="<%=mailSendUrl%>" method="post">
			<br>
			<div class="form-group">
      			<label class="control-label col-sm-2" for="CEaddress ">Type your message :</label>
      			<div class="col-sm-5">
        			<textarea type="text" class="form-control" id="textmsg" name="<portlet:namespace/>textmsg" placeholder="Enter your Message"></textarea>
        			<br>
        			<table>
        			<tr><td><input type="radio" name="<portlet:namespace/>severity" value="Severity-1"  onclick="getList();"> Severity-1 &nbsp;&nbsp;</td>
        			<td><input type="radio" name="<portlet:namespace/>severity" value="Severity-2"  onclick="getList();"> Severity-2 &nbsp;&nbsp;</td>
				    <td><input type="radio" name="<portlet:namespace/>severity" value="Severity-3"  onclick="getList();"> Severity-3 </td>
				    </tr>
        			</table>
      			</div>
      			<table>
				 <tr><td><input type="radio" name="<portlet:namespace/>listName" value="G-1"  onclick="getList();">G-1 </td></tr>
				 <tr><td><input type="radio" name="<portlet:namespace/>listName" value="G-2"  onclick="getList();">G-2 </td></tr>
				 <tr><td><input type="radio" name="<portlet:namespace/>listName" value="MOOPL Group"  onclick="getList();">MOOPL Group </td></tr>
				 <tr><td><input type="radio" name="<portlet:namespace/>listName" value="Testing-1"  onclick="getList();">Testing-1 </td></tr>
				 <tr><td><input type="radio" name="<portlet:namespace/>listName" value="Testing-2"  onclick="getList();">Testing-2 </td></tr>
				  
				 </table>
    		</div>
			<div id="text_count" style="margin-left: 200px;">
			
			</div>
			<div class="form-group" style="margin-top: 40px; margin-left: 200px;" >
				<input class="btn btn-info btnp" name="submit" id="submit" value="Submit" type="submit" onclick="return validList();"></input>
			</div>
			
			<div class="form-group">
    		<div id="recepientsList">
    		
			</div>
    		</div>
    		
				</form>
		</div>
	
		</div>
		</div>
</body>
<script type="text/javascript">
			function validList(){
				if($('input[name=<portlet:namespace/>listName]:checked').length<=0){
	             alert("Please Select List.")
				 return false;
	            }
			}
</script>
<aui:script>

Liferay.provide(
		window,
		'getList',
		function(){
			var A = AUI();
			var getListUrl = '<%=getListUrl.toString()%>';
			 // selecting the sourceSelect drop-down to get the current value
            var listName = A.one("input[name=<portlet:namespace/>listName]:checked").get("value");
            //var listName = $('input[name=listName]:checked').length<=0){
            //alert(listName);
            A.io.request (
            		// the resource URL to fetch words
                    getListUrl, {
            			data: {
            				// request parameters to be sent to the Server
                            <portlet:namespace />selectedList : listName
    		},
    		on: {
                success: function() {
                var resp = this.get('responseData');
                A.one("#recepientsList").empty().append(this.get('responseData'));
             }
       }
    
	});
});

</aui:script>

</html>