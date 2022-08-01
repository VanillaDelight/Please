package org.zerock.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		//mapper.getList().forEach(board->log.info(board));	// 스트림
		
		for(BoardVO vo : mapper.getList()) {
			log.info(vo);
		
		}
	}
	
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("java의 정석");
		vo.setContent("자바 책....");
		vo.setWriter("남궁성");
		mapper.insert(vo);
		log.info(vo);
	}
	@Test
	public void testSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("jsp");
		vo.setContent("jsp/sevlet 책....");
		vo.setWriter("성윤정");
		mapper.insertSelectKey(vo);
		log.info(vo);
	}
	@Test
	public void testread() {
		
		BoardVO vo = mapper.read(1L);
		log.info(vo);
	}
	@Test
	public void testdelete() {
		
		log.info("delete count : " + mapper.delete(1L));
	}
	@Test
	public void testupdate() {
		
		BoardVO vo = new BoardVO();
		vo.setBno(8L);
		vo.setTitle("오라클2");
		vo.setContent("오라클2");
		vo.setWriter("오라클2");
		log.info("update : " + mapper.update(vo));
	}
	
	@Test 
	public void testPaging() {
		Criteria cri = new Criteria();
		cri.setPageNum(4);
		cri.setAmount(15);
		List<BoardVO> list = mapper.getListWithPagging(cri);
		log.info(list);
	}
	
	@Test
	public void testPageDTO() {
		Criteria cri = new Criteria();
		cri.setPageNum(15);
		cri.setAmount(10);
		PageDTO pageDTO = new PageDTO(cri, 315);
		log.info(pageDTO);
	}
	
	@Test
	public void testSearchTest() {
		Map<String, String> map = new HashMap<>();
		map.put("T", "새로이");
		map.put("C", "도둑이야기");
		map.put("W", "남궁성");
		Map<String, Map<String, String>> outer = new HashMap<>();
		
		outer.put("map", map);
		List<BoardVO> list = mapper.searchTest(outer);
		log.info(list);
	}
	
	@Test
	public void testSearchPaging() {
		Criteria cri = new Criteria();
		cri.setType("TCW");
		cri.setKeyword("새로");
		List<BoardVO> list = mapper.getListWithPagging(cri);
		log.info(list);
	}
	
	@Test
	public void testTotal() {
		Criteria cri = new Criteria();
		cri.setType("T");
		cri.setKeyword("새로");
		
		int count = mapper.getTotalCount(cri);
		log.info("----------------");
		log.info("count : " + count);
	}
}
	
















