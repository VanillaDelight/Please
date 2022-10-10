<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h1>비밀번호 찾기</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="find_pwd.do" method="post" name="find_form">
				<p class="labeled">아이디</p>
				<input type="text" name="id" class="text-field" placeholder="ex) hong123" ><br>
				
				<p class="labeled">이메일</p>
				<input  type="text" name="email" id="email" class="text-field checking side" placeholder="ex) E-mail@gmail.com">&nbsp;  <input type="button" class="btn" id="emailChk" value="인증번호 받기"><br>
				<input  type="text" name="email2" id="email2" class="text-field checking side" disabled placeholder="인증번호를 입력해주세요">&nbsp; <input type="button" class="btn" id="emailChk2" value="이메일 인증" disabled><br>
				<p class="point successEmailChk">이메일 입력 후 인증번호 보내기를 해주십시오.</p><input type="hidden" id="emailDoubleChk" value="false">
				
				<input type="submit" value="비밀번호 찾기" class="submit-btn" onclick="return doubleChk()"><br>
			</form>

			<div class="links">
				<ul>
					<li><a href="find_id.do">아이디 찾기</a></li>
					<li>&nbsp; ｜ &nbsp;</li>
					<li><a href="login.do">로그인 페이지로</a></li>
					<li>&nbsp; ｜ &nbsp;</li>
					<li><a href="main.do">메인 페이지로</a></li>
				</ul>
			</div>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
<script>
//이메일 인증
var code = "";
$("#emailChk").click(function(){
	var email = $("#email").val();
	$.ajax({
        type:"GET",
        url:"mailCheck.do?email=" + email,
        cache : false,
        success:function(data){
        	if(data == "error"){
        		alert("이메일 주소가 올바르지 않습니다. 유효한 이메일 주소를 입력해주세요.");
				$("#email").attr("autofocus",true);
        	}else{	        		
				alert("인증번호 발송이 완료되었습니다.\n입력한 이메일에서 인증번호 확인을 해주십시오.");
        		$("#email2").attr("disabled",false);
        		$("#emailChk2").attr("disabled",false);
        		$("#emailChk2").css("display","inline-block");
        		$("#email").attr("readonly",true);
        		code = data;
        	}
        }
    });
});
//이메일 인증번호 대조
$("#emailChk2").click(function(){
	if($("#email2").val() == code){
		$(".successEmailChk").text("인증번호가 일치합니다.");
		$(".successEmailChk").css("color","green");
		$("#emailDoubleChk").val("true");
		$("#email2").attr("disabled",true);
	}else{
		$(".successEmailChk").text("인증번호가 일치하지 않습니다. 확인해주시기 바랍니다.");
		$(".successEmailChk").css("color","red");
		$("#emailDoubleChk").val("false");
		$("#email2").attr("autofocus",true);
	}
});
</script>
</html>