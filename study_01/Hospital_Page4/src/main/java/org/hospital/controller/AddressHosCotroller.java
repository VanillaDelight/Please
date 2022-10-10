package org.hospital.controller;

import org.hospital.domain.AddressHosVO;
import org.hospital.domain.Criteria;
import org.hospital.domain.PageDTO;
import org.hospital.service.AddressHosService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/hospital_address/*")
@AllArgsConstructor
public class AddressHosCotroller {

	@GetMapping("/hosaddress.do")
	public void hosaddress() {
		log.info("---------hosaddress---------");
	}
	
	private AddressHosService service;
	
	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		log.info("cri+ " + cri);
		int total = service.getTotal(cri);
		log.info("total count : " + total);
		
		model.addAttribute("list", service.getList(cri));
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}
	
	@GetMapping("/register")
	public void register() {
		
	}
	
	@PostMapping("/register")
	public String register(AddressHosVO vo, RedirectAttributes rttr) {
		log.info("register : " + vo);
		service.register(vo);
		rttr.addFlashAttribute("result", vo.getBno());
		return "redirect:/hospital_address/list";
	}
	
	@GetMapping("/get")
	public void get(Long bno,  @ModelAttribute("cri") Criteria cri , Model model) {
		log.info("--------------get--------------");
		model.addAttribute("hospital_address", service.get(bno));
	}
	
	
	
	
	
	
	
	
	
	
		
}















