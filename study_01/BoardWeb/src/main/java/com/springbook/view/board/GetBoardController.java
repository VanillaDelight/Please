package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class GetBoardController {

	@RequestMapping(value="/getBoard.do")
	public ModelAndView handleRequest(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 상세 조회 처리");
//		int seq = Integer.parseInt(request.getParameter("seq"));
//
//		BoardVO vo = new BoardVO();
//		vo.setSeq(seq);
//
//		BoardDAO boardDAO = new BoardDAO();
//		boardDAO.countCnt(seq);
//		BoardVO board = boardDAO.getBoard(vo);
		
//		HttpSession session = request.getSession();
//		session.setAttribute("board", board);
//		return "getBoard";
		
//		ModelAndView mav = new ModelAndView();
		mav.addObject("board", boardDAO.getBoard(vo)); // model 정보 저장
		mav.setViewName("getBoard.jsp"); // view 정보 저장
		return mav;
	}
}
