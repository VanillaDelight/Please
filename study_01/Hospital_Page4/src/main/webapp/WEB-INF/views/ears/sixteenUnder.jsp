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
	<h1>만 16세 이하의 소아청소년의 경우<br> 
	소아청소년과의 전문진료가 필요합니다.<br> 
	근처에 있는 소아청소년과 병원을 찾겠습니까?</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="sixteenUnder.do" method="get">
				<input type="radio" name="symptom" value="1" id="1"/> <label for="1">예. 근처에 있는 소아청소년과 병원을 찾을래요.</label> <hr>
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">아니오. 처음으로 돌아갈래요.</label> <hr>
				<input type="submit" value="다음으로" class="submit-btn"><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
</html>