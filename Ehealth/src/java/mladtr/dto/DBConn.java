/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mladtr.dto;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ravindrad
 */
public class DBConn {

    Connection con;

    public Connection getConn() {
        try {
          // Class.forName("oracle.jdbc.driver.OracleDriver");
       // con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hosp", "hosp");
       Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealth","root","root");
             return con;

        } catch (Exception e) {
             return null;
        }
       
    }

    public void close(){
        try{
    con.close();
        }catch(Exception e){
        }

    }
}
