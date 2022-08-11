<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>로그인</title>
<meta charset="utf-8">
<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="../../resources/css/findCss.css" rel="stylesheet" />
<link href="../../resources/css/styles.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="../../resources/js/joinScript.js"></script>
<script src="../../resources/js/doubleChk.js"></script>
</head>
<body>
<%@include file ="../includes/header.jsp" %>
	<h1>My Page</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="my_page.do" method="post" name="my_page">
				<p class="labeled">아이디</p>
				<input type="text" name="id" id="id" class="text-field" value='<c:out value="${member.id }"></c:out>' readonly><br>
				<p class="labeled">성함</p>
				<input type="text" name="name" id="name" class="text-field" value='<c:out value="${member.name }"></c:out>' readonly><br>
				<p class="labeled">이메일</p>
				<input type="text" name="email" id="email" class="text-field" value='<c:out value="${member.email }"></c:out>' readonly><br>
				<p class="labeled">전화번호</p>
				<input type="text" name="phone" id="phone" class="text-field" value='<c:out value="${member.phone }"></c:out>' readonly><br>
				<p class="labeled">가입날짜</p>
				<input type="text" name="join_date_pr" id="join_date_pr" class="text-field" value='<fmt:formatDate value="${member.join_date }" pattern="yyyy-MM-dd"/>' readonly><br>
				
				<input required type="password" name="pwd" id="pwd" class="text-field checking side" placeholder="비밀번호를 입력해주세요" style="display: none;"><input type="button" class="btn" id="pwdChk" value="비밀번호 확인" style="display: none;"><input type="hidden" id="pwdDoubleChking" value="false"><br>
				<p class="point successPwd"></p>
				<input type="submit" value="정보 수정하기" class="submit-btn" id='update_member' onclick="return pwd_double()"><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
<script>
$("#update_member").click(function(){
	if($("#pwdDoubleChking").val() == 'false') {
		$("#pwd").css("display","inline-block");
		$("#pwdChk").css("display","inline-block");
		$(".successPwd").text("비밀번호를 입력해주세요.");
		$(".successPwd").css("color", "red");
		$("#pwd").focus();
	}
});
$("#pwdChk").click(function(){
	var pwd = $("#pwd").val();
	var id = $("#id").val();
	$.ajax({
		url : '${pageContext.request.contextPath}/member/pwdCheck.do?pwd='+ pwd + '&id=' + id,
		type : 'post',
		cache : false,
		success : function(data) {
			if (data == 0) {
				$(".successPwd").text("비밀번호가 일치하지 않습니다.");
				$(".successPwd").css("color", "red");
				$("#pwdDoubleChking").val("false");
			} else {
				$(".successPwd").text("비밀번호가 일치합니다. :p");
				$(".successPwd").css("color", "green");
				$("#pwdDoubleChking").val("true");
			}
		}, error : function() {
			console.log("실패");
		}
	});
});
</script>
</html>