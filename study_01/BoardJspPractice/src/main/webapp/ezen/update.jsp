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
<title>수정하기</title>
</head>
<body>
	<div class="container">
		<h1>수정하기</h1>
		<form action="update_impl.jsp" method="get">
			<div class="row">
				<table class="table table-success">
					<tr>
						<td class="text-right" width="15%">작성자</td>
						<td><input type="text" name="name" width="15" value="<%=vo.getName() %>" readonly></td>
					</tr>
					<tr>
						<td class="text-right" width="15%">제목</td>
						<td><input type="text" name="subject" width="35" value="<%=vo.getSubject() %>"></td>
					</tr>
					<tr>
						<td class="text-right" width="15%">내용</td>
						<td><textarea rows="10" cols="55" name="content"><%=vo.getContent() %></textarea></td>
					</tr>
					<tr>
						<td class="text-right" width="15%">비밀번호</td>
						<td><input type="password" name="pwd" width="10"></td>
					</tr>
				</table>
				<div class="pagi">
					<input type="submit" class="btn btn-sm btn-success" value="수정">
					<input type="button" class="btn btn-sm btn-success" value="나가기" onclick="javascript:history.back()">
					<input type="hidden" name="no" value=<%=vo.getNo() %>>
				</div>
			</div>
		</form>
	</div>
</body>
</html>