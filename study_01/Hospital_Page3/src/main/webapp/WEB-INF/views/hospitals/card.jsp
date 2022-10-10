<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css"
	rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

 <nav class="navbar navbar-light bg-light static-top">
            <div class="container nava">
                <a class="navbar-brand" href="#!">All in one Care</a>
                <ul id="menu">
                 <!-- <li><button type="button" id="login">로그인</button></li> -->
		         <li><a href="../member/login.do">로그인</a></li>
		         <li><a href="#">로그아웃</a></li>
		         <li><a href="../member/join.do">회원가입</a></li>
      			</ul>
            </div>
            
        </nav>
        
	<h1>카드 등록</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="NewFile.do" method="post" name="NewFile">
				<p class="labeled" align ="left">카드 번호</p>
				  <input type="card-number" class="form-control" id="exampleInputCard-number" placeholder="Card-number" maxlength="16"><br>
				<p class="labeled" align="left">유효 기간</p>
				<input type="validity" class="form-control" id="exampleInputPassword1" placeholder="MM/YY" maxlength="5"> <br>
				<p class="labeled" align ="left">카드 비밀번호</p>
				<input type="Card-password" class="form-control" id="exampleInputPassword1" placeholder="앞2자리" maxlength="2"><br>
				
				
				<a href="#"><button type="button" class="submit-btn">+카드 등록하기</button></a>
			</form>
		</div>
	</div>

 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>