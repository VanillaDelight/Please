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

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class BoardControllerTests {
	
	@Autowired
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	// @Test 어노테이션 작동 전에 미리 선행시키는 것
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void testList() throws Exception {
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/board/list")).andReturn().getModelAndView().getModelMap()
				);
	}

	@Test
	public void testRegister() throws Exception {
		String resultPage = 
				mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
						.param("title", "리반장")
						.param("content", "리런루 일대기")
						.param("writer", "리런루")
						).andReturn().getModelAndView().getViewName();
		
		log.info(resultPage);
	}
	
	@Test
	public void testGet() throws Exception {
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/board/get")
						.param("bno", "13")).andReturn().getModelAndView().getModelMap()
				);
	}
	
	@Test
	public void  testRemove() throws Exception {
		String resultPage = 
				mockMvc.perform(
						MockMvcRequestBuilders.post("/board/remove")
						.param("bno", "13"))
				.andReturn().getModelAndView().getViewName();
		log.info(resultPage);
	}
	
	@Test
	public void testModify() throws Exception {
		String resultPage = 
				mockMvc.perform(
						MockMvcRequestBuilders.post("/board/modify")
						.param("bno", "10")
						.param("title", "뢰반장")
						.param("content", "뢰령룬 일대기")
						.param("writer", "뢰령룬")
						).andReturn().getModelAndView().getViewName();
		log.info(resultPage);
	}
}

