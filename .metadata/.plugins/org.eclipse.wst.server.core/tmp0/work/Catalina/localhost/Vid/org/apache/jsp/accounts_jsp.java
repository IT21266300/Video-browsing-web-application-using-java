/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2022-11-10 10:31:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class accounts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Accounts</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./styles/style.css\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\r\n");
      out.write("  	<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  	\r\n");
      out.write("  	<nav class=\"navbar bg-light p-0 justify-content-center m-0\">\r\n");
      out.write("	  <a href=\"./index.jsp\" class=\"navbar-brand\">\r\n");
      out.write("      	<img src=\"./img/logo.jpg\" class=\"img-fluid\" style=\"width:80px;\" alt=\"...\">\r\n");
      out.write("      </a>\r\n");
      out.write("	</nav>\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"container my-5\">\r\n");
      out.write("	\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-12 col-lg-5\">\r\n");
      out.write("				<h4 style=\"color:var(--clr-1)\">Sign In</h4>\r\n");
      out.write("			  	<form action=\"login\" method=\"post\">\r\n");
      out.write("				  <div class=\"mb-3\">\r\n");
      out.write("				    <label for=\"exampleInputEmail1\" class=\"form-label\">User</label>\r\n");
      out.write("				    <input type=\"text\" name=\"username\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n");
      out.write("				  </div>\r\n");
      out.write("				  <div class=\"mb-3\">\r\n");
      out.write("				    <label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\r\n");
      out.write("				    <input type=\"text\" name=\"password\" class=\"form-control\" id=\"exampleInputPassword1\">\r\n");
      out.write("				  </div>\r\n");
      out.write("				  <div class=\"mb-3\">\r\n");
      out.write("				  	<a href=\"./forgetPassword.jsp\" class=\"btn m-0 p-0\" style=\"color:var(--clr-1);\">Forget Password..?</a>\r\n");
      out.write("				  </div>\r\n");
      out.write("				  <button type=\"submit\" class=\"btn\" style=\"background:var(--clr-1); color:var(--clr-5);\">Sign In</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"col-12 col-lg-2 text-center d-flex align-items-center justify-content-center\">\r\n");
      out.write("				<h1 style=\"color:var(--clr-1);\">OR</h1>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"col-12 col-lg-5\">\r\n");
      out.write("				<h4 style=\"color:var(--clr-1)\">Sign Up</h4>\r\n");
      out.write("			  	<form action=\"#\" method=\"post\">\r\n");
      out.write("			  	<div class=\"mb-3\">\r\n");
      out.write("				    <label for=\"formFileLg\" class=\"form-label\">Upload Profile Picture</label>\r\n");
      out.write("  					<input class=\"form-control form-control-lg\" id=\"formFileLg\" type=\"file\">\r\n");
      out.write("				  </div>\r\n");
      out.write("			  	 <div class=\"mb-3\">\r\n");
      out.write("				    <label for=\"exampleInputEmail1\" class=\"form-label\">First Name</label>\r\n");
      out.write("				    <input type=\"text\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n");
      out.write("				  </div>\r\n");
      out.write("				  <div class=\"mb-3\">\r\n");
      out.write("				    <label for=\"exampleInputEmail1\" class=\"form-label\">Last Name</label>\r\n");
      out.write("				    <input type=\"text\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n");
      out.write("				  </div>\r\n");
      out.write("				  <div class=\"mb-3\">\r\n");
      out.write("				    <label for=\"exampleInputEmail1\" class=\"form-label\">Email address</label>\r\n");
      out.write("				    <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n");
      out.write("				  </div>\r\n");
      out.write("				  <div class=\"mb-3\">\r\n");
      out.write("				    <label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\r\n");
      out.write("				    <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\">\r\n");
      out.write("				  </div>\r\n");
      out.write("				  <div class=\"mb-3\">\r\n");
      out.write("				    <label for=\"exampleInputPassword1\" class=\"form-label\">Confirm Password</label>\r\n");
      out.write("				    <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\">\r\n");
      out.write("				  </div>\r\n");
      out.write("				  <button type=\"submit\" class=\"btn\" style=\"background:var(--clr-1); color:var(--clr-5);\">Sign Up</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		</div>	\r\n");
      out.write("	</div>\r\n");
      out.write("  	\r\n");
      out.write("	\r\n");
      out.write("			\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<footer style=\"background:var(--clr-1);\" class=\"text-center py-4\">\r\n");
      out.write("		<a href=\"#\" class=\"btn text-light\">@watchita</a>\r\n");
      out.write("	</footer>\r\n");
      out.write("	\r\n");
      out.write("     <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  	<script src=\"../JS/script.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
