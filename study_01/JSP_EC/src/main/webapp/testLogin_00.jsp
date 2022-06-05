<%@page import="java.net.URLEncoder"%>
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
		String id = "jo";
		String pwd = "5252";
		String name = "조";
		request.setCharacterEncoding("utf-8");
		
		if (id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd"))) {
			response.sendRedirect("main_00.jsp?name=" + URLEncoder.encode(name, "utf-8"));
		} else {
			response.sendRedirect("LoginForm_00.jsp");
		}
	%>
</body>
</html>