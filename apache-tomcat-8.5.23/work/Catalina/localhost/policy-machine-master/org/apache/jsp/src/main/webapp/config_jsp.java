/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2017-11-17 21:50:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.src.main.webapp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class config_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/theme.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/nav.css\">\n");
      out.write("<style>\n");
      out.write("    input[type=text]{\n");
      out.write("        margin-bottom: 3%;\n");
      out.write("    }\n");
      out.write("    body{\n");
      out.write("        background-color: lightgrey;\n");
      out.write("        padding-bottom: 20px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("<div class=\"header\">\n");
      out.write("    <ul>\n");
      out.write("        <li style=\"float: right; margin-right: 5px; color: white; font-size: 40px\">PolicyMachine</li>\n");
      out.write("        <li><a href=\"userguide.jsp\" class=\"\">User Guide</a></li>\n");
      out.write("        <li><a href=\"doc.jsp\" class=\"\">API Documentation</a></li>\n");
      out.write("        <li><a href=\"config.jsp\" class=\"pmactive\">Server Configuration</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("<div class=\"footer\" onclick=\"this.style.display='none'\">\n");
      out.write("    <div class=\"error\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("    <div class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${successMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"card content\" style=\"padding: 15px; text-align: center; margin-right: 25%; margin-left: 25%\">\n");
      out.write("    <h1>Policy Machine Configuration</h1>\n");
      out.write("    <div id=\"database-div\">\n");
      out.write("        <h2>Select a Database</h2>\n");
      out.write("        <button class=\"green-btn\" style=\"display: inline-block;width:45%\" onclick=\"setDb('neo4j')\">Neo4j</button>\n");
      out.write("        <button class=\"blue-btn\" style=\"display: inline-block;width:45%\" onclick=\"setDb('mysql')\">MySQL</button>\n");
      out.write("        <div id=\"neo4j\" class=\"card\" style=\"display: none; padding: 15px;\">\n");
      out.write("            <form action=\"SetConnection\" method=\"post\" style=\"text-align: left\">\n");
      out.write("                <input type=\"hidden\" name=\"database\" id=\"database\" value=\"neo4j\">\n");
      out.write("\n");
      out.write("                <label for=\"host\" style=\"font-weight: bold\">Host</label>\n");
      out.write("                <input class=\"green-txt\" type=\"text\" name=\"host\" id=\"host\" value=\"localhost\" placeholder=\"host\">\n");
      out.write("\n");
      out.write("                <label for=\"port\" style=\"font-weight: bold\">Port</label>\n");
      out.write("                <input class=\"green-txt\" type=\"text\" name=\"port\" id=\"port\" value=\"7474\" placeholder=\"port\">\n");
      out.write("\n");
      out.write("                <label for=\"username\" style=\"font-weight: bold\">Username</label>\n");
      out.write("                <input class=\"green-txt\" type=\"text\" name=\"username\" id=\"username\" value=\"neo4j\" placeholder=\"username\">\n");
      out.write("\n");
      out.write("                <label for=\"password\" style=\"font-weight: bold\">Password</label>\n");
      out.write("                <input class=\"green-txt\" type=\"text\" name=\"password\" id=\"password\" value=\"root\" placeholder=\"password\">\n");
      out.write("\n");
      out.write("                <input class=\"green-btn\" type=\"submit\" value=\"Connect\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"mysql\" class=\"card\" style=\"display: none; padding: 15px;\">\n");
      out.write("            <form action=\"SetConnection\" method=\"post\" style=\"text-align: left\">\n");
      out.write("                <input type=\"hidden\" name=\"database\" id=\"database\" value=\"mysql\">\n");
      out.write("\n");
      out.write("                <label for=\"host\" style=\"font-weight: bold\">Host</label>\n");
      out.write("                <input class=\"blue-txt\" type=\"text\" name=\"host\" id=\"host\" value=\"localhost\" placeholder=\"host\">\n");
      out.write("\n");
      out.write("                <label for=\"port\" style=\"font-weight: bold\">Port</label>\n");
      out.write("                <input class=\"blue-txt\" type=\"text\" name=\"port\" id=\"port\" value=\"3306\" placeholder=\"port\">\n");
      out.write("\n");
      out.write("                <label for=\"username\" style=\"font-weight: bold\">Username</label>\n");
      out.write("                <input class=\"blue-txt\" type=\"text\" name=\"username\" id=\"username\" value=\"root\" placeholder=\"username\">\n");
      out.write("\n");
      out.write("                <label for=\"password\" style=\"font-weight: bold\">Password</label>\n");
      out.write("                <input class=\"blue-txt\" type=\"text\" name=\"password\" id=\"password\" value=\"root\" placeholder=\"password\">\n");
      out.write("\n");
      out.write("                <label for=\"schema\" style=\"font-weight: bold\">Database</label>\n");
      out.write("                <input class=\"blue-txt\" type=\"text\" name=\"schema\" id=\"schema\" value=\"pmwsdb\" placeholder=\"schema\">\n");
      out.write("\n");
      out.write("                <input class=\"blue-btn\" type=\"submit\" value=\"Connect\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function setDb(db){\n");
      out.write("                if(db === 'neo4j'){\n");
      out.write("                    if(document.getElementById('neo4j').style.display === 'block'){\n");
      out.write("                        document.getElementById('neo4j').style.display = 'none';\n");
      out.write("                    }else {\n");
      out.write("                        document.getElementById('neo4j').style.display = 'block';\n");
      out.write("                        document.getElementById('mysql').style.display = 'none';\n");
      out.write("                    }\n");
      out.write("                }else{\n");
      out.write("                    if(document.getElementById('mysql').style.display === 'block'){\n");
      out.write("                        document.getElementById('mysql').style.display = 'none';\n");
      out.write("                    }else {\n");
      out.write("                        document.getElementById('neo4j').style.display = 'none';\n");
      out.write("                        document.getElementById('mysql').style.display = 'block';\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("        <h2>Set Configuration Dump Interval</h2>\n");
      out.write("        <p style=\"font-size: 12px; text-align: left\">\n");
      out.write("            * The Policy Machine periodically saves the current policy configuration to avoid losing data.\n");
      out.write("            This value will tell the Policy Machine how often to save the current configuration. The default is 30 seconds.\n");
      out.write("            <strong>Value must be in seconds and greater than 0.</strong>\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <form action=\"SetInterval\" method=\"post\" style=\"text-align: left\">\n");
      out.write("            <label for=\"interval\" style=\"font-weight: bold\">Interval</label>\n");
      out.write("            <input class=\"blue-txt\" type=\"text\" name=\"interval\" id=\"interval\" value=\"\">\n");
      out.write("\n");
      out.write("            <div style=\"text-align: center\">\n");
      out.write("                <input class=\"blue-btn\" type=\"submit\" value=\"Set Interval\" style=\"width: 45%;\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
