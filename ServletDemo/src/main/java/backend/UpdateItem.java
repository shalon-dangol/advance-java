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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Shalon
 */
public class UpdateItem extends HttpServlet {
Connection con;

    @Override
    public void init() throws ServletException {

    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    try {
         con= DBConnect.connect();
        
        int id = Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("itemName");
        int price=Integer.parseInt(req.getParameter("itemPrice"));
        String query = "UPDATE `tbl_item` SET `name`=?,`price`=?  WHERE  id = ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setInt(2,price);
        stmt.setInt(3, id);
        stmt.executeUpdate();
        res.getWriter().println("success");
    } catch (SQLException ex) {
        res.getWriter().println(ex.getMessage());
        Logger.getLogger(UpdateItem.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        
        res.getWriter().println(ex.getMessage());
        Logger.getLogger(UpdateItem.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
 
}
