package org.hospital.controller;

import org.hospital.domain.AddressPharVO;
import org.hospital.domain.Criteria;
import org.hospital.domain.PageDTO;
import org.hospital.service.AddressPharService;
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
@RequestMapping("/pharmacy_address/*")
@AllArgsConstructor
public class AddressPharController {

	@GetMapping("/pharaddress.do")
	public void hosaddress() {
		log.info("---------pharaddress---------");
	}
	
	private AddressPharService service;
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
	public String register(AddressPharVO vo, RedirectAttributes rttr) {
		log.info("register : " + vo);
		service.register(vo);
		rttr.addFlashAttribute("result", vo.getBno());
		return "redirect:/pharmacy_address/list";
	}
	
	@GetMapping("/get")
	public void get(Long bno,  @ModelAttribute("cri") Criteria cri , Model model) {
		log.info("--------------get--------------");
		model.addAttribute("pharmacy_address", service.get(bno));
	}
	
	
	
	
	
	
	
	
	
	
		
}























