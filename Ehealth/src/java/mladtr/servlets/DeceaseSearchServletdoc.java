package mladtr.servlets;


import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import mladtr.jbeans.DeceaseSearchJB;


public class DeceaseSearchServletdoc extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public DeceaseSearchServletdoc() {
		super();
	}
	public void service(HttpServletRequest request, HttpServletResponse response){
		try{
		System.out.println("getting data");	
			
		String failed1 =request.getParameter("form1");
		String failed2 =request.getParameter("form2");
		String deceaseName =request.getParameter("deceaseName");
		String symptom1 =request.getParameter("symptom1");
		String symptom2 =request.getParameter("symptom2");		
		String symptom3 =request.getParameter("symptom3");		
		
		System.out.println(deceaseName);

		if((deceaseName!=null)&&!deceaseName.equals("")){
			DeceaseSearchJB dsjb = new DeceaseSearchJB();
			System.out.println("by decease searching");
			ArrayList list=dsjb.searchByDecease(deceaseName);
			request.setAttribute("list", list);
	        RequestDispatcher rd = request.getRequestDispatcher("/searchdeceaselistdoc.jsp");
	        rd.forward(request, response);
			
		}else if((symptom1!=null)&&!symptom1.equals("") || (symptom2!=null)&&!symptom2.equals("") || (symptom3!=null)&&!symptom3.equals("")){
			System.out.println("symptom called");				
			DeceaseSearchJB dsjb = new DeceaseSearchJB();
			System.out.println("by symptom searching");
			ArrayList list=dsjb.searchBySymptom(symptom1,symptom2,symptom3);
			request.setAttribute("list", list);
	        RequestDispatcher rd = request.getRequestDispatcher("/searchdeceaselistdoc1.jsp");
	        rd.forward(request, response);
						
		}
	
		
		System.out.println(failed1);
		System.out.println(failed2);			
		if(deceaseName.equals("")&& (symptom1.equals("")||symptom2.equals("")||symptom3.equals(""))){
	       
			System.out.println("enter into failed block");				
			if(failed1.equals("decease")){
				System.out.println("enter into decease failed block");	    	
			RequestDispatcher rd = request.getRequestDispatcher("/failedsearchdecease.jsp");
	        rd.forward(request, response);		
		   }else if(failed2.equals("symptom")){
				System.out.println("enter into  symptom failed block");	    	   
			RequestDispatcher rd = request.getRequestDispatcher("/failedsearchdecease1.jsp");
		    rd.forward(request, response);	    	   
	       }
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
