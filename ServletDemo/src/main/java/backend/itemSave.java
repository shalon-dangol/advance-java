/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package backend;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shalon
 */
public class itemSave extends HttpServlet {
    Connection con;
    @Override
    public void init() throws ServletException {
    
        try {
            con = DBConnect.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(itemSave.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(itemSave.class.getName()).log(Level.SEVERE, null, ex);
        }
   
      
    }

   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       // normalWay(req, res);
        PreparedWay(req, res);
    }
    
    public void PreparedWay(HttpServletRequest req, HttpServletResponse res){
        String itemName = req.getParameter("itemName");
        int itemPrice = Integer.parseInt(req.getParameter("itemPrice"));
        try {
            con = DBConnect.connect();
            String query = "INSERT INTO `tbl_item`(`name`, `price`, `stock`, `photo`) VALUES (?,?,?,?)";
            PreparedStatement stat  = con.prepareStatement(query);
            //binding parameter value
            stat.setString(1, itemName);
            stat.setInt(2, itemPrice);
            stat.setInt(3, 0);
            stat.setString(4, "");
            
            stat.executeUpdate();
            res.getWriter().println("inserted succesfully");
                    
                    
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(itemName);
        System.out.println(itemPrice);
    }

    public void normalWay(HttpServletRequest req, HttpServletResponse res){
        String itemName = req.getParameter("itemName");
        int itemPrice = Integer.parseInt(req.getParameter("itemPrice"));
        try {
            Connection con = DBConnect.connect();
            String query = String.format("INSERT INTO `tbl_item`(`name`, `price`, `stock`, `photo`) VALUES ('%s', %d,0,'')",itemName,itemPrice);
            Statement stat  = con.createStatement();
            stat.executeUpdate(query);
            res.getWriter().println("inserted succesfully");
                    
                    
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(itemName);
        System.out.println(itemPrice);
        
    }
    @Override
    public void destroy() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(itemSave.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

}
