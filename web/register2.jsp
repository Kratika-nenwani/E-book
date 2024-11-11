<%@ page import="java.sql.*" %>
<%
String name = request.getParameter("name");
String phno = request.getParameter("phno");
String email = request.getParameter("email");
String password = request.getParameter("password");
String check = request.getParameter("check");

try {
    if (check != null && check.equals("on")) {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql:///ebook-app?useSSL=false", "root", "root");

        Statement sc = con.createStatement();
        sc.executeUpdate("insert into user(name, phno, email, password) values('" + name + "','" + phno + "','" + email + "','" + password + "')");

        out.println("Data Inserted..");
        con.close();
    } else {
      
%>
        <script>
            alert("Please agree to terms and conditions");
             window.location.href = "register.jsp";
        </script>
<%
    }
} catch (Exception e) {
    out.println(e);
}
%>
