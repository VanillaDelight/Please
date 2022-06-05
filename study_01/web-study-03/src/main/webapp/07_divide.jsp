<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 에러페이지 설정. --%>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
0으로 나누는것은 불능입니다.
<%-- 강제로 예외발생시킴 --%>
<%= 2/0%>
</body>
</html>