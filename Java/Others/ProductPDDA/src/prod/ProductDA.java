/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prod;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Pana
 */
public class ProductDA {
    private static Connection con;
    private static ArrayList<ProductPD> arProducts = new ArrayList<>();
    private static PreparedStatement ps;
    private static ResultSet rs;
    
    public static void initialiseConnection() throws DataStorageException{
        final String USERNAME = "root";
        final String PASSWORD = "";
        final String URL = "jdbc:mysql://localhost/AloeVeraProductsDB";
        final String DRIVER = "com.mysql.jdbc.Driver";
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch(ClassNotFoundException ex){
            throw new DataStorageException("Database Driver is missing.\n"+ex.getMessage());
        } 
        catch (SQLException e) {
            throw new DataStorageException("Connection Failed.\n"+e.getMessage());
        }
    
    }
    
}
