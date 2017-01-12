package mladtr.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mladtr.jbeans.AddDeceaseJB;

public class AddDeceaseServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddDeceaseServlet() {
		super();
	}
public void service(HttpServletRequest request, HttpServletResponse response){
		try{
		String deceaseName =request.getParameter("deceaseName");
		String treatment =request.getParameter("treatment");
		String cure =request.getParameter("cure");
		String prevention =request.getParameter("prevention");
		String symptom1 =request.getParameter("symptom1");
		String symptom2 =request.getParameter("symptom2");
		String symptom3 =request.getParameter("symptom3");
		
		AddDeceaseJB adjb = new AddDeceaseJB();
		int n =adjb.addDecease(deceaseName, treatment,cure,prevention,symptom1,symptom2,symptom3);
		PrintWriter out = response.getWriter();
		if(n==1){
			//out.println("<center>Successfully Modified<center>");
	        RequestDispatcher rd = request.getRequestDispatcher("/successadddecease.jsp");
	        rd.include(request, response);
	        
		}else{
			//out.println("<center>Sorry not modified<center>");
	        RequestDispatcher rd = request.getRequestDispatcher("/failedadddecease.jsp");
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


}
