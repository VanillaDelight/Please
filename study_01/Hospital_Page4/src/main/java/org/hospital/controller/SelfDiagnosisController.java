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
		if (Integer.parseInt(symptom) == 1) {
			log.info(symptomStr + "============================");
			return "selfDiagnosis/sixteenUnder";
		} else {
			log.info(symptomStr);
			log.info("twice");
			return "selfDiagnosis/two";
		}
	}
	@GetMapping("/three.do")
	public String third(@RequestParam ("symptom") String symptom) {
		log.info(symptomStr + "============================");
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		if (Integer.parseInt(symptom) < 5) {
			log.info(symptomStr + "============================");
			return "selfDiagnosis/four";
		} else if (Integer.parseInt(symptom) == 5) {
			log.info(symptomStr);
			log.info("three");
			return "selfDiagnosis/three";
		} else {
			log.info(symptomStr);
			log.info("skin");
			return "selfDiagnosis/skin";
		}
	}

	@GetMapping("/three_1.do")
	public String three_1(@RequestParam ("symptom") String symptom) {
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		log.info("-----three_1-----");
		return "selfDiagnosis/three_1";
	}
	@GetMapping("/three_2.do")
	public String three_2(@RequestParam ("symptom") String symptom) {
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		log.info("-----three_2-----");
		return "selfDiagnosis/three_2";
	}
	@GetMapping("/three_3.do")
	public String three_3(@RequestParam ("symptom") String symptom) {
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		log.info("-----three_3-----");
		return "selfDiagnosis/three_3";
	}
	@GetMapping("/four.do")
	public String four(@RequestParam ("symptom") String symptom) {
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		log.info("-----four-----");
		return "selfDiagnosis/four";
	}
	@GetMapping("/five.do")
	public String five(@RequestParam ("symptom") String symptom) {
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		log.info("-----five-----");
		return "selfDiagnosis/five";
	}
	@GetMapping("/six.do")
	public String six(@RequestParam ("symptom") String symptom) {
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		log.info("-----six-----");
		return "selfDiagnosis/six";
	}
	
	@GetMapping("/seven.do")
	public String seven(@RequestParam ("symptom") String symptom) {
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		log.info("-----seven-----");
		return "selfDiagnosis/seven";
	}
	
	@GetMapping("/eight.do")
	public String eight(@RequestParam ("symptom") String symptom) {
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		log.info("-----seven-----");
		return "selfDiagnosis/eight";
	}
	
	@GetMapping("/result.do")
	public String result(@RequestParam ("symptom") String symptom) {
		log.info(symptomStr + "============================");
		String symptomS = symptom;
		symptomStr.add(symptomS);
		System.out.println(symptomStr + "=============");
		if (Integer.parseInt(symptom) == 1) {
			log.info(symptomStr + "============================");
			return "selfDiagnosis/result";
		} else {
			log.info(symptomStr);
			log.info("self_main");
			return "selfDiagnosis/self_main";
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
