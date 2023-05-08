<%-- 
    Document   : ViewItemPic
    Created on : May 7, 2023, 10:03:38 AM
    Author     : Shalon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="menu.jsp"/>

<script type="text/javascript">
     $(document).ready(function(){
        console.log("started");
        $.ajax({
            type: "get",
            url: "../ViewItemPic",
            data: null,
            beforeSend: function(){},
            success: function(data,status){
                $("#image").html(data);
            },
            error:function(xhr,data,status){}
        });
});
</script>

<div class="main-content">
            <div class="title">User</div>
            <div class="content">
                <div  class="display_table">
                    
             <img id="image" src
        
    </div>
            </div>
        </div>
