<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>로그인</title>
<meta charset="utf-8">
<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="../../resources/css/findCss.css" rel="stylesheet" />
<link href="../../resources/css/styles.css" rel="stylesheet" />
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css"
	rel="stylesheet">
	<script src="../../resources/js/doubleChk.js"></script>
</head>
<body>
<%@include file ="../includes/header.jsp" %>
	<c:if test="${ userChk > 0 }">
	<h1>비밀번호 재설정</h1>
	</c:if>
	<c:if test="${ userChk <= 0 }">
	<h1>확인해주세요</h1>
	</c:if>
	<div class="login-body">
		<div class="login-form">
			<c:if test="${ userChk > 0 }">
			<form action="update_pwd.do" method="post" name="update_form">
			<input type="hidden" name="id" value="${member.id }">
			<input type="hidden" name="email" value="${member.email }">
				<p>재설정할 비밀번호를 입력해주세요.</p>
				<p class="point successPwd">※ 비밀번호는 최소 8 자, 최소 하나의 문자 및 하나의 숫자를 포함</p>
				<input type="password" name="pwd" id="pwd" class="text-field" placeholder="비밀번호"><input type="hidden" id="pwdDoubleChking" value="false"><br>
				<p>다시한번 입력해주세요.</p>
				<p class="point successPwdChk">※ 똑같이 입력해주세요</p>
				<input type="password" name="pwdChk" id="pwdChk" class="text-field" placeholder="비밀번호"><input type="hidden" id="pwdDoubleChk" value="false"><br>
				<input type="submit" value="비밀번호 변경" class="submit-btn" onclick="return pwd_chk()"><br>
			</form>
				
			</c:if>
			
			
			<c:if test="${ userChk <= 0 }">
			<form action="find_id.do" method="get" name="find_form">
				<p>일치하는 회원정보가 없습니다.</p>
				<input type="submit" value="아이디 찾기" class="submit-btn"><br>
			</form>
			</c:if>

			<div class="links">
				<ul>
					<li><a href="find_id.do">아이디 찾기</a></li>
					<li>&nbsp; ｜ &nbsp;</li>
					<li><a href="login.do">로그인 페이지로</a></li>
					<li>&nbsp; ｜ &nbsp;</li>
					<li><a href="hospitalMain.do">메인 페이지로</a></li>
				</ul>
			</div>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
<script>
$("#pwd").blur(function(){
	var pattern = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/;
	var pwd = $("#pwd").val();
	if( false === pattern.test(pwd) ) {
		$(".successPwd").text("※ 비밀번호는 최소 8 자, 최소 하나의 문자 및 하나의 숫자를 포함");
		$(".successPwd").css("color", "red");
		$("#pwdDoubleChking").val("false");
	}else{
		$(".successPwd").text("사용가능한 비밀번호입니다.");
		$(".successPwd").css("color", "green");
		$("#pwdDoubleChking").val("true");
	}
});
$("#pwdChk").blur(function(){
	if($("#pwdChk").val() == $("#pwd").val()){
		$(".successPwdChk").text("비밀번호가 일치합니다.");
		$(".successPwdChk").css("color", "green");
		$("#pwdDoubleChk").val("true");
	}else{
		$(".successPwdChk").text("비밀번호가 일치하지 않습니다.");
		$(".successPwdChk").css("color", "red");
		$("#pwdDoubleChk").val("false");
	}
});
</script>
</html>