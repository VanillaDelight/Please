<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>자가예상진단(귀)</title>
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
			<form action="fourth.do" method="get">
				<input type="radio" name="symptom" value="1" id="1"/> <label for="1">귀에서 분비물(고름)이 나온다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">귀가 가렵다.</label> <hr>
				<input type="radio" name="symptom" value="3" id="3"/> <label for="3">소리가 잘 안들린다.</label> <hr>
				<input type="radio" name="symptom" value="4" id="4"/> <label for="4">남들은 듣지 못하는 사람 목소리가 아닌 소리가 들린다(이명).</label> <hr>
				<input type="radio" name="symptom" value="5" id="5"/> <label for="5">귓속이 무겁거나 가득 찬 느낌이 든다.</label> <hr>
				<input type="radio" name="symptom" value="6" id="6"/> <label for="6">피부에 문제가 있다.</label> <hr>
				<input type="submit" value="다음으로" class="submit-btn"><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
</html>