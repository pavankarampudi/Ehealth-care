package mladtr.jbeans;

import java.sql.*;
import mladtr.dto.DBConn;


public class DeleteJB {
	int m,n;
	Connection con;
	public int delete(String deceaseName){
		
		try{	
			con=new DBConn().getConn();
			Statement stmt = con.createStatement();
			
			String query = "delete decease where deceasename='"+deceaseName+"'"; 
			System.out.println(query);
			m = stmt.executeUpdate(query);
            
			if(m==1){
				Statement stmt1 = con.createStatement();
				
				String query1 = "delete symptom where deceasename='"+deceaseName+"'"; 
				System.out.println(query1);
				n = stmt.executeUpdate(query1);				
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
		
		
	return n;
	}

}
