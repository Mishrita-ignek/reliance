/* Include Files */
$(document).ready(function(){
	$(function () {
		$("#our_business").load("include/our_business.html");
		$("#sustainability").load("include/sustainability.html");
		$("#investor_relations").load("include/investor_relations.html");
		$("#left_menu_liferinfra").load("include/left_menu_liferinfra.html");
		$("#left_menu_NewsMedia").load("include/left_menu_NewsMedia.html");
		$("#left_menu_contactus").load("include/left_menu_contactus.html");
		$("#left_menu_Padma_Vibhushan").load("include/left_menu_Padma_Vibhushan.html");
		$("#leftmenu3").load("include/left_menu_new.html");
		$("#leftmenu4").load("include/left_menu_privacy.html");
		$("#leftmenu5").load("include/left_menu_legal.html");
		$("#leftmenu6").load("include/left_menu_group_com.html");
	});
});

$(document).ready(function(){
	
	$("#cssmenu").hide();

    $(".mobi_menu_a").click(function(){
        $("#cssmenu").slideToggle();
    });
});


