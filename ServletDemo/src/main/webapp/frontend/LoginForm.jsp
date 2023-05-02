
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String username = "";
    String password = "";
    
    Cookie cookies[] = request.getCookies();
    for(Cookie cookie : cookies){
        if(cookie.getName().equals("username")){
        System.out.println(cookie.getValue());
        username = cookie.getValue();
        
    }
    if(cookie.getName().equals("password")){
    password = cookie.getValue();
    
    }
    
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    
    <style>
        .main-content{
            width:350px;
            float: none;
            display: block;
            margin: 0;
            margin: 50px auto;
            background: white;
        }
        .passwordField{
            box-sizing: border-box;
			display: block;
		    width: 100%;
		    padding: 0.375rem 0.75rem;
		    font-size: 1rem;
		    line-height: 1.5;
		    color: #495057;
		    background-color: #fff;
		    background-clip: padding-box;
		    border: 1px solid #ced4da;
		    border-radius: 0.25rem;
		    margin-top: 8px;
		    margin-bottom: 15px;
        }
     
        
    </style>
    <body style="background-image: linear-gradient(272deg, #434343 0%, black 100%)">
        <div class="main-content">
            <div class="title">
                Login User
            </div>
            <div class="content" >
             <form action="../LoginUser" method="post">
             <label>Username:</label><input type="text" name="username" value="<%= username%>" />
            <label>Password:</label><input type="password" name="password" class="passwordField" value="<%= password%>"/>

            <input type="checkbox" name="remember"/><span>Remember User</span><br>
            <input type="submit" class="btn success" value="Login" />
        </form>
             <%
                 String err = "";
                 if(session.getAttribute("errorMsg")!=null){
                    err = session.getAttribute("errorMsg").toString();
                    System.out.println(err);
                    session.removeAttribute("errorMsg");
                    out.println("<div class = 'error-msg' >"+err+"</div>");
                 }
                 %>
            </div>
        </div>
       
    </body>
</html>
