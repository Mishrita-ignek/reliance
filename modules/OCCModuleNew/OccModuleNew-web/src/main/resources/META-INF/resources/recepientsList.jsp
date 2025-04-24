<%@ include file="init.jsp"%>
<%@ page import="OCCModuleNew.model.OccNew"%>
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
		<label class="control-label col-sm-2" for="CEaddress ">Recepients
			List :</label>
		<div class="col-md-4">
			<div class="table-responsive">
				<table class="table table-hover table-striped bg-white">
					<tbody>
						<c:choose>
							<c:when test="${not empty emailList}">
								<c:forEach var="list" items="${emailList}">
									<tr>
										<td>${list.name}</td>
									</tr>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<tr>
									<td colspan="4" style="text-align: center;">No Name
										available for this group.</td>
								</tr>
							</c:otherwise>
						</c:choose>
					</tbody>
				</table>
			</div> 
		</div>
	</div>
</div>
