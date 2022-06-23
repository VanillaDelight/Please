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
		<form action="EmployeesServlet" name="frm" method="post">
			<input type="hidden" name="command" value="employees_update">
			<input type="hidden" name="pre_id" value=${employees.id }>
			<h1>정보 수정</h1>
			<table style="width: 800px;">
				<tr>
					<th style="width: 200px;">아이디</th>
					<td><input type="text" name="id" value="${employees.id }"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pass" value="${employees.pass }"></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" value="${employees.name }"></td>
				</tr>
				<c:choose>
					<c:when test="${employees.lev eq '운영자' }">
						<tr>
							<th>권한</th>
							<td><select name="lev">
									<option value="A" selected>운영자</option>
									<option value="B">일반회원</option>
							</select></td>
						</tr>
					</c:when>
					<c:otherwise>
						<tr>
							<th>권한</th>
							<td><select name="lev">
									<option value="A">운영자</option>
									<option value="B" selected>일반회원</option>
							</select></td>
						</tr>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${employees.gender eq '남자' }">
						<tr>
							<th>성별</th>
							<td><select name="gender">
									<option value="1" selected>남자</option>
									<option value="2">여자</option>
							</select></td>
						</tr>
					</c:when>
					<c:otherwise>
						<tr>
							<th>성별</th>
							<td><select name="gender">
									<option value="1">남자</option>
									<option value="2" selected>여자</option>
							</select></td>
						</tr>
					</c:otherwise>
				</c:choose>
				<tr>
					<th>전화번호</th>
					<td><input type="text" name="phone" value="${employees.phone }"></td>
				</tr>
			</table>
			<br><br> 
			<input type="submit" class="btn btn-primary" value="확인" onclick="return employeesCheck()"> 
			<input type="reset" class="btn btn-danger" value="취소"> 
			<input type="button" class="btn btn-dark" value="목록" onclick="location.href='EmployeesServlet?command=employees_list'">
		</form>
	</div>
</body>
</html>