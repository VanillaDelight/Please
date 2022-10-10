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
	> page_9의 모든 선택지 > page_10에서 해당없음 선택-->
	
	
	<h1>자가예상진단 결과를 확인하시겠습니까?</h1>

						
						
	 
	<div class="login-body">
		<div class="login-form">
			<form action="../eyes/page_12.do" method="get">
				<input type="radio" name="symptom" value="1" id="1"/> <label for="1">예.예상진단결과를 볼래요.</label> <hr><!-- 선택시 page_13로 -->
				<input type="radio" name="symptom" value="2" id="2"/> <label for="2">아니오. 처음으로 돌아갈래요.</label> <hr><!-- 선택시 page_1로 -->
				
	
				<a href="page_3.do"><input type="submit" value="다음으로" class="submit-btn"></a><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
</html>