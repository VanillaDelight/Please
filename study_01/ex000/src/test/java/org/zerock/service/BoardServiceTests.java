package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapperTests;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {

	@Autowired
	private BoardService service;
	
	@Test
	public void testRegister() {
		BoardVO vo  = new BoardVO();
		vo.setHosname("IT엘치과의원");
		vo.setAddress("서울특별시 금천구 디지털로9길 33-0 205호(가산동, IT미래타워)");
		vo.setPhone("02-2027-5872");
		vo.setSubject("치과");
		vo.setWorkday("월~토");
		vo.setOpentime("10:00");
		vo.setClosetime("19:00(토 : 14:00)");
		vo.setHoliday("일, 공휴일");
		vo.setHolisubject("전부 휴진");
		vo.setLocation("IT엘치과의원");
		
		service.register(vo);
		log.info("생성된 게시물 번호 : " + vo.getBno());
	}
	@Test
	public void testRead() {
		service.get(2L);
		//log.info("검색된 데이타  : " + 	service.get(24L));
	}
	@Test
	public void testDelete() {
		//service.remove(24L);
		log.info("삭제된 개수  : " + 	service.remove(17L));
	}

	@Test
	public void testGetList() {
		log.info("----------------------------");
		service.getList(new Criteria(2,10));
	}

	@Test
	public void testModify() {
		BoardVO vo = new BoardVO();
		vo.setBno(17L);;
		vo.setHosname("서울 비뇨기과의원");
		vo.setAddress("서울특별시 강서구 강서로 391 3층 302, 303호(마곡동, 운영비즈웍스)");
		vo.setPhone("02-6932-0088");
		vo.setSubject("비뇨기과");
		vo.setWorkday("월~토");
		vo.setOpentime("09:00");
		vo.setClosetime("19:00(토 : 16:00)");
		vo.setHoliday("일, 공휴일");
		vo.setHolisubject("전부 휴진");
		vo.setLocation("서울 비뇨기과의원");
		service.modify(vo);
		service.modify(vo);
		log.info("수정된 데이타 : " + service.modify(vo));
	}
	 
	
	
	
	
	
}