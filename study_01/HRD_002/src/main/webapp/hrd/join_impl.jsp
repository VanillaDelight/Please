<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.dao.HrdDAO"/>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="vo" class="com.it.dto.HrdVO">
	<jsp:setProperty property="*" name="vo"/>
</jsp:useBean>
<%
	boolean chk = dao.joinmember(vo);
	if (chk == true) {
%>
<script type="text/javascript">
	alert("회원 등록이 완료되었습니다.");
	location.href="join.jsp";
</script>
<%
	} else {
%>
<script type="text/javascript">
	alert("등록실패");
	history.back();
</script>
<%
	}
%>