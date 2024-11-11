<%@ page import="java.sql.*" %>
<%
String email = request.getParameter("email");
String password = request.getParameter("password");
if(email.equals("admin@gmail.com")&&password.equals("admin")){
response.sendRedirect("admin/home.jsp");
}
else{

try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql:///ebook-app?useSSL=false", "root", "root");
        Statement sc = con.createStatement();
        ResultSet rs=sc.executeQuery("select * from user where email='"+email+"' and password='"+password+"'");
        if(rs.next()){
        response.sendRedirect("home.jsp");
        }
        else
        {%>
        <script>
        alert("Invalid User");
        window.location.href = "login.jsp";
        </script>
           <%
              
        }
        con.close();
    }
      
 catch (Exception e) {
    out.println(e);
}
}
%>
