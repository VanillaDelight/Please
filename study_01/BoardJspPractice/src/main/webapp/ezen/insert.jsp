<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/pagination.css">
<title>새글</title>
</head>
<body>
	<div class="container">
		<h1>글쓰기</h1>
		<form action="insert_impl.jsp" method="get">
			<div class="row">
				<table class="table table-success">
					<tr>
						<td class="text-right" width="15%">작성자</td>
						<td><input type="text" name="name" width="15"></td>
					</tr>
					<tr>
						<td class="text-right" width="15%">제목</td>
						<td><input type="text" name="subject" width="35"></td>
					</tr>
					<tr>
						<td class="text-right" width="15%">내용</td>
						<td><textarea rows="10" cols="55" name="content"></textarea></td>
					</tr>
					<tr>
						<td class="text-right" width="15%">비밀번호</td>
						<td><input type="password" name="pwd" width="10"></td>
					</tr>
				</table>
				<div class="pagi">
					<input type="submit" class="btn btn-sm btn-success" value="등록">
					<input type="button" class="btn btn-sm btn-success" value="나가기" onclick="javascript:history.back()">
				</div>
			</div>
		</form>
	</div>
</body>
</html>