<%@page import="com.it.dto.HrdVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.dao.HrdDAO"/>
<%
	List<HrdVO> list = dao.getList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
<link rel="stylesheet" href="../css/styles.css">
</head>
<body>
<%@include file="../pages/header.jsp" %>
	<section>
		<h3>회원목록조회/수정</h3>
		<table class="center big">
			<tr>
				<th>회원번호</th>
				<th>회원성명</th>
				<th>전화번호</th>
				<th>주소</th>
				<th>가입일자</th>
				<th>고객등급</th>
				<th>거주지역</th>
			</tr>
		<%
			for (HrdVO vo : list) {
		%>
			<tr>
				<td><a href="update.jsp?custno=<%=vo.getCustno() %>"><%=vo.getCustno() %></a></td>
				<td><%=vo.getCustname() %></td>
				<td><%=vo.getPhone() %></td>
				<td><%=vo.getAddress() %></td>
				<td><%=vo.getJoindate() %></td>
				<td><%=vo.getGrade() %></td>
				<td><%=vo.getCity() %></td>
			</tr>
		<%
				}
		%>
		</table>
	</section>
<%@include file="../pages/footer.jsp" %>
</body>
</html>