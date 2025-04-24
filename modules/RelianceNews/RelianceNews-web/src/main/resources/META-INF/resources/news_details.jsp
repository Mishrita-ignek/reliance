<%@ include file="init.jsp"%>
<%@ page import="com.rinfra.news.model.PressNews"%>
<div class="row">
	<div class="col-md-12">
		<div class="table-responsive">
		
			<table class="table table-hover table-striped bg-white">
				<thead>
					<tr>
						<th>Date</th>
						<th>Headline</th>
						<th>Publication</th>
						<th>Download</th>
						
						
					</tr>
				</thead>
				<tbody>
					<c:choose>
					
					 
						<c:when test="${not empty newsRoomWrappers}">
							<c:forEach var="newsRooms" items="${newsRoomWrappers}">
							<c:if test="${newsRooms.show=='T'}">
								<tr>
									<td><fmt:formatDate pattern="dd-MMM-yyyy" value="${newsRooms.date}" /></td>
									<td>${newsRooms.headLine}</td>
									<td>${newsRooms.publication}</td>
									<td>
										<c:choose>
												<c:when test="${not empty newsRooms.downloadUrl}">
													<a href="${newsRooms.downloadUrl}"
										target="_blank"><span style="padding:21px"><img src="<%=request.getContextPath()%>/image/pdf.png" /></span></a>
												</c:when>
												<c:otherwise>
													
												</c:otherwise>
											</c:choose> 
									</td>
								</tr>
								</c:if>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td colspan="4" style="text-align: center;">No News
									Headlines available for the current Month/Year.</td>
							</tr>
						</c:otherwise>
					</c:choose>

				</tbody>
			</table>
		</div>
	</div>
</div>
