<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>여기맞니?</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/assets/css/nanumfont.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/assets/css/navbar.css" />
</head>
<body>
	
	<div class="container">
        <div class="page_1" id="page_1">
        <div class="main_introduce">
             <img src="assets/img/beans.png" class="main_beans">
            <img src="assets/img/jack.png" class="main_img">

            <img src="assets/img/beans2.png" class="main_beans2">

            <h2>All about her.</h2>
            <p class="main_sub">
                기존의 웹 표준 기술 위에 새로워진 HTML5와 CSS3 요소를 더하여 인터렉티브 한 반응형 웹페이지 기술을 제작할 수 있는 웹 퍼블리싱 기법들을 소개하고, CSS3의 코드를 편리하게 작성할 수 있도록 도와주는 LESS를 기반으로 한
            </p>

        </div>

    </div>
    <div class="page_2" id="page_2">
          <div class="row">
            <div class="col-md-1">
            </div>
            <div class="col-md-4">
                <h2>CSS3</h2>
                <p>
                    기존에 사용되던 CSS2와 함께 사용할 수 있는 다채로운 그래픽 효과에 대해서 소개합니다. CSS3의 그림자,그라데이션 효과는 이미지 제작 없이 상당수의 웹 페이지들을 CSS만으로 제작 가능하게 해 주었습니다. CSS3는 CSS2에 효과들이 추가되는 개념이기 때문에 웹 표준 기술(XHTML1.0+CSS2)에 대한 이해가 필요합니다.
                </p>

            </div>
            <div class="col-md-2">
            </div>
            <div class="col-md-4">
                <h2>Bootstrap3</h2>
                <p>
                    Bootstrap은 트위터에서 만든 반응형 웹 Framework로, 어려운 CSS3나 Javascript에 대한 이해가 없이도 반응형 웹을 손쉽게 만들어 줄 수 있는 도구입니다. 기본적으로 제공하는 페이지의 형태 위에 사용자가 직접 제작한 CSS를 추가하면 다채로운 반응형 웹 페이지를 제작할 수 있습니다.
                </p>

            </div>
            <div class="col-md-1">
            </div>
        </div>
    </div>
    <div class="page_3" id="page_3">
       <div class="page3_introduce">
            <img src="assets/img/mind.jpg" class="main_img img-rounded">
            <h4 style="margin-left: 150px;">혹시 "---" 아세요?</h4>
            <p class="main_sub">
               
                카페도 있어요 제가 취미로 자주한답니다
                이런 경험있는 지원자 보신적있나요?

            </p>

        </div>
    </div>
    <div class="page_4" id="page_4">
      <h4 align="center">개발자 전에는 이런일을 했습니다.</h4>
        <p>
          녹색건축인증 2018~2021
        </p>
    </div>
    <div class="page_5" id="page_5">
      <h4 style="margin-left: 150px;">이제는 개발자가 되고싶습니다.</h4>
       <p>
            5페이지입니다
        </p>
    </div>
    </div>

</body>
</html>
