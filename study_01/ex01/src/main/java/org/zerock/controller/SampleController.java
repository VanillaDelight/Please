package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/")
@Log4j
public class SampleController {
	
	@RequestMapping(value="basic", method=RequestMethod.GET)
	public String basic() {
		log.info("basic----------------");
		return "basic";
	}
	
	@GetMapping("/basicOnlyGet")
	public String basicGet2() {
		log.info("basicGet2()--------------");
		return "basic2";
	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto, Model model) {
		log.info("dto--------:" + dto);
		model.addAttribute("model", model);
		return "ex01";
	}

	@GetMapping("/ex02")
	public String ex02(SampleDTO dto) {
		log.info("dto--------:" + dto);
		return "sample/ex02";
	}
	
	@GetMapping("/ex03")
	public String ex03(@ModelAttribute("SD") SampleDTO dto, @ModelAttribute("page") int page) {
		log.info(dto);
		log.info(page);
		return "ex03";
	}
	
	@GetMapping("/ex04")
	public @ResponseBody SampleDTO ex04() {
		log.info("ex04 ----------------- ");
		SampleDTO dto = new SampleDTO();
		dto.setName("유반장");
		dto.setAge(38);
		return dto;
	}
}
