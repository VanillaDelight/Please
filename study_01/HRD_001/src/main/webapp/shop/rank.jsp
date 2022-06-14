<%@page import="java.util.List"%>
<%@page import="com.it.dto.ShopVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.dao.ShopDAO"/>
<%
	List<ShopVO> list = dao.getRankingList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ranking</title>
<link rel="stylesheet" href="../css/shopStyles.css?after">
</head>
<body>
<%@ include file="../pages/header.jsp" %>
<%@ include file="../pages/nav.jsp" %>
	<section>
		<h3>회원매출조회</h3>
		<table id="center">
			<tr>
				<th>회원번호</th>
				<th>회원성명</th>
				<th>고객등급</th>
				<th>매출</th>
			</tr>
<%
				for (ShopVO vo : list) {
%>
			<tr>
				<td><%=vo.getCustno() %></td>
				<td><%=vo.getCustname() %></td>
				<td><%=vo.getGrade() %></td>
				<td><%=vo.getSum() %></td>
			</tr>
<%
				}
%>
		</table>
	</section>
<%@ include file="../pages/footer.jsp" %>
</body>
</html>