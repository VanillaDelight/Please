function employeesCheck() {
	if (document.frm.id.value.length == 0) {
		alert("아이디를 입력해주세요.");
		frm.id.focus();
		return false;
	}
	if (document.frm.pass.value.length == 0) {
		alert("비밀번호를 입력해주세요.");
		frm.pass.focus();
		return false;
	}
	if (document.frm.name.value.length == 0) {
		alert("이름을 입력해주세요.");
		frm.name.focus();
		return false;
	}
	if (document.frm.phone.value.length == 0) {
		alert("번화번호를 입력해주세요.");
		frm.phone.focus();
		return false;
	}
	return true;
}

function open_win(url, name) {
    window.open(url, name, "width=500, height=230");
}

function passCheck() {
	if (document.frm.pass.value.length == 0) {
		alert("비밀번호를 입력하세요");
		frm.pass.focus();
		return false;
	}
	return true;
}