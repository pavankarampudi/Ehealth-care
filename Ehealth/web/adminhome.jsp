<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>My site</title>
<link rel="stylesheet" type="text/css" href="demo.css" />
<link rel="stylesheet" href="menu.css" type="text/css" media="screen" />
<!--[if IE 6]>
<style>
body {behavior: url("csshover3.htc");}
#menu li .drop {background:url("img/drop.gif") no-repeat right 8px; 
</style>m 
<![endif]-->
	
	<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript" src="script.js"></script>
</head>
<% if(session.getAttribute("username").equals("admin@gmail.com")){
%>    


<body>
<div id="title">
  <div id="title1">E-Health Care</div>
  <div id="title2">Welcome to Admin..!</div>
</div>
    <div id="main1">
  <ul id="menu2">
    <li><a href="#">Home</a> </li>
   
   
     <li class="menu_right"><a href="#" class="drop">Disease</a>
      <div class="dropdown_1column">
        <div class="col_1">
          <ul class="simple">
            <li><a href="adddecease.jsp">Add</a></li>
            <li><a href="tomodify.jsp">Modify</a></li>
            <li><a href="deletelist.jsp">Delete</a></li>
            </ul>
        </div>
      </div>
    </li>
    <li class="menu_right"><a href="#" class="drop">Relation</a>
      <div class="dropdown_1column">
        <div class="col_1">
          <ul class="simple">
            <li><a href="relationadmin.jsp">Relation diagram</a></li>
            </ul>
        </div>
      </div>
    </li>
           
       
    <li class="menu_right"><a href="#" class="drop">Doctors</a>
      <div class="dropdown_1column">
        <div class="col_1">
          <ul class="simple">
            <li><a href="admindoctorlist.jsp">Doctors List</a></li>
             <li><a href="doctorsearchadmin.html">Search doc</a></li>
          </ul>
        </div>
      </div>
    </li>
     <li class="menu_right"><a href="#" class="drop">Disease List</a>
      <div class="dropdown_1column">
        <div class="col_1">
          <ul class="simple">
            <li><a href="searchdeceaseadmin.jsp">Disease Search</a></li>
            <li><a href="searchsymptomadmin.jsp">Symptom Search</a></li>
            <li><a href="googlesearchadmin.jsp">Google Search</a></li>
            </ul>
        </div>
      </div>
    </li>
    <li class="menu_right"><a href="#" class="drop">Shopping</a>
      <div class="dropdown_1column">
        <div class="col_1">
          <ul class="simple">
         <li><a href="viewadmin_jsp.jsp">View Products</a></li>
            <li><a href="Products_det.html">Product Details</a></li>
            <li><a href="Reports.html">Reports</a></li>
            <li><a href="viewsuggestions.jsp">Client Suggestions</a></li>
           </ul>
        </div>
      </div>
    </li>
       
   
    <li><a href="logout.jsp">Sign out</a> </li>
       
       
   
            <!-- End 2 columns container -->
    <!-- End Home Item -->


     </ul>
        <div id="gallery">
    <div id="slides">
      <div class="slide"><img src="img/sample_slides/1.jpg" width="920" height="400" alt="side" /></div>
      <div class="slide"><img src="img/sample_slides/2.jpg" width="920" height="400" alt="side" /></div>
      <div class="slide"><img src="img/sample_slides/3.jpg" width="920" height="400" alt="side" /></div>
      <div class="slide"><img src="img/sample_slides/4.jpg" width="920" height="400" alt="side" /></div>
    </div>
    <div id="menu1">
      <ul>
        <li class="fbar">&nbsp;</li>
        <li class="menuItem"><a href=""><img src="img/sample_slides/1.jpg" alt="thumbnail" /></a></li>
        <li class="menuItem"><a href=""><img src="img/sample_slides/2.png" alt="thumbnail" /></a></li>
        <li class="menuItem"><a href=""><img src="img/sample_slides/3.png" alt="thumbnail" /></a></li>
        <li class="menuItem"><a href=""><img src="img/sample_slides/4.png" alt="thumbnail" /></a></li>
      </ul>
    </div>
  </div>
  <div id="cont">
    <div id="cont3">
      <div id="con33">web cam interaction</div>
      <div id="con333">we provide web cam interaction with the doc for the registered users. <br /><br>
         we alsoprovide the google search facility for even advanced search facility and other services.</div>
    </div>
    <div id="cont2">
      <div id="con22">medicines purchase</div>
      <div id="con222">we offer services to buy medicines required for the user online. <br /><br>
        the medicine purchase can be of any mode like cash on delivery and through card mode. </div>
    </div>
  </div>
  <div id="cont1">
    <div id="con11">we care for you </div>
    <div id="con111">we offer services that could recognize diseases based on symptoms. <br />
      <br />
      we also can tell the symptoms based on the diseases and their treatment for the diseases also <br />
      <br />
    </div>
  </div>
</div>
<div id="fot">
  <div id="fotlinks1">
    <div id="fotlinks4">
      <!--<h2>LINKS</h2>
      <br />
      <a href="demo.html">Lorem ipsum dignis</a><br />
      <a href="demo.html">Lorem ipsum dignis</a><br />
      <a href="demo.html">Lorem ipsum dihnis</a><br />
      <a href="demo.html">Lorem ipsum
        dignis</a></div>
    <div id="fotlinks3">
      <div id="fotlinks5">
        <h2>LINKS</h2>
        <br />
        <a href="demo.html">Lorem ipsum dignis</a><br />
        <a href="demo.html">Lorem ipsum dignis</a><br />
        <a href="demo.html">Lorem ipsum dihnis</a><br />
        <a href="demo.html">Lorem ipsum
          dignis</a></div>
    </div>
    <div id="fotlinks2">
      <h2>LINKS</h2>
      <br />
      <a href="demo.html">Lorem ipsum dignis</a><br />
      <a href="demo.html">Lorem ipsum dignis</a><br />
      <a href="demo.html">Lorem ipsum dihnis</a><br />
      <a href="demo.html">Lorem ipsum dignis</a><br />-->
    </div>
  </div>
</div>
<div id="fotlinks6">
  <div align="center">Copyright 2014 ehealth<br />
<p>all rights reserved</p></div>


     </div>
     </body>
  <% }
else{
    RequestDispatcher rd=request.getRequestDispatcher("index.html");
                rd.forward(request, response);
                
       }
%>
</html>
