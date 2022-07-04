package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class LoginController {

	@RequestMapping(value="/login.do")
	public String handleRequest(UserVO vo, UserDAO userDAO) {
		System.out.println("로그인 처리");
		
		if (userDAO.getUser(vo) != null)
			return "getBoardList.do";
		else
			return "loginFailed.jsp";
		
		// 1. 사용자 입력 정보 추출
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");
//
//		// 2. DB 연동 처리
//		UserVO vo = new UserVO();
//		vo.setId(id);
//		vo.setPassword(password);
//
//		UserDAO userDAO = new UserDAO();
//		UserVO user = userDAO.getUser(vo);
//		
//		ModelAndView mav = new ModelAndView();
//		if (user != null) {
//			HttpSession session = request.getSession();
//			session.setAttribute("username", user.getName());
//			
//			mav.setViewName("redirect:getBoardList.do");
//		} else {
//			mav.setViewName("redirect:loginFailed.jsp");
//		}
//		return mav;
	}

}
