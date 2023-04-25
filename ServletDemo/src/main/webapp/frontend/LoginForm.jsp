
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="style.css"/>
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
     
        
    </style>
    <body style="background-image:linear-gradiant(272deg, #434343 0%, black 100%)">
        <div class="main-content">
            <div class="title">
                Login User
            </div>
            <div class="content" >
             <form action="../LoginUser" method="post">
             <label>Username:</label><input type="text" name="username" />
            <label>Password:</label><input type="password" name="password" class="passwordField"/>

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
