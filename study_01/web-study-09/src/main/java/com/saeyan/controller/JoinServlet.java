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

@WebServlet("/join.do")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("please/join.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		int admin = Integer.parseInt(request.getParameter("admin"));
		
		MemberVO mVO = new MemberVO();
		mVO.setName(name);
		mVO.setUserid(userid);
		mVO.setPwd(pwd);
		mVO.setEmail(email);
		mVO.setPhone(phone);
		mVO.setAdmin(admin);
		
		MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.insertMember(mVO); // insert 잘들어가면 1리턴, 아니면 -1리턴(기본값)
		HttpSession session = request.getSession();
		
		if (result == 1) {
			session.setAttribute("userid", mVO.getUserid());
			request.setAttribute("message", "회원가입에 성공했습니다.");
		} else {
			request.setAttribute("message", "회원가입에 실패했습니다.");
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("please/login.jsp");
		dis.forward(request, response);
	}

}
