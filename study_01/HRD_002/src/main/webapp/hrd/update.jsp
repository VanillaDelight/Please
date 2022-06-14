<%@page import="com.it.dto.HrdVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.dao.HrdDAO"/>
<%
	int custno = Integer.parseInt(request.getParameter("custno"));
	HrdVO vo = dao.getDetail(custno);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
<link rel="stylesheet" href="../css/styles.css">
<script type="text/javascript" src="../script/checking.js"></script>
</head>
<body>
<%@include file="../pages/header.jsp" %>
	<section>
		<h3>홈쇼핑 회원정보 수정</h3>
		<form action="update_impl.jsp" name="frm">
			<table class="big">
				<tr>
					<th class="short">회원번호(수정불가)</th>
					<td><input type="text" name="custno" size="20" value="<%=vo.getCustno() %>" readonly></td>
				</tr>
				<tr>
					<th>회원성명</th>
					<td><input type="text" name="custname" size="20" value="<%=vo.getCustname() %>"></td>
				</tr>
				<tr>
					<th>회원전화</th>
					<td><input type="text" name="phone" size="30" value="<%=vo.getPhone() %>"></td>
				</tr>
				<tr>
					<th>회원주소</th>
					<td><input type="text" name="address" size="40" value="<%=vo.getAddress() %>"></td>
				</tr>
				<tr>
					<th>가입일자</th>
					<td><input type="text" name="joindate" size="20" value="<%=vo.getJoindate() %>"></td>
				</tr>
				<tr>
					<th>고객등급 [A:VIP,B:일반,C:직원]</th>
					<td><input type="text" name="grade" size="20" value="<%=vo.getGrade() %>"></td>
				</tr>
				<tr>
					<th>도시코드</th>
					<td><input type="text" name="city" size="20" value="<%=vo.getCity() %>"></td>
				</tr>
				<tr>
					<th colspan="2"><input type="submit" value="수정" onclick="return joinCheck()"> <input type="button" value="조회" onclick="location.href='list.jsp'"></th>
				</tr>
			</table>
		</form>
	</section>
<%@include file="../pages/footer.jsp" %>
</body>
</html>