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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shalon
 */
public class GetAllItem extends HttpServlet {

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
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            String query= "select * from tbl_item";
            Statement  stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            String table="<table border='1'>";
            table+="<tr>";
            table+="<th>ID<th>Name<th>Price<th>Stock<th>Action";
            table+="</tr>";
            
            while(result.next()){
                String id = result.getString("id");
                
                    table+="<tr>";
                    table+="<td>"+result.getString("id")+"</td>";
                    table+="<td>"+result.getString("name")+"</td>";
                    table+="<td>"+result.getString("price")+"</td>";
                    table+="<td>"+result.getString("stock")+"</td>";
                    table+="<td><a onclick='return confirm(\"Are you sure to delete?\")'  href= '../DeleteItem?id="+id+"'>Delete</a></td>";
                    table+="<td><a href= '../GetOneItem?id="+id+"'>Update</a></td>";
                    table+="<td><a href= '../ViewItemPic?id="+id+"'>View</a></td>";
                    table+="</tr>";
                
            }
            table+="</table>";
            res.setContentType("text/html");
            res.getWriter().println(table);
        } catch (SQLException ex) {
            Logger.getLogger(GetAllItem.class.getName()).log(Level.SEVERE, null, ex);
        }
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
