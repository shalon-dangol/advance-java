<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //without using filter interface
// String username = "";
// if(session.getAttribute("username")!=null){ 
// session.setAttribute("errorMsg","You are not logged in.");
// response.sendRedirect("LoginForm.jsp");
//    }else{
//    username = session.getAttribute("username").toString();
//    }


String username="";
if(session.getAttribute("username")!=null){
        username = session.getAttribute("username").toString();
    }
  %>

<!DOCTYPE html>
<html>
    <head>
        <title>Inventory System</title>
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="icon" type="image/x-icon" href="images/favicon.jpg">
        <style type="text/css">

        </style>
    </head>
    <body>

        <script src="jqueryFile.js"></script>

        <div class="nav-bar">
            <div class="system-name">Inventory System</div>
            <a href="../Logout"> logout</a> 
            <div class="user">Welcome : <%= username%></div>

        </div>
        <div class="menu">
            <a href="ItemForm.jsp" >Insert Items</a>
            <a href="DisplayItem.jsp">Display Items</a>
            <a href="Signup.jsp" >Signup</a>
            <a href="DisplayUser.jsp">Display User</a>


            <a href="Purchase.jsp">

                Purchase</a>

            <a href="Sales.jsp"> Sale</a>

            <a href="">Purchase</a>

            <a href="stock.php">Stock</a>

        </div>
            <%
                if(session.getAttribute("successMsg")!=null){
                out.println(session.getAttribute("successMsg"));
                session.removeAttribute("successMsg");
                }
            %>
