function enjoy() {
	if (document.frm.title.value == "") {
		alert("제목을 입력하세요");
		frm.title.focus();
		return false;
	}
	if (document.frm.writer.value == "") {
		alert("작성자를 입력하세요");
		frm.writer.focus();
		return false;
	}
	if (document.frm.content.value == "") {
		alert("내용을 입력하세요");
		frm.content.focus();
		return false;
	}
	return true;
}
function login() {
	if (document.frm.id.value == "") {
		alert("아이디를 입력하세요");
		frm.id.focus();
		return false;
	}
	if (document.frm.password.value == "") {
		alert("비밀번호를 입력하세요");
		frm.password.focus();
		return false;
	}
	return true;
}