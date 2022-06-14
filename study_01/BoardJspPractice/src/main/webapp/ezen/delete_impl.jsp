<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.dao.EzenDAO"/>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	String pwd = request.getParameter("pwd");
	
	boolean chk = dao.deleteEzen(no, pwd);
	
	if (chk == true) {
%>
	<script>
		alert("삭제되었습니다.")
	</script>
<%
	response.sendRedirect("list.jsp");
	} else {
%>
	<script>
		alert("비밀번호가 틀립니다.")
		history.back();
	</script>
<%
	}
%>