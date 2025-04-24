<%@ include file="init.jsp" %>
<html>
<head>
<style>
body {
    font-family: Arial,Helvetica,sans-serif;
    font-size: 14px;
    letter-spacing: 0;
}




</style>
</head>
<body>
<div class="row">
	<div class="col-md-12">
		<div class="table-responsive">
		
			<table class="table table-hover table-striped bg-white">
				<thead>
					<tr>
						<th>Year</th>
						<th>Data</th>
						<th>Download</th>
					</tr>
				</thead>
				<tbody>
					<c:choose>
						<c:when test="${not empty annualRports}">
							<c:forEach var="annualRports" items="${annualRports}">
								<tr>
									<td>${annualRports.FINANCIAL_YEARS }</td>
									<td>${annualRports.FINANCIALDATA}</td>
									
									<td>
										<c:choose>
												<c:when test="${not empty annualRports.FINANCIAL_DATALINK}">
													<a href="${annualRports.FINANCIAL_DATALINK}"
										target="_blank"><span style="padding:21px"><img src="<%=request.getContextPath()%>/images/icon_pdf.gif" /></span></a>
												</c:when>
												<c:otherwise>
													<p>Please Select Year</p>
												</c:otherwise>
											</c:choose> 
									</td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td colspan="4" style="text-align: center;"></td>
							</tr>
						</c:otherwise>
					</c:choose>

				</tbody>
			</table>
		</div>
	</div>
</div>

</body>
</html>