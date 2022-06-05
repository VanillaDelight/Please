package com.saeyan.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.MemberDAO;

@WebServlet("/idCheck.do")
public class idCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		MemberDAO mDAO = MemberDAO.getInstance();
		int result = mDAO.confirmID(userid); // 아이디 중복체크 (중복 : 1, 사용가능 : -1)
		
		request.setAttribute("userid", userid); // 사용자 아이디와 confirmID() 결과값을
		request.setAttribute("result", result); // idCheck.jsp 페이지에 어트리뷰트에 실어보내기
		
		RequestDispatcher dis = request.getRequestDispatcher("please/idCheck.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
