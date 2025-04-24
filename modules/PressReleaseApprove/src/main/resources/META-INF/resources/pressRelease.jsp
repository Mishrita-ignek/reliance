<%@ include file="init.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page import="com.relieanceada.rinfra.portal.pressRelease.model.PressRelease"  %>
<%@ page import="com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalServiceUtil"%>


<%

String source=(String) request.getAttribute("pressReleaseList");
String url="http://10.8.48.129/user/rinfrapressreview";

%>
<style>

.portlet-inner {
    height: 204px !important;
}

.bsesportal body #wrapper p, .bsesportal body #wrapper .x-14 {
    font-size: 15px;
    font-family: sans-serif;
    padding-top: 23px !important;
}

input.btn.btn-primary.center-block {
    margin-top: 35px !important;
}
.lfr-alert-container {
	display: none !important;
}
</style>
</header>
<div class="portlet-inner">
		<div class="row">
			<div class="col-xs-12">
				<h4 class="colorBlue helvetica-light ml-15">
					<p>This  press release has been published on the  website.</p>
				</h4>
			</div>
			<div class="col-xs-12">
			  <input type="button" class="btn btn-primary center-block" value="Back" label="Back"  onclick='location.href="<%=url%>"'></input> 
	</div>
	</div>
</div>			
																	
															
							
								
								 
							