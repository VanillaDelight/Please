function checkbox(){
	var cnt = 0;
	var checkedAgree = document.getElementsByName("agree");
	
	for (var i = 0; i < checkedAgree.length; i++) {

   if(!checkedAgree[i].checked) {
       alert("약관 동의를 해주세요");
       agree.focus();
       return false;
      } else {
       cnt++;
      }
   }
   if(cnt==2) {
   	agree.focus();
   	return true;
   }
   else {
   	alert("약관 동의를 해주세요.");
   	agree.focus();
   	return false;
   	}
}
