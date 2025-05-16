<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>${the_title}</title>
	<meta content="initial-scale=1.0, width=device-width" name="viewport" />
	<!--<meta http-equiv="Content-Security-Policy" content="upgrade-insecure-requests">-->

	<@liferay_util["include"] page=top_head_include />
	<script>
		function popupCenter1(url, title, w, h) {
		var left = (screen.width/2)-(w/2);
		var top = (screen.height/2)-(h/2);
		return window.open(url, title, 'toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=no, resizable=no, copyhistory=no, width='+w+', height='+h+', top='+top+', left='+left);
}
</script>
<style>
#wrapper {
    padding-bottom: 0;
    padding-top: 20px;
    position: relative;
    width: 100%;
}

.menu-container {
    margin-right: auto;
    margin-left: auto;
    padding-left: 0px;
    padding-right: 0px;
}

h2.portlet-title-text.portlet-title-editable {
    display: none;
}
.portlet-title-text {
	display: none !important;
}
</style>

	</head>

	
<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />
<#if has_navigation && is_setup_complete>
			<#include "${full_templates_path}/desktop_navigation.ftl" />
		</#if>
<div  class="menu-container" id="wrapper">
	<header id="banner" role="banner">
		<div id="heading">
		
		</div>

		<!-- <#if !is_signed_in>
			<a data-redirect="${is_login_redirect_required?string}" href="${sign_in_url}" id="sign-in" rel="nofollow">${sign_in_text}</a>
		</#if> -->


		
	</header>
<div class='abc'>
</div>
	
	<div>
		<style>
			.portlet-title-text {
			display: none;
			}

</style>
 <@liferay_portlet["runtime"]
        defaultPreferences="${freeMarkerPortletPreferences}"
        portletProviderAction=portletProviderAction.VIEW
        instanceId=the_title
        portletName="com_liferay_journal_content_web_portlet_JournalContentPortlet" />
        ${freeMarkerPortletPreferences.reset()}

</div>
	
	<section id="container">
		<h1 class="hide-accessible">${the_title}</h1>

		

		<#if selectable>
			<@liferay_util["include"] page=content_include />
		<#else>
			${portletDisplay.recycle()}

			${portletDisplay.setTitle(the_title)}

			<@liferay_theme["wrap-portlet"] page="portlet.ftl">
				<@liferay_util["include"] page=content_include />
			</@>
		</#if>
	</section>


		  <div class="footer_wrap">
        

			<#include "${full_templates_path}/footer.ftl" />
		
		
      </div><!-- footer_wrap -->
	
<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />
	
	



<!-- inject:js -->

<script type="text/javascript" src="${javascript_folder}/custom/navAccordion.js"></script>
<script type="text/javascript" src="${javascript_folder}/custom/script.js"></script>
<script type="text/javascript" src="${javascript_folder}/custom/jquery.fancybox.js"></script>
<script type="text/javascript" src="${javascript_folder}/custom/responsiveslides.js"></script>
 <script>

  //Disable cut copy paste
    // $('body').bind('cut copy paste', function (e) {
    //     e.preventDefault();
    // });
   
    //Disable mouse right click
    // $("body").on("contextmenu",function(e){
    //     return false;
    // });
  //(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  //(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  //m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
//  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  //ga('create', 'UA-61583241-1', 'auto');
  //ga('send', 'pageview');
 
</script>
<!-- endinject -->

</body>

</html>