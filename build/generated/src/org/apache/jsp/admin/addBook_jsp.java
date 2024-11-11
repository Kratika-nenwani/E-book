package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/admin/allCss.jsp");
    _jspx_dependants.add("/admin/navBar.jsp");
    _jspx_dependants.add("/admin/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>EBook-AddBook</title>\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" \n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" \n");
      out.write("      integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" \n");
      out.write("      crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" \n");
      out.write("integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" \n");
      out.write("crossorigin=\"anonymous\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" \n");
      out.write("integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("crossorigin=\"anonymous\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" \n");
      out.write("integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n");
      out.write("crossorigin=\"anonymous\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\"\n");
      out.write("      integrity=\"sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==\" \n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("      referrerpolicy=\"no-referrer\" />\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"allComponent/style.css\">");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #f0f5f3;\">\n");
      out.write("       ");
      out.write("<head>\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .bg-custom{\n");
      out.write("    background-color: #00838f ;\n");
      out.write("}\n");
      out.write(".navbar .nav-item:hover {\n");
      out.write("    background-color: #3e2723;\n");
      out.write("    border-radius: 20px;\n");
      out.write("} \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("<div class=\"container-fluid p-4 \">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-7\">\n");
      out.write("            <h2>    <i class=\"fa-solid fa-book-open-reader\"></i>  EBOOK   </h2>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"col-md-5\">\n");
      out.write("            <a href=\"login.jsp\" class=\"btn btn-success\"><i class=\"fa-solid fa-right-to-bracket\"></i>  Login</a>\n");
      out.write("            <a href=\"register.jsp\" class=\"btn btn-primary\"><i class=\"fa-solid fa-address-card\"></i>  Register</a>\n");
      out.write("    \n");
      out.write("            <a href=\"\" class=\"btn btn-secondary\"><i class=\"fa-solid fa-gears\"></i>  Setting</a>\n");
      out.write("            <a href=\"\" class=\"btn btn-secondary\"><i class=\"fa-regular fa-id-card\"></i>  Contact Us</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom\">\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"home.jsp\"><i class=\"fa-solid fa-house-flag\"></i>  Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("       <div class=\"container\">\n");
      out.write("           <div class=\"row\">\n");
      out.write("               <div class=\"col-md-3 offset-md-4 mt-4\">\n");
      out.write("                   <div class=\"card \" >\n");
      out.write("                       <div class=\"card-body text\">\n");
      out.write("                           \n");
      out.write("                           <form action=\"AddBook\" method=\"post\" enctype=\"multipart/form-data\" >\n");
      out.write("\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Book Name*</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"bookName\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" required=\"required\"  placeholder=\"Enter name\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Author Name*</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\"name=\"author\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" required=\"required\" placeholder=\"Enter phone number\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Price*</label>\n");
      out.write("    <input type=\"number\" class=\"form-control\" name=\"price\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" required=\"required\" placeholder=\"Enter email\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("                                                         <div class=\"form-group\">\n");
      out.write("      <label for=\"inputState\">Book Categories</label>\n");
      out.write("      <select name=\"bookcategory\" id=\"inputState\" class=\"form-control\">\n");
      out.write("        <option selected>Choose...</option>\n");
      out.write("        <option value=\"New\">New Book</option>\n");
      out.write("      </select>\n");
      out.write("    </div>\n");
      out.write("                                                         <div class=\"form-group\">\n");
      out.write("      <label for=\"inputState\">Book Status</label>\n");
      out.write("      <select id=\"inputState\" name=\"bstatus\" class=\"form-control\">\n");
      out.write("        <option selected>Choose...</option>\n");
      out.write("        <option value=\"Active\">Active</option>\n");
      out.write("        <option value=\"InActive\">InActive</option>\n");
      out.write("      </select>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleFormControlFile1\">Upload Photo</label>\n");
      out.write("    <input type=\"file\" name=\"bimg\"class=\"form-control-file\" id=\"exampleFormControlFile1\">\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("                                                              \n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">Add</button>\n");
      out.write("  \n");
      out.write("                                </div>\n");
      out.write("</form>\n");
      out.write("                       </div>\n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("               \n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("       \n");
      out.write("            ");
      out.write("<div class=\"container-fluid text-center text-white p-2 mt-2\" \n");
      out.write("    style =\"background-color:#00838f;\">\n");
      out.write("    <h4>EBook Website By Kratika...</h4>\n");
      out.write("</div>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}