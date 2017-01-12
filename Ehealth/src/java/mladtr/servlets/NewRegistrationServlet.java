package mladtr.servlets;


import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mladtr.jbeans.UserRegistrationJB;

public class NewRegistrationServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public NewRegistrationServlet() {
		super();
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response){
		try{
		String userId =request.getParameter("userName");
		String password =request.getParameter("password");
		String userType = request.getParameter("userType");
		System.out.println("username="+userId);
	    PrintWriter out = response.getWriter();
		UserRegistrationJB uljb=new UserRegistrationJB();
		int flag = uljb.userRegistration(userId, password, userType);
		System.out.println(flag);		
		RequestDispatcher rd;
		if(flag == 1){
			System.out.println("dispatching to Login");
			rd = request.getRequestDispatcher("/Login.html");
			out.println("<html><body><center><font color=\"Green\">Successfully Registered</font></center></body></html>");	
			rd.include(request, response);
		}else if(flag == 0){
			System.out.println("failed registration");	
			out.println("<html><body><center><font color=\"red\">User Name already existed</font></center>");			
			rd = request.getRequestDispatcher("/registration.html");
			rd.include(request, response);
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}	

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
