package mladtr.jbeans;

import java.sql.*;
import mladtr.dto.DBConn;


public class ModifyDeceaseJB {
	int m,n;
	Connection con;
	public int modifyDecease(String deceaseNameOld,String deceaseName,String treatment,String cure,String prevention,String symptom1,String symptom2,String symptom3){
		
	try {
		con=new DBConn().getConn();
                Statement stmt = con.createStatement();
		String query= "update decease set deceasename='"+deceaseName+"',treatment='"+treatment+"' where deceasename='"+deceaseNameOld+"'";
		System.out.println(query);		
		n= stmt.executeUpdate(query);
		
		if(n==1){
			Statement stmt1 = con.createStatement();			
			String query1= "update symptom set deceasename='"+deceaseName+"',cure='"+cure+"',prevention='"+prevention+"',symptom1='"+symptom1+"',symptom2='"+symptom2+"',symptom3='"+symptom3+"' where deceasename='"+deceaseNameOld+"'";
			System.out.println(query1);		
			m= stmt.executeUpdate(query1);
						
			
		}

		
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	return m;
	}	
}
