<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardVO board = (BoardVO) session.getAttribute("board");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/script.js"></script>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<div class="center">
		<h1>글 상세</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="updateBoard.do" method="post" name="frm">
			<input type="hidden" name="seq" value=<%=board.getSeq() %>>
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">제목</td>
					<td align="left"><input type="text" name="title" value="<%=board.getTitle() %>"></td>
				</tr>
				<tr>
					<td bgcolor="orange">작성자</td>
					<td align="left"><%=board.getWriter() %></td>
				</tr>
				<tr>
					<td bgcolor="orange">내용</td>
					<td align="left"><textarea name="content" cols="40" rows="10"><%=board.getContent() %></textarea></td>
				</tr>
				<tr>
					<td bgcolor="orange">등록일</td>
					<td align="left"><%=board.getRegDate() %></td>
				</tr>
				<tr>
					<td bgcolor="orange">조회수</td>
					<td align="left"><%=board.getCnt() %></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="글 수정" onclick="return enjoy()">
					</td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertBoard.jsp">새글 등록</a>&nbsp;&nbsp;&nbsp;
		<a href="deleteBoard.do?seq=<%=board.getSeq()%>">글 삭제</a>&nbsp;&nbsp;&nbsp;
		<a href="getBoardList.do">글 목록</a>
	</div>
</body>
</html>