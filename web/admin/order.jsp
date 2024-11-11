<%-- 
    Document   : allBooks
    Created on : 3 Jan, 2024, 9:45:45 PM
    Author     : hp 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EBook-Orders</title>
         <%@include file="allCss.jsp"%>
    </head>
    <body>
         <%@include file="navBar.jsp"%>
         <div class="text-center">
        <h1>Hello Admin</h1>
        </div>
         <table class="table table-sm ">
  <thead CLASS="bg-secondary text-white">
    <tr>
      <th scope="col">Order ID</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Address</th>
      <th scope="col">Phn No</th>
      <th scope="col">Book Name</th>
      <th scope="col">Author</th>
      <th scope="col">Price</th>
      <th scope="col">Payment Type</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Mark</td>
      <td>Otto</td>
     
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td><td>Otto</td><td>Otto</td>
     
      <td>@mdo</td>
      <td>Mark</td>
      <td>Otto</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Larry the Bird</td>
      <td>@twitter</td>
      <td>@twitter</td>
       <td>Mark</td>
      <td>Otto</td>
     
      <td>@mdo</td>
      <td>Mark</td>
      <td>Otto</td>
    </tr>
  </tbody>
</table>
          <div style="margin-top:40px">
           <%@include file="footer.jsp"%>
       </div>
    </body>
</html>