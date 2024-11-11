package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TAC_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html><!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Ebook Management System - Terms and Conditions</title>\n");
      out.write("  <style>\n");
      out.write("    body {\n");
      out.write("      font-family: Arial, sans-serif;\n");
      out.write("      line-height: 1.6;\n");
      out.write("      margin: 30px;\n");
      out.write("      padding: 0;\n");
      out.write("      color: #333;\n");
      out.write("    }\n");
      out.write("    h1 {\n");
      out.write("      text-align: center;\n");
      out.write("      margin-bottom: 20px;\n");
      out.write("      color: #2e86de;\n");
      out.write("    }\n");
      out.write("    .terms {\n");
      out.write("      border: 2px solid #2e86de;\n");
      out.write("      padding: 20px;\n");
      out.write("      border-radius: 10px;\n");
      out.write("      background-color: #f7f9fc;\n");
      out.write("    }\n");
      out.write("    .contact {\n");
      out.write("      text-align: center;\n");
      out.write("      margin-top: 30px;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <h1>Ebook Management System - Terms and Conditions</h1>\n");
      out.write("  <div class=\"terms\">\n");
      out.write("    <p>Please read these terms and conditions (\"Terms\", \"Terms and Conditions\") carefully before using the ebook management system (the \"Service\") operated by us.</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <h2>Accounts</h2>\n");
      out.write("    <p>When you create an account with us, you must provide accurate and complete information. You are solely responsible for maintaining the confidentiality of your account and password, and you agree to accept responsibility for all activities that occur under your account.</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <h2>Contact Us</h2>\n");
      out.write("    <p>If you have any questions about these Terms, please contact us at <a href=\"mailto:kratikanenwani@gmail.com\">kratikanenwani@gmail.com</a>.</p>\n");
      out.write("\n");
      out.write("    <p>By using our Service, you agree to these terms. Thank you for using the ebook management system!</p>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"contact\">\n");
      out.write("    <p>Need help? Contact us at <a href=\"mailto:kratikanenwani@gmail.com\">kratikanenwani@gmail.com</a></p>\n");
      out.write("  </div>\n");
      out.write("  <div>\n");
      out.write("      <a href=\"register.jsp\"> Back to Registration Form</a>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
