<%@page import="com.it.dto.EzenVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.dao.EzenDAO"/>
<%
	String no = request.getParameter("no");
	EzenVO vo = dao.getDetail(Integer.parseInt(no));
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
		<h1>상세보기</h1>
		<div class="row">
			<table class="table table-info">
				<tr>
					<td class="text-center" width="20%">번호</td>
					<td class="text-center" width="35%"><%=vo.getNo() %></td>
					<td class="text-center" width="15%">작성일</td>
					<td class="text-center" width="30%"><%=vo.getDbday() %></td>
				</tr>
				<tr>
					<td class="text-center" width="20%">작성자</td>
					<td class="text-center" width="35%"><%=vo.getName() %></td>
					<td class="text-center" width="15%">조회수</td>
					<td class="text-center" width="30%"><%=vo.getHit() %></td>
				</tr>
				<tr>
					<td class="text-center" width="20%">제목</td>
					<td width="35%"><%=vo.getSubject() %></td>
					<td class="text-center" width="15%">마지막 수정</td>
					<td class="text-center" width="30%"><%=vo.getModday() %></td>
				</tr>
				<tr>
					<td colspan="4" height="200"><pre><b><%=vo.getContent() %></b></pre></td>
				</tr>
			</table>
			<div class="right">
				<a href="update.jsp?no=<%=vo.getNo() %>" class="btn btn-xs btn-danger">수정</a>
				<a href="delete.jsp?no=<%=vo.getNo() %>" class="btn btn-xs btn-success">삭제</a>
				<a href="list.jsp" class="btn btn-xs btn-info">목록</a>
			</div>
		</div>
	</div>
</body>
</html>