package org.hospital.controller;

import org.hospital.domain.Criteria;
import org.hospital.domain.PageDTO;
import org.hospital.domain.PharmacyVO;
import org.hospital.service.PharmacyService;
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
@RequestMapping("/pharmacy/*")
@AllArgsConstructor
public class PharmacyController {

	private PharmacyService service;
	
	@GetMapping("/reservation.do")//
	public void reservation() {
		log.info("-----reservation-----");
	}
	@GetMapping("/ph_checkout.do")
	public void checkout() {
		log.info("-----checkout-----");
	}
	
//	@GetMapping("/ph_list.do")
//	public void list(Criteria cri, Model model) {
//		log.info("cri+ " + cri);
//		int total = service.getTotal(cri);
//		log.info("total count : " + total);
//		
//		model.addAttribute("list", service.getList(cri));
//		model.addAttribute("pageMaker", new PageDTO(cri, total));
//	}
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
	public String register(PharmacyVO vo, RedirectAttributes rttr) {
		log.info("register : " + vo);
		service.register(vo);
		rttr.addFlashAttribute("result", vo.getBno());
		return "redirect:/pharmacy/list";
	}
	
//	@GetMapping({"/ph_get", "/ph_modify"})
//	public void get(Long bno,  @ModelAttribute("cri") Criteria cri , Model model) {
//		log.info("--------------get or modify--------------");
//		model.addAttribute("pharmacy", service.get(bno));
//	}
	
	@GetMapping({"/get", "/modify"})
	public void get(Long bno,  @ModelAttribute("cri") Criteria cri , Model model) {
		log.info("--------------get or modify--------------");
		model.addAttribute("pharmacy", service.get(bno));
	}
	
	
	@PostMapping("/remove")
	public String remove(Long bno, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		log.info("remove---------" + bno);
		if(service.remove(bno)==1) {
			rttr.addFlashAttribute("result", "success");
		}
		
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());
		return "redirect:/pharmacy/list";
	}
	
	@PostMapping("/modify")
	public String modify(PharmacyVO vo, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		log.info("modify : " + vo);
		if( service.modify(vo) == 1) {
			rttr.addFlashAttribute("result", "success");
		}
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());
		return "redirect:/pharmacy/list";
	}
}






