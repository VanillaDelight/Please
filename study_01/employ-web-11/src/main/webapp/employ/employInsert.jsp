<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/styles.css">
<script type="text/javascript" src="script/employ.js"></script>
</head>
<body>
	<div class="wrap" align="center">
		<h1>정보 등록</h1>
		<form action="EmployServlet" method="post" name="frm">
			<input type="hidden" name="command" value="employ_insert">
			<table>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th>권한</th>
					<td><select name="lev">
						<option value="A">운영자</option>
						<option value="B">일반회원</option>
					</select></td>
				</tr>
				<tr>
					<th>성별</th>
					<td><select name="gender">
						<option value="1">남자</option>
						<option value="2">여자</option>
					</select></td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="text" name="phone"></td>
				</tr>
			</table>
			<br><br>
			<input type="submit" value="확인" class="btn btn-primary" onclick="return Checking()">
			<input type="reset" value="취소" class="btn btn-danger">
			<input type="button" value="목록" class="btn btn-success" onclick="location.href='EmployServlet?command=employ_list'">
		</form>
		<br><br>
	</div>
</body>
</html>