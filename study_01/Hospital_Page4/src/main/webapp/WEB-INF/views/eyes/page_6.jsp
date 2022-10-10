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
	<!-- 눈이 침침하고 시력이 떨어진것 같다 > 16세 이상 > 눈이 찔리거나 다쳤나요 (예,아니오) > 당뇨병,눈건조,눈툭튀,충혈,해당없음 중 무엇을 선택해도 이 페이지 나옴 -->
	<h1>보기에서 해당되는 증상을 모두 선택하세요.</h1>
	<h1>중복 선택 가능</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="../eyes/page_7.do" method="get">
				<input type="radio" name="symptom" value="1" id="1"/> <label for="1">평소보다 눈물이 많이 난다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">눈에 뭐가 들어간 느낌이다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="3"/> <label for="3">눈곱이 낀다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="4"/> <label for="4">눈이 간지럽다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="5"/> <label for="5">해당없음.</label> <hr>
				
				<a href="page_3.do"><input type="submit" value="다음으로" class="submit-btn"></a><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
</html>