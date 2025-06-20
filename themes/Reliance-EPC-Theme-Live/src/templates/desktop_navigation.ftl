<div class="desktop_navigation" id="header">
<header class="ig-menu-container ig-custom-container" id="wrapper ig-wrapper">
   <nav id="navbar">
      <div class="ig-desktop_navigation" id="header">
         <div class="ig-header">
            <!-- Left Logo -->
            <div class="ig-logo-hamburger-wrapper">
               <div class="ig-fleft ig-col1">
                  <div class="ig-Rlogo">
                     <a href="/web/reliance-epc/index"><img src="${site_logo}" /></a>
                  </div>
               </div>
               <div class="ig-hamburger" id="ig-hamburger">
                  <!-- Hamburger Icon -->
                    <svg class="icon icon-hamburger" xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="black" viewBox="0 0 24 24">
                      <rect y="4" width="24" height="2"></rect>
                      <rect y="11" width="24" height="2"></rect>
                      <rect y="18" width="24" height="2"></rect>
                    </svg>

                    <!-- Cross Icon -->
                    <svg class="icon icon-close" xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="black" viewBox="0 0 24 24">
                      <line x1="4" y1="4" x2="20" y2="20" stroke="black" stroke-width="2"/>
                      <line x1="20" y1="4" x2="4" y2="20" stroke="black" stroke-width="2"/>
                    </svg>
               </div>
            </div>
            <!-- Navigation + Select Box -->
            <div class="ig-nav-item-wrapper">
               <!-- Navigation Menu -->
               <div class="ig-col2a">
                  <nav class="ig-nav_colmn2">
                     <div class="ig-nav_subcolmn1">
                        <ul id="nav">
                           <li class="ig-top">
                              <button class='toggle-submenu'>+</button>
                              <a href="#" class="ig-top_link" id="t02">About Us</a>
                              <ul class="ig-sub">
                                 <li><a href="/web/reliance-epc/company-profile">Reliance Group Profile</a></li>
                                 <li><a href="/web/reliance-epc/reliance-epc">Reliance E&amp;C</a></li>
                                 <li><a href="/web/reliance-epc/our-vision-mission">Our Vision &amp; Mission</a></li>
                                 <li><a href="/web/reliance-epc/award-accolades">Award &amp; Accolades</a></li>
                              </ul>
                           </li>
                           <li class="ig-top">
                              <a href="project-showcase" class="ig-top_link" id="t03">Project Showcase</a>
                           </li>
                           <li class="ig-top">
                              <a href="focus-area" class="ig-top_link" id="t04">Focus Area</a>
                           </li>
                           <li class="ig-top">
                              <a href="ongoing-projects" class="ig-top_link" id="t05">Ongoing Projects</a>
                           </li>
                           <li class="ig-top">
                              <a href="contact-us" class="ig-top_link" id="t10">Contact Us</a>
                           </li>
                        </ul>
                     </div>
                  </nav>
               </div>
               <!-- Group Websites Dropdown -->
               <div class="nav-gw">
               <div class="ig-nav_subcolmn1">
                  <ul id="nav">
                     <li class="ig-top" id="group-websites-dropdown">
                        <button class='toggle-submenu'>+</button>
                        <a href="#" class="ig-top_link" id="t06">Group Websites <svg fill="#034EA2" width="20" height="20" viewBox="0 -0.15 13.1 13.1" xmlns="http://www.w3.org/2000/svg"><path d="m1.6 4.775.85-.85L6.55 8l4.1-4.075.85.85-4.95 4.9z"/></svg></a>
                        <ul class="ig-sub">
                           <li> <a href="http://www.reliancegroupindia.com">Reliance Group </a></li>
                           <li> <a href="http://www.rinfra.com">Reliance Infrastructure</a></li>
                           <li> <a href="http://www.reliancepower.co.in">Reliance Power</a></li>
                           <li> <a href="http://www.relianceroads.com">Reliance Roads</a></li>
                           <li> <a href="http://www.relianceepc.com">Reliance EPC</a></li>
                           <li> <a href="http://www.reliancemumbaimetro.com">Reliance Mumbai Metro</a></li>
                           <li> <a href="http://www.bsesdelhi.com">BSES Delhi</a></li>
                           <li> <a href="http://www.relianceentertainment.com/">Reliance Entertainment</a></li>
                           <li> <a href="http://www.kokilabenhospital.com">Kokilaben Hospital</a></li>
                           <li> <a href="http://www.daiict.ac.in">DAIICT</a></li>
                        </ul>
                     </li>
                  </ul>
               </div>
               </div>
            </div>
         </div>
      </div>
   </nav>
</header>
</div>

<script>
  document.addEventListener("DOMContentLoaded", function () {
    document.addEventListener("click", function (e) {
      // ✅ Hamburger toggle
      const hamburger = document.getElementById("ig-hamburger");
      const navWrapper = document.querySelector(".ig-nav-item-wrapper");

      if (e.target.closest("#ig-hamburger")) {
        if (navWrapper) navWrapper.classList.toggle("active");
        if (hamburger) hamburger.classList.toggle("open");
      }

      // ✅ Submenu toggle
      if (e.target.classList.contains("toggle-submenu")) {
        const parentLi = e.target.closest("li");

        if (parentLi) {
          parentLi.classList.toggle("open");
          e.target.textContent = parentLi.classList.contains("open") ? "−" : "+";

          // ✅ Extra logic ONLY for "Group Websites" dropdown on mobile
          if (
            parentLi.id === "group-websites-dropdown" &&
            window.innerWidth <= 768
          ) {
            const dropdown = parentLi.querySelector(".ig-sub");

            if (dropdown) {
              // Remove previous direction classes
              dropdown.classList.remove("drop-up", "drop-down");

              // Wait for dropdown to be visible
              setTimeout(() => {
                const rect = dropdown.getBoundingClientRect();
                const spaceBelow = window.innerHeight - rect.bottom;
                const spaceAbove = rect.top;
                const dropdownHeight = dropdown.offsetHeight || 200;

                if (spaceBelow < dropdownHeight && spaceAbove > dropdownHeight) {
                  dropdown.classList.add("drop-up");
                } else {
                  dropdown.classList.add("drop-down");
                }
              }, 50); // Delay slightly to allow DOM update
            }
          }
        }
      }

      // ✅ Nested submenu toggle
      if (e.target.classList.contains("toggle-nested-menu")) {
        const childLi = e.target.closest("li");
        if (childLi) {
          childLi.classList.toggle("open");
          e.target.textContent = childLi.classList.contains("open") ? "−" : "+";
        }
      }
    });
  });
</script>


