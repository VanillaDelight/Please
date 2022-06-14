<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>클라이언트로부터 얻어온 Cookies</h3>
	<%
		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			out.println(c.getName() + " : " + c.getValue() + "<br>");
		}
	%>
	<a href="03_removeCookies.jsp">아이디 쿠키 삭제하기</a>
	<a href="00_setIDCookie.jsp">아이디 쿠키 생성하기</a>
</body>
</html>