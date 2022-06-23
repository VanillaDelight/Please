<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<div class="wrap" align="center">
		<h1>리스트</h1>
		<table style="text-align: center;">
			<tr>
				<td colspan="5" align="right" style="border: white;"><a href="EmployServlet?command=insert_employ_form" class="btn btn-primary">정보등록</a></td>
			</tr>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>권한</th>
				<th>성별</th>
				<th>전화번호</th>
			</tr>
			<c:forEach var="employ" items="${list }">
				<tr>
					<td>${employ.id }</td>
					<td><a href="EmployServlet?command=detail&id=${employ.id}">${employ.name }</a></td>
					<td>${employ.lev }</td>
					<td>${employ.gender }</td>
					<td>${employ.phone }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>