<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!doctype html>
<html>
<head>
	<meta charset="utf-8" />
	<title>My JSP Page</title>
	</head>
<body>
	<h1>${subject }</h1>
	
	<h2>원본 이미지</h2>
	<img src="${item.fileUrl }" width="240"/>
	
	<ul>
		<li>fieldName: ${item.fieldName }</li>
		<li>originName: ${item.originName }</li>
		<li>contentType: ${item.contentType }</li>
		<li>fileSize: ${item.fileSize }</li>
		<li>filePath: ${item.filePath }</li>
	</ul>
</body>
</html>


