function doubleChk() {
    if (document.find_form.id.value.length == 0) {
		alert("아이디를 입력해주세요.");
		find_form.id.focus();
		return false;
	}
    if (document.find_form.email.value.length == 0) {
		alert("이메일을 입력해주세요.");
		find_form.email.focus();
		return false;
	}
    if (document.getElementById("emailDoubleChk").value === "false") {
        alert("※ 이메일 인증을 완료해주세요");
        find_form.email.focus();
        return false;
    }
    alert("인증이 완료되었습니다. :)");
	return true;
}
function pwd_chk() {
    if (document.update_form.pwd.value.length == 0) {
		alert("비밀번호를 입력해주세요.");
		update_form.pwd.focus();
		return false;
	}
    if (document.update_form.pwdChk.value.length == 0) {
		alert("비밀번호를 입력해주세요.");
		update_form.pwdChk.focus();
		return false;
	}
    if (document.getElementById("pwdDoubleChking").value === "false") {
	    alert("※ 비밀번호는 최소 8 자, 최소 하나의 문자 및 하나의 숫자를 포함");
	    update_form.pwd.focus();
	    return false;
    }
    if (document.getElementById("pwdDoubleChk").value === "false") {
	    alert("※ 비밀번호가 일치하지 않습니다.");
	    update_form.pwdChk.focus();
	    return false;
    }
    alert("비밀번호 재설정이 완료되었습니다. :)");
    return true;
}
function pwd_double() {
    if (document.getElementById("pwdDoubleChking").value === "false") {
	    alert("※ 비밀번호 인증을 완료해주세요.");
	    my_page.pwd.focus();
	    return false;
    }
    alert("비밀번호 인증이 완료되었습니다. :)");
	return true;	
}
function joinChk() {
	
	var id = $("#id").val();
	var phone = $("#phone").val();
	
	$.ajax({
		url:"find_pwd.do?id="+id+"&phone="+phone,
		type:"POST",
		success:function(data){
			if(data == 0){
				$('#pwd_value').text("회원 정보를 확인해주세요!");
				$('#id').val('');
				$('#phone').val('');
			} else {
				$('#pwd_value').text(data);
				$('#id').val('');
				$('#phone').val('');
			}
		},
		 error:function(){
                alert("에러입니다");
            }
	});
};

const modal = document.getElementById("modal")
const btnModal = document.getElementById("find_pwd")

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
	
    if (document.getElementById("idDoubleChk").value === "false") {
        alert("아이디를 확인해주세요.\n※ 영문자, 소문자 입력가능, 최소 4자~최대 10자 까지 입력하세요");
        join.id.focus();
        return false;
    }
    if (document.getElementById("pwdDoubleChking").value === "false") {
        alert("비밀번호를 확인해주세요.\n※ 비밀번호는 최소 8 자, 최소 하나의 문자 및 하나의 숫자를 포함");
        join.pwd.focus();
        return false;
    }
    if (document.getElementById("pwdDoubleChk").value === "false") {
        alert("비밀번호가 일치하지 않습니다.");
        join.pwdChk.focus();
        return false;
    }
    if (document.getElementById("nameDoubleChk").value === "false") {
        alert("성함은 2자 이상 8자 이하로 설정해주시기 바랍니다.");
        join.name.focus();
        return false;
    }
    if (document.getElementById("emailDoubleChk").value === "false") {
        alert("※ 이메일 인증을 완료해주세요");
        join.email.focus();
        return false;
    }
    if (document.getElementById("phoneDoubleChk").value === "false") {
        alert("※ 휴대폰 인증을 완료해주세요");
        join.phone.focus();
        return false;
    }
    alert($('#name').val() + "(" + $('#id').val() + ")" + "님 환영합니다. 가입이 완료되었습니다. :)");
	return true;
})
