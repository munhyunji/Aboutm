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
</head>

<body>
    <h1>다이어리 추가</h1>
    <form method="post" action="${pageContext.request.contextPath }/diary/add_ok.do">
     	<div>
     	
     	<label for="date">날짜</label>
     		<input type="date" name="date" id="date"     />
     		
     		<label for="title">제목</label>
     		<input type="text" name="title" id="title"     />
     		
     		
     		
     		
     		<label for="writer">글작성자</label>
     		<input type="text" name="writer" id="writer"     />
     		
     		<label for="content">내용</label>
     		<input type="text" name="content" id="content"/>
     			</div>
     		<button type="submit">저장하기</button>
    </form>
    
</body>

</html>