<%@page import="java.util.List"%>
<%@page import="com.it.dto.ShopVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.dao.ShopDAO"/>
<%
	request.setCharacterEncoding("UTF-8");
	String search = request.getParameter("search");
	List<ShopVO> list = dao.getList();
	try {
		if (search.length() != 0) {
			list = dao.getsearch(search);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert</title>
<link rel="stylesheet" href="../css/shopStyles.css?after">
</head>
<body>
<%@ include file="../pages/header.jsp" %>
<%@ include file="../pages/nav.jsp" %>
	<section>
		<h3>회원목록조회/수정</h3>
		<form action="list.jsp">
			<div class="search_form">
				주소 검색 : <input type="text" name="search" size="20" value="<%=request.getParameter("search") %>"> <input type="submit" class="btn">
			</div>
		</form>
		<table id="list">
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
				for (ShopVO vo : list) {
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
<%@ include file="../pages/footer.jsp" %>
</body>
</html>