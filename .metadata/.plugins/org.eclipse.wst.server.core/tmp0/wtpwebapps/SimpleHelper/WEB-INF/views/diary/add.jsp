<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<div class="container">
    <h1>다이어리 추가</h1>
    <hr/>
    <form method="post" action="${pageContext.request.contextPath }/diary/add_ok.do">
     	<div>
     	
     	<label for="date">날짜</label>
     		<input type="date" name="date" id="date"     />
     		
     		<label for="title">제목</label>
     		<input type="text" name="title" id="title"     />
     		
     		<p>작성자 : 문현지</p>
     		
     		<label for="content">내용</label>
     		<input type="text" name="content" id="content"/>
     			</div>
     		<button type="submit">저장하기</button>
    </form>
    </div>
</body>

</html>