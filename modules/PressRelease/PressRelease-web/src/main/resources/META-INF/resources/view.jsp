<%@ include file="init.jsp" %>

<portlet:resourceURL var="fetchPressReleaseURL">
</portlet:resourceURL>
<style>
.form-horizontal .form-group {
     margin-left: 0px !important; 
     margin-right: 0px !important; 
}

.form-group.input-select-wrapper {
	width:108px
}

.form-control {
	display: block;
	width: 100%;
	height: 43px;
	padding: 6px 12px;
	font-size: 14px;
	line-height: 1.42857143;
	color: #555;
	background-color: #fff;
	background-image: none;
	border: 1px solid black;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	-webkit-transition: border-color ease-in-out .15s, -webkit-box-shadow
		ease-in-out .15s;
	-o-transition: border-color ease-in-out .15s, box-shadow ease-in-out
		.15s;
	transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
}

.form-horizontal .custome-control-label {
	text-align: left;
	margin-bottom: 0;
	padding-top: 7px;
	color: #635e5e;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 13px;
	padding-left: 11px;
    margin-left: 22px;
}

.form-horizontal .head-label {
	text-align: left;
	margin-bottom: 0;
	padding-top: 7px;
	color: #635e5e;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 15px;
	margin-left: 17px;
}

.control-label {
	display: none;
}

.form-group.form-inline.input-checkbox-wrapper {
	margin-top: -24px;
	margin-right: 3px !important;
}
</style>
<%
List<String> newsYearList=(List<String>) request.getAttribute("NewsYearList");
%>
<style type="text/css">.headtxt_inner {
    font-family: Arial, Helvetica, sans-serif;
    font-size: 18px;
    font-weight: normal;
    color: #063a83;
    float: left;
    width: 100%;
    border-bottom: 1px solid #b9cadf;
    padding-bottom: 11px;
    margin-bottom: 15px;
}

.smalltxt_inner {
    font-family: Arial, Helvetica, sans-serif;
    float: left;
    width: 100%;
    color: #565656;
    margin: 0px 0 0 0;
}

p {
    margin: 10px 0 12px 0;
    padding: 0px;
    font-family: Arial, Helvetica, sans-serif;
    font-size: 14px;
    color: #3b3b3b;
}

#breadcrumbs a  {
    color: #333333;
}


#breadcrumbs{
    font-family: Arial, Helvetica, sans-serif;
    font-size: 14px;
    font-weight: normal;
    color: #333;
    float: left;
    width: 100%;
    border-bottom: 1px solid #034ea2;
    padding-bottom: 11px;
    margin-bottom: 15px;
}

.active_breadcrumbs , .active_menu1 {
  color: #034ea2 !important;
}



	
</style>







<p><span id="breadcrumbs"><a href="index">Home</a> - News &amp; Media - 
<span class="active_breadcrumbs">Press Release</span></span></p>
<div class="smalltxt_inner">
<h2><strong>Press Release</strong></h2>

<p class="inner_para">You can keep pace with all the updates and news FROM OUR WORLD by signing up for our archive and accessing various press releases online</p>
</div>
<div class="portlet-inner">
	<aui:form method="POST" name="pressReleaseForm">
		<div class="form-horizontal">
			<div class="form-group">
				
				<div class="col-sm-4">
					<div class="select-style"> 
						<aui:select id="newsYear" name="newsYear" label="" onChange="fetchPresssReleaseList();">
							<%-- <aui:option value="">--Select Year--</aui:option> --%>
							<aui:option value="<%=newsYearList.get(0) %>">Year- <%= newsYearList.get(0) %></aui:option>
							<%
							if(Validator.isNotNull(newsYearList)){
							for (String newsYear : newsYearList.subList(1, newsYearList.size()) ){ 
								%>
								<aui:option value="<%=newsYear %>">Year- <%=newsYear %></aui:option>
								<%}
							}%>
						</aui:select>
					</div>
				</div> 
			</div>
		</div>
	</aui:form>
	<div id="pressReleaseTable">
	</div>
</div>
<aui:script>
Liferay.provide(
		window,
		'fetchPresssReleaseList',
		function(){
			var A = AUI();
			var fetchPressReleaseURL = '<%= fetchPressReleaseURL.toString() %>';
			fetchPressReleaseURL=fetchPressReleaseURL.replace("http","https");
			 // selecting the sourceSelect drop-down to get the current value
            var newsYearSelect = A.one("#<portlet:namespace />newsYear");
           // alert("Fetch word for alphabet = " + newsYearSelect.val());
            
            A.io.request (
            		// the resource URL to fetch words
                    fetchPressReleaseURL, {
            			data: {
            				// request parameters to be sent to the Server
                            <portlet:namespace />selectedNewsYear : newsYearSelect.val()
    		},
    		on: {
                success: function() {
                var resp = this.get('responseData');
                A.one("#pressReleaseTable").empty().append(this.get('responseData'));
             }
       }
    
	});
});

var A = AUI();
A.use(
		  'aui-io-request',
		  function (Y) {
			var A = AUI();
			var fetchPressReleaseURL = '<%= fetchPressReleaseURL.toString() %>';
			
			fetchPressReleaseURL=fetchPressReleaseURL.replace("http","https");
			var currentYear='<%= newsYearList.get(0) %>';
			//alert("currentYear"+currentYear);
			 A.io.request (
	            		// the resource URL to fetch words
	                    fetchPressReleaseURL, {
	            			data: {
	            				// request parameters to be sent to the Server
	                            <portlet:namespace />selectedNewsYear : currentYear
	    		},
	    		on: {
	                success: function() {
	                var resp = this.get('responseData');
	                A.one("#pressReleaseTable").empty().append(this.get('responseData'));
	             }
	       }
	    
		});
		  }
		); 
</aui:script>
