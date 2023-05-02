<%-- 
    Document   : Purchase
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
        <div class="main-content">
            <div class="title">Insert Item</div>
            <div class="content">
                
        <form action="../SavePurchase" method="post">
            <label>Item Name</label><span id="combo"></span>
            <label>Item Price</label><input type="text" name="itemPrice"/>
            <label>Quantity</label><input type="text" name="itemQuantity"/>

            <input type="submit" />
        </form>
            </div>
        </div>
            <script>
            $(document).ready(function(){
                $.ajax({
                     type: "get",
            url: "../GetItemSelectBox",
            data: null,
            beforeSend: function(){},
            success: function(data,status){
                $("#combo").html(data);
            },
            error:function(xhr,data,status){}     
        });
            });
    </script>
    </body>
</html>
