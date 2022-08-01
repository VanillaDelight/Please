<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../../resources/css/travelStyle.css">
</head>
<body>
	<nav class="navbar navbar-light bg-light static-top">
		<div class="container nava">
			<a class="navbar-brand" href="#!">All in one Care</a>
			<ul id="menu">
				<li><a href="#" id="login">로그인</a></li>
				<li><a href="#">로그아웃</a></li>
				<li><a href="#">회원가입</a></li>
			</ul>
		</div>

	</nav>

	<div class="nava">
		<ul id="menu">
			<li><a href="#">예약</a></li>
			<li><a href="#">자가예상진단</a></li>
			<li><a href="#" id=hos_search>병원 찾기</a></li>
			<li><a href="#">약국 찾기</a></li>
			<li><a href="#">고객센터</a></li>
			<li><a href="#">마이페이지</a></li>
		</ul>
	</div>
	<br>
	<br>
	<h1>병원 찾기</h1>
		<div id="manu">
		<a href="#" id="hos_search">지역명으로 찾기</a>
		<a href="#" id="hos_name_search"><b>병원명으로 찾기</b></a>
	</div>
	<div class="search-body">
		<div class="search-form">
			<form action="#">
				<p>병원명을 입력하세요</p>
				<input type="text" name="hos_name" class="text-field"><br>
				<input type="submit" value="병원찾기" class="submit-btn"><br>
			</form>
		</div>
	</div>
</body>
<script>
$("#hos_name_search").on("click",function(){
	self.location = "/hos_name_search";
});
$("#hos_search").on("click",function(){
	self.location = "/hos_search";
});
</script>
</html>