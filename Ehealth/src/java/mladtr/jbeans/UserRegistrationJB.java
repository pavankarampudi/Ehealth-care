package mladtr.jbeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import mladtr.dto.DBConn;

public class UserRegistrationJB {
    String query,query1,query2,ruserName;
    int flag,max,n=0;
    Connection con;
	public int userRegistration(String userName,String password,String userType){
		
		try {
			con=new DBConn().getConn();
			Statement stmt1 = con.createStatement();

			query1 = "select username from userlist";
			System.out.println(query1);
			ResultSet rs1=stmt1.executeQuery(query1);
			while(rs1.next()){
			ruserName=rs1.getString(1);
			System.out.println("rusername : "+ruserName);			
			if(ruserName.equals(userName)){
				System.out.println("if loop rusername : "+ruserName);				
				return n;
			}
			}			
			
			Statement stmt = con.createStatement();
			
			
			if(userName!=null && password!=null && userType!=null){
			query = "select MAX(userid) from userlist";
				
							
			
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query);

			while(rs.next()){

			max=rs.getInt(1);
			
			}
			
			max=max+1;

			System.out.println(userName);	
			Statement stmt2 = con.createStatement();

			query2 = "insert into userlist values("+max+",'"+userName+"','"+password+"','"+userType+"')";
			System.out.println(query2);
			n=stmt2.executeUpdate(query2);
			System.out.println(n);	
					
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
		
		
		
		
		
	return n;	
	}

}	

