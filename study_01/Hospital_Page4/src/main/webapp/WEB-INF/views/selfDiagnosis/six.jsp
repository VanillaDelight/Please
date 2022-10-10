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
			<form action="seven.do" method="get">
				<input type="radio" name="symptom" value="1" id="1"/> <label for="1">체중이 갑자기 줄었다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">식욕이 떨어졌다.</label> <hr>
				<input type="radio" name="symptom" value="6" id="3"/> <label for="3">소화가 잘 안된다.</label> <hr>
				<input type="radio" name="symptom" value="3" id="4"/> <label for="4">턱과 귀 사이 목부분이 부어있고, 덩어리가 만져진다.</label> <hr>
				<input type="radio" name="symptom" value="4" id="5"/> <label for="5">몸이나 팔다리에 힘이 없다.</label> <hr>
				<input type="radio" name="symptom" value="5" id="6"/> <label for="6">과격한 행동을 하거나 갑자기 일어날 때 어지럽다.</label> <hr>
				<input type="radio" name="symptom" value="5" id="6"/> <label for="7">해당하지 않음.</label> <hr>
				<input type="submit" value="다음으로" class="submit-btn"><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
</html>