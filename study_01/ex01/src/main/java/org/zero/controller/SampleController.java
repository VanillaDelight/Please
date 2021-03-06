package org.zero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@RequestMapping("/sample/*")
@Log4j
@Controller
public class SampleController {
	@RequestMapping("/basic")
	public void basic() {
		log.info("basic====================");
	}
	
	@RequestMapping("/basic2")
	public String basic2() {
		log.info("basic2====================");
		return "basic";
	}
}
