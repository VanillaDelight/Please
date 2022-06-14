<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.dao.EzenDAO" />
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="vo" class="com.it.dto.EzenVO">
	<jsp:setProperty property="*" name="vo" />
</jsp:useBean>

<%
	dao.addBoardEzen(vo);
	response.sendRedirect("list.jsp");
%>
