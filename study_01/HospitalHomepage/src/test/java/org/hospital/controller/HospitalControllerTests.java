package org.hospital.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
							"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@WebAppConfiguration
@Log4j
public class HospitalControllerTests {

	@Autowired
	private WebApplicationContext ctx;
	
	private MockMvc mvc;
	
	@Before
	public void setup() {
		this.mvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void testList() throws Exception {
		log.info(
				mvc.perform(MockMvcRequestBuilders.get("/board/list"))
				.andReturn()
				.getModelAndView()
				.getModelMap()
				);
	}
	
//	 hosname varchar2(200) not null,         -- 병원 이름    primary key
//	    address varchar2(2000) not null,        -- 주소
//	    phone varchar2(50) not null,            -- 전화번호
//	    subject varchar2(50) not null,          -- 진료과목
//	    workday varchar2(50) not null,          -- 진료일
//	    opentime varchar2(100) not null,        --진료 시간(시작)
//	    closetime varchar2(100) not null,       --진료 시간(종료)
//	    holiday varchar(50) not null,           -- 휴무
//	    holisubject varchar(50) not null,       -- 휴진 안내
//	    location varchar(50) not null           -- 병원 위치
	
	@Test
	public void testRegister() throws Exception {
		String resultPage =
				mvc.perform(MockMvcRequestBuilders.post("/board/register")
						.param("hosname", "에센스 산부인과의원")
						.param("address", "경기도 의정부시 오목로 205번길 1 4층 401호")
						.param("phone", "031-852-7580")
						.param("subject", "산부인과")
						.param("workday", "월~토")
						.param("opentime", "09:00")
						.param("closetime", "18:00(토요일 : 13:00)")
						.param("holiday", "일")
						.param("holisubject", "전부 휴진")
						.param("location", "에센스 산부인과의원"))
						.andReturn()
						.getModelAndView()
						.getViewName();
				log.info(resultPage);
				
	}
	
	@Test
	public void testGet() throws Exception {
		log.info(
				mvc.perform(MockMvcRequestBuilders.get("/board/get")
						.param("hospitalslist", "1"))
						.andReturn()
						.getModelAndView()
						.getModelMap()
				);
	}
	
	@Test
	public void testRemove() throws Exception {
		String resultPage = 
				mvc.perform(MockMvcRequestBuilders.post("/board/remove")
				.param("hospitalslist", "2"))
				.andReturn()
				.getModelAndView()
				.getViewName();
		log.info(resultPage);
	}
	
	@Test
	public void testModify() throws Exception {
		String resultPage = 
				mvc.perform(MockMvcRequestBuilders.post("/board/modify")
						.param("hosname", "상동아산 정형외과의원")
						.param("address", "경기도 부천시 원미구 상동로 113 송재프라자 302호, 303호")
						.param("phone", "032-327-5916")
						.param("subject", "정형외과")
						.param("workday", "월~토")
						.param("opentime", "09:00")
						.param("closetime", "20:00(토요일 : 15:00)")
						.param("holiday", "일")
						.param("holisubject", "전부 휴진")
						.param("location", "상동아산 정형외과의원"))
				.andReturn()
				.getModelAndView()
				.getViewName();
		log.info(resultPage);
	}
	
	@Test
	public void testListPaging() throws Exception {
		log.info(
				mvc.perform(MockMvcRequestBuilders.get("/board/list")
				.param("pageNum", "1")
				.param("amount", "5"))
				.andReturn()
				.getModelAndView()
				.getModelMap()
				);
	}
	
}













