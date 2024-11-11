<%@ page import="java.io.*, javax.servlet.http.*, javax.servlet.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*" %>


<%
    String bookName = request.getParameter("bookName");
    String author = request.getParameter("author");
    double price = Double.parseDouble(request.getParameter("price"));
    String bookCategory = request.getParameter("bookcategory");
    String bookStatus = request.getParameter("bstatus");
    Part filePart = request.getPart("bimg");

%>
