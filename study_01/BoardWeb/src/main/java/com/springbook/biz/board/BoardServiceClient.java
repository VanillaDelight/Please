package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		// 1. Spring 컨테이너를 구동한다. BoardServiceImpl, BoardDAO 가 메모리공간에 올라간다.
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup한다.
		BoardService boardService = (BoardService) container.getBean("boardService");
//		BoardService boardService = container.getBean("boardService", BoardService.class);
		
		// 3. 글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		vo.setSeq(100);
		vo.setTitle("나난나");
		vo.setWriter("고길동");
		vo.setContent("하이하이 . . . . . .  . . ..");
//		boardService.insertBoard(vo);
		
		// 4. 글 목록 검색 기능 테스트
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
		// 5. Spring 컨테이너 종료
		container.close();
	}

}
