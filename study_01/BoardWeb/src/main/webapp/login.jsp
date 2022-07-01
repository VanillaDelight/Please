<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/script.js"></script>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<div class="center">
		<h1>로그인</h1>
		<hr>
		<!-- <form action="login_proc.jsp" method="post"> -->
		<form action="login.do" method="post" name="frm">
			<table border="1" cellpadding="0" cellpacing="0">
				<tr>
					<td bgcolor="orange">아이디</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td bgcolor="orange">비밀번호</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="로그인" onclick="return login()"></td>
				</tr>
				
			</table>
		</form>
	</div>
</body>
</html>