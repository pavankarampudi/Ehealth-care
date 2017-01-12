package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import mladtr.dto.DBConn;

public final class Desgadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/./adminlevelmenu.html");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("\r\n");
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
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"title\">\r\n");
      out.write("  <div id=\"title1\">E-Health Care</div>\r\n");
      out.write("  <div id=\"title2\">Welcome to Admin..!</div>\r\n");
      out.write("</div>\r\n");
      out.write("    <div id=\"main1\">\r\n");
      out.write("  <ul id=\"menu2\">\r\n");
      out.write("<li><a href=\"#\">Home</a> </li>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("     <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Disease</a>\r\n");
      out.write("      <div class=\"dropdown_1column\">\r\n");
      out.write("        <div class=\"col_1\">\r\n");
      out.write("          <ul class=\"simple\">\r\n");
      out.write("            <li><a href=\"adddecease.jsp\">Add</a></li>\r\n");
      out.write("            <li><a href=\"tomodify.jsp\">Modify</a></li>\r\n");
      out.write("            <li><a href=\"deletelist.jsp\">Delete</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Relation</a>\r\n");
      out.write("      <div class=\"dropdown_1column\">\r\n");
      out.write("        <div class=\"col_1\">\r\n");
      out.write("          <ul class=\"simple\">\r\n");
      out.write("            <li><a href=\"relationadmin.jsp\">Relation diagram</a></li>\r\n");
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
      out.write("            <li><a href=\"admindoctorlist.jsp\">Doctors List</a></li>\r\n");
      out.write("             <li><a href=\"doctorsearchadmin.html\">Search doc</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("     <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Disease List</a>\r\n");
      out.write("      <div class=\"dropdown_1column\">\r\n");
      out.write("        <div class=\"col_1\">\r\n");
      out.write("          <ul class=\"simple\">\r\n");
      out.write("            <li><a href=\"searchdeceaseadmin.jsp\">Disease Search</a></li>\r\n");
      out.write("            <li><a href=\"searchsymptomadmin.jsp\">Symptom Search</a></li>\r\n");
      out.write("            <li><a href=\"googlesearchadmin.jsp\">Google Search</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"menu_right\"><a href=\"#\" class=\"drop\">Shopping</a>\r\n");
      out.write("      <div class=\"dropdown_1column\">\r\n");
      out.write("        <div class=\"col_1\">\r\n");
      out.write("          <ul class=\"simple\">\r\n");
      out.write("         <li><a href=\"viewadmin_jsp.jsp\">View Products</a></li>\r\n");
      out.write("            <li><a href=\"Products_det.html\">Product Details</a></li>\r\n");
      out.write("            <li><a href=\"Reports.html\">Reports</a></li>\r\n");
      out.write("            <li><a href=\"viewsuggestions.jsp\">Client Suggestions</a></li>\r\n");
      out.write("           </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("       \r\n");
      out.write("   \r\n");
      out.write("    <li><a href=\"logout.jsp\">Sign out</a> </li>\r\n");
      out.write("            \r\n");
      out.write("       \r\n");
      out.write("   \r\n");
      out.write("            <!-- End 2 columns container -->\r\n");
      out.write("    <!-- End Home Item -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     </ul>\r\n");
      out.write("     </div>\r\n");
      out.write("     </body>\r\n");
      out.write("  \r\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
  String desg=request.getParameter("name");
        //String desg="m";
        
        Connection con=null;
           PreparedStatement stat=null;
          System.out.println(desg);
          try {
           
                         //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = new DBConn().getConn();
           
          //  System.out.println(pincode);
            stat = con.prepareStatement("select * from doctor_signup where Designation='"+desg+"'");
            ResultSet rs = stat.executeQuery();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayData</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center><table border='1' style='width:75%; height:auto;'>");
            out.println("<thead><td width='25%'>Doctor Name</td> <td width='25%'>Address</td><td>Designation</td></thead>");
            while (rs.next()) {
                 out.println("<tr><td>"+rs.getString(2)+"</td>");
                  out.println("<td>"+rs.getString(8)+"</td>"); 
                   out.println("<td>"+rs.getString(13)+"</td>");
            }
            
            out.println("</table></form>");
            out.println("</body>");
            out.println("</html>");
        } 
         catch (SQLException ex) {
            out.println(ex.getMessage());
        }
          finally {
            try {
                con.close();
                out.close();
            } 
            catch (SQLException ex) {
                out.println(ex.getMessage());
            }
        }
      
      out.write(" \n");
      out.write("                        \n");
      out.write("        \n");
      out.write("                     \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
