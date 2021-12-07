<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Hello JSP</title>
</head>
<body>
    <h1>교수관리</h1>
    <a href="${pageContext.request.contextPath}/diary/add.do">[일기적기추가]</a>

    <!-- 검색폼 -->
    <form method="get" action="${pageContext.request.contextPath}/diary/list.do">
        <label for="keyword">검색어: </label>
        <input type="search" name="keyword" id="keyword" placeholder="이름 검색" value="${keyword}" />
        <button type="submit">검색</button>
    </form>

    <hr />

    <!-- 조회 결과 목록 -->
    <table border="1">
        <thead>
            <tr>
                <th width="80" align="center">글번호</th>
                <th width="100" align="center">글제목</th>
                <th width="100" align="center">작성날짜</th>
                <th width="80" align="center">작성자</th>
                <th width="50" align="center">글내용</th>
               
            </tr>
        </thead>
        <tbody>
            <c:choose>
                <%-- 조회결과가 없는 경우 --%>
                <c:when test="${output == null || fn:length(output) == 0}">
                    <tr>
                        <td colspan="9" align="center">조회결과가 없습니다.</td>
                    </tr>
                </c:when>
                <%-- 조회결과가 있는  경우 --%>
                <c:otherwise>
                    <%-- 조회 결과에 따른 반복 처리 --%>
                    <c:forEach var="item" items="${output}" varStatus="status">
                        <%-- 출력을 위해 준비한 교수이름 변수 --%>
                        <c:set var="name" value="${item.title}" />
                        
                        <%-- 검색어가 있다면? --%>
                        <c:if test="${keyword != ''}">
                            <%-- 검색어에 <mark> 태그를 적용하여 형광팬 효과 준비 --%>
                            <c:set var="mark" value="<mark>${keyword}</mark>" />
                            <%-- 출력을 위해 준비한 교수이름에서 검색어와 일치하는 단어를 형광팬 효과로 변경 --%>
                            <c:set var="name" value="${fn:replace(name, keyword, mark)}" />
                        </c:if>
                        
                        <%-- 상세페이지로 이동하기 위한 URL --%>
                        <c:url value="/diary/view.do" var="viewUrl">
                            <c:param name="id" value="${item.id}" />
                        </c:url>
                        
                        <tr>
                            <td align="center">${item.id}</td>
                            <td align="center">${itme.title}</td>
                            <td align="center">${item.date}</td>
                            <td align="center">${item.writer}</td>
                            <td align="center">${item.content}</td>
                           
                        </tr>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
        </tbody>
    </table>
    
    <!-- 페이지 번호 구현 -->

</body>
</html>