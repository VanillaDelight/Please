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
			<form action="eight.do" method="get">
				<input type="radio" name="symptom" value="1" id="1"/> <label for="1">목이 불편해서 음식이나 침을 삼키기가 힘들다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">목에 뭐가 있는 것 같은 느낌이다.</label> <hr>
				<input type="radio" name="symptom" value="3" id="3"/> <label for="3">가슴이 답답하고 숨쉬기 힘들다.</label> <hr>
				<input type="radio" name="symptom" value="4" id="4"/> <label for="4">턱을 움직일 수 없다.</label> <hr>
				<input type="radio" name="symptom" value="5" id="5"/> <label for="5">입을 여닫을 수 없다.</label> <hr>
				<input type="radio" name="symptom" value="6" id="6"/> <label for="6">얼굴색이 붉다.</label> <hr>
				<input type="radio" name="symptom" value="7" id="7"/> <label for="7">해당사항 없음.</label> <hr>
				<input type="submit" value="다음으로" class="submit-btn"><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
</html>