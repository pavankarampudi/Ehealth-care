package mladtr.servlets;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LogoutServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LogoutServlet() {
		super();
	}
	public void service(HttpServletRequest request, HttpServletResponse response){
	    try{
	    	
	        RequestDispatcher rd = request.getRequestDispatcher("/logout.jsp");
	        rd.forward(request, response);
	     	
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		
System.out.print("destroy method called");
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
		System.out.print("init() method called");
	}

}
