import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import com.sms.*;
 import mladtr.dto.DBConn;
/**
 * @author Vishal.Gilbile
 */
public class DisplayData extends HttpServlet {
 
    Connection con;
    PreparedStatement stat; 
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.   
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = new DBConn().getConn();
            stat = con.prepareStatement("select * from doctor_signup where flag='false'");
            ResultSet rs = stat.executeQuery();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayData</title>");
            out.println("</head>");
            out.println("<body><form name='f1' action='accept.jsp'>");
            out.println("<table border='1' style='width:100%; height:auto;'>");
            out.println("<thead><td>ID</td><td>Name</td>"
                   
   
                    + "<td>Email</td>"
                   
                    + "<td>Address</td>"
                    + "<td>mobile no</td>"
                    + "<td>Designation</td>"
 + "<td align='center'>Photo</td>"
                    + "<td align='center'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Certificate&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td><td>check<td>validation</td></thead>");
            while (rs.next()) {
                int id = rs.getInt(1);
                String mobile=rs.getString(11);
                out.println("<tr><td >" + id + "</td>");
                out.println("<td>"+rs.getString(2)+"</td>");
              
                out.println("<td>" + rs.getString(3) + "</td>");
                //out.println("<td>" + rs.getString(7) + "</td>");
                
                out.println("<td>"+rs.getString(8)+"</td>");
                
                out.println("<td>" + rs.getString(11) + "</td>");
                
                out.println("<td>" + rs.getString(13) + "</td>");
                  out.println("<td style='width:100px; height:125px;'><img src='"+"retriveImage?"+id+"'style='width:150px;height:125px;'/></td>");
               
                 out.println("<td style='width:100px; height:100px;'><img src='" + "retriveImage1?" + id + "' style='width:150px; height:125px;'/></td>");
               out.println("<td><input type='checkbox' name='id' value='"+id+"' </td>");
                 out.println("<td><input type='submit' name='act' value='Accept'><br><br><input type='submit' name='act' value='Ignore'></td>");
                 
            }
            out.println("</table></form>");
            out.println("</body>");
            out.println("</html>");
        } catch (ClassNotFoundException ex) {
            out.println(ex.getMessage());
        } catch (SQLException ex) {
            out.println(ex.getMessage());
        } finally {
            try {
                con.close();
                out.close();
            } catch (SQLException ex) {
                out.println(ex.getMessage());
            }
        }
    }
 
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.   
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    } 
    /**
     * Handles the HTTP <code>POST</code> method.   
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    } 
    /**
     * Returns a short description of the servlet.     
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
 