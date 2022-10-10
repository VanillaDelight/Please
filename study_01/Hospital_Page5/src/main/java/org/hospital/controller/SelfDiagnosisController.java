package org.hospital.controller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/selfDiagnosis/*")
public class SelfDiagnosisController {
	
	ArrayList<String> symptomStr = new ArrayList<String>();
	
	@GetMapping("/self_main.do")
	public void selfdiagnosis() {
		log.info("-----self-diagnosis-----");
	}
	@GetMapping("/one.do")
	public String first() {
		log.info("-----first-----");
		return "selfDiagnosis/first";
	}
	@GetMapping("/two.do")
	public String twice(@RequestParam ("symptom") String symptom) {
		log.info(symptomStr + "============================");
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		if (Integer.parseInt(symptom) > 4) {
			log.info(symptomStr + "============================");
			return "selfDiagnosis/two_2";
		} else {
			log.info(symptomStr);
			log.info("twice");
			return "selfDiagnosis/two_1";
		}
	}
	@GetMapping("/three.do")
	public String third(@RequestParam ("symptom") String symptom) {
		log.info(symptomStr + "============================");
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		if (Integer.parseInt(symptom) == 1) {
			log.info(symptomStr + "============================");
			return "selfDiagnosis/sixteenUnder";
		} else {
			log.info(symptomStr);
			log.info("twice");
			return "selfDiagnosis/three_1";
		}
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
