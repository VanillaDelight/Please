<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="EX09_AC.jsp">
		<table style="text-align: center" border="1">
			<tr>
				<th><label for="userid">아이디 : </label></th>
				<td><input type="text" name="id" id="userid"></td>
			</tr>
			<tr>
				<th><label for="userpwd">암호 : </label></th>
				<td><input type="password" name="pwd" id="userpwd"></td>
			</tr>
		</table>
		<input type="radio" name="how" value="user" id="user" checked><label for="user">사용자</label>
		<input type="radio" name="how" value="manager" id="manager"><label for="manager">관리자</label><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>