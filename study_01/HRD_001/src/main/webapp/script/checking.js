function joinCheck() {
	if (document.join.custno.value == "") {
		alert("회원번호를 입력해 주세요.");
		join.custno.focus();
		return false;
	}
	if (document.join.custname.value == "") {
		alert("이름을 입력해 주세요.");
		join.custname.focus();
		return false;
	}
	if (document.join.phone.value == "") {
		alert("전화번호을 입력해 주세요.");
		join.phone.focus();
		return false;
	}
	if (document.join.address.value == "") {
		alert("주소를 입력해 주세요.");
		join.address.focus();
		return false;
	}
	if (document.join.joindate.value == "") {
		alert("가입일자을 입력해 주세요.");
		join.joindate.focus();
		return false;
	}
	if (document.join.grade.value == "") {
		alert("고객등급을 입력해 주세요.");
		join.grade.focus();
		return false;
	}
	if (document.join.city.value == "") {
		alert("도시코드를 입력해 주세요.");
		join.city.focus();
		return false;
	}
	return true;
}