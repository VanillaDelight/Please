<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="param.js"></script>
</head>
<body>
	<form action="ParamServlet" method=get name="frm">
		<label for="userid">아이디 : </label>
		<input type="text" name="id" id="userid"><br>
		나 &nbsp; 이 : <input type="password" name="age"><br>
		<input type="submit" value="전송" onclick="return check()">
		&nbsp;&nbsp;<input type="reset" value="초기화">
	</form>
</body>
</html>