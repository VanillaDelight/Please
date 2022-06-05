function check() {
	if (document.para.content.value == "") {
		alert("인사하세요.");
		document.para.content.focus();
		return false;
	} else
		return true;
}