
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-book index</title>
        <%@include file="allComponent/allCss.jsp" %>
      
        <style type="text/css">
            .back-img{
                background: url("img/bg.jpg");
                height :50vh;
                width:100%;
                background-size: cover;
            }
            .crd-ho:hover
            {
               background-color:  #e1ede8;
            }
        </style>
    </head>
    <body style="background-color:#f0f5f3;">
         
         
         
         <%@include file="allComponent/navBar.jsp" %>
        <div class="container-fluid back-img">
            <h2 class="text-center">
                <i class="fa-solid fa-book-open-reader"></i>  EBook Management System</h2>
        </div>
        <!-Recent Book Start->
        <div class="container">
            <h3 class="text-center">Recent Book</h3>
            <div class="row">
                <div class="col-md-3">
                    <div class="card crd-ho">
                    <div class="card-body text-center">
                        <img alt="" src="book/b1.jpg" style="width:200px;height:270px">
                        <p>IKIGAI : The Japanese secret to a long and happy life</p>
                        <p>Category: NEW</p>
                        <div class="row">
                        <a href="" class="btn btn-info btn-sm ml-1"><i class="fa-solid fa-cart-shopping"></i>Add Cart</a>
                        <a href="" class="btn btn-warning btn-sm ml-1">View</a>
                        <a href="" class="btn btn-info btn-sm ml-1">371.00</a>
                        </div>
                    </div>
                </div>
              
            </div>
                <div class="col-md-3">
                    <div class="card crd-ho">
                    <div class="card-body text-center">
                        <img alt="" src="book/b2.jpg" style="width:200px;height:270px">
                        <p>Build, Don't Talk (English, Paperback, Shamani Raj)</p>
                        <p>Category: NEW</p>
                        <div class="row">
                        <a href="" class="btn btn-info btn-sm ml-1"><i class="fa-solid fa-cart-shopping"></i>Add Cart</a>
                        <a href="" class="btn btn-warning btn-sm ml-1">View</a>
                        <a href="" class="btn btn-info btn-sm ml-1">199.00</a>
                        </div>
                    </div>
                </div>
              
            </div>
                
                <div class="col-md-3">
                    <div class="card crd-ho">
                    <div class="card-body text-center">
                        <img alt="" src="book/b3.jpg" style="width:200px;height:270px">
                        <p>The Hidden Hindu (Akshat Gupta)</p>
                        <p>Category: NEW</p>
                        <div class="row">
                        <a href="" class="btn btn-info btn-sm ml-1"><i class="fa-solid fa-cart-shopping"></i>Add Cart</a>
                        <a href="" class="btn btn-warning btn-sm ml-1">View</a>
                        <a href="" class="btn btn-info btn-sm ml-1">160.00</a>
                        </div>
                    </div>
                </div>
              
            </div>
                
                <div class="col-md-3">
                    <div class="card crd-ho">
                    <div class="card-body text-center">
                        <img alt="" src="book/b4.jpg" style="width:200px;height:270px">
                        <p>Atomic Habits Book (Paperback)</p>
                        <p>Category: NEW</p>
                        <div class="row">
                        <a href="" class="btn btn-info btn-sm ml-1"><i class="fa-solid fa-cart-shopping"></i>Add Cart</a>
                        <a href="" class="btn btn-warning btn-sm ml-1">View</a>
                        <a href="" class="btn btn-info btn-sm ml-1">149.00</a>
                        </div>
                    </div>
                </div>
              
            </div>
               
        </div>
             <div class="text-center mt-1">
                 <a href="" class="btn btn-danger btn-sm "> Veiw All</a>
                </div>
            
        <!-Recent Book End->
        
        
        <hr>

        <!-New Book Start->
        <div class="container">
            <h3 class="text-center">New Book</h3>
            <div class="row">
                <div class="col-md-3">
                    <div class="card crd-ho">
                    <div class="card-body text-center">
                        <img alt="" src="book/b1.jpg" style="width:200px;height:270px">
                        <p>IKIGAI : The Japanese secret to a long and happy life</p>
                        <p>Category: NEW</p>
                        <div class="row">
                        <a href="" class="btn btn-info btn-sm ml-1"><i class="fa-solid fa-cart-shopping"></i>Add Cart</a>
                        <a href="" class="btn btn-warning btn-sm ml-1">View</a>
                        <a href="" class="btn btn-info btn-sm ml-1">371.00</a>
                        </div>
                    </div>
                </div>
              
            </div>
                <div class="col-md-3">
                    <div class="card crd-ho">
                    <div class="card-body text-center">
                        <img alt="" src="book/b2.jpg" style="width:200px;height:270px">
                        <p>Build, Don't Talk (English, Paperback, Shamani Raj)</p>
                        <p>Category: NEW</p>
                        <div class="row">
                        <a href="" class="btn btn-info btn-sm ml-1"><i class="fa-solid fa-cart-shopping"></i>Add Cart</a>
                        <a href="" class="btn btn-warning btn-sm ml-1">View</a>
                        <a href="" class="btn btn-info btn-sm ml-1">199.00</a>
                        </div>
                    </div>
                </div>
              
            </div>
                
                <div class="col-md-3">
                    <div class="card crd-ho">
                    <div class="card-body text-center">
                        <img alt="" src="book/b3.jpg" style="width:200px;height:270px">
                        <p>The Hidden Hindu (Akshat Gupta)</p>
                        <p>Category: NEW</p>
                        <div class="row">
                        <a href="" class="btn btn-info btn-sm ml-1"><i class="fa-solid fa-cart-shopping"></i>Add Cart</a>
                        <a href="" class="btn btn-warning btn-sm ml-1">View</a>
                        <a href="" class="btn btn-info btn-sm ml-1">160.00</a>
                        </div>
                    </div>
                </div>
              
            </div>
                
                <div class="col-md-3">
                    <div class="card crd-ho">
                    <div class="card-body text-center">
                        <img alt="" src="book/b4.jpg" style="width:200px;height:270px">
                        <p>Atomic Habits Book (Paperback)</p>
                        <p>Category: NEW</p>
                        <div class="row">
                        <a href="" class="btn btn-info btn-sm ml-1"><i class="fa-solid fa-cart-shopping"></i>Add Cart</a>
                        <a href="" class="btn btn-warning btn-sm ml-1">View</a>
                        <a href="" class="btn btn-info btn-sm ml-1">149.00</a>
                        </div>
                    </div>
                </div>
              
            </div>
               
        </div>
             <div class="text-center mt-1">
                 <a href="" class="btn btn-danger btn-sm "> Veiw All</a>
                </div>
            
        <!-New Book End->
        
        <hr>
        
        
        <!-Recent Book Start->
        <div class="container">
            <h3 class="text-center">Old Book</h3>
            <div class="row">
                <div class="col-md-3">
                    <div class="card crd-ho">
                    <div class="card-body text-center">
                        <img alt="" src="book/b1.jpg" style="width:200px;height:270px">
                        <p>IKIGAI : The Japanese secret to a long and happy life</p>
                        <p>Category: NEW</p>
                        <div class="row">
                       
                        <a href="" class="btn btn-warning btn-sm ml-5">View</a>
                        <a href="" class="btn btn-info btn-sm ml-1">371.00</a>
                        </div>
                    </div>
                </div>
              
            </div>
                <div class="col-md-3">
                    <div class="card crd-ho">
                    <div class="card-body text-center">
                        <img alt="" src="book/b2.jpg" style="width:200px;height:270px">
                        <p>Build, Don't Talk (English, Paperback, Shamani Raj)</p>
                        <p>Category: NEW</p>
                        <div class="row">
                        <a href="" class="btn btn-warning btn-sm ml-5">View</a>
                        <a href="" class="btn btn-info btn-sm ml-1">199.00</a>
                        </div>
                    </div>
                </div>
              
            </div>
                
                <div class="col-md-3">
                    <div class="card crd-ho">
                    <div class="card-body text-center">
                        <img alt="" src="book/b3.jpg" style="width:200px;height:270px">
                        <p>The Hidden Hindu (Akshat Gupta)</p>
                        <p>Category: NEW</p>
                        <div class="row">
                        <a href="" class="btn btn-warning btn-sm ml-5">View</a>
                        <a href="" class="btn btn-info btn-sm ml-1">160.00</a>
                        </div>
                    </div>
                </div>
              
            </div>
                
                <div class="col-md-3">
                    <div class="card crd-ho">
                    <div class="card-body text-center">
                        <img alt="" src="book/b4.jpg" style="width:200px;height:270px">
                        <p>Atomic Habits Book (Paperback)</p>
                        <p>Category: NEW</p>
                        <div class="row">
                        <a href="" class="btn btn-warning btn-sm ml-5">View</a>
                        <a href="" class="btn btn-info btn-sm ml-1">149.00</a>
                        </div>
                    </div>
                </div>
              
            </div>
               
        </div>
             <div class="text-center mt-1">
                 <a href="" class="btn btn-danger btn-sm "> Veiw All</a>
                </div>
            
        <!-Recent Book End->
        
        <%@include file="allComponent/footer.jsp" %>
    </body>
</html>
