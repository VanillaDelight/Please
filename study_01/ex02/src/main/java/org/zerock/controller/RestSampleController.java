package org.zerock.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.SampleVO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/restsample")
@Log4j
public class RestSampleController {
									// 반환타입
	@GetMapping(value="/getText", produces = "text/plain; charset=utf-8")
	@ResponseBody
	public String getText() {
		log.info("MINI TYPE" + MediaType.TEXT_PLAIN_VALUE);
		return "안녕하세요";
	}
	@GetMapping(value="/getSample", produces = {
//			MediaType.APPLICATION_PROBLEM_JSON_UTF8_VALUE,
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE
	})
	@ResponseBody
	public SampleVO getSample() {
		return new SampleVO(111, "홍", "길동");
	}
}
