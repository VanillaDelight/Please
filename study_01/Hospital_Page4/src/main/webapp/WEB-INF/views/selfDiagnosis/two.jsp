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
	<h1>보기에서 해당되는 증상을 선택하세요(다중 선택 가능).</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="three.do" method="get">
				<input type="radio" name="symptom" value="1" id="1"/> <label for="1">어지럽다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">머리가 아프다.</label> <hr>
				<input type="radio" name="symptom" value="3" id="3"/> <label for="3">열이 나는 것 같다.</label> <hr>
				<input type="radio" name="symptom" value="4" id="4"/> <label for="4">머리가 가렵다.</label> <hr>
				<input type="radio" name="symptom" value="5" id="5"/> <label for="5">기절을 하거나 기억상실을 경험했다.</label> <hr>
				<input type="radio" name="symptom" value="6" id="6"/> <label for="6">피부에 문제가 있다.</label> <hr>
				<input type="submit" value="다음으로" class="submit-btn"><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
</html>