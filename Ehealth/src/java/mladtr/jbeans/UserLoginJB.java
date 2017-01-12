package mladtr.jbeans;

import java.sql.*;

import javax.servlet.http.*;
import mladtr.dto.DBConn;

public class UserLoginJB {
	int flag ;
	String query;
	Connection con;
	public int userLogin(String userName,String password,String userType,HttpSession session){
		
		try {
			con=new DBConn().getConn();
			Statement stmt = con.createStatement();
			
			
			if(!userName.equals(" ")&&!password.equals(" ")&&!userType.equals(" ")){
				query = "select userName,password,usertype from userlist";
				query = query+" where username='"+userName+"' and password='"+password+"' and usertype='"+userType+"'";
							
			}
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query);
			
			if(rs.next()){
				
				String ruserType = rs.getString(3);
				if(ruserType.equals("Admin")){
					flag=2;
					System.out.println("calling admin");
				}
				if(ruserType.equals("User")){
					flag=1;
					System.out.println("calling user");
				}
				System.out.println("session1");		
				session.setAttribute("userName",rs.getString(1));
				System.out.println("session2");
				session.setAttribute("password",rs.getString(2));
				System.out.println("session3");
				session.setAttribute("userType",ruserType);
											
			}else{
				flag = 0;
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
			}
		}			
		
		
		
		
	return flag;	
	}

}
