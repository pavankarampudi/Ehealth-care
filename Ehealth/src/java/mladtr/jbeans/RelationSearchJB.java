package mladtr.jbeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import mladtr.dto.DBConn;

import mladtr.dto.Decease;


public class RelationSearchJB {
	Connection con;
	public ArrayList relationSearch(String deceaseName){
		ArrayList list = new ArrayList();
		try {
			con=new DBConn().getConn();
                        Statement stmt = con.createStatement();
			
			String query = "select d.deceasename,d.treatment,s.cure,s.prevention,s.symptom1,s.symptom2,s.symptom3 from decease d,symptom s where d.deceasename LIKE '%"+deceaseName+"%' and s.deceasename LIKE '%"+deceaseName+"%' and d.deceasename=s.deceasename";
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()){
				Decease d = new Decease();
				d.setDeceaseName(rs.getString(1));
				d.setTreatment(rs.getString(2));
				d.setCure(rs.getString(3));
				d.setPrevention(rs.getString(4));
				d.setSymptom1(rs.getString(5));
				d.setSymptom2(rs.getString(6));
				d.setSymptom3(rs.getString(7));

				list.add(d);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
			
		return list;
		
		
	}	
}
