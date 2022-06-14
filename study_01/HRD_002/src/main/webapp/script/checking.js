function joinCheck() {
	if (document.frm.custno.value == "") {
		alert("회원 번호를 입력해주세요.");
		frm.custno.focus();
		return false;
	}
	if (document.frm.custname.value == "") {
		alert("회원 이름을 입력해주세요.");
		frm.custname.focus();
		return false;
	}
	if (document.frm.phone.value == "") {
		alert("회원 전화를 입력해주세요.");
		frm.phone.focus();
		return false;
	}
	if (document.frm.address.value == "") {
		alert("회원 주소를 입력해주세요.");
		frm.address.focus();
		return false;
	}
	if (document.frm.joindate.value == "") {
		alert("가입 일자를 입력해주세요.");
		frm.joindate.focus();
		return false;
	}
	if (document.frm.grade.value == "") {
		alert("고객 등급을 입력해주세요.");
		frm.grade.focus();
		return false;
	}
	if (document.frm.city.value == "") {
		alert("도시 코드를 입력해주세요.");
		frm.city.focus();
		return false;
	}
	return true;
}