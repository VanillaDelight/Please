<%@page import="com.it.dto.EzenVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.dao.EzenDAO"/>
<%
	String strpage = request.getParameter("page");
	
	if (strpage == null)
		strpage = "1";
	
	int curpage = Integer.parseInt(strpage);
	
	List<EzenVO> list = dao.ezenListData(curpage);
	int totalPage = dao.ezenTotalPage();
	
	final int BLOCK = 3;
	int startPage = ((curpage - 1) / BLOCK * BLOCK) + 1;
	int endPage = ((curpage - 1) / BLOCK * BLOCK) + BLOCK;
	
	if (endPage > totalPage)
		endPage = totalPage;
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
	<div class="contaniner">
		<h1>자유게시판</h1>
		<div class="row">
			<a href="insert.jsp" class="btn btn-sm btn-success new">새글</a>
			<table class="table table-dark table-hover fr">
				<tr>
					<td class="text-center" width="10%">번호</td>
					<td class="text-center" width="45%">제목</td>
					<td class="text-center" width="15%">글쓴이</td>
					<td class="text-center" width="20%">작성일</td>
					<td class="text-center" width="10%">조회수</td>
				</tr>
				<%
					for (EzenVO vo : list) {
				%>
				<tr>
					<td class="text-center" width="10%"><%=vo.getNo() %></td>
					<td class="text-left" width="45%"><a href="detail.jsp?no=<%=vo.getNo() %>"><%=vo.getSubject() %></a></td>
					<td class="text-center" width="15%"><%=vo.getName() %></td>
					<td class="text-center" width="20%"><%=vo.getDbday() %></td>
					<td class="text-center" width="10%"><%=vo.getHit() %></td>
				</tr>
				<%
					}
				%>
			</table>
		</div>
		<div class="row">
			<div class="pagi">
				<ul class="pagination">
				<%
					if (startPage > 1) {
				%>
					<li><a href="list.jsp?page=<%=startPage - 1 %>">&lt;</a></li>
				<%
					}
				
					for (int i = startPage; i <= endPage; i++) {
						String act = "";
						if (curpage == i) {
							act = "class=\"active\"";
						} else {
							act = "";
						}
				%>
					<li <%=act %>><a href="list.jsp?page=<%=i %>"><%=i %></a></li>
				<%
					}
					if (endPage < totalPage) {
				%>
					<li><a href="list.jsp?page=<%=startPage + BLOCK %>">&gt;</a></li>
				<%
					}
				%>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>