<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		response.addCookie(new Cookie("id", "pinksung"));
	%>
	<h3>쿠키 생성됨</h3>
	<a href="02_getCookies.jsp">확인해보기</a>
</body>
</html>