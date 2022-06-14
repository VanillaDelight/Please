<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.dao.ShopDAO"/>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="vo" class="com.it.dto.ShopVO">
	<jsp:setProperty property="*" name="vo"/>
</jsp:useBean>
<%
	boolean isGood = dao.addmember(vo);

	if (isGood == true) {
%>
<script type="text/javascript">
	alert("회원 등록이 완료되었습니다.")
	location.href="insert.jsp"
</script>
<%
	} else {
%>
<script type="text/javascript">
	alert("등록 실패.")
</script>
<%
	}
%>