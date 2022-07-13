package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapperTests;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceImplTests {
	@Autowired
	private BoardService service;
	@Test
	public void testRegister() {
		BoardVO vo = new BoardVO();
		vo.setTitle("쇠북종");
		vo.setContent("종을 더해라");
		vo.setWriter("더할우");
		service.register(vo);
	}
	@Test
	public void testModify() {
		BoardVO vo = new BoardVO();
		vo.setTitle("안미나");
		vo.setContent("진진자라");
		vo.setWriter("안미정");
		vo.setBno(7L);
		service.modify(vo);
	}
	@Test
	public void testRemove() {
		service.remove(11L);
	}
	@Test
	public void testGet() {
		service.get(1L);
	}
	@Test
	public void testGetList() {
		service.getList();
	}
}
