<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/styles.css">
<script type="text/javascript" src="script/employees.js"></script>
</head>
<body>
	<div class="wrap" align="center">
			<input type="hidden" name="command" value="employees_write">
			<h1>정보 보기</h1>
			<table style="width: 800px;">
				<tr>
					<th style="width: 200px;">아이디</th>
					<td>${employees.id }</td>
				</tr>
				<tr>
					<th>이름</th>
					<td>${employees.name }</td>
				</tr>
				<tr>
					<th>권한</th>
					<td>${employees.lev }</td>
				</tr>
				<tr>
					<th>성별</th>
					<td>${employees.gender }</td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td>${employees.phone }</td>
				</tr>
				<tr>
					<th>가입일</th>
					<td>${employees.enter }</td>
				</tr>
			</table>
			<br><br> 
			<input type="button" class="btn btn-primary" value="수정" onclick="open_win('EmployeesServlet?command=pass_check_form&id=${employees.id}', 'update')"> 
			<input type="button" class="btn btn-danger" value="삭제" onclick="open_win('EmployeesServlet?command=pass_check_form&id=${employees.id}', 'delete')"> 
			<input type="button" class="btn btn-dark" value="목록" onclick="location.href='EmployeesServlet?command=employees_list'">
			<input type="button" class="btn btn-success" value="등록" onclick="location.href='EmployeesServlet?command=employees_write_form'"> 
	</div>
</body>
</html>