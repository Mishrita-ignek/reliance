
$(document).ready(function(){
	
	$("#cssmenu").hide();

    $(".mobi_menu_a").click(function(){
        $("#cssmenu").slideToggle();
    });
});

jQuery(document).ready(function(){jQuery("#cssmenu").navAccordion({expandButtonText:'<img style="margin-top:7px" src="/o/Reliance-Group-Theme/css/custom/images/nav_plus.png">',collapseButtonText:'<img style="margin-top:7px" src="/o/Reliance-Group-Theme/css/custom/images/nav_minus.png">'},function(){console.log("Callback")})}),jQuery(document).ready(function(){jQuery("#cssmenu2").navAccordion({expandButtonText:'<img src="/o/Reliance-Group-India-Theme/css/custom/images/plus.png">',collapseButtonText:'<img src="/o/Reliance-Group-India-Theme/css/custom/images/minus.png">'},function(){console.log("Callback")})});