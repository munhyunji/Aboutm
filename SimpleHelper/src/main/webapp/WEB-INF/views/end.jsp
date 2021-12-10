<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!doctype html>
<html>

<head>
    <meta charset="UTF-8" />
    <title>Hello JSP</title>
    <link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/assets/css/nanumfont.css" />
	
	<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/assets/css/navbar.css" />
</head>

<body>
    <%@ include file="../include/navbar.jsp"%>
    <div class="container">
       마치며 페이지입니다.
    </div>
    
</body>

</html>