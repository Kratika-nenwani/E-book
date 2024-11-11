<%-- 
    Document   : addBook
    Created on : 3 Jan, 2024, 9:39:50 PM
    Author     : hp 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EBook-AddBook</title>
        <%@include file="allCss.jsp"%>
    </head>
    <body style="background-color: #f0f5f3;">
       <%@include file="navBar.jsp"%>
       <div class="container">
           <div class="row">
               <div class="col-md-3 offset-md-4 mt-4">
                   <div class="card " >
                       <div class="card-body text">
                           
                           <form action="AddBook" method="post" enctype="multipart/form-data" >

  <div class="form-group">
    <label for="exampleInputEmail1">Book Name*</label>
    <input type="text" class="form-control" name="bookName" id="exampleInputEmail1" aria-describedby="emailHelp" required="required"  placeholder="Enter name">
    
  </div>
                                <div class="form-group">
    <label for="exampleInputEmail1">Author Name*</label>
    <input type="text" class="form-control"name="author" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" placeholder="Enter phone number">
    
  </div>
                                <div class="form-group">
    <label for="exampleInputEmail1">Price*</label>
    <input type="number" class="form-control" name="price" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" placeholder="Enter email">
    
  </div>
                                                         <div class="form-group">
      <label for="inputState">Book Categories</label>
      <select name="bookcategory" id="inputState" class="form-control">
        <option selected>Choose...</option>
        <option value="New">New Book</option>
      </select>
    </div>
                                                         <div class="form-group">
      <label for="inputState">Book Status</label>
      <select id="inputState" name="bstatus" class="form-control">
        <option selected>Choose...</option>
        <option value="Active">Active</option>
        <option value="InActive">InActive</option>
      </select>
    </div>

  <div class="form-group">
    <label for="exampleFormControlFile1">Upload Photo</label>
    <input type="file" name="bimg"class="form-control-file" id="exampleFormControlFile1">
  </div>

                                                              
                                <div class="text-center">
  <button type="submit" class="btn btn-primary">Add</button>
  
                                </div>
</form>
                       </div>
                   </div>
               </div>
               
           </div>
       </div>
       
            <%@include file="footer.jsp"%>
    </body>
</html>
