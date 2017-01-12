package mladtr.servlets;


import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

import mladtr.jbeans.ModifyDeceaseJB;
;

public class ModifyDeceaseServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ModifyDeceaseServlet() {
		super();
	}
	public void service(HttpServletRequest request, HttpServletResponse response){
		try{
			String deceaseNameOld =request.getParameter("deceaseNameOld");
			String deceaseName =request.getParameter("deceaseName");
		    String treatment =request.getParameter("treatment");
			String cure =request.getParameter("cure");
			String prevention =request.getParameter("prevention");
			String symptom1 =request.getParameter("symptom1");
			String symptom2 =request.getParameter("symptom2");
			String symptom3 =request.getParameter("symptom3");
		
		ModifyDeceaseJB mdjb = new ModifyDeceaseJB();
		int n = mdjb.modifyDecease(deceaseNameOld,deceaseName, treatment,cure,prevention,symptom1,symptom2,symptom3);
		PrintWriter out = response.getWriter();
		if(n==1){
			//out.println("<center>Successfully Modified<center>");
	        RequestDispatcher rd = request.getRequestDispatcher("/successmodify.jsp");
	        rd.include(request, response);
	        
		}else{
			//out.println("<center>Sorry not modified<center>");
	        RequestDispatcher rd = request.getRequestDispatcher("/failedmodify.jsp");
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
