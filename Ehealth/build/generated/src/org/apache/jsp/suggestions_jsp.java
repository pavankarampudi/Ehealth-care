package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class suggestions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html>\n");
      out.write("    <form method=\"POST\" name=frm action=\"saveadvice_jsp.jsp\" onSubmit=\"return check()\">\n");
      out.write("\n");
      out.write("<TABLE width=\"100%\" bgcolor=\"#008000\">\n");
      out.write("<TR>\n");
      out.write("\t<TD></TD>\n");
      out.write("</TR>\n");
      out.write("</TABLE>\n");
      out.write("<Head><FONT  face=\"comic sans ms\" size=3 COLOR=#006600><center><hr color=#99CC00>Suggestions<hr color=#99CC00></CENTER></font></head>\n");
      out.write("\n");
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
