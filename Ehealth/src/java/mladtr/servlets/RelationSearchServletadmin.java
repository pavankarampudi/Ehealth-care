package mladtr.servlets;


import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mladtr.jbeans.RelationSearchJB;

public class RelationSearchServletadmin extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RelationSearchServletadmin() {
		super();
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response){
		try{
		String deceaseName =request.getParameter("deceaseName");
		
		System.out.println(deceaseName);
		
		
			RelationSearchJB rsjb = new RelationSearchJB();
			System.out.println("by decease searching");
			ArrayList list=rsjb.relationSearch(deceaseName);
			
                        request.setAttribute("list", list);
	        
                        RequestDispatcher rd = request.getRequestDispatcher("./relationdiagramadmin.jsp");
	        rd.forward(request, response);
			
		
				
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
