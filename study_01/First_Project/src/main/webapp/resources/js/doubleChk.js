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