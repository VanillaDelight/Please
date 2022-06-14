<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.dao.EzenDAO"/>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="vo" class="com.it.dto.EzenVO">
	<jsp:setProperty property="*" name="vo"/>
</jsp:useBean>

<%
	boolean chk = dao.ezenBoardUpdate(vo);

	if (chk == true) {
%>
	<script>
		alert("수정되었습니다.");
	</script>
<%
	response.sendRedirect("detail.jsp?no=" + vo.getNo());
	} else {
%>
	<script>
		alert("비밀번호가 틀립니다.");
		history.back();
	</script>
<%
	}
%>