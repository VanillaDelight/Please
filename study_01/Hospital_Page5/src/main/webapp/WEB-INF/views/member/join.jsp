<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<head>
<title>로그인</title>
<meta charset="utf-8">
 <link href="../../resources/css/hospitalStyles.css" rel="stylesheet" />
<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="../../resources/css/styles.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="../../resources/js/joinScript.js"></script>
</head>
<body>
<%@include file ="../includes/header.jsp" %>
	<h1>Join</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="join.do" method="post" name="join">
			
				<input required type="text" name="id" id="id" class="text-field checking" placeholder="아이디를 입력해주세요" maxlength="10"><input type="hidden" id="idDoubleChk" value="false"><br>
				<p class="point">※ 영문자, 소문자 입력가능, 최소 4자~최대 10자 까지 입력</p>
				<p class="point successIdChk"></p>
				
				<input required type="password" name="pwd" id="pwd" class="text-field checking" placeholder="비밀번호를 입력해주세요"><input type="hidden" id="pwdDoubleChking" value="false"><br>
				<p class="point successPwd">※ 비밀번호는 최소 8 자, 최소 하나의 문자 및 하나의 숫자를 포함</p>
				<input required type="password" name="pwdChk" id="pwdChk" class="text-field checking" placeholder="비밀번호를 다시한번 입력해주세요"><input type="hidden" id="pwdDoubleChk" value="false"><br>
				<p class="point successPwdChk">※ 똑같이 입력해주세요</p>
				
				<input required type="text" name="name" class="text-field checking" id="name" placeholder="성함을 입력해주세요" maxlength="8" title="8자 까지 입력"><input type="hidden" id="nameDoubleChk" value="false"><br>
				<p class="point successNameChk">성함은 2자 이상 8자 이하로 설정해주시기 바랍니다.</p>
				
				<input required type="text" name="email" id="email" class="text-field checking side" placeholder="이메일을 입력해주세요">&nbsp; <input type="button" class="btn" id="emailChk" value="인증번호 받기" disabled><br>
				<p class="point">아이디 비밀번호 분실시 필요한 정보이므로, 정확하게 기입해 주십시오.</p><input type="hidden" value="false" id="emailFirstChk">
				<input required type="text" name="email2" id="email2" class="text-field checking side" disabled placeholder="인증번호를 입력해주세요">&nbsp; <input type="button" class="btn" id="emailChk2" value="이메일 인증" disabled><br>
				<p class="point successEmailChk">이메일 입력 후 인증번호 보내기를 해주십시오.</p><input type="hidden" id="emailDoubleChk" value="true">
				
				<input required type="text" name="phone" id="phone" class="text-field checking side" placeholder="전화번호를 입력해주세요">&nbsp; <input type="button" class="btn" id="phoneChk" value="인증번호 받기"><br>
				<input required type="text" name="phone2" id="phone2" class="text-field checking side" disabled placeholder="인증번호를 입력해주세요">&nbsp; <input type="button" class="btn" id="phoneChk2" value="전화번호 인증" disabled><br>
				<p class="point successPhoneChk">전화번호 입력 후 인증번호 보내기를 해주십시오.</p><input type="hidden" id="phoneDoubleChk" value="true">
				
				<input type="submit" value="회원가입" class="submit-btn" onclick="return joinChk()"><br>
			</form>
		</div>
	</div>

</body>
<script>
$("#id").blur(function(){
	var id = $("#id").val();
	if(id == "" || id.length < 4){
		$(".successIdChk").text("아이디는 4자 이상 10자 이하로 설정해주세요 :)");
		$(".successIdChk").css("color", "red");
		$("#idDoubleChk").val("false");
	}else{
		$.ajax({
			url : '${pageContext.request.contextPath}/member/idCheck.do?id='+ id,
			type : 'post',
			cache : false,
			success : function(data) {
				if (data == 0) {
					$(".successIdChk").text("사용가능한 아이디입니다.");
					$(".successIdChk").css("color", "green");
					$("#idDoubleChk").val("true");
				} else {
					$(".successIdChk").text("사용중인 아이디입니다 :p");
					$(".successIdChk").css("color", "red");
					$("#idDoubleChk").val("false");
				}
			}, error : function() {
				console.log("실패");
			}
		});
	}
});
$("#name").blur(function(){
	var name = $("#name").val();
	if(name == "" || name.length < 2){
		$(".successNameChk").text("이름은 2자 이상 8자 이하로 설정해주세요 :)");
		$(".successNameChk").css("color", "red");
		$("#nameDoubleChk").val("false");
	}else{
		$.ajax({
			url : '${pageContext.request.contextPath}/member/nameCheck.do?name='+ name,
			type : 'post',
			cache : false,
			success : function(data) {
				if (data == 0) {
					$(".successNameChk").text("사용가능한 이름입니다.");
					$(".successNameChk").css("color", "green");
					$("#nameDoubleChk").val("true");
				} else {
					$(".successNameChk").text("사용중인 이름입니다 :p");
					$(".successNameChk").css("color", "red");
					$("#nameDoubleChk").val("false");
				}
			}, error : function() {
				console.log("실패");
			}
		});
	}
});
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
//이메일 중복 확인
$("#email").blur(function(){
	var regEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/;
	var email = $("#email").val();
	if( false === regEmail.test(email) ) {
		$(".successEmailChk").text("이메일 형식에 맞게 작성해주세요 :)");
		$(".successEmailChk").css("color", "red");
		$("#emailFirstChk").val("false");
	}else{
		$.ajax({
			url : '${pageContext.request.contextPath}/member/emailCheck.do?email='+ email,
			type : 'post',
			cache : false,
			success : function(data) {
				if (data == 0) {
					$(".successEmailChk").text("사용가능한 이메일입니다.");
					$(".successEmailChk").css("color", "green");
	        		$("#emailChk").attr("disabled",false);
					$("#emailFirstChk").val("true");
				} else {
					$(".successEmailChk").text("사용중인 이메일입니다 :p");
	        		$("#emailChk").attr("disabled",true);
					$(".successEmailChk").css("color", "red");
					$("#emailFirstChk").val("false");
				}
			}, error : function() {
				console.log("실패");
			}
		});
	}
});
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
				$(".successEmailChk").text("유효한 이메일 주소를 입력해주세요.");
				$(".successEmailChk").css("color","red");
        	}else{	        		
				alert("인증번호 발송이 완료되었습니다.\n입력한 이메일에서 인증번호 확인을 해주십시오.");
        		$("#email2").attr("disabled",false);
        		$("#emailChk2").attr("disabled",false);
        		$("#emailChk2").css("display","inline-block");
        		$(".successEmailChk").text("인증번호를 입력한 뒤 이메일 인증을 눌러주십시오.");
        		$(".successEmailChk").css("color","green");
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
		//$("#sm_email").attr("disabled",true);
	}else{
		$(".successEmailChk").text("인증번호가 일치하지 않습니다. 확인해주시기 바랍니다.");
		$(".successEmailChk").css("color","red");
		$("#emailDoubleChk").val("false");
		$("#email2").attr("autofocus",true);
	}
});
//휴대폰 번호 인증
var code2 = "";
$("#phoneChk").click(function(){
	alert("인증번호 발송이 완료되었습니다.\n휴대폰에서 인증번호 확인을 해주십시오.");
	var phone = $("#phone").val();
	$.ajax({
        type:"GET",
        url:"phoneCheck.do?phone=" + phone,
        cache : false,
        success:function(data){
        	if(data == "error"){
        		alert("휴대폰 번호가 올바르지 않습니다.")
				$(".successPhoneChk").text("유효한 번호를 입력해주세요.");
				$(".successPhoneChk").css("color","red");
				$("#phone").attr("autofocus",true);
        	}else{	        		
        		$("#phone2").attr("disabled",false);
        		$("#phoneChk2").attr("disabled",false);
        		$("#phoneChk2").css("display","inline-block");
        		$(".successPhoneChk").text("인증번호를 입력한 뒤 본인인증을 눌러주십시오.");
        		$(".successPhoneChk").css("color","green");
        		$("#phone").attr("readonly",true);
        		code2 = data;
        	}
        }
    });
});
//휴대폰 인증번호 대조
$("#phoneChk2").click(function(){
	if($("#phone2").val() == code2){
		$(".successPhoneChk").text("인증번호가 일치합니다.");
		$(".successPhoneChk").css("color","green");
		$("#phoneDoubleChk").val("true");
		$("#phone2").attr("disabled",true);
	}else{
		$(".successPhoneChk").text("인증번호가 일치하지 않습니다. 확인해주시기 바랍니다.");
		$(".successPhoneChk").css("color","red");
		$("#phoneDoubleChk").val("false");
		$(this).attr("autofocus",true);
	}
});
</script>
<%@include file ="../includes/footer.jsp" %>