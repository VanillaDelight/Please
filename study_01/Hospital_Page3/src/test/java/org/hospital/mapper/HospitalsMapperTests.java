package org.hospital.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hospital.domain.Criteria;
import org.hospital.domain.HospitalsVO;
import org.hospital.domain.PageDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class HospitalsMapperTests {
	@Autowired
	private HospitalsMapper mapper;
	
	@Test
	public void testGetList() {
		//mapper.getList().forEach(board->log.info(board));	// 스트림
		
		for(HospitalsVO vo : mapper.getList()) {
			log.info(vo);
		
		}
	}
	
	@Test
	public void testInsert() {
		HospitalsVO vo = new HospitalsVO();
		vo.setHosname("다나은신경외과의원");
		vo.setAddress("서울특별시 강서구 강서로 391 2,4,5,6층(마곡동,운영비즈웍스)");
		vo.setPhone("02-3662-7588");
		vo.setSubject("정형외과, 신경외과, 영상의학과");
		vo.setWorkday("월~토");
		vo.setOpentime("09:00");
		vo.setClosetime("19:00(토 : 17:00)");
		vo.setHoliday("일, 공휴일");
		vo.setHolisubject("전부 휴진");
		vo.setLocation("다나은신경외과의원");
		mapper.insert(vo);
		log.info(vo);
	}
	
	@Test
	public void testInsertSelectKey() {
		HospitalsVO vo = new HospitalsVO();
		vo.setHosname("에이치플러스 양지병원");
		vo.setAddress("서울특별시 관악구 남부순환로 1636(신림동 10-715)");
		vo.setPhone("1877-8875");
		vo.setSubject("종합검진");
		vo.setWorkday("월~토");
		vo.setOpentime("08:30");
		vo.setClosetime("17:30(토 : 12:30)");
		vo.setHoliday("일, 공휴일");
		vo.setHolisubject("전부 휴진");
		vo.setLocation("에이치플러스 양지병원");
		mapper.insertSelectKey(vo);
		log.info(vo);
	}
	@Test
	public void testread() {
		
		HospitalsVO vo = mapper.read(1L);
		log.info(vo);
	}
	@Test
	public void testdelete() {
		
		log.info("delete count : " + mapper.delete(17L));
	}
	@Test
	public void testupdate() {
		
		HospitalsVO vo = new HospitalsVO();
		vo.setBno(17L);
		vo.setHosname("에이스한방병원");
		vo.setAddress("서울특별시 강서구 공항대로 41길 34 플러스존(등촌동 700)");
		vo.setPhone("02-6954-6575");
		vo.setSubject("한의학");
		vo.setWorkday("연중무휴");
		vo.setOpentime("09:00");
		vo.setClosetime("21:00(주말, 공휴일: 15:00)");
		vo.setHoliday("연중무휴");
		vo.setHolisubject("없음");
		vo.setLocation("에이스한방병원");
		log.info("update : " + mapper.update(vo));
	}
	
	@Test 
	public void testPaging() {
		Criteria cri = new Criteria();
		cri.setPageNum(2);
		cri.setAmount(10);
		List<HospitalsVO> list = mapper.getListWithPagging(cri);
		log.info(list);
	}
	
	@Test
	public void testPageDTO() {
		Criteria cri = new Criteria();
		cri.setPageNum(2);
		cri.setAmount(10);
		PageDTO pageDTO = new PageDTO(cri, 1);
		log.info(pageDTO);
	}
	
	@Test
	public void testSearchTest() {
		Map<String, String> map = new HashMap<>();
		map.put("H", "연세권마취통증의학과의원");
		map.put("A", "경기도 고양시 일산동구 중앙로 1275번길 38-10 우림로데오스위트 209");
		map.put("S", "소아청소년학과");
		Map<String, Map<String, String>> outer = new HashMap<>();
		
		outer.put("map", map);
		List<HospitalsVO> list = mapper.searchTest(outer);
		log.info(list);
	}
	
	@Test
	public void testSearchPaging() {
		Criteria cri = new Criteria();
		cri.setType("HAS");
		cri.setKeyword("연세");
		List<HospitalsVO> list = mapper.getListWithPagging(cri);
		log.info(list);
	}
	
	@Test
	public void testTotal() {
		Criteria cri = new Criteria();
		cri.setType("H");
		cri.setKeyword("연세권");
		
		int count = mapper.getTotalCount(cri);
		log.info("----------------");
		log.info("count : " + count);
	}
}
	
















