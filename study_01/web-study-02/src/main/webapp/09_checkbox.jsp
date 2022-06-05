<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>악세사리</h2>
	관심항목을 선택하세요.<hr>
	<form method="get" action="CheckboxServlet">
		<input type="checkbox" name="item" value="신발" id="신발"><label for="신발">신발</label>
		<input type="checkbox" name="item" value="가방" id="가방"><label for="가방">가방</label>
		<input type="checkbox" name="item" value="벨트" id="벨트"><label for="벨트">벨트</label><br>
		<input type="checkbox" name="item" value="모자" id="모자"><label for="모자">모자</label>
		<input type="checkbox" name="item" value="시계" id="시계"><label for="시계">시계</label>
		<input type="checkbox" name="item" value="쥬얼리" id="쥬얼리"><label for="쥬얼리">쥬얼리</label><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>