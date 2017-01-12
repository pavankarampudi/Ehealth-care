
import mladtr.dto.DBConn;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.regex.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class upload extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
      //  RequestDispatcher rd=request.getRequestDispatcher("/userlevelmenu.html");
        //rd.include(request, response);
//int userid=Integer.parseInt(request.getParameter("userid"));
//        String action=request.getParameter("Upload");
        
        
  //      int userid=((Integer)request.getAttribute("op1")).intValue();
        
        
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (!isMultipart) {
            out.println("File Not Uploaded");
        } else {
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List items = null;
            try {
                items = upload.parseRequest(request);
                out.println("items: " + items);
            } catch (FileUploadException e) {
                e.printStackTrace();
            }
            FileItem file = (FileItem) items.get(0);
            // out.print(file);
            Connection conn = null;
        
            String sql = null;
            try {
               conn=new DBConn().getConn();
                // FileInputStream fs = new FileInputStream(savedFile);
                sql = "update doctor_signup(photo) VALUES(?)";
                PreparedStatement st = conn.prepareStatement(sql);
                // st.setInt(1,1);
                st.setBinaryStream(1, file.getInputStream(), (int) file.getSize());
                int rs = st.executeUpdate();
  //              out.println(userid);
                if (rs > 0) {
                    out.println("Query Executed Successfully++++++++++++++");
                }
                conn.close();
            } catch (Exception e) {
                out.println(e.getMessage());
            }
        }
        
    }
}