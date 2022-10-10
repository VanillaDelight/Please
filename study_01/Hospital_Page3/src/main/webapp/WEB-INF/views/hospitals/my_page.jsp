<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>my page</title>

<meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
 <meta name="description" content="" />
 <meta name="author" content="" />

<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"/>
 <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick-theme.css"/>

 <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" type="text/css" />
 <!-- Google fonts-->
 <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css" /> 
 
<link href="../../resources/css/hospitalStyles.css" rel="stylesheet" />
<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="../../resources/css/findCss.css" rel="stylesheet" />
<link href="../../resources/css/styles.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css" rel="stylesheet">

<script src="https://code.jquery.com/jquery-3.4.1.js"   
			integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="   
			crossorigin="anonymous">
</script>
<script src="../../resources/js/joinScript.js"></script>
<script src="../../resources/js/doubleChk.js"></script>
<script type="text/javascript" src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js">
</script>	
</head>
<body>
<!-- Navigation-->
 <%@include file ="../includes/header.jsp" %>
	<h1>My Page</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="my_page.do" method="post" name="my_page">
				<p class="labeled">아이디</p>
				<input type="text" name="id" id="id" class="text-field" value='<c:out value="${member.id }"></c:out>' readonly><br>
				<p class="labeled">성함</p>
				<input type="text" name="name" id="name" class="text-field" value='<c:out value="${member.name }"></c:out>' readonly><br>
				<p class="labeled">이메일</p>
				<input type="text" name="email" id="email" class="text-field" value='<c:out value="${member.email }"></c:out>' readonly><br>
				<p class="labeled">전화번호</p>
				<input type="text" name="phone" id="phone" class="text-field" value='<c:out value="${member.phone }"></c:out>' readonly><br>
				<p class="labeled">가입날짜</p>
				<input type="text" name="join_date_pr" id="join_date_pr" class="text-field" value='<fmt:formatDate value="${member.join_date }" pattern="yyyy-MM-dd"/>' readonly><br>
				
				<input required type="password" name="pwd" id="pwd" class="text-field checking side" placeholder="비밀번호를 입력해주세요" style="display: none;"><input type="button" class="btn" id="pwdChk" value="비밀번호 확인" style="display: none;"><input type="hidden" id="pwdDoubleChking" value="false"><br>
				<p class="point successPwd"></p>
				 <a href="#"><button type="button" class="submit-btn">내 예약 조회하기</button></a>
				 	 <a href="my_review.do"><button type="button" class="submit-btn">내가 쓴 리뷰</button></a>
				<input type="submit" value="정보 수정하기" class="submit-btn" id='update_member' onclick="return pwd_double()"><br>
			</form>
		</div>
	</div>

</body>
<script>

</script>
</html>
<%@include file ="../includes/footer.jsp" %>
