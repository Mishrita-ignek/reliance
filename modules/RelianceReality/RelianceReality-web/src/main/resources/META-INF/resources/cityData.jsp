<%@page
	import="com.reliance.reality.service.RealityPropertyMasterLocalServiceUtil"%>
<%@page import="com.reliance.reality.model.RealityPropertyMaster"%>
<%@ include file="init.jsp"%>

<div class="row">
	<div class="col-md-12">
	<h4>Available Real Estate</h4>
		<div class="table-responsive table table-bordered">
			<table class="table table-hover table-striped bg-white">
				<thead>
					<tr>
						<th>SrNo</th>
						<th>Location</th>
						<th>Address</th>
						<th>Area</th>
						<th>Type</th>
						<th>Guidance Price (INR Lakhs)</th>
						<th>Age of Property (in years)</th>
						<th>Select Property you want to Bid</th>
						<th>Offer Price (INR Lakhs)</th>
					</tr>

				</thead>
				<tbody>
					<c:forEach items="${realityPropertyMaster}"
						var="realityPropertyMaster">
						<tr>
							<td>${realityPropertyMaster.propertyBid}</td>
							<td>${realityPropertyMaster.location}</td>
							<td>${realityPropertyMaster.address}</td>
							<td>${realityPropertyMaster.area}</td>
							<td>${realityPropertyMaster.type}</td>
							<td>${realityPropertyMaster.guidancePrice}</td>
							<td>${realityPropertyMaster.ageOfProperty}</td>
							<td><input style="width: 80px;"  type="checkbox" onchange="priceSum();" name="<portlet:namespace/>bid" id="bid" value="${realityPropertyMaster.property_ID}"></td>
							<td><input style="width: 80px;"  type="number" pattern="/^-?\d+\.?\d*$/" onKeyPress="if(this.value.length==3) return false;"  onchange="priceSum();" name="<portlet:namespace/>offerPrice${realityPropertyMaster.property_ID}" id="offerPrice${realityPropertyMaster.property_ID}" ></td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="3">Total Funding Needed</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td><input style="width: 80px;"  type="text" name="totalPrice" id="totalPrice" readonly="readonly" value=""> </td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>
	