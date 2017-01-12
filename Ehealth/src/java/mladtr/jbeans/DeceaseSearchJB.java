package mladtr.jbeans;


import java.sql.*;
import java.util.*;
import mladtr.dto.DBConn;

import mladtr.dto.Decease;


public class DeceaseSearchJB {
	Connection con1,con2;	
	public ArrayList searchByDecease(String deceaseName){
		ArrayList list = new ArrayList();
		try {
			con1=new DBConn().getConn();
                        Statement stmt = con1.createStatement();
			
			String query = "select d.deceasename,d.treatment,s.cure,s.prevention,s.symptom1,s.symptom2,s.symptom3 from decease d,symptom s where d.deceasename LIKE '%"+deceaseName+"%' and s.deceasename LIKE '%"+deceaseName+"%' and d.deceasename=s.deceasename order by deceasename";
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
				System.out.println(rs.getString(1));

				list.add(d);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return list;
		
		
	}
	public ArrayList searchBySymptom(String symptom1,String symptom2,String symptom3){

		ArrayList list = new ArrayList();
		try {
			con2=new DBConn().getConn();
                        Statement stmt = con2.createStatement();
			
			String query = "select deceasename,cure,prevention,symptom1,symptom2,symptom3 from symptom s where s.symptom1 LIKE '%"+symptom1+"%' and s.symptom2 LIKE '%"+symptom2+"%' and s.symptom3 LIKE '%"+symptom3+"%'";
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()){
				Decease d = new Decease();
				d.setDeceaseName(rs.getString(1));

				d.setCure(rs.getString(2));
				d.setPrevention(rs.getString(3));
				d.setSymptom1(rs.getString(4));
				d.setSymptom2(rs.getString(5));
				d.setSymptom3(rs.getString(6));
			
				list.add(d);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				con2.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
			
		return list;
		
		
	}

}
