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
	<h1>가장 문제가 되는 상태를 선택하세요</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="../eyes/page_2.do" method="get">
				<input type="radio" name="radio" value="1" id="1"/> <label for="1">눈이 침침하고 시력이 떨어진 것 같다.</label> <hr>
				<input type="radio" name="radio" value="2" id="2"/> <label for="2">시야에 문제가 생겼다.</label> <hr>
				<input type="radio" name="radio" value="3" id="3"/> <label for="3">눈이 시리다.</label> <hr>
				<input type="radio" name="radio" value="4" id="4"/> <label for="4">눈이 부시다.</label> <hr>
				<input type="radio" name="radio" value="5" id="5"/> <label for="5">눈의 색이 변했다.</label> <hr>
				<input type="radio" name="radio" value="6" id="6"/> <label for="5">눈이 아프다.</label> <hr>
				<input type="radio" name="radio" value="5" id="5"/> <label for="5">눈다래끼인 것 같다.</label> <hr>
				<a href="page_2.do"><input type="submit" value="다음으로" class="submit-btn"></a><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
<script>




	</script>
</html>
