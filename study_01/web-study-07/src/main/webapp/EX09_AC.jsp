<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${param.id }님
	<c:if test="${param.how eq 'user' }">
		사용자로 로그인하셨습니다.
	</c:if>
	<c:if test="${param.how eq 'manager' }">
		관리자로 로그인하셨습니다.
	</c:if>
</body>
</html>