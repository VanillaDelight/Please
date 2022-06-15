<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<h1>영화 정보 등록</h1>
		<form enctype="multipart/form-data" name="frm" method="post">
			<table>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title"></td>
				</tr>
				<tr>
					<th>가격</th>
					<td><input type="text" name="price"></td>
				</tr>
				<tr>
					<th>감독</th>
					<td><input type="text" name="director"></td>
				</tr>
				<tr>
					<th>배우</th>
					<td><input type="text" name="actor"></td>
				</tr>
				<tr>
					<th>설명</th>
					<td><textarea cols="80" rows="15" name="synopsis"></textarea></td>
				</tr>
				<tr>
					<th>사진</th>
					<td><input type="file" name="poster"></td>
				</tr>
			</table>
			<div style="margin-top: 10px;">
				<input type="submit" value="확인" onclick="return movieCheck()"> 
				<input type="reset" value="취소"> 
				<input type="button" value="목록" onclick="location.href='movieList.do'"> 
			</div>
		</form>
	</div>
</body>
</html>