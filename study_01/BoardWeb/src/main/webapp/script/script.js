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