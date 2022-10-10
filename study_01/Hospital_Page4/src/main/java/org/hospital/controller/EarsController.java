package org.hospital.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/ears/*")
public class EarsController {
ArrayList<String> symptomStr = new ArrayList<String>();
	
	@GetMapping("/self_main.do")
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
