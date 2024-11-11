<%-- 
    Document   : register.jsp
    Created on : 1 Jan, 2024, 11:48:35 PM
    Author     : hp 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EBook-Login</title>
        <%@include file="allComponent/allCss.jsp" %>
    </head>
    <body style="background-color: #f0f5f3;">
        <%@include file="allComponent/navBar.jsp" %>
        <div class="container">
            <div class="row">
                <div class="col-md-4 offset-md-4 p-4">
                    <div class="card">
                        <div class="card-body">
                            <h2 class="text-center mt-3">
                              <i class="fa-solid fa-right-to-bracket"></i>   Login Page
                            </h2>
                            <form action="login2.jsp">
  <div class="form-group">
                                <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" required="required">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="password"class="form-control" id="exampleInputPassword1" placeholder="Password" required="required">
  </div>
    <div class="text-center">
  <button type="submit" class="btn btn-primary">Login</button>
  <br>
  <a href="register.jsp" >Create Account</a>
                                </div>
</form>
                        
                    </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="allComponent/footer.jsp" %>
    </body>
</html>
