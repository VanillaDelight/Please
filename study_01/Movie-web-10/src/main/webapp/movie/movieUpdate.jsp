<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/movie.css">
<script type="text/javascript" src="script/movie.js"></script>
</head>
<body>
	<div id="wrap" align="center">
		<h1>영화 정보 수정</h1>
		<form enctype="multipart/form-data" name="frm" method="post">
			<input type="hidden" name="code" value="${movie.code }"> <input
				type="hidden" name="pre_poster" value="${movie.poster }">
			<table>
				<tr>
					<td style="text-align: center;"><c:choose>
							<c:when test="${empty movie.poster }">
								<img alt="no" src="upload/noimage.gif">
							</c:when>
							<c:otherwise>
								<img alt="${movie.poster }"
									src="images/${movie.poster }">
							</c:otherwise>
						</c:choose></td>
					<td>
						<table>
							<tr>
								<th>제목</th>
								<td><input type="text" name="title" value="${movie.title }"></td>
							</tr>
							<tr>
								<th>가격</th>
								<td><input type="text" name="price" value="${movie.price }"></td>
							</tr>
							<tr>
								<th>감독</th>
								<td><input type="text" name="director"
									value="${movie.director }"></td>
							</tr>
							<tr>
								<th>배우</th>
								<td><input type="text" name="actor" value="${movie.actor }"></td>
							</tr>
							<tr>
								<th>설명</th>
								<td><textarea cols="80" rows="15" name="synopsis">${movie.synopsis }</textarea></td>
							</tr>
							<tr>
								<th>사진</th>
								<td><input type="file" name="poster"><br> 포스터를
									변경하고 싶을때만 선택하세요.</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<div style="margin-top: 10px;">
				<input type="submit" value="수정" onclick="return updateCheck()">
				<input type="button" value="목록"
					onclick="location.href='movieList.do'">
			</div>
		</form>
	</div>
</body>
</html>