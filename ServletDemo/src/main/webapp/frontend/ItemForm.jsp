<%-- 
    Document   : ItemForm
    Created on : Apr 4, 2023, 9:25:55 AM
    Author     : Shalon
--%>
<jsp:include page="menu.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="../itemSave" method="post">
            <label>Item Name</label> <input type="text" name="itemName"/>
            <label>Item Price</label><input type="text" name="itemPrice"/>
            <input type="submit" />
        </form>
    </body>
</html>
