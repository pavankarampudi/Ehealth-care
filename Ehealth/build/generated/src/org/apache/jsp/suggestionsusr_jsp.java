package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class suggestionsusr_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/./usrlevelmenu.html");
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
      out.write("  <div id=\"title2\">Welcome to User..!</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"main1\">\r\n");
      out.write("  <ul id=\"menu2\">\r\n");
      out.write("    <li><a href=\"#\">Home</a> </li>\r\n");
      out.write("   \r\n");
      out.write("    <li><a href=\"aboutususr.jsp\" >About Us</a> </li>\r\n");
      out.write("    <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Relation</a>\r\n");
      out.write("      <div class=\"dropdown_1column align_right\">\r\n");
      out.write("        <div class=\"col_1\">\r\n");
      out.write("          <ul class=\"simple\">\r\n");
      out.write("            <li><a href=\"relationusr.jsp\">Relation diagram</a></li>\r\n");
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
      out.write("            <li><a href=\"doctorsearchusr.html\">Doctors List</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("     <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Diseases</a>\r\n");
      out.write("      <div class=\"dropdown_1column\">\r\n");
      out.write("        <div class=\"col_1\">\r\n");
      out.write("          <ul class=\"simple\">\r\n");
      out.write("            <li><a href=\"searchdeceaseusr.jsp\">Disease Search</a></li>\r\n");
      out.write("            <li><a href=\"searchsymptomusr.jsp\">Symptom Search</a></li>\r\n");
      out.write("            <li><a href=\"googlesearchusr.jsp\">Google Search</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Shopping</a>\r\n");
      out.write("      <div class=\"dropdown_1column\">\r\n");
      out.write("        <div class=\"col_1\">\r\n");
      out.write("          <ul class=\"simple\">\r\n");
      out.write("            <li><a href=\"viewusr_jsp.jsp\">View Products</a></li>\r\n");
      out.write("            <li><a href=\"clienttable.jsp\">Purchase Products</a></li>\r\n");
      out.write("            <li><a href=\"suggestionsusr.html\">Feedback</a></li>\r\n");
      out.write("            \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("       <li><a href=\"#\">Contact Us</a> </li>\r\n");
      out.write("        <li><a href=\"logout.jsp\">Sign out</a> </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     </ul>\r\n");
      out.write("     </div>\r\n");
      out.write("     </body>\r\n");
      out.write("  \r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html>\n");
      out.write("    <form method=\"POST\" name=frm action=\"saveadviceusr_jsp.jsp\" onSubmit=\"return check()\">\n");
      out.write("\n");
      out.write("<TABLE width=\"100%\" bgcolor=\"#008000\">\n");
      out.write("<TR>\n");
      out.write("\t<TD></TD>\n");
      out.write("</TR>\n");
      out.write("</TABLE>\n");
      out.write("        <center>\n");
      out.write("<FONT  face=\"comic sans ms\" size=3 COLOR=#006600><hr color=#99CC00>Suggestions<hr color=#99CC00></font>\n");
      out.write("   </center>\n");
      out.write("  <p><font color=\"#008000\" size=2 face=\"Comic Sans MS\">Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("  :</font><input type=\"text\" name=\"T1\" size=\"20\"></p>\n");
      out.write("  <p><font color=\"#008000\" face=\"Comic Sans MS\" size=2>Phone Number    &nbsp;:</font><input type=\"text\" name=\"T2\" size=\"20\"></p>\n");
      out.write("  <p><font color=\"#008000\" face=\"Comic Sans MS\" size=2>Email Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("  :<input type=\"text\" name=\"id\" size=\"20\"></font></p>\n");
      out.write("  <p><font color=\"#008000\" face=\"Comic Sans MS\" size=2>\n");
      out.write("  <p><font color=\"#008000\" face=\"Comic Sans MS\" size=2>Address&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("  :<input type=\"text\" name=\"T3\" size=\"20\"></font></p>\n");
      out.write("  <p><font color=\"#008000\" face=\"Comic Sans MS\" size=2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("  Type In Your Suggestions.......</font></p>\n");
      out.write("  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("  <textarea rows=\"4\" name=\"S1\" cols=\"40\"></textarea></p>\n");
      out.write("  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("  <input type=\"submit\" value=\"Submit\" name=\"B1\"></p>\n");
      out.write("</form>\n");
      out.write("</body>\n");
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
      out.write('\n');
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
