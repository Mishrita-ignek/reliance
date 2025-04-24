  

 jQuery(document).ready(function(){

      //Accordion Nav
      jQuery('#cssmenu').navAccordion({
        expandButtonText: '<img style="margin-top:7px" src="/o/Reliance-Infrastructure-Theme/css/custom/images/nav_plus.png">',  //Text inside of buttons can be HTML
        collapseButtonText: '<img style="margin-top:7px" src="/o/Reliance-Infrastructure-Theme/css/custom/images/nav_minus.png">'
      }, 
      function(){
        console.log('Callback')
      });
      
    }); 

 jQuery(document).ready(function(){

      //Accordion Nav
      jQuery('#cssmenu2').navAccordion({
        expandButtonText: '<img src="/o/Reliance-Infrastructure-Theme/css/custom/images/plus.png">',  //Text inside of buttons can be HTML
        collapseButtonText: '<img src="/o/Reliance-Infrastructure-Theme/css/custom/images/minus.png">'
      }, 
      function(){
        console.log('Callback')
      });
      
    }); 


