<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   .coco{
      background-color: #E2E2E2;
      text-align: center;
   }
</style>
</head>
<body>
<h1>게시판 글쓰기</h1>
<div>
	<form action="boardWrite.jsp" method="post">
		<table border=1>
			<tr>
				<th class="coco">작성자</th>
				<td><input type="text" name="name" size="20"></td>
			</tr>
			<tr>
				<th class="coco">비밀번호</th>
				<td><input type="password" name="pass" size="20">(게시물 수정 삭제시 필요합니다.)</td>
			</tr>
			<tr>
				<th class="coco">이메일</th>
				<td><input type="text" name="email" size="20"></td>
			</tr>
			<tr>
				<th class="coco">글제목</th>
				<td><input type="text" name="title" size="60"></td>
			</tr>
			<tr>
				<th class="coco">글내용</th>
				<td><textarea rows="8" cols="80" name="content"></textarea></td>
			</tr>
		</table>
		<input type="submit" value="등록"> <input type="reset" value="다시 작성">
	</form>
</div>
</body>
</html>