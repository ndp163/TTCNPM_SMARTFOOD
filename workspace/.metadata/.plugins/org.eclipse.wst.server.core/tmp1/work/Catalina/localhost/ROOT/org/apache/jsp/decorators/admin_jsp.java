/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-06-28 14:59:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.decorators;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("/common/admin/menu.jsp", Long.valueOf(1593350822090L));
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1593350822090L));
    _jspx_dependants.put("/common/admin/footer.jsp", Long.valueOf(1593350822090L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1592667289456L));
    _jspx_dependants.put("/common/admin/header.jsp", Long.valueOf(1593350822090L));
    _jspx_dependants.put("jar:file:/home/d/Desktop/web/TTCNPM_SMARTFOOD/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/smartfood-06-2020/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("jar:file:/home/d/Desktop/web/TTCNPM_SMARTFOOD/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/smartfood-06-2020/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1592667288996L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdec_005fbody_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdec_005fbody_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fdec_005fbody_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Trang quản trị</title>\n");
      out.write("    <meta name=\"description\" content=\"A high-quality &amp; free Bootstrap admin dashboard template pack that comes with lots of templates and components.\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("    <link href=\"https://use.fontawesome.com/releases/v5.0.6/css/all.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" id=\"main-stylesheet\" data-version=\"1.1.0\" href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.min.js\" integrity=\"sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/extras.1.1.0.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("    <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("    <script async defer src=\"https://buttons.github.io/buttons.js\"></script>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("</head>\n");
      out.write("<body class=\"no-skin\">\n");
      out.write("\n");
      out.write("\t<!-- header -->\n");
      out.write("    ");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<aside class=\"main-sidebar col-12 col-md-3 col-lg-2 px-0\">\n");
      out.write("<div class=\"main-navbar\">\n");
      out.write("\t<nav\n");
      out.write("\t\tclass=\"navbar align-items-stretch navbar-light bg-white flex-md-nowrap border-bottom p-0\">\n");
      out.write("\t<a class=\"navbar-brand w-100 mr-0\" href='");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("' style=\"line-height: 25px;\">\n");
      out.write("\t\t<div class=\"d-table m-auto\">\n");
      out.write("\t\t\t<img id=\"main-logo\" class=\"d-inline-block align-top mr-1\" src=\"/views/web/image/hcmut.jpg\" height=\"45\"\n");
      out.write("\t\t\t\talt=\"Shards Dashboard\">\n");
      out.write("\t\t</div>\n");
      out.write("\t</a> <a class=\"toggle-sidebar d-sm-inline d-md-none d-lg-none\"> <i\n");
      out.write("\t\tclass=\"material-icons\">&#xE5C4;</i>\n");
      out.write("\t</a> </nav>\n");
      out.write("</div>\n");
      out.write("<form action=\"#\"\n");
      out.write("\tclass=\"main-sidebar__search w-100 border-right d-sm-flex d-md-none d-lg-none\">\n");
      out.write("\t<div class=\"input-group input-group-seamless ml-3\">\n");
      out.write("\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t\t<div class=\"input-group-text\">\n");
      out.write("\t\t\t\t<i class=\"fas fa-search\"></i>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<input class=\"navbar-search form-control\" type=\"text\"\n");
      out.write("\t\t\tplaceholder=\"Search for something...\" aria-label=\"Search\">\n");
      out.write("\t</div>\n");
      out.write("</form>\n");
      out.write("<div class=\"nav-wrapper\">\n");
      out.write("\t<ul class=\"nav flex-column\">\n");
      out.write("\t\t<li class=\"nav-item\"><a class=\"nav-link active\" href='");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("'>\n");
      out.write("\t\t\t\t<i class=\"material-icons\">edit</i> <span>Blog Dashboard</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"nav-item\"><a class=\"nav-link \"\n");
      out.write("\t\t\thref=\"#\"> <i class=\"material-icons\">vertical_split</i>\n");
      out.write("\t\t\t\t<span>Blog Posts</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"nav-item\"><a class=\"nav-link \"\n");
      out.write("\t\t\thref=\"#\"> <i class=\"material-icons\">note_add</i>\n");
      out.write("\t\t\t\t<span>Add New Post</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"nav-item\"><a class=\"nav-link \"\n");
      out.write("\t\t\thref=\"#\"> <i class=\"material-icons\">view_module</i>\n");
      out.write("\t\t\t\t<span>Forms &amp; Components</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"nav-item\"><a class=\"nav-link \" href=\"#\">\n");
      out.write("\t\t\t\t<i class=\"material-icons\">table_chart</i> <span>Tables</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"nav-item\"><a class=\"nav-link \"\n");
      out.write("\t\t\thref=\"#\"> <i class=\"material-icons\">person</i>\n");
      out.write("\t\t\t\t<span>User Profile</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"nav-item\"><a class=\"nav-link \" href=\"#\">\n");
      out.write("\t\t\t\t<i class=\"material-icons\">error</i> <span>Errors</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
      out.write("</aside>");
      out.write("\n");
      out.write("    <!-- header -->\n");
      out.write("\t\n");
      out.write("\t    <main class=\"main-content col-lg-10 col-md-9 col-sm-12 p-0 offset-lg-2 offset-md-3\">\n");
      out.write("\t    \t<div class=\"main-content-container container-fluid px-4\">\n");
      out.write("\t\t\t\t<!-- header -->\n");
      out.write("\t\t    \t");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<div class=\"main-navbar sticky-top bg-white\">\n");
      out.write("   <!-- Main Navbar -->\n");
      out.write("   <nav class=\"navbar align-items-stretch navbar-light flex-md-nowrap p-0\">\n");
      out.write("      <form action=\"#\"\n");
      out.write("         class=\"main-navbar__search w-100 d-none d-md-flex d-lg-flex\">\n");
      out.write("         <div class=\"input-group input-group-seamless ml-3\">\n");
      out.write("            <div class=\"input-group-prepend\">\n");
      out.write("               <div class=\"input-group-text\">\n");
      out.write("                  <i class=\"fas fa-search\"></i>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("            <input class=\"navbar-search form-control\" type=\"text\"\n");
      out.write("               placeholder=\"Search for something...\" aria-label=\"Search\">\n");
      out.write("         </div>\n");
      out.write("      </form>\n");
      out.write("      <ul class=\"navbar-nav border-left flex-row \">\n");
      out.write("         <li class=\"nav-item border-right dropdown notifications\">\n");
      out.write("           \n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-small\"\n");
      out.write("               aria-labelledby=\"dropdownMenuLink\">\n");
      out.write("               <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                  <div class=\"notification__icon-wrapper\">\n");
      out.write("                     <div class=\"notification__icon\">\n");
      out.write("                        <i class=\"material-icons\">&#xE6E1;</i>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"notification__content\">\n");
      out.write("                     <span class=\"notification__category\">Analytics</span>\n");
      out.write("                     <p>\n");
      out.write("                        Your website’s active users count increased by <span\n");
      out.write("                           class=\"text-success text-semibold\">28%</span> in the last week.\n");
      out.write("                        Great job!\n");
      out.write("                     </p>\n");
      out.write("                  </div>\n");
      out.write("               </a>\n");
      out.write("               <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                  <div class=\"notification__icon-wrapper\">\n");
      out.write("                     <div class=\"notification__icon\">\n");
      out.write("                        <i class=\"material-icons\">&#xE8D1;</i>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"notification__content\">\n");
      out.write("                     <span class=\"notification__category\">Sales</span>\n");
      out.write("                     <p>\n");
      out.write("                        Last week your store’s sales count decreased by <span\n");
      out.write("                           class=\"text-danger text-semibold\">5.52%</span>. It could have\n");
      out.write("                        been worse!\n");
      out.write("                     </p>\n");
      out.write("                  </div>\n");
      out.write("               </a>\n");
      out.write("               <a class=\"dropdown-item notification__all text-center\" href=\"#\">\n");
      out.write("               View all Notifications </a>\n");
      out.write("            </div>\n");
      out.write("         </li>\n");
      out.write("         <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle text-nowrap px-3\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write("               aria-expanded=\"false\">\n");
      out.write("               <span class=\"d-none d-md-inline-block\">\n");
      out.write("                  <h4 style=\"color: #e47676\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${USERMODEL.fullName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("               </span>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-small\">\n");
      out.write("               <a class=\"dropdown-item\" href=\"#\"> <i\n");
      out.write("                  class=\"material-icons\">&#xE7FD;</i> Profile\n");
      out.write("               </a> <a class=\"dropdown-item\" href=#> <i\n");
      out.write("                  class=\"material-icons\">vertical_split</i> Blog Posts\n");
      out.write("               </a> <a class=\"dropdown-item\" href=\"#\"> <i\n");
      out.write("                  class=\"material-icons\">note_add</i> Add New Post\n");
      out.write("               </a>\n");
      out.write("               <div class=\"dropdown-divider\"></div>\n");
      out.write("               <a class=\"dropdown-item text-danger\" href='");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("'> <i\n");
      out.write("                  class=\"material-icons text-danger\">&#xE879;</i> Logout\n");
      out.write("               </a>\n");
      out.write("            </div>\n");
      out.write("         </li>\n");
      out.write("      </ul>\n");
      out.write("      <nav class=\"nav\"> <a href=\"#\"\n");
      out.write("         class=\"nav-link nav-link-icon toggle-sidebar d-md-inline d-lg-none text-center border-left\"\n");
      out.write("         data-toggle=\"collapse\" data-target=\".header-navbar\"\n");
      out.write("         aria-expanded=\"false\" aria-controls=\"header-navbar\"> <i\n");
      out.write("         class=\"material-icons\">&#xE5D2;</i>\n");
      out.write("         </a> \n");
      out.write("      </nav>\n");
      out.write("   </nav>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\t\t    \t<!-- header -->\t\t\t\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_dec_005fbody_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t<!-- footer -->\n");
      out.write("\t\t\t</div>\n");
      out.write("    \t</main>\n");
      out.write("\n");
      out.write("\t\t    \t");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"main-footer d-flex p-2 px-3 bg-white border-top footer\" style=\"bottom:0; padding-bottom:0px;\">\n");
      out.write("\t<span class=\"copyright ml-auto my-auto mr-2\">Copyright © 2020</span> \n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("\t\t    \t<!-- footer -->\n");
      out.write("\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js\"></script>\n");
      out.write("    <script src=\"https://unpkg.com/shards-ui@latest/dist/js/shards.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Sharrre/2.0.1/jquery.sharrre.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("    \n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_005furl_005f7(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_005furl_005f8(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_005furl_005f9(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /decorators/admin.jsp(13,33) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/template/admin/font-awesome/4.5.0/css/font-awesome.min.css");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /decorators/admin.jsp(16,75) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/template/admin/styles/shards-dashboards.1.1.0.min.css");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f2_reused = false;
    try {
      _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f2.setParent(null);
      // /decorators/admin.jsp(22,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setValue("/template/paging/jquery.twbsPagination.js");
      int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
      if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      _jspx_th_c_005furl_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f2, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f3_reused = false;
    try {
      _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f3.setParent(null);
      // /decorators/admin.jsp(26,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f3.setValue("/ckeditor/ckeditor.js");
      int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
      if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      _jspx_th_c_005furl_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f3, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f4_reused = false;
    try {
      _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f4.setParent(null);
      // /common/admin/menu.jsp(8,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f4.setValue("/admin-foods?type=list&page=1&maxPageItem=6&sortName=id&sortBy=asc");
      int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
      if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      _jspx_th_c_005furl_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f4, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f5_reused = false;
    try {
      _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f5.setParent(null);
      // /common/admin/menu.jsp(31,56) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f5.setValue("/admin-foods?type=list&page=1&maxPageItem=6&sortName=id&sortBy=asc");
      int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
      if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      _jspx_th_c_005furl_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f5, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f6_reused = false;
    try {
      _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f6.setParent(null);
      // /common/admin/header.jsp(76,58) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f6.setValue("/thoat?action=logout");
      int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
      if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      _jspx_th_c_005furl_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f6, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f6_reused);
    }
    return false;
  }

  private boolean _jspx_meth_dec_005fbody_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  dec:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_dec_005fbody_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _005fjspx_005ftagPool_005fdec_005fbody_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    boolean _jspx_th_dec_005fbody_005f0_reused = false;
    try {
      _jspx_th_dec_005fbody_005f0.setPageContext(_jspx_page_context);
      _jspx_th_dec_005fbody_005f0.setParent(null);
      int _jspx_eval_dec_005fbody_005f0 = _jspx_th_dec_005fbody_005f0.doStartTag();
      if (_jspx_th_dec_005fbody_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fdec_005fbody_005fnobody.reuse(_jspx_th_dec_005fbody_005f0);
      _jspx_th_dec_005fbody_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_dec_005fbody_005f0, _jsp_getInstanceManager(), _jspx_th_dec_005fbody_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f7(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f7_reused = false;
    try {
      _jspx_th_c_005furl_005f7.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f7.setParent(null);
      // /decorators/admin.jsp(53,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f7.setValue("/template/admin/scripts/extras.1.1.0.min.js");
      int _jspx_eval_c_005furl_005f7 = _jspx_th_c_005furl_005f7.doStartTag();
      if (_jspx_th_c_005furl_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
      _jspx_th_c_005furl_005f7_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f7, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f7_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f8(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f8_reused = false;
    try {
      _jspx_th_c_005furl_005f8.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f8.setParent(null);
      // /decorators/admin.jsp(54,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f8.setValue("/template/admin/scripts/shards-dashboards.1.1.0.min.js");
      int _jspx_eval_c_005furl_005f8 = _jspx_th_c_005furl_005f8.doStartTag();
      if (_jspx_th_c_005furl_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
      _jspx_th_c_005furl_005f8_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f8, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f8_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f9(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f9_reused = false;
    try {
      _jspx_th_c_005furl_005f9.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f9.setParent(null);
      // /decorators/admin.jsp(55,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f9.setValue("/template/admin/scripts/app/app-blog-overview.1.1.0.js");
      int _jspx_eval_c_005furl_005f9 = _jspx_th_c_005furl_005f9.doStartTag();
      if (_jspx_th_c_005furl_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
      _jspx_th_c_005furl_005f9_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f9, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f9_reused);
    }
    return false;
  }
}
