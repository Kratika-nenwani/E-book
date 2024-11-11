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
        <title>EBook-Register</title>
        <%@include file="allComponent/allCss.jsp" %>
    </head>
    <body style="background-color: #f0f5f3;">
        <%@include file="allComponent/navBar.jsp" %>
        <div class="container">
            <div class="row">
                <div class="col-md-4 offset-md-4 p-4">
                    <div class="card">
                        <div class="card-body">
                            <h3 class="text-center mt-3">
                                <i class="fa-solid fa-address-card"></i> Resistration Page
                            </h3>
                            <form action="register2.jsp">

  <div class="form-group">
    <label for="exampleInputEmail1">Full Name</label>
    <input type="text" class="form-control" name="name" id="exampleInputEmail1" aria-describedby="emailHelp" required="required"  placeholder="Enter name">
    
  </div>
                                <div class="form-group">
    <label for="exampleInputEmail1">Phone Number</label>
    <input type="number" class="form-control"name="phno" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" placeholder="Enter phone number">
    
  </div>
                                <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" placeholder="Enter email">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password" required="required" placeholder="Password">
  </div>
  <div class="form-check text-center">
    <input type="checkbox" class="form-check-input" id="exampleCheck1" name="check">
    <label class="form-check-label"  for="exampleCheck1">Agree Terms And condition</label>
  </div>
                                <div class="text-center">
      <a href="TAC.jsp"> View T&C </a>
  </div>
                                
                                <div class="text-center">
  <button type="submit" class="btn btn-primary">Register</button>
  
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
