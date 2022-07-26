package org.hospital.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hospital.criterial.HospitalCriterial;
import org.hospital.dao.PageDAO;
import org.hospital.vo.HospitalVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class HospitalMapperTests {

	@Autowired
	private HospitalMapper mapper;
	
	@Test
	public void testGetList() {
		for(HospitalVO vo : mapper.getList()) {
			log.info(vo);
		}
	}
	
//	 hosname varchar2(200) not null,         -- 병원 이름    primary key
//    address varchar2(2000) not null,        -- 주소
//    phone varchar2(50) not null,            -- 전화번호
//    subject varchar2(50) not null,          -- 진료과목
//    workday varchar2(50) not null,          -- 진료일
//    opentime varchar2(100) not null,        --진료 시간(시작)
//    closetime varchar2(100) not null,       --진료 시간(종료)
//    holiday varchar(50) not null,           -- 휴무
//    holisubject varchar(50) not null,       -- 휴진 안내
//    location varchar(50) not null           -- 병원 위치
	
	@Test
	public void testInsert() {
		HospitalVO vo = new HospitalVO();
		vo.setHosname("강의원");
		vo.setAddress("경기도 고양시 일산동구 중앙로 1275번길 38-10 우림로데오스위트 209");
		vo.setPhone("031-919-2568");
		vo.setSubject("소아청소년학과");
		vo.setWorkday("월~토");
		vo.setOpentime("09:00(목 : 14:00)");
		vo.setClosetime("18:30(목 : 21:00, 토 : 15:00)");
		vo.setHoliday("일");
		vo.setHolisubject("전부 휴진");
		vo.setLocation("강의원");
		mapper.insert(vo);
		log.info(vo);
	}
	
	@Test
	public void testSelectKey() {
		HospitalVO vo = new HospitalVO();
		vo.setHosname("강의원");
		vo.setAddress("경기도 고양시 일산동구 중앙로 1275번길 38-10 우림로데오스위트 209");
		vo.setPhone("031-919-2568");
		vo.setSubject("소아청소년학과");
		vo.setWorkday("월~토");
		vo.setOpentime("09:00(목 : 14:00)");
		vo.setClosetime("18:30(목 : 21:00, 토 : 15:00)");
		vo.setHoliday("일");
		vo.setHolisubject("전부 휴진");
		vo.setLocation("강의원");
		mapper.insertSelectKey(vo);
		log.info(vo);
	}
	
	@Test
	public void testread() {
		HospitalVO vo = mapper.read(1L);
		log.info(vo);
	}
	
	@Test
	public void testdelete() {
		log.info("delete count : " + mapper.delete(1L));
	}
	
	@Test
	public void testupdate() {
		HospitalVO vo = new HospitalVO();
		vo.setHospitalslist(4L);
		vo.setHosname("강의원");
		vo.setAddress("경기도 고양시 일산동구 중앙로 1275번길 38-10 우림로데오스위트 209");
		vo.setPhone("031-919-2568");
		vo.setSubject("소아청소년학과");
		vo.setWorkday("월~토");
		vo.setOpentime("09:00(목 : 14:00)");
		vo.setClosetime("18:30(목 : 21:00, 토 : 15:00)");
		vo.setHoliday("일");
		vo.setHolisubject("전부 휴진");
		vo.setLocation("강의원");
		log.info("update : " + mapper.update(vo));
	}
	
	@Test
	public void testPaging() {
		HospitalCriterial hc = new HospitalCriterial();
		hc.setPageNum(1);
		hc.setAmount(5);
		List<HospitalVO> list = mapper.getListWithPagging(hc);
		log.info(list);
	}
	@Test
	public void testPageDTO() {
		HospitalCriterial hc = new HospitalCriterial();
		hc.setPageNum(1);
		hc.setAmount(5);
		PageDAO dao = new PageDAO(hc, 1);
		log.info(dao);
	}
	
	@Test
	public void testSearchTest() {
		Map<String, String> map = new HashMap<>();
		map.put("H", "연세권마취통증의학과의원");
		map.put("A", "경기도 고양시 일산동구 중앙로 1275번길 38-10 우림로데오스위트 209");
		map.put("S", "소아청소년학과");
		Map<String, Map<String, String>> outer = new HashMap<>();
		
		outer.put("map", map);
		List<HospitalVO> list = mapper.searchTest(outer);
		log.info(list);
	}
	
	@Test
	public void testSearchPaging() {
		HospitalCriterial hc = new HospitalCriterial();
		hc.setType("HAS");
		hc.setKeyword("연세");
		List<HospitalVO> list = mapper.getListWithPagging(hc);
		log.info(list);
	}
	
	@Test
	public void testTotal() {
		HospitalCriterial hc = new HospitalCriterial();
		hc.setType("T");
		hc.setKeyword("새로");
		
		int count = mapper.getTotalCount(hc);
		log.info("----------------");
		log.info("count : " + count);
	}
}
	



























