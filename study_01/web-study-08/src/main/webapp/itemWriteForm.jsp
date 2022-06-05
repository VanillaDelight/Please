<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>정보 입력 폼</h1>
	<form action="itemWriteResult.jsp" method="post">
		<table>
			<tr>
				<td>상품명</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td>설명</td>
				<td><textarea rows="5" cols="70" name="description"></textarea>
			</tr>
		</table>
		<input type="submit" value="전송">
		<input type="reset" value="취소"><br>
		<a href="itemWrite.jsp">목록보기</a>
	</form>
</body>
</html>