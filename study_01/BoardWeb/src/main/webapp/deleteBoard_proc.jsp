<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int seq = Integer.parseInt(request.getParameter("seq"));

	BoardVO vo = new BoardVO();
	vo.setSeq(seq);
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.deleteBoard(vo);
	
	response.sendRedirect("getBoardList.jsp");
			
%>