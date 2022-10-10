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
	<!-- 눈이 침침하고 시력이 떨어진것 같다 > 16세 이상 > 눈이 찔리거나 다쳤나요 (예,아니오) > 당뇨병,눈건조,눈툭튀,충혈,해당없음 모든선택지 > page_6의 모든선택지 -->
	<h1>보기에서 해당되는 증상을 모두 선택하세요.</h1>
	<h1>중복 선택 가능</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="../eyes/page_8.do" method="get">
				<input type="radio" name="symptom" value="1" id="1"/> <label for="1">눈이 침침하고 사물이 잘 안보인다.</label> <hr>
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">눈이 시리고 부시다.</label> <hr>
				<input type="radio" name="symptom" value="3" id="3"/> <label for="3">사물이 둘로 보인다.</label> <hr>
				<input type="radio" name="symptom" value="4" id="4"/> <label for="4">눈 앞에 먼지 같은 것이 보이거나 검은 커튼이 쳐진 것 같다.</label> <hr>
				<input type="radio" name="symptom" value="5" id="5"/> <label for="5">눈 앞에 반짝거리는 것이 보이거나 눈을 감아도 빛이 아른거린다.</label> <hr>
				<input type="radio" name="symptom" value="6" id="6"/> <label for="6">시야 중심부에 까만 점이 보이면서 보이지 않는 부위가 생겼다.</label> <hr>
				<input type="radio" name="symptom" value="7" id="7"/> <label for="6">해당없음.</label> <hr>
				
				<a href="page_3.do"><input type="submit" value="다음으로" class="submit-btn"></a><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
</html>