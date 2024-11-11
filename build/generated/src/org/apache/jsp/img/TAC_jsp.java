package org.apache.jsp.img;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Ebook Management System - Terms and Conditions</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Arial', sans-serif;\n");
      out.write("            line-height: 1.6;\n");
      out.write("            margin: 20px;\n");
      out.write("            max-width: 800px;\n");
      out.write("            margin-left: auto;\n");
      out.write("            margin-right: auto;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            color: #333;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            color: #555;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        p {\n");
      out.write("            color: #666;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        pre {\n");
      out.write("            background-color: #f8f8f8;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            overflow-x: auto;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact {\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <h1>Ebook Management System</h1>\n");
      out.write("    <h2>Terms and Conditions</h2>\n");
      out.write("\n");
      out.write("    <p>Please read these terms and conditions (\"Terms\", \"Terms and Conditions\") carefully before using the ebook management system (the \"Service\") operated by us.</p>\n");
      out.write("\n");
      out.write("    <p>Your access to and use of the Service is conditioned on your acceptance of and compliance with these Terms. These Terms apply to all visitors, users, and others who access or use the Service.</p>\n");
      out.write("\n");
      out.write("    <p>By accessing or using the Service you agree to be bound by these Terms. If you disagree with any part of the terms then you may not access the Service.</p>\n");
      out.write("\n");
      out.write("    <h2>Accounts</h2>\n");
      out.write("    <p>When you create an account with us, you must provide accurate and complete information. You are solely responsible for maintaining the confidentiality of your account and password, and you agree to accept responsibility for all activities that occur under your account.</p>\n");
      out.write("\n");
      out.write("    <h2>Content</h2>\n");
      out.write("    <p>Our Service allows you to upload, link to, store, share and otherwise make available certain information, text, graphics, videos, or other material (\"Content\"). You retain ownership of any intellectual property rights that you hold in that Content. By uploading, linking to, storing, or making available any Content, you grant us a non-exclusive, worldwide, royalty-free, sublicenseable, and transferable license to use, reproduce, distribute, prepare derivative works of, display, and perform that Content in connection with the Service.</p>\n");
      out.write("\n");
      out.write("    <h2>Restrictions</h2>\n");
      out.write("    <p>You agree not to:</p>\n");
      out.write("    <ul>\n");
      out.write("        <li>Use the Service for any illegal or unauthorized purpose.</li>\n");
      out.write("        <li>Upload or share any Content that is unlawful, infringes on any third party's legal rights, or is inappropriate.</li>\n");
      out.write("        <li>Attempt to gain unauthorized access to our Service or any related systems or networks.</li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <h2>Termination</h2>\n");
      out.write("    <p>We may terminate or suspend access to our Service immediately, without prior notice or liability, for any reason whatsoever, including without limitation if you breach these Terms.</p>\n");
      out.write("\n");
      out.write("    <h2>Changes</h2>\n");
      out.write("    <p>We reserve the right, at our sole discretion, to modify or replace these Terms at any time. If a revision is material, we will try to provide at least 30 days' notice prior to any new terms taking effect. What constitutes a material change will be determined at our sole discretion.</p>\n");
      out.write("\n");
      out.write("    <h2>Contact Us</h2>\n");
      out.write("    <p>If you have any questions about these Terms, please contact us at <a href=\"mailto:kratikanenwani@gmail.com\">kratikanenwani@gmail.com</a>.</\n");
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
