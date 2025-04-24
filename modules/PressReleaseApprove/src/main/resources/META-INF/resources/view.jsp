<%@ include file="init.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page import="com.relieanceada.rinfra.portal.pressRelease.model.PressRelease"  %>
<%@ page import="com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalServiceUtil"%>


<portlet:resourceURL var="payuURL" id="payu">
</portlet:resourceURL>
<body>



<div class="row">
	<div class="col-md-12">
		<div class="table-responsive">
	   		<table class="table table-hover table-striped bg-white">
		    <thead>
			     <tr>
				      <th>Date</th>
				      <th>Description</th>
				      <th>Download</th>
				       <th>Approve</th>
				       <th>Reject</th>
				        
			     </tr>
		    </thead>
	    <tbody>
		<c:forEach items="${pressReleaseList}" var="pressRelease">
			<c:if test="${not empty pressRelease && pressRelease.show=='F'}">
				<tr>
					<td style="width:17%;"><fmt:formatDate pattern="dd-MMM-yyyy" value="${pressRelease.newsDate}"/></td>
					<%-- <td>${pressRelease.heading}</td> --%>
					<td>${pressRelease.description}</td>
					<c:choose>
						<c:when test="${not empty pressRelease.fileURL}">	
<portlet:resourceURL var="pdfDownloadUrl">
						
	<portlet:param name="approve" value="${pressRelease.pressId}"/>
	
</portlet:resourceURL>


<portlet:resourceURL var="pdfDownloadUrl1">
						
	<portlet:param name="reject" value="${pressRelease.pressId}"/>
	
</portlet:resourceURL>
					<aui:form method="POST" name="pressReleaseForm1">		
							<td style="width:15%;"><a href="${pressRelease.fileURL}" target="_blank"><span style="padding:21px"><img src="<%=request.getContextPath()%>/image/pdf.png" /></span></a></td>
							
 <td style="width:15%;"><a href="<%= pdfDownloadUrl %>" class="btn btn-primary"><span style="padding:21px">Approve</span></a></td>
  <td style="width:15%;"><a href="<%= pdfDownloadUrl1 %>" class="btn btn-primary"><span style="padding:21px">Reject</span></a></td>
							
									
									
									</td>
								
								 
								</aui:form>	
							
						</c:when>
						
						<c:otherwise>
							<td></td>
						</c:otherwise>
					</c:choose>
				</tr>				
			</c:if>
		</c:forEach>
		</tbody>
	   </table>
	 </div>
	</div>
 </div> 


<script
		src="https://code.jquery.com/jquery-1.10.2.js" type="text/javascript"></script>
<script>
function myFunction() {
  //document.getElementById("demo").innerHTML = "Hello World";
  var approve = document.getElementById('Approve').value;
  var reject = document.getElementById('Reject').value;
 alert(approve);
	jQuery
	.ajax({
		url : '${payuURL}',
		type : 'POST',
		async : false,
		dataType : 'json',
		data : {
			
			"<portlet:namespace/>Approve" : approve,
			
			"<portlet:namespace/>Reject" : reject
		},
		success : function() {
			var resp = this.get('responseData');	
              alert("response=="+resp);
              

		}
	});
}
</script> 
	
</body>
</html>
		
							
							
																	
															
							
								
								 
							