<%@page import="com.metro.mediarelease.model.MetroMediaRelease"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="row">
	<div class="col-md-12">
		<div class="table-responsive">
			<table class="table table-hover table-striped bg-white">
				<thead class="table_head">
					<tr>
						<th class="head_th">Date</th>
						<th class="head_th">HEADLINE</th>
						<th class="head_th">Download</th>
					</tr>
				</thead>
				<tbody>
					<c:choose>
						<c:when test="${not empty mediaList}">
							<c:forEach items="${mediaList}" var="pressRelease">
								<tr>
									<td style="width: 17%;"><fmt:formatDate
											pattern="dd-MMM-yyyy" value="${pressRelease.HDATE}" /></td>
									<td>${pressRelease.HEADLINE}</td>
									<c:choose>
										<c:when test="${not empty pressRelease.DOCUMENT_NAME}">
											<td style="width: 15%;"><a
												href="${pressRelease.DOCUMENT_NAME}" target="_blank"><span
													style="padding: 21px"><img
														src="<%=request.getContextPath()%>/image/pdf.png" /></span></a></td>
										</c:when>
									</c:choose>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<th colspan="4">No Result Found For Search Criteria</th>
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

