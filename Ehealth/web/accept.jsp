<%-- 
    Document   : accept
    Created on : Mar 26, 2014, 12:29:10 AM
    Author     : pavan
--%>
<%@page import="java.sql.*"%>
<%@page import="mladtr.dto.DBConn"%>
<%@page import="com.sms.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String action=request.getParameter("act");
        //out.println("action "+action +" " +request.getParameter("id"));
       String abc= request.getParameter("id");
       String mob=request.getParameter("mobile");
       int num=0;
       System.out.println("\nact"+action+"mob"+abc);
       if(abc!=null)
                     {
           
           num=Integer.parseInt(abc);
       
        try{
            Connection con=new DBConn().getConn();
            Statement st=con.createStatement();
           String str=null;
       if(action.equals("Accept"))
                     {
           
          // SMSClient smsc = new SMSClient(-1);
          //smsc.sendMessage("+91"+mob," hai! you have been aproved :)  \n");
                                 
           str="update doctor_signup set flag='true' where userid="+num;
           st.executeUpdate(str);
       }
           if(action.equals("Ignore"))
                             {
           str="delete from doctor_signup where userid="+num;
           st.executeUpdate(str);
           }
         response.sendRedirect("DisplayData");
        
                       }
        catch(Exception e)
                               {
        }
                     }
               %>
    </body>
</html>
