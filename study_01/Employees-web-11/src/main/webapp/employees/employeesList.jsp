<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<table class="list">
			<tr>
				<td colspan="5" style="border: white; text-align: right;"><a
					href="EmployeesServlet?command=employees_write_form"
					class="btn btn-success">정보 등록</a></td>
			</tr>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>권한</th>
				<th>성별</th>
				<th width="25%">전화번호</th>
			</tr>
			<c:forEach var="employee" items="${employees }">
				<tr>
					<td>${employee.id }</td>
					<td><a href="EmployeesServlet?command=employees_view&id=${employee.id }">${employee.name }</a></td>
					<td>${employee.lev }</td>
					<td>${employee.gender }</td>
					<td>${employee.phone }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>