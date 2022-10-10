<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>로그인</title>
<meta charset="utf-8">
 <link href="../../resources/css/hospitalStyles.css" rel="stylesheet" />
<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="../../resources/css/styles.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css" rel="stylesheet">
</head>
<body>
<%@include file ="../includes/header.jsp" %>
	<h1>Login</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="login.do" method="post">
				<input type="text" name="id" class="text-field" placeholder="아이디"><br>
				<input type="password" name="pwd" class="text-field" placeholder="비밀번호"><br>
				<input type="submit" value="로그인" class="submit-btn"><br>
			</form>

			<div class="links">
				<ul>
					<li><a href="find_id.do">아이디 찾기</a></li>
					<li>&nbsp; ｜ &nbsp;</li>
					<li><a href="find_pwd.do">비밀번호 찾기</a></li>
					<li>&nbsp; ｜ &nbsp;</li>
					<li><a href="join.do">회원가입</a></li>
				</ul>
			</div>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
</html>