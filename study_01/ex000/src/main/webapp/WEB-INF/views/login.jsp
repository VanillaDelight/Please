<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<head>
<title>로그인</title>
<meta charset="utf-8">
<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css"
	rel="stylesheet">
</head>
<body>
	<!-- Navigation-->
	<nav class="navbar navbar-light bg-light static-top">
		<div class="container nava">
			<a class="navbar-brand" href="#!">All in one Care</a>
			<ul id="menu">
				<li><a href="#">로그인</a></li>
				<li><a href="main">로그아웃</a></li>
				<li><a href="agree">회원가입</a></li>
			</ul>
		</div>

	</nav>
	<h1>Login</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="#">
				<input type="text" name="email" class="text-field" placeholder="아이디"><br>
				<input type="password" name="password" class="text-field"
					placeholder="비밀번호"><br> 
					<input type="submit" value="로그인" class="submit-btn"><br>
			</form>

			<div class="links">
				<ul>
					<li><a href="#">아이디 찾기</a></li>
					<li>&nbsp; ｜ &nbsp;</li>
					<li><a href="#">비밀번호 찾기</a></li>
					<li>&nbsp; ｜ &nbsp;</li>
					<li><a href="agree">회원가입</a></li>
				</ul>
			</div>
		</div>
	</div>

	<!-- Footer-->
	<footer class="footer bg-light login-footer">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 h-100 text-center text-lg-start my-auto">
					<ul class="list-inline mb-2">
						<li class="list-inline-item"><a href="#!">인터넷 이용약관</a></li>
						<li class="list-inline-item">⋅</li>
						<li class="list-inline-item"><a href="#">위로가기</a></li>
					</ul>
					<p class="text-muted small mb-4 mb-lg-0">&copy; Your Website
						2022. All Rights Reserved.</p>
				</div>
				<div class="col-lg-6 h-100 text-center text-lg-end my-auto">
					<ul class="list-inline mb-0">
						<li class="list-inline-item me-4"><a href="#!"><i
								class="bi-facebook fs-3 icon"></i></a></li>
						<li class="list-inline-item me-4"><a href="#!"><i
								class="bi-twitter fs-3 icon"></i></a></li>
						<li class="list-inline-item"><a href="#!"><i
								class="bi-instagram fs-3 icon"></i></a></li>
					</ul>
				</div>
			</div>
		</div>
	</footer>
</body>

<script>

	$("#main").on("click",function() {
		self.location = "/main";
	});
	
	$("#agree").on("click",function() {
		self.location = "/agree";
	});
</script>













