<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<portlet:actionURL name="register" var="registerURL" />
<portlet:resourceURL var="fetchPropertyURL" />

<html>
<head>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reliance Reality</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/jquery-ui.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<script src="<%=request.getContextPath()%>/js/jquery.min.js">
	
</script>
<style type="text/css">
.portlet-content {
	border: none !important;
}

.lableF {
	color: red;
	margin-left: 197px;
}

.astrx {
	color: red;
}

.alink {
	color: #f5f5f5;
	text-decoration: none;
}
</style>

<style type="text/css">
.lableF {
	color: red;
	margin-left: 197px;
}

.astrx {
	color: red;
}
</style>


</head>
<body>
	<div>
		<img alt="" src="<%=request.getContextPath()%>/image/logo.png">
	</div>
	<div class="container" style="width: 108%;">
		<div id="loginbox" style="margin-top: 50px;" class="">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="panel-title">Reliance Reality</div>
					<div style="float: right; position: relative; top: -21px"></div>
				</div>

				<div style="padding-top: 30px" class="panel-body">

					<div style="display: none" id="login-alert"
						class="alert alert-danger col-sm-12"></div>

					<form id="signupform" class="form-horizontal" role="form"
						method="post" action="" name="registrationForm">
						
						
						<div id="signupalert" style="display: none"
							class="alert alert-danger">
							<p>Error:</p>
						</div>
				<!-- 		<span style="padding-left: 100px;">1) The properties offered for sale are open for inspection on 07 & 08 September and on 14th & 15th September</span><br>
						<span style="padding-left: 100px;">2) The last day for submission of offer for the properties is 16 th September </span> <br><br> -->
						<span class="lableF"> All fields marked * are mandatory </span> <br>
						<br>
						
						<div class="form-group">
							<label for="email" class="col-md-2 control-label">City :
								<strong class="astrx">*</strong>
							</label>
							<div class="col-md-3" style="padding: 0 30px;">
								<aui:select name="city" id="city" label=""
									onChange="fetchProperty();">
									<aui:option value="-1">Select City</aui:option>
									<c:forEach var="city" items="${city}">
										<aui:option value="${city}">${city}</aui:option>
									</c:forEach>
								</aui:select>
							</div>
						</div>

						<div class="" id="cityData"></div>
						
						<div class="form-group" id="errorMessage" style="padding-left: 120px;color: red;" ></div>

						<div class="form-group">
							<label for="email" class="col-md-2 control-label">Funding
								: <strong class="astrx">*</strong>
							</label>
							<div class="col-md-3" style="padding: 0 30px;" >
								<aui:select name="funding" id="funding" label="">
									<aui:option value="-1">Select Funding</aui:option>
									<aui:option value="Self">Self</aui:option>
									<aui:option value="Bank Loan">Bank Loan</aui:option>
								</aui:select>
							</div>
							<!-- </div>
						
						<div class="form-group"> -->
							<label for="email" class="col-md-2 control-label">Arrange
								Fund in Days : <strong class="astrx">*</strong>
							</label>
							<div class="col-md-3">
								<input type="text" class="form-control numberOnly" maxlength="3"
									id="days" name="<portlet:namespace/>days" 
									placeholder="Enter Days" required="required"
									onkeypress="return numbersonly();">
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2" for="Empcode">Empcode
								: <strong class="astrx">*</strong>
							</label>
							<div class="col-sm-3">
								<input type="text"   class="form-control numberOnly"  
									rows="3" id="empcode" name="<portlet:namespace/>empcode" 
									placeholder="Empcode" value="" onkeypress="return numbersonly();">
								</input>
							</div>
							<!-- </div>
						
						<div class="form-group">
 -->
							<label class="control-label col-md-2" for="Name">Name : <strong
								class="astrx">*</strong></label>
							<div class="col-sm-3">
								<input type="text" class="form-control" rows="3" id="name" 
									name="<portlet:namespace/>name" placeholder="Enter Name"
									value=""></input>
							</div>
						</div>

						<div class="form-group">
							<label for="firstname" class="col-md-2 control-label">Email
								:<strong class="astrx">*</strong>
							</label>
							<div class="col-md-3">
								<input type="email" class="form-control" 
									name="<portlet:namespace />email" placeholder="Enter Email"
									id="email">
								
							</div>
							<!-- </div>
						<div class="form-group"> -->
							<label for="email" class="col-md-2 control-label">Mobile
								:<strong class="astrx">*</strong>
							</label>
							<div class="col-md-3">
								<input type="text" class="form-control numberOnly"  
									maxlength="10" id="mobNumberber"
									name="<portlet:namespace/>mobNumberber"
									placeholder="Mobile Number" required="required"
									onkeypress="return numbersonly();">
							</div>
						</div>
						<div class="form-group">
							<label for="email" class="col-md-2 control-label">Group
								Company Name : <strong class="astrx">*</strong>
							</label>
							<div class="col-md-3" style="padding: 0 30px;" >
								<aui:select name="companyName" id="companyName" label="">
									<aui:option value="-1">Select Company Name</aui:option>
									<aui:option value="Metro">Reliance Group</aui:option>
									<aui:option value="Reliance Infrastructure">Reliance Infrastructure</aui:option>
									<aui:option value="Reliance Naval & Engineering">Reliance Naval & Engineering</aui:option>
									<aui:option value="Reliance Power">Reliance Power</aui:option>
									<aui:option value="Reliance Roads">Reliance Roads</aui:option>
									<aui:option value="Reliance EPC">Reliance EPC</aui:option>
									<aui:option value="Reliance Mumbai Metro">Reliance Mumbai Metro</aui:option>
									<aui:option value="Reliance Communications">Reliance Communications</aui:option>
									<aui:option value="Reliance Capital">Reliance Capital</aui:option>
									<aui:option value="Reliance General Insurance">Reliance General Insurance</aui:option>
									<aui:option value="Reliance Life Insurance">Reliance Life Insurance</aui:option>
									<aui:option value="Reliance Home Finance">Reliance Home Finance</aui:option>
									<aui:option value="Nanded Airport">Nanded Airport</aui:option>
									<aui:option value="BSES Rajdhani Power">BSES Rajdhani Power</aui:option>
									<aui:option value="BSES Yamuna Power">BSES Yamuna Power</aui:option>
									<aui:option value="Kokilaben Hospital">Kokilaben Hospital</aui:option>
								</aui:select>
							</div>
						</div>
						<!-- ------------------------->
						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<button id="btn-signup" type="button" class="btn btn-info"
									onclick="return validRegistrationForm();">
									<i class="icon-hand-right"></i> &nbsp Submit
								</button>
							</div>
						</div>
					</form>
				</div>
				<p>
					<strong>Note:1) All the carpet and built up areas are provided as per the records available. The final areas would be verified at a later stage on actual measurements. </strong>
					<br></br>
					<strong>  &nbsp; &nbsp; &nbsp; &nbsp;    2) Stamp duty and registration charges will be on purchaser's account.</strong><br></br>
					
					
				<strong>  &nbsp; &nbsp; &nbsp; &nbsp;   3) For any further queries, kindly mail on the following ID's </strong>	<br></br>
        
         <p>   <strong> &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; pradip.b.singh@relianceada.com  (022 43032507 / 9329682265)</strong></p>
           <p> <strong> &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;alok.k.kumar@relianceada.com  (9320044855)</strong></p>
           <p> <strong> &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; bahaar.rao@relianceada.com   (022 43032506)</strong></p>
           <p> <strong> &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; deepali.g.pawar@relianceada.com   (022 43032505)</strong>
				<!-- </p>
					<strong>Contact persons</strong>
				</p> -->
			<!-- 	<table class="table table-hover table-striped bg-white">
					<thead>
						<tr>
							<th style="border: 1px solid;">SL</th>
							<th style="border: 1px solid;">Name</th>
							<th style="border: 1px solid;">Phone</th>
							<th style="border: 1px solid;">Email</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td style="border: 1px solid;">1</td>
							<td style="border: 1px solid;">Alok kumar</td>
							<td style="border: 1px solid;">9320044855</td>
							<td style="border: 1px solid;">alok.k.kumar@relianceada.com</td>
						</tr>
						<tr>
							<td style="border: 1px solid;">2</td>
							<td style="border: 1px solid;">Pradip Singh</td>
							<td style="border: 1px solid;">9329682265</td>
							<td style="border: 1px solid;">pradip.b.singh@relianceada.com</td>
						</tr>
					</tbody>
				</table> -->
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	function validRegistrationForm() {
		
		var city = document.getElementById("<portlet:namespace/>city").value;
		if (city == "-1" || city == "null") {
			alert("Please Select City .")
			document.getElementById("<portlet:namespace/>city").focus();
			return false;
		}
		
		var favorite = [];
        $.each($("input[name='<portlet:namespace/>bid']:checked"), function(){            
            favorite.push($(this).val());
            
        });
        if(favorite.length == 0){
        	alert("Please Select Property you want to Bid.")
	    	return false;
        }
        var totalPrice = 0 ;
        var priceAmt = 0 ;
        for (index = 0 ; index < favorite.length ; index++) { 
			//alert("offerPrice"+favorite[index]);
			var price = document.getElementById("offerPrice"+favorite[index]).value;
			if (price == "" || price == "null") {
				alert("Please Enter Offer Price.")
				document.getElementById("offerPrice"+favorite[index]).focus();
				return false;
			}
			priceAmt = parseFloat(price)
			if (priceAmt == 0) {
				alert('Please Enter Offer price should be greater than "0".')
				document.getElementById("offerPrice"+favorite[index]).focus();
				return false;
			}
			
			totalPrice += parseFloat(price);
		}
        //alert("totalPrice - "+totalPrice);
        //document.getElementById("totalPrice").value = totalPrice ;
        
		var funding = document.getElementById("<portlet:namespace/>funding").value;
		if (funding == "-1" || funding == "null") {
			alert("Please Select funding .")
			document.getElementById("<portlet:namespace/>funding").focus();
			return false;
		}
		var days = document.getElementById("days").value;
		if (days == "" || days == "null") {
			alert("Specify time you will need to arrange required Fund in days.")
			document.getElementById("days").focus();
			return false;
		}
		var empcode = document.getElementById("empcode").value;
		if (empcode == "" || empcode == "null") {
			alert("Enter Empcode.")
			document.getElementById("empcode").focus();
			return false;
		}
		var name = document.getElementById("name").value;
		if (name == "" || name == "null") {
			alert("Enter Name.")
			document.getElementById("name").focus();
			return false;
		}
		var email = document.getElementById("email").value;
		if (email == "" || email == "null") {
			alert("Enter Email.")
			document.getElementById("email").focus();
			return false;
		}

		e_pat = /^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
		if (!e_pat.test(email)) {
			alert("Invalid Email Id.");
			document.getElementById("email").focus();
			return false;
		}
		
		var mobile = document.getElementById("mobNumberber").value;
		if (mobile == "" || mobile == "null") {
			alert("Enter Mobile Number.")
			document.getElementById("mobNumberber").focus();
			return false;
		}

		m_pat = /^[6-9][0-9]{9}$/;
		if (!m_pat.test(mobile)) {
			alert("Invalid Mobile Number");
			document.getElementById("mobNumberber").focus();
			return false;
		}
		var companyName = document.getElementById("<portlet:namespace/>companyName").value;
		if (companyName == "-1" || companyName == "null") {
			alert("Please Select Group Company Name .")
			document.getElementById("<portlet:namespace/>companyName").focus();
			return false;
		}
		
		getExistRecord(favorite,empcode);
		
		/* document.registrationForm.method = "POST";
		document.registrationForm.action = "${registerURL}";
		document.registrationForm.submit(); */
	}

	function priceSum(){
		
		var favorite = [];
        $.each($("input[name='<portlet:namespace/>bid']:checked"), function(){            
            favorite.push($(this).val());
            
            var totalPrice = 0 ;
            var price = 0 ;
            for (index = 0 ; index < favorite.length ; index++) { 
    			//alert("offerPrice"+favorite[index]);
    			price = document.getElementById("offerPrice"+favorite[index]).value;
    			//alert(price);
    			if (price != "" || price != null || price >0) {
    				totalPrice += parseFloat(price);
    				//alert(totalPrice);
    				document.getElementById("totalPrice").value = totalPrice ;
    			}else{
    				alert("Please enter valid price");
    			}
    			
    		}
            
            
        });
        if(favorite.length == 0){
        	document.getElementById("totalPrice").value = 0 ;
	    	return false;
        }
        
	}
	
	
	function Stringonly() {
		var key;
		var keychar;
		if (window.event)
			key = window.event.keyCode;
		else
			return true;
		keychar = String.fromCharCode(key);
		if ((key == null) || (key == 0) || (key == 8) || (key == 9)
				|| (key == 13) || (key == 27))
			return true;
		else if ((("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz' ")
				.indexOf(keychar) > -1))
			return true;
		else
			alert("Please Enter Characters only!");
		return false;
	}
	function numbersonly() {
		var key;
		var keychar;
		if (window.event)
			key = window.event.keyCode;
		else
			return true;
		keychar = String.fromCharCode(key);
		if ((key == null) || (key == 0) || (key == 8) || (key == 9)
				|| (key == 13) || (key == 27))
			return true;
		else if ((("0123456789").indexOf(keychar) > -1))
			return true;
		else
			alert("Please Enter Only Number!");
		return false;
	}
</script>

<aui:script>
	Liferay.provide(window, 'getExistRecord', function(favorite,empcode) {
		var A = AUI();
		A.one("#errorMessage").empty();
		var fetchPropertyURL = '<%= fetchPropertyURL.toString() %>';
		//alert(favorite);
		
		A.io.request(fetchPropertyURL,
				{
					data : {
						<portlet:namespace />flag : 'checkExistRecord',
						<portlet:namespace />empcode : empcode,
						<portlet:namespace />bids : favorite
					},
					on : {
						success : function() {
							var resp = this.get('responseData');
							//alert(resp);
							var i = 'You have already quoted an offer for this property.';
							if(i==resp){
								A.one("#errorMessage").empty().append(this.get('responseData'));
							}else{
								document.registrationForm.method = "POST";
								document.registrationForm.action = "${registerURL}";
								document.registrationForm.submit();
							}
							
						}
					}

				});
	});
	
	Liferay.provide(window, 'fetchProperty', function() {
		var A = AUI();
		var fetchPropertyURL = '<%= fetchPropertyURL.toString() %>';
		
		var city = A.one("#<portlet:namespace />city");
		//alert(city);
		A.io.request(fetchPropertyURL,
				{
					data : {
						<portlet:namespace />city : city.val()
					},
					on : {
						success : function() {
							var resp = this.get('responseData');
							A.one("#cityData").empty().append(
									this.get('responseData'));
						}
					}

				});
	});
</aui:script>


</html>