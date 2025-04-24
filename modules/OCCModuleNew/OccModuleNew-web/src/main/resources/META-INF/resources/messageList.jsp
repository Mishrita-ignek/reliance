<%@ include file="init.jsp"%>
<%@ page import="OCCModuleNew.model.OccNew"%>

<div class="row">
	<div class="col-md-12">
		<div class="table-responsive">
			<table class="table table-hover table-striped bg-white">
				<thead class="table_head">
					<tr>
						<th class="head_th">Date</th>
						<th class="head_th">Message</th>
					</tr>
				</thead>
				<tbody>
					<c:choose>
						<c:when test="${not empty messageList}">
								<c:forEach var="messagelist" items="${messageList}">
								<tr>
									<td style="width: 17%;">${messagelist.MSgSendDate}</td>
									<td>${messagelist.message}</td>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<th colspan="3">No Message available for this List.</th>
							</tr>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>
		</div>
	</div>
</div>

<style>
.table_head {
	background: #0F75BD;
	color: #fff;
	font-weight: bold;
}

.head_th {
	border: 1px solid #ccc;
	text-align: center;
	padding: 10px 10px;
}
</style>

<%-- 






<style>
.table {
	width: 100%;
	max-width: 100%;
	border-color: #6a6e75;
	border: solid 1px;
	border-top-color: #6a6e75;
}
</style>
<div class="row" style="margin-top: 30px; margin-left: 0px;">
	<div class="form-group">
		<div class="col-md-4">
			<div class="table-responsive">
				<table class="table table-hover table-striped bg-white">
					<tbody>
						<c:choose>
							<c:when test="${not empty messageList}">
								<c:forEach var="messagelist" items="${messageList}">
									<tr>
										<td>${messagelist.MSgSendDate}</td>
										<td>${messagelist.message}</td>
									</tr>
									
								</c:forEach>
							</c:when>
							<c:otherwise>
								<tr>
									<td colspan="4" style="text-align: center;">No Message
										available for this List.</td>
								</tr>
							</c:otherwise>
						</c:choose>
					</tbody>
				</table>
			</div> 
		</div>
	</div>
</div>
 --%>