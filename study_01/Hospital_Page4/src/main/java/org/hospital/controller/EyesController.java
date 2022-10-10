package org.hospital.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/eyes/*")
public class EyesController {
ArrayList<String> symptomStr = new ArrayList<String>();
	
	@GetMapping("/page_1.do")
	public String page_1() {
		log.info("-----page_1-----");
		return "eyes/page_1";
	}
	@GetMapping("/page_2.do")
	public String page_2() {
		log.info("-----page_2-----");
		return "eyes/page_2";
	}
	@GetMapping("/page_3.do")
	public String page_3() {
		log.info("-----page_3-----");
		return "eyes/page_3";
	}
	@GetMapping("/page_4.do")
	public String page_4() {
		log.info("-----page_4-----");
		return "eyes/page_4";
	}
	@GetMapping("/page_5.do")
	public String page_5() {
		log.info("-----page_5-----");
		return "eyes/page_5";
	}
	@GetMapping("/page_6.do")
	public String page_6() {
		log.info("-----page_6-----");
		return "eyes/page_6";
	}
	@GetMapping("/page_7.do")
	public String page_7() {
		log.info("-----page_7-----");
		return "eyes/page_7";
	}
	@GetMapping("/page_8.do")
	public String page_8() {
		log.info("-----page_8-----");
		return "eyes/page_8";
	}
	@GetMapping("/page_9.do")
	public String page_9() {
		log.info("-----page_9-----");
		return "eyes/page_9";
	}
	@GetMapping("/page_10.do")
	public String page_10() {
		log.info("-----page_10-----");
		return "eyes/page_10";
	}
	@GetMapping("/page_11.do")
	public String page_11() {
		log.info("-----page_11-----");
		return "eyes/page_11";
	}
	@GetMapping("/page_12.do")
	public String page_12() {
		log.info("-----page_12-----");
		return "eyes/page_12";
	}
	@GetMapping("/page_13.do")
	public String page_13() {
		log.info("-----page_13-----");
		return "eyes/page_13";
	}
	@GetMapping("/page_14.do")
	public String page_14() {
		log.info("-----page_14-----");
		return "eyes/page_14";
	}
	@GetMapping("/page_15.do")
	public String page_15() {
		log.info("-----page_15-----");
		return "eyes/page_15";
	}
	
	
	@GetMapping("/self-diagnosis.do")
	public void selfdiagnosis() {
		log.info("-----self-diagnosis-----");
	}
	
	@GetMapping("/first.do")
	public String first() {
		log.info("-----first-----");
		return "ears/first";
	}
	@GetMapping("/second.do")
	public String twice(@RequestParam ("symptom") String symptom) {
		log.info(symptomStr + "============================");
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		if (Integer.parseInt(symptom) == 1) {
			log.info(symptomStr + "============================");
			return "ears/sixteenUnder";
		} else {
			log.info(symptomStr);
			log.info("twice");
			return "ears/second";
		}
	}
	
	@GetMapping("/third.do")
	public String third() {
		log.info("-----first-----");
		return "ears/third";
	}
	
	
	@GetMapping("/fourth.do")
	public String fourth(@RequestParam ("symptom") String symptom) {
		log.info(symptomStr + "============================");
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		if(Integer.parseInt(symptom)<6) {
			log.info(symptomStr + "============================");
			return "ears/fourth";
		} else {
			log.info(symptomStr);
			log.info("skin");
			return "ears/skin";
		}
		
	}
	
	@GetMapping("/fifth.do")
	public String fifth(@RequestParam ("symptom") String symptom) {
		log.info("-----first-----");
		return "ears/fifth";
		
	}
	
	@GetMapping("/sixteenUnder.do")
	public String sixteen(@RequestParam ("symptom") String symptom) {
		log.info(symptomStr + "============================");
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		if (Integer.parseInt(symptom) == 1) {
			log.info(symptomStr + "============================");
			return "#";
		} else {
			log.info(symptomStr);
			log.info("twice");
			return "selfDiagnosis/self_main";
		}
	}
}
