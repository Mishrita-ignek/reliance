<%@ include file="init.jsp" %>
<%@ page import="com.relieanceada.rinfra.portal.pressRelease.model.PressRelease"  %>
<%@ page import="com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalServiceUtil"%>

<div class="row">
	<div class="col-md-12">
		<div class="table-responsive">
	   		<table class="table table-hover table-striped bg-white">
		    <thead>
			     <tr>
				      <th>Date</th>
				      <th>Description</th>
				      <th>Download</th>
			     </tr>
		    </thead>
	    <tbody>
		<c:forEach items="${pressReleaseList}" var="pressRelease">
			<c:if test="${not empty pressRelease && pressRelease.show=='T'}">
				<tr>
					<td style="width:17%;"><fmt:formatDate pattern="dd-MMM-yyyy" value="${pressRelease.newsDate}"/></td>
					<%-- <td>${pressRelease.heading}</td> --%>
					<td>${pressRelease.description}</td>
					<c:choose>
						<c:when test="${not empty pressRelease.fileURL}">				
							<td style="width:15%;"><a href="${pressRelease.fileURL}" target="_blank"><span style="padding:21px"><img src="<%=request.getContextPath()%>/image/pdf.png" /></span></a></td>		
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

 
