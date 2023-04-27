/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author Shalon
 */
@WebFilter("/*")


public class LoginCheck implements Filter{

    @Override
    public void doFilter(ServletRequest sreq, ServletResponse sres, FilterChain fc) throws IOException, ServletException {
        HttpServletRequest req= (HttpServletRequest) sreq;
        HttpServletResponse res= (HttpServletResponse) sres;
        
        if(req.getServletPath().equals("/frontend/LoginForm.jsp")||req.getServletPath().equals("/LoginUser")){
            System.out.println("okay");
            System.out.println(req.getServletPath());
        }else{
            HttpSession session = req.getSession(false);
            if(session.getAttribute("username")==null){
                session.setAttribute("errorMsg", "you are not logged in");
                res.sendRedirect("/ServletDemo/frontend/LoginForm.jsp");
                return;
            }else{
                
            }
            
        }
        fc.doFilter(req,res);
    }
    

    
}
