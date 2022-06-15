function movieCheck() {
	if (document.frm.title.value.length == 0) {
		alert("영화 제목을 입력해주세요.");
		frm.title.focus();
		return false;
	}
	if (document.frm.price.value.length == 0) {
		alert("가격을 입력해주세요.");
		frm.price.focus();
		return false;
	}
	if (isNaN(document.frm.price.value)) {
		alert("가격란에는 숫자만 입력 가능합니다.");
		frm.price.focus();
		return false;
	}
	if (document.frm.director.value.length == 0) {
		alert("영화 감독을 입력해주세요.");
		frm.director.focus();
		return false;
	}
	if (document.frm.actor.value.length == 0) {
		alert("영화 배우를 입력해주세요.");
		frm.actor.focus();
		return false;
	}
	if (document.frm.synopsis.value.length == 0) {
		alert("영화 설명을 입력해주세요.");
		frm.synopsis.focus();
		return false;
	}
	if (document.frm.poster.value.length == 0) {
		alert("영화 포스터를 입력해주세요.");
		frm.poster.focus();
		return false;
	}
	return true;
}

function updateCheck() {
	if (document.frm.title.value.length == 0) {
		alert("영화 제목을 입력해주세요.");
		frm.title.focus();
		return false;
	}
	if (document.frm.price.value.length == 0) {
		alert("가격을 입력해주세요.");
		frm.price.focus();
		return false;
	}
	if (isNaN(document.frm.price.value)) {
		alert("가격란에는 숫자만 입력 가능합니다.");
		frm.price.focus();
		return false;
	}
	if (document.frm.director.value.length == 0) {
		alert("영화 감독을 입력해주세요.");
		frm.director.focus();
		return false;
	}
	if (document.frm.actor.value.length == 0) {
		alert("영화 배우를 입력해주세요.");
		frm.actor.focus();
		return false;
	}
	if (document.frm.synopsis.value.length == 0) {
		alert("영화 설명을 입력해주세요.");
		frm.synopsis.focus();
		return false;
	}
	return true;
}