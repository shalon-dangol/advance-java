/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shalon
 */
public class DBConnect {
    public static Connection connect() throws SQLException, ClassNotFoundException{
       try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 String url="jdbc:mysql://localhost/inventory_db";
                 String username="root";
                 String password="";
         
            Connection con=DriverManager.getConnection(url,username,password);
            return con;
            }catch(SQLException ex){
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE,null,ex);
                return null;
            }
        
    }
}

