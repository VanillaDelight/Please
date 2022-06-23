function Checking() {
	if (document.frm.id.value.length == 0) {
		alert("아이디");
		frm.id.focus();
		return false;
	}
	if (document.frm.pass.value.length == 0) {
		alert("비번");
		frm.pass.focus();
		return false;
	}
	if (document.frm.name.value.length == 0) {
		alert("이름");
		frm.name.focus();
		return false;
	}
	if (document.frm.phone.value.length == 0) {
		alert("전번");
		frm.phone.focus();
		return false;
	}
	return true;
}