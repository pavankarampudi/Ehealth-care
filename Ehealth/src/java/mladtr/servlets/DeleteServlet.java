package mladtr.servlets;


import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mladtr.jbeans.DeleteJB;

public class DeleteServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public DeleteServlet() {
		super();
	}
	
	
	public void service(HttpServletRequest request, HttpServletResponse response){
		try{
		String deceaseName =request.getParameter("deceaseName");
		DeleteJB djb = new DeleteJB();
		int n = djb.delete(deceaseName);
		PrintWriter out = response.getWriter();
		RequestDispatcher rd;
		if(n==1){
			//out.println("<center>Successfully Deleted<center>");
			rd = request.getRequestDispatcher("/successdeletedecease.jsp");
			rd.include(request, response);			
		}else{
			//out.println("<center>Sorry Record not Deleted<center>");
			rd = request.getRequestDispatcher("/faileddelete.jsp");
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

}
