/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcom;
import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author Pana
 */
public class Driver {
    
    public static void main(String[] args) {
        
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            //1.get the connection to database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/client","root","");
            //2.Create a statement
            Statement st = con.createStatement();
            //3.Execute a sql query
            ResultSet rs = st.executeQuery("select * from userdata");
            //4.Process the Resultset
            while (rs.next()) {                
                System.out.println(rs.getInt("user_no")+" : "+ rs.getString("user_name"));
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
}
