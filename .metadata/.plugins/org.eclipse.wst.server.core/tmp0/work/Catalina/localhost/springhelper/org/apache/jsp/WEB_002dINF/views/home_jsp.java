/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2022-03-06 07:05:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1623731321088L));
    _jspx_dependants.put("jar:file:/D:/EZEN08/aboutm/workplace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SimpleHelper_12-10%20다이어리페이지수정/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fn.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/D:/EZEN08/aboutm/workplace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SimpleHelper_12-10%20다이어리페이지수정/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/D:/EZEN08/aboutm/workplace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SimpleHelper_12-10%20다이어리페이지수정/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/views/../include/navbar.jsp", Long.valueOf(1646550301491L));
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Home</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/bootstrap.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/nanumfont.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/main.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/navbar.css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      out.write("<div class=\"navbar navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("        <!-- 로고영역-->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">메뉴열기</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <!--// 반응형메뉴버튼 -->\r\n");
      out.write("                <!-- 로고-->\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">About M.</a>\r\n");
      out.write("                <!--//로고-->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--// 로고영역 -->\r\n");
      out.write("            <!-- 메뉴 영역-->\r\n");
      out.write("            <div class=\"navbar-collapse collapse\">\r\n");
      out.write("                <!-- 메뉴항목 -->\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"#page_2\">자신소개</a></li>\r\n");
      out.write("                     <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/diary/list.do\">Diary</a></li>\r\n");
      out.write("                     <li><a href=\"#\">마치며..</a></li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>");
      out.write("<div class=\"container\">\n");
      out.write("        <div class=\"page_1\" id=\"page_1\">\n");
      out.write("        <div class=\"main_introduce\">\n");
      out.write("             <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/beans.png\" class=\"main_beans\">\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/jack.png\" class=\"main_img\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <h2>All about her.</h2>\n");
      out.write("            <p class=\"main_sub\">\n");
      out.write("                기존의 웹 표준 기술 위에 새로워진 HTML5와 CSS3 요소를 더하여 인터렉티브 한 반응형 웹페이지 기술을 제작할 수 있는 웹 퍼블리싱 기법들을 소개하고, CSS3의 코드를 편리하게 작성할 수 있도록 도와주는 LESS를 기반으로 한\n");
      out.write("            </p>\n");
      out.write("\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/beans2.png\" class=\"main_beans2\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"page_2\" id=\"page_2\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-1\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <h2>나는 누구인가?</h2>\n");
      out.write("                <p>\n");
      out.write("                    이름: 문현지 <br>\n");
      out.write("                    주소: 서울 강남구 역삼동 (본가 : 전라남도 광주)<br>\n");
      out.write("                    메일: mhg0904@naver.com<br>\n");
      out.write("                    연락처 : 010-8519-9617<br>\n");
      out.write("                    TMI : 현재 역삼동에서 자취, 곱창전골을 좋아함, 영화오타쿠\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-1\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-5\">\n");
      out.write("                <h2>하고싶은 말</h2>\n");
      out.write("                <p>\n");
      out.write("\t\t\t\t\t저는 만들고, 그리는 것을 좋아했던 아이였습니다.\n");
      out.write("고등학생때는 그림부에 들어가서 방과후에 그림을 그렸습니다.   내가 원하는 걸 만들 때의 성취감과 자극이 너무나도 행복했었고 그때의 경험을 살려서 코딩하며 원하는 프로그램을 만들고 개발하고 배포하는 기쁨에 빠지고싶습니다.\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-1\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"page_3\" id=\"page_3\">\n");
      out.write("       <div class=\"page3_introduce\">\n");
      out.write("            <img src=\"assets/img/mind.jpg\" class=\"main_img img-rounded\">\n");
      out.write("            <h4 style=\"margin-left: 150px;\">혹시 \"---\" 아세요?</h4>\n");
      out.write("            <p class=\"main_sub\">\n");
      out.write("              \n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"page_4\" id=\"page_4\">\n");
      out.write("      <h4 align=\"center\">무슨내용을 넣을까.</h4>\n");
      out.write("        <p>\n");
      out.write("          \n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"page_5\" id=\"page_5\">\n");
      out.write("      <h4 style=\"margin-left: 150px;\">이제는 개발자가 되고싶습니다.</h4>\n");
      out.write("       <p>\n");
      out.write("            5페이지입니다\n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("\t<ul>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/diary/list.do\">\n");
      out.write("\t\t\t\t다이어리에게</a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t</li>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/handlebars-v4.0.11.js\"></script>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
