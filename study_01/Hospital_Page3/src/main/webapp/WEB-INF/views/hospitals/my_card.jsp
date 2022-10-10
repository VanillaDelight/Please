<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
<head>
<!-- Navigation-->
<%@include file ="../includes/header.jsp" %>
<meta charset="EUC-KR">
<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css"
	rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

<nav class="navbar navbar-light bg-light static-top">
            <div class="container nava">
                <a class="navbar-brand" href="#!">All in one Care</a>
                <ul id="menu">
                 <!-- <li><button type="button" id="login">로그인</button></li> -->
		         <li><a href="login">로그인</a></li>
		         <li><a href="#">로그아웃</a></li>
		         <li><a href="agree">회원가입</a></li>
      			</ul>
            </div>
        </nav>
        
<h2><p style="text-align:center;">카드 관리</p></h2>
<div style="text-align:center;">

<img src="${pagaContext.request.contextPath}/resources/assets/img/카드등록.jpg" width="400px" height="300px" />
<br>

  <a href="card.do"><button type="button" class="submit-btn">+결제수단 추가</button></a>
 
  </div>
  
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
<script>






</script>