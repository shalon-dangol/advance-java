/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package backend;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import static java.lang.System.in;
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
public class LoginUser extends HttpServlet {
Connection con;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    try {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String status = "active";
        con = DBConnect.connect();
        String query = "SELECT * FROM `tbl_user` WHERE username = ? AND password=? AND status = ? ";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, username);
        stmt.setString(2, password);
        stmt.setString(3, status);
        ResultSet result = stmt.executeQuery();
//        System.out.println(stmt.getUpdateCount());
        HttpSession session = req.getSession();
        
        
        if(result.next()){
            if(req.getParameter("remember")!=null){
                System.out.println("checked");
                Cookie usernameCookie = new Cookie("username",username);
                Cookie passwordCookie = new Cookie("password",password);
                
                res.addCookie(usernameCookie);
                res.addCookie(passwordCookie);
                
                
            }else{
                System.out.println("unchecked");
                Cookie cookies[]= req.getCookies();
                for(Cookie cookie : cookies){
                    if(cookie.getName().equals("username")){
                        cookie.setMaxAge(0);
                        res.addCookie(cookie);
                    }
                    if(cookie.getName().equals("password")){
                        cookie.setMaxAge(0);
                        res.addCookie(cookie);
                    }
                }
            }
            session.setAttribute("userid",result.getString("id"));
            session.setAttribute("username",username);
            
            res.sendRedirect("frontend/menu.jsp");
        }else{
            session.setAttribute("errorMsg","Either username or password is wrong");
            res.sendRedirect("frontend/LoginForm.jsp");
        }
        
        
    } catch (ClassNotFoundException | SQLException ex) {
       res.getWriter().println("wrong user password");
        Logger.getLogger(LoginUser.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
        
}
