<%-- 
    Document   : accept
    Created on : Mar 26, 2014, 12:29:10 AM
    Author     : pavan
--%>
<%@page import="java.sql.*"%>
<%@page import="mladtr.dto.DBConn"%>
<%@page import="com.sms.*"%>
<%@ include file="./usrlevelmenu.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% //String action=request.getParameter("act");
        //out.println("action "+action +" " +request.getParameter("id"));
       String abc= request.getParameter("c1");
       String pincode=request.getParameter("pincode");
        int num=0;
       //System.out.println("\nact"+action+"mob"+abc);
       if(abc!=null)
                     {
           
           num=Integer.parseInt(abc);
       
        try{
            Connection con=new DBConn().getConn();
            Statement st=con.createStatement();
           String str=null;
           String name=(String)session.getAttribute("username");
           str="select userid from user_signup where email='"+name+"'";  
            ResultSet rs=st.executeQuery(str);
               rs.next();
             int userId=rs.getInt(1);
             str="insert into user_request values("+userId+","+num+")";
             int i=st.executeUpdate(str);
              out.println("request is created soon you will get the response");
              rs.close(); 
              st.close();
             
                                                                                            
          // str="delete from doctor_signup where userid="+num;
           //st.executeUpdate(str);
          
        
                       }
        catch(Exception e)
                               {
        }
                     }
        else
            response.sendRedirect("userlistviewusr.jsp?pincode="+pincode);
               %>
    </body>
</html>
<%@ include file="./footer.html" %>