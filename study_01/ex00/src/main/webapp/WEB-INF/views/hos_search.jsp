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
		<a href="#"><b>지역명으로 찾기</b></a>
		<a href="#" id="hos_name_search">병원명으로 찾기</a>
	</div>
	<div class="search-body">
		<div class="search-form">
			<form action="#">
				<p>도시를 입력하세요</p>
				<input type="text" name="city1" class="text-field"><br>
				<p>시군도를 입력하세요</p>
				<input type="text" name="city2" class="text-field"><br> 
				<p>동읍면을 입력하세요</p>
				<input type="text" name="city3" class="text-field"><br> 
				<p>진료과목을 선택하세요</p>
				<input type="text" name="sub" class="text-field"><br> 
				<input type="submit" value="병원찾기" class="submit-btn"><br>
			</form>
		</div>
	</div>
		<!-- Footer-->
	<footer class="footer bg-light">
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
<script type="text/javascript">
$("#hos_name_search").on("click",function(){
	self.location = "/hos_name_search";
});
$("#hos_search").on("click",function(){
	self.location = "/hos_search";
});
</script>
</html>