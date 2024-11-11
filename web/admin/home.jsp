<%-- 
    Document   : home.jsp
    Created on : 3 Jan, 2024, 12:04:37 AM
    Author     : hp 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin:Home</title>
        <%@include file="allCss.jsp"%>
        <style type="text/css">
            a
            {
                text-decoration:none;
                color:black;
            }
            a:hover{
                text-decoration:none;
                color:midnightblue;
            }
            </style>
            
    </head>
    <body>
        
        <%@include file="navBar.jsp"%>
       <div class="container mt-4">
           <div class="row">
               <div class="col-md-3">
                   <a href="addBook.jsp">
                   <div class="card text-center">
                   <div class="card-body ">
                   
<i class="fa-solid fa-plus fa-3x text-danger"></i><br>
<h3>Add Book</h3>
                   </div>
               </div>
                   </a>
               </div>
               
           <div class="col-md-3">
               <a href="allBooks.jsp">
                   <div class="card text-center">
                   <div class="card-body ">
                   
<i class="fa-solid fa-book fa-3x text-warning"></i><br>
<h3>All Books</h3>
                   </div>
               </div>
                   </a>
               </div>
           
              <div class="col-md-3">
                   <a href="order.jsp">
                   <div class="card text-center">
                   <div class="card-body ">
                   
<i class="fa-solid fa-bag-shopping fa-3x text-primary"></i><br>
<h3>Orders</h3>
                   </div>
               </div>
                       </a>
               </div>
               
               <div class="col-md-3">
                   <a href="register.jsp">
                      
                   <div class="card text-center">
                   <div class="card-body ">
                   <i class="fa-solid fa-right-from-bracket fa-3x text-success"></i><br>
<h3>Log Out</h3>
                   </div>
               </div>
                       </a>
               </div>
           </div>
       <div style="margin-top:260px">
           <%@include file="footer.jsp"%>
       </div>
           
       </div>
    </body>
</html>
