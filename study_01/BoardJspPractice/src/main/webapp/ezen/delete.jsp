<%@page import="com.it.dto.EzenVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.dao.EzenDAO"/>
<%
	EzenVO vo = dao.getDetail(Integer.parseInt(request.getParameter("no")));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/pagination.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>글 삭제하기</h1>
		<form action="delete_impl.jsp">
			<div class="row">
				<table class="table table-active">
					<tr>
						<td class="text-right" width="40%">비밀번호 : </td>
						<td><input type="password" name="pwd" size="20">
					</tr>
				</table>
				<div class="pagi">
					<input type="submit" value="삭제" class="btn btn-sm btn-danger">
					<input type="button" value="나가기" class="btn btn-sm btn-success" onclick="javascript:history.back()">
					<input type="hidden" value="<%=vo.getNo() %>" name="no">
				</div>
			</div>
		</form>
	</div>
</body>
</html>