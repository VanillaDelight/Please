package com.saeyan.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saeyan.dao.MemberDAO;
import com.saeyan.dto.MemberVO;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "please/login.jsp";
		HttpSession session = request.getSession();
		if (session.getAttribute("loginUser") != null) {
			url = "main.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "please/login.jsp";
		
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.userCheck(userid, pwd);
		
		if (result == 1) { //성공~
			MemberVO mVO = mDao.getMember(userid);
			// session에 유지시키기
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mVO);
			request.setAttribute("message", "로그인 성공!");
			url = "main.jsp";
		} else if (result == 0) {
			request.setAttribute("message", "비밀번호가 맞지 않습니다.");
		} else if (result == -1) {
			request.setAttribute("message", "존재하지 않는 회원입니다.");
		} else {
			request.setAttribute("message", "누구세요.");
		}
		
		RequestDispatcher dis = request.getRequestDispatcher(url);
		dis.forward(request, response);
		
	}

}
