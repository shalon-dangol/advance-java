/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package backend;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shalon
 */
public class GetItemForView extends HttpServlet {
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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try {
        int id = Integer.parseInt(req.getParameter("id"));
        String query= "select * from tbl_item where id = ?";
        
        PreparedStatement  stmt = con.prepareStatement(query);
        stmt.setInt(1,id);
        ResultSet result = stmt.executeQuery();
        result.next();
        
        HttpSession session = req.getSession();
        session.setAttribute("id",result.getString("id"));
        session.setAttribute("itemName",result.getString("name"));
        session.setAttribute("itemPrice",result.getString("price"));
        session.setAttribute("photo", result.getString("photo"));
        
        resp.sendRedirect("frontend/ViewItem.jsp");
    } catch (SQLException ex) {
        Logger.getLogger(GetOneItem.class.getName()).log(Level.SEVERE, null, ex);
    }
           
    }
}
