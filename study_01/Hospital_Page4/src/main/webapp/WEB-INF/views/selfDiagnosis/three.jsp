<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>자가진단</title>
<meta charset="utf-8">
<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="../../resources/css/styles.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css"
	rel="stylesheet">
	<link href="../../resources/css/hospitalStyles.css" rel="stylesheet" />
</head>
<body>
<%@include file ="../includes/header.jsp" %>
	<h1>기절이나 기억상실 등의 증세가 얼마나 지속되었습니까?</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="three_1.do" method="get">
				<input type="radio" name="symptom" value="1" id="1"/> <label for="1">24시간 이내에 회복되었다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">24시간 이상 증상이 있었다.</label> <hr>
				<input type="submit" value="다음으로" class="submit-btn"><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
</html>