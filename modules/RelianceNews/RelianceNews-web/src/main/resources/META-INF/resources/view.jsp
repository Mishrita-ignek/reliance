<%@ include file="init.jsp" %>

<portlet:resourceURL var="fetchNewsListURL" id="fetchNewsList">
</portlet:resourceURL>
<style type="text/css">
.headtxt_inner {
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
<span class="active_breadcrumbs">Reliance in News</span></span></p>

<div class="smalltxt_inner">
<h2><strong>The latest news updates from the world of Reliance.</strong></h2>

</div>

<div class="portlet-inner">
	<div class="form-horizontal">
		 <div class="form-group">
				<div class="col-sm-2">
					<div class="form-group">
						<div class="select-style">
							<aui:select name="year" label="">
								<aui:option value="-1">Select Year</aui:option>
									<c:forEach var="year" items="${years}">
										<aui:option value="${year}">${year}</aui:option>
									</c:forEach>
							</aui:select>
						</div>
					</div>
				</div>
				<div class="col-sm-2">
					<div class="form-group">
						<div class="select-style">
								<aui:select name="month" label="">
									<aui:option value="-1">-All-</aui:option>
									<aui:option value="1">Jan</aui:option>
									<aui:option value="2">Feb</aui:option>
									<aui:option value="3">Mar</aui:option>
									<aui:option value="4">Apr</aui:option>
									<aui:option value="5">May</aui:option>
									<aui:option value="6">Jun</aui:option>
									<aui:option value="7">Jul</aui:option>
									<aui:option value="8">Aug</aui:option>
									<aui:option value="9">Sep</aui:option>
									<aui:option value="10">Oct</aui:option>
									<aui:option value="11">Nov</aui:option>
									<aui:option value="12">Dec</aui:option>
								</aui:select>
							</div>
					</div>
				</div>
				<div class="col-sm-1">
					<button class="btn btn-info btn-blue btn-sm" id="subBtn" name="goBtn" onclick="ajaxCall()"><span class="lfr-btn-label">Go</span></button> 
				</div>
			<i class="clearfix"></i>
		</div>
	</div>
	<div id="news"></div>
</div>
<script type="text/javascript">
function ajaxCall(){
    AUI().use('aui-io-request', function(A){
    	var selectedYear = A.one("#<portlet:namespace/>year").val();
    	var selectedMonth = A.one("#<portlet:namespace/>month").val();
    	
    	var fetchNewsListURL = '<%= fetchNewsListURL.toString() %>';
    	fetchNewsListURL=fetchNewsListURL.replace("http","https");
        A.io.request(
        		
        	fetchNewsListURL, {
               method: 'post',
               data: {
            	   <portlet:namespace />year:selectedYear,
		            <portlet:namespace />month:selectedMonth,
               },
               on: {
                       success: function() {
                        A.one("#news").empty().append(this.get('responseData'));
                    }
              }
        });
    });
}
</script>
