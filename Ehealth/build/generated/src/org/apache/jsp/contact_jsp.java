package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/./userlevelmenu.html");
    _jspx_dependants.add("/./footer.html");
  }

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

      out.write('\n');
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Ehealth care advisor</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"demo.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"menu.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<style>\r\n");
      out.write("body {behavior: url(\"csshover3.htc\");}\r\n");
      out.write("#menu li .drop {background:url(\"img/drop.gif\") no-repeat right 8px; \r\n");
      out.write("</style>m \r\n");
      out.write("<![endif]-->\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\t\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"title\">\r\n");
      out.write("  <div id=\"title1\">Ehealth care advisor</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"main1\">\r\n");
      out.write("  <ul id=\"menu2\">\r\n");
      out.write("    <li><a href=\"index.html\">Home</a> </li>\r\n");
      out.write("   \r\n");
      out.write("    <li><a href=\"#\" >About Us</a> </li>\r\n");
      out.write("    <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Relation</a>\r\n");
      out.write("      <div class=\"dropdown_1column align_right\">\r\n");
      out.write("        <div class=\"col_1\">\r\n");
      out.write("          <ul class=\"simple\">\r\n");
      out.write("            <li><a href=\"relation.jsp\">Relation diagram</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("           \r\n");
      out.write("       \r\n");
      out.write("    <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Doctors</a>\r\n");
      out.write("      <div class=\"dropdown_1column\">\r\n");
      out.write("        <div class=\"col_1\">\r\n");
      out.write("          <ul class=\"simple\">\r\n");
      out.write("            <li><a href=\"doctorsearch.html\">Doctors List</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("     <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Diseases</a>\r\n");
      out.write("      <div class=\"dropdown_1column\">\r\n");
      out.write("        <div class=\"col_1\">\r\n");
      out.write("          <ul class=\"simple\">\r\n");
      out.write("            <li><a href=\"searchdecease.jsp\">Disease Search</a></li>\r\n");
      out.write("           <li><a href=\"searchsymptom.jsp\">Symptom Search</a></li>\r\n");
      out.write("            <li><a href=\"googlesearch.jsp\">Google Search</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Shopping</a>\r\n");
      out.write("      <div class=\"dropdown_1column\">\r\n");
      out.write("        <div class=\"col_1\">\r\n");
      out.write("          <ul class=\"simple\">\r\n");
      out.write("            <li><a href=\"view_jsp.jsp\">View Products</a></li>\r\n");
      out.write("            <li><a href=\"suggestions.html\">Feedback</a></li>\r\n");
      out.write("      \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("       <li><a href=\"contact.jsp\">Contact Us</a> </li>\r\n");
      out.write("       <li><a href=\"#\" class=\"drop\">Sign in</a>\r\n");
      out.write("      <!-- Begin Home Item -->\r\n");
      out.write("      <div class=\"dropdown_2columns\">\r\n");
      out.write("        <!-- Begin 2 columns container -->\r\n");
      out.write("        <div class=\"col_2\">\r\n");
      out.write("          <h2>Existing Users</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col_2\">\r\n");
      out.write("\t<form name=\"login\" action=\"login.jsp\" method=\"get\" >\r\n");
      out.write("    <ul>  \r\n");
      out.write("        <li><label for=\"usermail\">&nbsp;Email</label>  \r\n");
      out.write("       <input  type=\"email\" name=\"usermail\" placeholder=\"yourname@email.com\" required></li>  <br/>\r\n");
      out.write("        <li><label for=\"password\">&nbsp;Password</label>  \r\n");
      out.write("        <input type=\"password\" name=\"password\" placeholder=\"password\" required></li>  <br/>\r\n");
      out.write("        <li>  \r\n");
      out.write("        &nbsp;<input type=\"submit\" value=\"Log in\"></li>  \r\n");
      out.write("    </ul>  \r\n");
      out.write("    </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col_2\">\r\n");
      out.write("          <h2>New Users</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col_2\">\r\n");
      out.write("       <center><a href=\"signup.html\">Click here for SignUp</a></center><br/>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- End 2 columns container -->\r\n");
      out.write("    </li>\r\n");
      out.write("    <!-- End Home Item -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     </ul>\r\n");
      out.write("     </div>\r\n");
      out.write("     </body>\r\n");
      out.write("  \r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <center> <iframe width=\"425\" height=\"350\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" src=\"https://maps.google.com/maps?t=m&amp;q=PVP+Siddhartha+Engineering+College+Rd,+Kanuru&amp;ie=UTF8&amp;hq=&amp;hnear=PVP+Siddhartha+Engineering+College+Rd,+Kanuru,+Vijayawada,+Krishna,+Andhra+Pradesh+520007,+India&amp;z=14&amp;ll=16.489547,80.693668&amp;output=embed\"></iframe><br /><small><a href=\"https://maps.google.com/maps?t=m&amp;q=PVP+Siddhartha+Engineering+College+Rd,+Kanuru&amp;ie=UTF8&amp;hq=&amp;hnear=PVP+Siddhartha+Engineering+College+Rd,+Kanuru,+Vijayawada,+Krishna,+Andhra+Pradesh+520007,+India&amp;z=14&amp;ll=16.489547,80.693668&amp;source=embed\" style=\"color:#0000FF;text-align:left\">View Larger Map</a></small>\n");
      out.write("        </center> </body>\n");
      out.write("</html>\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>My site</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"demo.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"menu.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<style>\r\n");
      out.write("body {behavior: url(\"csshover3.htc\");}\r\n");
      out.write("#menu li .drop {background:url(\"img/drop.gif\") no-repeat right 8px; \r\n");
      out.write("</style>m \r\n");
      out.write("<![endif]-->\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\t\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"fot\">\r\n");
      out.write("  <div id=\"fotlinks1\">\r\n");
      out.write("    <div id=\"fotlinks4\">\r\n");
      out.write("      <!--<h2>LINKS</h2>\r\n");
      out.write("      <br />\r\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum dignis</a><br />\r\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum dignis</a><br />\r\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum dihnis</a><br />\r\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum\r\n");
      out.write("        dignis</a></div>\r\n");
      out.write("    <div id=\"fotlinks3\">\r\n");
      out.write("      <div id=\"fotlinks5\">\r\n");
      out.write("        <h2>LINKS</h2>\r\n");
      out.write("        <br />\r\n");
      out.write("        <a href=\"demo.html\">Lorem ipsum dignis</a><br />\r\n");
      out.write("        <a href=\"demo.html\">Lorem ipsum dignis</a><br />\r\n");
      out.write("        <a href=\"demo.html\">Lorem ipsum dihnis</a><br />\r\n");
      out.write("        <a href=\"demo.html\">Lorem ipsum\r\n");
      out.write("          dignis</a></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"fotlinks2\">\r\n");
      out.write("      <h2>LINKS</h2>\r\n");
      out.write("      <br />\r\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum dignis</a><br />\r\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum dignis</a><br />\r\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum dihnis</a><br />\r\n");
      out.write("      <a href=\"demo.html\">Lorem ipsum dignis</a><br />-->\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"fotlinks6\">\r\n");
      out.write("  <div align=\"center\">Copyright 2014 ehealth<br />\r\n");
      out.write("      <p>all rights reserved</p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
