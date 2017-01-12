package mladtr.servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import mladtr.jbeans.UserLoginJB;


public class LoginServlet extends HttpServlet {
    
	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
		super();
	}
	
    @Override
	public void service(HttpServletRequest request, HttpServletResponse response){
		try{
		String userId =request.getParameter("userName");
		String password =request.getParameter("password");
		String userType = request.getParameter("userType");
		
		HttpSession session = request.getSession(true);
	    PrintWriter out = response.getWriter();		
		
		UserLoginJB uljb=new UserLoginJB();
		int flag = uljb.userLogin(userId, password, userType, session);
		RequestDispatcher rd;
		if(flag == 2){
			System.out.println("dispatching to admin");
			rd = request.getRequestDispatcher("/AdminHome.html");
			rd.forward(request, response);
		}
		if(flag == 1){
			System.out.println("dispatching to user");			
			rd = request.getRequestDispatcher("/usershome.html");
			rd.forward(request, response);
		}
		if(flag == 0){
			System.out.println("dispatching to error");
			rd = request.getRequestDispatcher("/Login.html");
			out.println("<html><body><center><font color=\"red\">Please enter valid User Name/Password</font></center>");				
			rd.include(request, response);
		}
		}catch(Exception e){
		}
		
	}
		/**
	 * Destruction of the servlet. <br>
	 */
    @Override
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


}
