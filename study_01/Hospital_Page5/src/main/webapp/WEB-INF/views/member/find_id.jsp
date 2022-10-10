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
</head>
<body>
<%@ include file="../includes/find_id_modal.jsp" %>
<%@include file ="../includes/header.jsp" %>
	<h1>아이디 찾기</h1>
	<div class="login-body">
		<div class="login-form">
			<p class="labeled">이메일</p>
			<input type="text" name="email" id="email" class="text-field" placeholder="ex) E-mail@gmail.com"><br>
			<p class="labeled">전화번호</p>
			<input type="text" name="phone" id="phone" class="text-field" placeholder="ex) 01077779999"><br>
			<input type="button" value="아이디 찾기" class="submit-btn" id='find_id' onclick="findId_click()"><br>

			<div class="links">
				<ul>
					<li><a href="find_pwd.do">비밀번호 찾기</a></li>
					<li>&nbsp; ｜ &nbsp;</li>
					<li><a href="main.do">메인 페이지로</a></li>
					<li>&nbsp; ｜ &nbsp;</li>
					<li><a href="login.do">로그인 페이지로</a></li>
				</ul>
			</div>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
<script>
function findId_click(){
	var email = $("#email").val();
	var phone = $("#phone").val();
	
	$.ajax({
		url:"find_id.do?email="+email+"&phone="+phone,
		type:"POST",
		success:function(data){
			if(data == 0){
				$('#id_value').text("회원 정보를 확인해주세요!");
				$('#email').val('');
				$('#phone').val('');
			} else {
				$('#id_value').text(data);
				$('#email').val('');
				$('#phone').val('');
			}
		},
		 error:function(){
                alert("에러입니다");
            }
	});
};

const modal = document.getElementById("modal")
const btnModal = document.getElementById("find_id")

btnModal.addEventListener("click", e => {
    modal.style.display = "flex"
})

    
const closeBtn = modal.querySelector(".close-area")
closeBtn.addEventListener("click", e => {
    modal.style.display = "none"
})

modal.addEventListener("click", e => {
    const evTarget = e.target
    if(evTarget.classList.contains("modal-overlay")) {
        modal.style.display = "none"
    }
})


</script>
</html>