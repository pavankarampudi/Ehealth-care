package mladtr.jbeans;

import java.sql.*;
import mladtr.dto.DBConn;


public class AddDeceaseJB {
	int maxdid,m,n;
	Connection con;
	public int addDecease(String deceaseName,String treatment,String cure,String prevention,String symptom1,String symptom2,String symptom3){
		try{	
		con=new DBConn().getConn();
		Statement stmt = con.createStatement();
		
		String query = "select MAX(deceaseid) from decease";
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()){
			maxdid = rs.getInt(1);
		}
		maxdid = maxdid +1;
		
		Statement stmt1 = con.createStatement();
		String query1="insert into decease values("+maxdid+",'"+deceaseName+"','"+treatment+"')";
		m = stmt1.executeUpdate(query1);

		if(m==1){
		Statement stmt2 = con.createStatement();
		String query2="insert into symptom values('"+deceaseName+"','"+symptom1+"','"+symptom2+"','"+symptom3+"','"+cure+"','"+prevention+"')";
		n = stmt2.executeUpdate(query2);
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
