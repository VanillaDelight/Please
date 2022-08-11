package org.zerock.controller;

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
public class BoardControllerTests {
	@Autowired
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void testList() throws Exception {
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))
				.andReturn()
				.getModelAndView()
				.getModelMap()
				);
	}
	@Test
	public void testRegister() throws Exception {
		String resultPage = 
				mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
						.param("hosname", "염주상 정형외과의원")
						.param("address", "서울특별시 강서구 강서로 385 4층 407,408호(마곡동, 우성에스비타워)")
						.param("phone", "02-2659-1050")
						.param("subject", "정형외과")
						.param("workday", "월~토")
						.param("opentime", "09:00")
						.param("closetime", "19:00(토요일 : 13:00)")
						.param("holiday", "일, 공휴일")
						.param("holisubject", "전부 휴진")
						.param("location", "염주상 정형외과의원"))
						.andReturn()
						.getModelAndView()
						.getViewName();
		log.info(resultPage);
	}
	
	@Test
	public void testGet() throws Exception {
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/board/get")
				.param("bno", "1"))
				.andReturn()
				.getModelAndView()
				.getModelMap()
				);
	}
	
	@Test
	public void testRemove() throws Exception {
		String resultPage = 
				mockMvc.perform(MockMvcRequestBuilders.post("/board/remove")
				.param("bno", "17"))
				.andReturn()
				.getModelAndView()
				.getViewName();
		log.info(resultPage);
	}

	@Test
	public void testModify() throws Exception {
		String resultPage = 
				mockMvc.perform(MockMvcRequestBuilders.post("/board/modify")
						.param("bno", "14")
						.param("hosname", "류마내과의원")
						.param("address", "서울특별시 강서구 화곡로 142 2층 201호(화곡동, 메가박스)")
						.param("phone", "02-2605-0279")
						.param("subject", "내과")
						.param("workday", "월~토")
						.param("opentime", "09:00")
						.param("closetime", "19:00(토요일 : 14:00)")
						.param("holiday", "일, 공휴일")
						.param("holisubject", "전부 휴진")
						.param("location", "류마내과의원"))
				.andReturn()
				.getModelAndView()
				.getViewName();
		log.info(resultPage);
	}
	
	
	@Test
	public void testListPaging() throws Exception {
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/board/list")
				.param("pageNum", "2")
				.param("amount", "10"))
				.andReturn()
				.getModelAndView()
				.getModelMap()
				);
	}
	
	
	
	
	
	
	
	
}