package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class doctorhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>My site</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"demo.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"menu.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<!--[if IE 6]>\n");
      out.write("<style>\n");
      out.write("body {behavior: url(\"csshover3.htc\");}\n");
      out.write("#menu li .drop {background:url(\"img/drop.gif\") no-repeat right 8px; \n");
      out.write("</style>m \n");
      out.write("<![endif]-->\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"script.js\"></script>\n");
      out.write("</head>\n");
 if(session.getAttribute("username").equals(request.getParameter("usr"))){

      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"title\">\n");
      out.write("  <div id=\"title1\">E-Health Care</div>\n");
      out.write("  <div id=\"title2\">Welcome to Doctor..!</div>\n");
      out.write("</div>\n");
      out.write("    <div id=\"main1\">\n");
      out.write("  <ul id=\"menu2\">\n");
      out.write("    <li><a href=\"#\">Home</a> </li>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("     <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Disease</a>\n");
      out.write("      <div class=\"dropdown_1column align_right\">\n");
      out.write("        <div class=\"col_1\">\n");
      out.write("          <ul class=\"simple\">\n");
      out.write("            <li><a href=\"adddecease.jsp\">Add</a></li>\n");
      out.write("                        </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Relation</a>\n");
      out.write("      <div class=\"dropdown_1column align_right\">\n");
      out.write("        <div class=\"col_1\">\n");
      out.write("          <ul class=\"simple\">\n");
      out.write("            <li><a href=\"#\">Relation diagram</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("      \n");
      out.write("       \n");
      out.write("    <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Users Request</a>\n");
      out.write("      <div class=\"dropdown_1column align_right\">\n");
      out.write("        <div class=\"col_1\">\n");
      out.write("          <ul class=\"simple\">\n");
      out.write("            <li><a href=\"admindoctorlist.jsp\">Doctors List</a></li>\n");
      out.write("             <li><a href=\"doctorsearch.jsp\">Search doc</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("     <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Disease List</a>\n");
      out.write("      <div class=\"dropdown_1column align_right\">\n");
      out.write("        <div class=\"col_1\">\n");
      out.write("          <ul class=\"simple\">\n");
      out.write("            <li><a href=\"searchdecease.jsp\">Disease Search</a></li>\n");
      out.write("            <li><a href=\"symptomsearch.jsp\">Symptom Search</a></li>\n");
      out.write("            <li><a href=\"googlesearch.jsp\">Google Search</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Shopping</a>\n");
      out.write("      <div class=\"dropdown_1column align_right\">\n");
      out.write("        <div class=\"col_1\">\n");
      out.write("          <ul class=\"simple\">\n");
      out.write("           <!-- <li><a href=\"#\">FreelanceSwitch</a></li>\n");
      out.write("            <li><a href=\"#\">Creattica</a></li>\n");
      out.write("            <li><a href=\"#\">WorkAwesome</a></li>\n");
      out.write("            <li><a href=\"#\">Mac Apps</a></li>\n");
      out.write("            <li><a href=\"#\">Web Apps</a></li>\n");
      out.write("            <li><a href=\"#\">NetTuts</a></li>\n");
      out.write("            <li><a href=\"#\">VectorTuts</a></li>\n");
      out.write("            <li><a href=\"#\">PsdTuts</a></li>\n");
      out.write("            <li><a href=\"#\">PhotoTuts</a></li>\n");
      out.write("            <li><a href=\"#\">ActiveTuts</a></li>\n");
      out.write("            <li><a href=\"#\">Design</a></li>\n");
      out.write("            <li><a href=\"#\">Logo</a></li>\n");
      out.write("            <li><a href=\"#\">Flash</a></li>\n");
      out.write("            <li><a href=\"#\">Illustration</a></li>\n");
      out.write("            <li><a href=\"#\">More...</a></li>-->\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("       \n");
      out.write("    <li><a href=\"#\">AboutUs</a> </li>\n");
      out.write("    <li><a href=\"logout.jsp\">Sign out</a> </li>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("   \n");
      out.write("            <!-- End 2 columns container -->\n");
      out.write("    <!-- End Home Item -->\n");
      out.write("\n");
      out.write("\n");
      out.write("     </ul>\n");
      out.write("        <div id=\"gallery\">\n");
      out.write("    <div id=\"slides\">\n");
      out.write("      <div class=\"slide\"><img src=\"img/sample_slides/1.jpg\" width=\"920\" height=\"400\" alt=\"side\" /></div>\n");
      out.write("      <div class=\"slide\"><img src=\"img/sample_slides/iphone.jpg\" width=\"920\" height=\"400\" alt=\"side\" /></div>\n");
      out.write("      <div class=\"slide\"><img src=\"img/sample_slides/imac.jpg\" width=\"920\" height=\"400\" alt=\"side\" /></div>\n");
      out.write("      <div class=\"slide\"><img src=\"img/sample_slides/info.jpg\" width=\"920\" height=\"400\" alt=\"side\" /></div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"menu1\">\n");
      out.write("      <ul>\n");
      out.write("        <li class=\"fbar\">&nbsp;</li>\n");
      out.write("        <li class=\"menuItem\"><a href=\"\"><img src=\"img/sample_slides/1.jpg\" alt=\"thumbnail\" /></a></li>\n");
      out.write("        <li class=\"menuItem\"><a href=\"\"><img src=\"img/sample_slides/thumb_iphone.png\" alt=\"thumbnail\" /></a></li>\n");
      out.write("        <li class=\"menuItem\"><a href=\"\"><img src=\"img/sample_slides/thumb_imac.png\" alt=\"thumbnail\" /></a></li>\n");
      out.write("        <li class=\"menuItem\"><a href=\"\"><img src=\"img/sample_slides/thumb_about.png\" alt=\"thumbnail\" /></a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"cont\">\n");
      out.write("    <div id=\"cont3\">\n");
      out.write("      <div id=\"con33\">web cam interaction</div>\n");
      out.write("      <div id=\"con333\">we provide web cam interaction with the doc for the registered users. <br /><br>\n");
      out.write("         we alsoprovide the google search facility for even advanced search facility and other services.</div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"cont2\">\n");
      out.write("      <div id=\"con22\">medicines purchase</div>\n");
      out.write("      <div id=\"con222\">we offer services to buy medicines required for the user online. <br /><br>\n");
      out.write("        the medicine purchase can be of any mode like cash on delivery and through card mode. </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"cont1\">\n");
      out.write("    <div id=\"con11\">we care for you </div>\n");
      out.write("    <div id=\"con111\">we offer services that could recognize diseases based on symptoms. <br />\n");
      out.write("      <br />\n");
      out.write("      we also can tell the symptoms based on the diseases and their treatment for the diseases also <br />\n");
      out.write("      <br />\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"fot\">\n");
      out.write("  <div id=\"fotlinks1\">\n");
      out.write("    <div id=\"fotlinks4\">\n");
      out.write("      <!--<h2>LINKS</h2>\n");
      out.write("      <br />\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum dignis</a><br />\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum dignis</a><br />\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum dihnis</a><br />\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum\n");
      out.write("        dignis</a></div>\n");
      out.write("    <div id=\"fotlinks3\">\n");
      out.write("      <div id=\"fotlinks5\">\n");
      out.write("        <h2>LINKS</h2>\n");
      out.write("        <br />\n");
      out.write("        <a href=\"demo.html\">Lorem ipsum dignis</a><br />\n");
      out.write("        <a href=\"demo.html\">Lorem ipsum dignis</a><br />\n");
      out.write("        <a href=\"demo.html\">Lorem ipsum dihnis</a><br />\n");
      out.write("        <a href=\"demo.html\">Lorem ipsum\n");
      out.write("          dignis</a></div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"fotlinks2\">\n");
      out.write("      <h2>LINKS</h2>\n");
      out.write("      <br />\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum dignis</a><br />\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum dignis</a><br />\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum dihnis</a><br />\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum dignis</a><br />-->\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"fotlinks6\">\n");
      out.write("  <div align=\"center\">Copyright 2014 ehealth<br />\n");
      out.write("<p>all rights reserved</p></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("     </div>\n");
      out.write("     </body>\n");
      out.write("  ");
 }
else{
    RequestDispatcher rd=request.getRequestDispatcher("index.html");
                rd.forward(request, response);
                
       }

      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
