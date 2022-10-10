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
		<!-- 눈이 침침하고 시력이 떨어진것 같다 > 16세 이상 > 눈이 찔리거나 다쳤나요 (예,아니오) > 당뇨병,눈건조,눈툭튀,충혈,해당없음 모든선택지 > page_6의 모든선택지 > page_7의 모든 선택지 > page_8의 모든선택지 
	> page_9의 모든 선택지 > page_10에서 머리가 아픔선택-->
	<h1>머리가 어떻게 아픕니까?.</h1>
	
	<div class="login-body">
		<div class="login-form">
			<form action="../eyes/page_14.do" method="get">
				<input type="radio" name="symptom" value="1" id="1"/> <label for="1">머리가 조이는 듯 하게 아프다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">쪼개질 것 처럼 아프다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="3"/> <label for="3">머리가 지끈거린다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="4"/> <label for="4">관자놀이 부근에 박동성이 느껴지는 두통이다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="5"/> <label for="5">해당없음.</label> <hr>
				
				<a href="page_3.do"><input type="submit" value="다음으로" class="submit-btn"></a><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
</html>