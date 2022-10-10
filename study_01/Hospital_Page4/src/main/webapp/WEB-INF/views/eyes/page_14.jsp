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
	> page_9의 모든 선택지 > page_10에서 머리가 아픔선택 > 16의 모든선택지-->
	<h1>보기에서 해당되는 증상을 모두 선택하세요.</h1>
	<h1>중복 선택 가능.</h1>
	
	<div class="login-body">
		<div class="login-form"><!-- 여기서 암거나 골라도 11로 이동 -->
			<form action="../eyes/page_3.do" method="get">
				<input type="radio" name="symptom" value="1" id="1"/> <label for="1">아픈 부위를 눌렀을 때 아프다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">머리가 한쪽만 아프다(편두통).</label> <hr>
				<input type="radio" name="symptom" value="3" id="3"/> <label for="3">진통제를 먹어도 통증이 가시지 않는다.</label> <hr>
				<input type="radio" name="symptom" value="4" id="4"/> <label for="4">토하거나 숨을 깊게 몰아쉬면 덜 아파진다.</label> <hr>
				<input type="radio" name="symptom" value="5" id="5"/> <label for="5">잠을 자다가 혹은 새벽에 두통이 더 심해진다.</label> <hr>
				<input type="radio" name="symptom" value="6" id="6"/> <label for="5">해당없음.</label> <hr>
				
				<a href="page_3.do"><input type="submit" value="다음으로" class="submit-btn"></a><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
</html>