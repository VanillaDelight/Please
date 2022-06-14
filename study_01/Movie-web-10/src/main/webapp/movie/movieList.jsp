<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/movie.css">

</head>
<body>
	<div id="wrap" align="center">
		<h1>리스트</h1>
		<table>
			<tr>
				<td colspan="5" style="border: white; text-align: right"><a
					href="insert.do">
						<button type="button" class="btn btn-info">정보 등록</button>
				</a></td>
			</tr>
		</table>
		<table>
			<tr>
				<th>제목</th>
				<th>감독</th>
				<th>배우</th>
				<th>가격</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			<c:forEach var="list" items="${movieList }">
				<tr>
					<td>${list.title }</td>
					<td>${list.director }</td>
					<td>${list.actor }</td>
					<td>${list.price }</td>
					<td><a href="update.do?code=${list.code }">정보 수정</a></td>
					<td><a href="delete.do?code=${list.code }">정보 삭제</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>