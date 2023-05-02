<%-- 
    Document   : GetCookie
    Created on : Apr 30, 2023, 9:41:21 AM
    Author     : Shalon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
       Cookie cookies[] =  request.getCookies();
       if(cookies==null){
       out.println("cookies is null");
            return;
            }
            for(Cookie c : cookies){
               if( c.getName().equals("token")){
                out.println(c.getValue());
                return;
            }
            
            }
            out.println("cookie is expired");
        %>
        <h1>Hello World!</h1>
    </body>
</html>
