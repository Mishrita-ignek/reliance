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
<%
	PortletURL candidateLoginPage = renderResponse.createRenderURL();
	candidateLoginPage.setParameter("mvcPath", "/jsp/candidate_login.jsp");

	renderRequest.getAttribute("duplicateEmail");
%>
<portlet:actionURL name="register" var="registerURL" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RDEL ATM</title>
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
	<div class="container">
		<div id="loginbox" style="margin-top: 50px;" class="">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="panel-title">Sign Up</div>
					<div style="float: right; position: relative; top: -21px">
						<a href="<%=candidateLoginPage.toString()%>" class="alink">Sign
							In</a>
					</div>
				</div>

				<div style="padding-top: 30px" class="panel-body">

					<div style="display: none" id="login-alert"
						class="alert alert-danger col-sm-12"></div>

					<form id="signupform" class="form-horizontal" role="form"
						method="post" action="" name="registrationForm">

						<div id="signupalert" style="display: none"
							class="alert alert-danger">
							<p>Error:</p>
							<span></span>
						</div>
						<span class="lableF"> All fields marked * are mandatory </span> <br>
						<div class="form-group">
							<label for="email" class="col-md-3 control-label">First
								Name :<strong class="astrx">*</strong>
							</label>
							<div class="col-md-7">
								<input type="text" class="form-control"
									name="<portlet:namespace />firstname"
									placeholder="Enter First Name" id="firstname"
									onkeypress="return Stringonly();">
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="col-md-3 control-label">Last
								Name</label>
							<div class="col-md-7">
								<input type="text" class="form-control"
									name="<portlet:namespace />lastname"
									placeholder="Enter Last Name" id="lastname"
									onkeypress="return Stringonly();">
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="col-md-3 control-label">Aadhar
								Card No :
							</label>
							<div class="col-md-7">
								<input type="text" class="form-control numberOnly" id="AadharNo"
									name="<portlet:namespace/>AadharNo" maxlength="12"
									placeholder="Aadhar Card No"
									onkeypress="return numbersonly();">
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="col-md-3 control-label">Mobile
								:<strong class="astrx">*</strong>
							</label>
							<div class="col-md-7">
								<input type="text" class="form-control numberOnly"
									maxlength="10" id="mobNumberber"
									name="<portlet:namespace/>mobNumberber"
									placeholder="Mobile Number" required="required"
									onkeypress="return numbersonly();">
							</div>
						</div>

						<div class="form-group">
							<label for="firstname" class="col-md-3 control-label">Email
								:<strong class="astrx">*</strong>
							</label>
							<div class="col-md-7">
								<input type="email" class="form-control"
									name="<portlet:namespace />email" placeholder="Enter Email"
									id="email">
								<%
									String msg = request.getParameter("msg");
									if ("0".equals(msg) && msg != null) {
								%>
								<label class="control-label"><font color="red"
									style="font-size: 12px;"> Email already registered. </font></label>
								<%
									}
								%>
							</div>
						</div>

						<div class="form-group">
							<label for="lastname" class="col-md-3 control-label">Password
								:<strong class="astrx">*</strong>
							</label>
							<div class="col-md-7">
								<input type="password" class="form-control"
									name="<portlet:namespace />passwd" placeholder="Enter Password"
									id="passwd">
							</div>
						</div>
						<div class="form-group">
							<label for="password" class="col-md-3 control-label">Confirm
								Password :<strong class="astrx">*</strong>
							</label>
							<div class="col-md-7">
								<input type="password" class="form-control" name="cpasswd"
									placeholder="Enter Confirm Password" id="cpasswd">
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-3 control-label" for="mainQualification">Main
								Qualification :</label>
							<div class="col-sm-7">
								<Select class="form-control" id="mainQualification"
									name="<portlet:namespace/>mainQualification">
									<option value="">Select Qualification</option>
									<option value="Not Pursuing Graduation">Not Pursuing
										Graduation</option>
									<option value="B.A">B.A</option>
									<option value="B.Arch">B.Arch</option>
									<option value="B.Des.">B.Des.</option>
									<option value="B.El.Ed">B.El.Ed</option>
									<option value="B.P.Ed">B.P.Ed</option>
									<option value="B.U.M.S">B.U.M.S</option>
									<option value="BAMS">BAMS</option>
									<option value="BCA">BCA</option>
									<option value="B.B.A/ B.M.S">B.B.A/ B.M.S</option>
									<option value="B.Com">B.Com</option>
									<option value="B.Ed">B.Ed</option>
									<option value="BDS">BDS</option>
									<option value="BFA">BFA</option>
									<option value="BHM">BHM</option>
									<option value="B.Pharma">B.Pharma</option>
									<option value="B.Sc">B.Sc</option>
									<option value="B.Tech/B.E.">B.Tech/B.E.</option>
									<option value="BHMS">BHMS</option>
									<option value="BVSC">BVSC</option>
									<option value="Diploma Engineering">Diploma
										Engineering</option>
									<option value="Diploma">Diploma</option>
									<option value="ITI">ITI</option>
									<option value="LLB">LLB</option>
									<option value="MBBS">MBBS</option>
									<option value="M.Tech/M.E">M.Tech/M.E</option>
									<option value="Other">Other</option>
								</select>
							</div>
						</div>

						<div class="form-group" id="OtherQaul" style="display: none;">
							<label class="col-md-3 control-label" for="OtherQaul">Other
								:</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" id="other"
									name="<portlet:namespace/>OtherQaul"
									placeholder="Other Qualification">
							</div>
						</div>


						<div class="form-group">
							<label class="col-md-3 control-label" for="specialization">Specialization:</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" id="specialization"
									name="<portlet:namespace/>specialization"
									placeholder="Specialization">
							</div>
						</div>

						<!---------------------->
						
				<div class="form-group">
					<label class="control-label col-md-3" for="Address">Address:</label>
					<div class="col-sm-7">
						<textarea type="text" class="form-control" rows="3" id="Address"
							name="<portlet:namespace/>Address" placeholder="Address"
							value=""></textarea>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3" for="email">City:<strong
						class="astrx">*</strong></label>
					<div class="col-sm-7">
						<input type="text" class="form-control" id="city"
							name="<portlet:namespace/>city" placeholder="City"
							required="required" >
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3" for="InState">State:<strong
						class="astrx">*</strong></label>
					<div class="col-sm-7">
						<select class="form-control" id="InState" name="<portlet:namespace/>InState" required="required">
							<option value="">Select State</option>
							<option value="Andhra Pradesh">Andhra Pradesh</option>
							<option value="Arunachal Pradesh">Arunachal Pradesh</option>
							<option value="Assam">Assam</option>
							<option value="Bihar">Bihar</option>
							<option value="Chhattisgarh">Chhattisgarh</option>
							<option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
							<option value="Daman and Diu">Daman and Diu</option>
							<option value="Delhi">Delhi</option>
							<option value="Goa">Goa</option>
							<option value="Gujarat">Gujarat</option>
							<option value="Haryana">Haryana</option>
							<option value="Himachal Pradesh">Himachal Pradesh</option>
							<option value="Jammu and Kashmir">Jammu and Kashmir</option>
							<option value="Jharkhand">Jharkhand</option>
							<option value="Karnataka">Karnataka</option>
							<option value="Kerala">Kerala</option>
							<option value="Madhya Pradesh">Madhya Pradesh</option>
							<option value="Maharashtra">Maharashtra</option>
							<option value="Manipur">Manipur</option>
							<option value="Meghalaya">Meghalaya</option>
							<option value="Mizoram">Mizoram</option>
							<option value="Nagaland">Nagaland</option>
							<option value="Orissa">Orissa</option>
							<option value="Puducherry">Puducherry</option>
							<option value="Punjab">Punjab</option>
							<option value="Rajasthan">Rajasthan</option>
							<option value="Sikkim">Sikkim</option>
							<option value="Tamil Nadu">Tamil Nadu</option>
							<option value="Telangana">Telangana</option>
							<option value="Tripura">Tripura</option>
							<option value="Uttar Pradesh">Uttar Pradesh</option>
							<option value="Uttarakhand">Uttarakhand</option>
							<option value="West Bengal">West Bengal</option>
						</select>
					</div>
				</div>
			

				<div class="form-group">
					<label class="control-label col-md-3" for="pinNumber">PIN:<strong
						class="astrx">*</strong></label>
					<div class="col-sm-7">
						<input type="text" class="form-control numberOnly" maxlength="6"
							id="pinNumber" name="<portlet:namespace/>pinNumber"
							placeholder="Pin" required="required">
					</div>
				</div>
				
				<!-- -------------------------> 

						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<button id="btn-signup" type="button" class="btn btn-info"
									onclick="return validRegistrationForm();">
									<i class="icon-hand-right"></i> &nbsp Sign Up
								</button>
								<span style="margin-left: 8px;"></span> <span
									style="margin-left: 8px;"></span>
								<button id="btn-signup" type="button" class="btn btn-info"
									onclick="return resetRegistrationForm();">
									<i class="icon-hand-right"></i> &nbsp Reset
								</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
</body>
<script type="text/javascript">

function resetRegistrationForm(){		
	
   var r = confirm("Are you sure you want to reset.");
   if (r == true) {
     document.getElementById("firstname").value="";
	 document.getElementById("lastname").value="";
	  document.getElementById("AadharNo").value="";
	  document.getElementById("mobNumberber").value="";
	  document.getElementById("email").value="";
	  document.getElementById("passwd").value="";
	  document.getElementById("cpasswd").value="";	 
	  document.getElementById("mainQualification").value="";
	  document.getElementById("other").value="";
	  document.getElementById("specialization").value="";
   } else {
      
   }
   
}
		function validRegistrationForm(){			
		
			var fname = document.getElementById("firstname").value;
			if(fname == "" || fname == "null"){
				alert("Enter First Name.")
				document.getElementById("firstname").focus();
				return false;
			}
			
						
			/* n_pat = /^[0-9 ]{12}$/i;
			if(!n_pat.test(AadharNo))
			{
				alert("Invalid  Aadhar Number.");
				document.getElementById("AadharNo").focus();
				return false;
			} */
			
			var mobile = document.getElementById("mobNumberber").value;
			if(mobile == "" || mobile == "null"){
				alert("Enter Mobile Number.")
				document.getElementById("mobNumberber").focus();
				return false;
			}
			
			m_pat = /^[7-9][0-9]{9}$/;
			if(!m_pat.test(mobile))
			{
				alert("Invalid Mobile Number");
				document.getElementById("mobNumberber").focus();
				return false;
			}
			
			var email = document.getElementById("email").value;
			if(email == "" || email == "null"){
				alert("Enter Email.")
				document.getElementById("email").focus();
				return false;
			}
			
			e_pat = /^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
	        if(!e_pat.test(email))
	        {
	            alert("Invalid Email Id.");
	            document.getElementById("email").value="";
	            document.getElementById("email").focus();
	            return false;
	        } 
			
			var passwd = document.getElementById("passwd").value;
			if(passwd == "" || passwd == "null"){
				alert("Enter Password.")
				document.getElementById("passwd").focus();
				return false;
			}
			
			var cpasswd = document.getElementById("cpasswd").value;
			if(cpasswd == "" || cpasswd == "null"){
				alert("Enter Confirm Password.")
				document.getElementById("cpasswd").focus();				
				return false;
			}
			
			if(passwd != cpasswd){
				alert("Invalid Confirm Password.")
				document.getElementById("cpasswd").focus();
				document.getElementById("cpasswd").value="";
				return false;
			}
			
			document.registrationForm.method="POST";
			document.registrationForm.action="${registerURL}";
			document.registrationForm.submit();
		}
		
			
		function Stringonly()
		{	
			var key;
			var keychar;
			if (window.event)
			key = window.event.keyCode;
			else
			return true;
			keychar = String.fromCharCode(key);
			if ((key==null) || (key==0) || (key==8) || (key==9) || (key==13) || (key==27) )
			return true;
			else if ((("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz' ").indexOf(keychar) > -1))
			return true;
			else
				alert("Please Enter Characters only!");
			return false;
		}
		function numbersonly()
		{	
			var key;
			var keychar;
			if (window.event)
			key = window.event.keyCode;
			else
			return true;
			keychar = String.fromCharCode(key);
			if ((key==null) || (key==0) || (key==8) || (key==9) || (key==13) || (key==27) )
			return true;
			else if ((("0123456789").indexOf(keychar) > -1))
			return true;
			else
			alert("Please Enter Only Number!");
			return false;
		}
		
	</script>
	<script type="text/javascript">
  $(document).ready(function(){
  
$('#mainQualification').on('change', function() {
	$("#OtherQaul").hide();
  if(this.value=="Other"){
      $("#OtherQaul").show();
  }else{
      $("#OtherQaul").hide();
  }
})
}); 
</script> 
<!-- <script type="text/javascript">
  $(document).ready(function(){
    /*defualt hidden fields strat*/
    $("#previousExp").hide();
    $("#phState").hide();
      $("#np").hide();
      $("#OtherQaul").hide();
    /*defualt hidden fields strat*/





 /* 
    $("#AadharNo").keyup(function(){
        var $this = $(this);
        if ((($this.val().length+1) % 5)==0){
            $this.val($this.val() + " ");
        }
    });        */ 


/*aadhar number formate validation only*/


 /* $(".numberOnly").keydown(function (e) {
        // Allow: backspace, delete, tab, escape, enter and .
        if ($.inArray(e.keyCode, [410, 8, 9, 27, 13, 110, 190]) !== -1 ||
             // Allow: Ctrl+A, Command+A
            (e.keyCode === 105 && (e.ctrlKey === true || e.metaKey === true)) || 
             // Allow: home, end, left, right, down, up
            (e.keyCode >= 35 && e.keyCode <= 40)) {
                 // let it happen, don't do anything
                 return;
        }
        // Ensure that it is a number and stop the keypress
        if ((e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 910 || e.keyCode > 105)) {
            e.preventDefault();
        }
    }); */



/*radio button Have you worked with Reliance earlier*/

$("#r_Yes").click(function () {
        $("#previousExp").show();
    });

        $("#r_No").click(function () {
        $("#previousExp").hide();
    });


$("#npAfter").click(function () {
        $("#np").show();
    });

        $("#npImm").click(function () {
        $("#np").hide();
    });




/*Physically Handicapped strt */


$("#ph_Yes").click(function () {
        $("#phState").show();
    });

        $("#ph_No").click(function () {
        $("#phState").hide();
    });


/*Physically Handicapped strt */



/* $("#submitBtn").click(function(){
    //alert("The paragraph was clicked.");
var panVal = $('#panNumber').val();
var regpan = /^([a-zA-Z]){5}([0-9]){4}([a-zA-Z]){1}?$/;
if(!(regpan.test(panVal))){
alert("Please enter valid PAN number.");
  return false;
}
});
 */

 /* $("#mobNumberber").on("blur", function(){
        var mobNumber = $(this).val();
        var filter = /^\d*(?:\.\d{1,2})?$/;

          if (filter.test(mobNumber)) {
            if(mobNumber.length==10){
                  return true;
                  
             } else {
                alert('Please put 10  digit mobile number');
                return false;
              }
            }
            else {
              alert('Not a valid number');
              return false;
           }
    
  }); */



 /* $("#AlMobNumberber").on("blur", function(){
        var mobNumber = $(this).val();
        var filter = /^\d*(?:\.\d{1,2})?$/;

          if (filter.test(mobNumber)) {
            if(mobNumber.length==10){
                  return true;
                  
             } else {
                alert('Please put 10  digit mobile number');
                return false;
              }
            }
            else {
              alert('Not a valid number');
              return false;
           }
    
  }); */

$('#mainQualification').on('change', function() {

  if(this.value=="Other"){
      $("#OtherQaul").show();
  }else{
      $("#OtherQaul").hide();
  }
})


$(document).ready(function(){
	$(".datepicker-13").datepicker({
		 dateFormat:"dd/mm/yy",
	        changeMonth: true,
	        changeYear: true,
	        yearRange: "-100:+0",
	        maxDate: new Date()
     });
});

}); 
  /*PAN card validation part*/
</script> -->
</html>