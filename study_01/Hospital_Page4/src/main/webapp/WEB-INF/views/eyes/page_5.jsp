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
	<!-- 눈이 침침하고 시력이 떨어진것 같다 > 16세 이상 > 눈이 찔리거나 다쳤나요 (예,아니오) -->
	<h1>보기에서 해당되는 증상을 모두 선택하세요.</h1>
	<h1>중복 선택 가능</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="../eyes/page_6.do" method="get">
				<input type="radio" name="symptom" value="1" id="1"/> <label for="1">당뇨병이 있다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">눈이 건조하다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">눈이 좀 튀어나온 것 같다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">눈에 흰부분이 빨갛게 충혈됐다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">해당없음.</label> <hr>
				
				<a href="page_3.do"><input type="submit" value="다음으로" class="submit-btn"></a><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
</html>