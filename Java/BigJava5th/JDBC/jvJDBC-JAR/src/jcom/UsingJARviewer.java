/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcom;
import java.io.*;
import javax.swing.*;
import java.sql.*;
import java.sql.DriverManager;
//Connection , DriverManager, ResultSet, Prepared set, Statement
/**
 *
 * @author Pana
 */
public class UsingJARviewer{

    //public Connection con;
    //public Statement st;
    //public PreparedStatement ps;
    //public ResultSet rs;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
        System.out.println("This program demonstrates connecting to the database using a JAR.\nFocus on the connection");
        //declare the connection parameters
        String user = "root";
        String pass = "";
        String  url = "jdbc:mysql://localhost:3306/university";
        //String url = "jdbc.mysql//localhost:3306/university";
        //declare the query statement to execute to the sql server
        String query = "select * from engineering";
        //this will test the connection using the jar file
        //this will check if it works correctly
        try {
            //Class.forName("");THIS ISNT DISPLAYING nor running
            Class.forName("com.mysql.jdbc.Driver");//this will check if this driver exists and works correctly
            //if not prints an error
        } catch (ClassNotFoundException e) {
            e.getStackTrace();
            
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();//this initializes the connection, which creates a format for sql class
            ResultSet rs = st.executeQuery(query);
            //now we retrived the query, with result
            while (rs.next()) {//this ensures results are following each other, until theres none left
                String UniversityData = "";//enure loop initialization starts @ 1 if 0 it wont run
                for (int i = 1; i <= 6; i++) {//which ever result is accessed currently , its saved in the string university
                    UniversityData += rs.getString(i) + ":";
                }
                //print the results retrieved
                System.out.println(UniversityData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.getStackTrace();
        }
        
        
    
    }
    
}
