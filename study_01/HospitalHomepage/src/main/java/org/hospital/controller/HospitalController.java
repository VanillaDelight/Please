package org.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.hospital.criterial.HospitalCriterial;
import org.hospital.dao.PageDAO;
import org.hospital.service.HospitalService;
import org.hospital.vo.HospitalVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class HospitalController {

	private HospitalService service;
	
	@GetMapping("/list")
	public void list(HospitalCriterial hc, Model model) {
		log.info("hc + " + hc);
		int total = service.getTotal(hc);
		log.info("total count : " + total);
		
		model.addAttribute("list", service.getList(hc));
		model.addAttribute("pageMaker", new PageDAO(hc, total));
	}
	
	@GetMapping("/register")
	public void register() {
		
	}
	
	@PostMapping("/register")
	public String register(HospitalVO vo, RedirectAttributes rttr) {
		log.info("register : " + vo);
		service.register(vo);
		rttr.addFlashAttribute("result", vo.getHospitalslist());
		return "redirect:/board/list";
	}
	
	@GetMapping({"/get", "/modify"})
	public void get(Long hospitalslist, @ModelAttribute("hc") HospitalCriterial hc, Model model) {
		log.info("get or modify--------------------");
		model.addAttribute("board", service.get(hospitalslist));
	}
	
	@PostMapping("/remove")
	public String remove(Long hospitalslist, @ModelAttribute("hc") HospitalCriterial hc, RedirectAttributes rttr) {
		log.info("remove-----------" + hospitalslist);
		if(service.remove(hospitalslist) == 1) {
			rttr.addFlashAttribute("result", "success");
		}
		rttr.addAttribute("pageNum", hc.getPageNum());
		rttr.addAttribute("amount", hc.getAmount());
		rttr.addAttribute("type", hc.getType());
		rttr.addAttribute("keyword", hc.getKeyword());
		return "redirect:/board/list";
		
	}
	
	@PostMapping("/modify")
	public String modify(HospitalVO vo, @ModelAttribute("hc") HospitalCriterial hc, RedirectAttributes rttr) {
		log.info("modify : " + vo);
		if(service.modify(vo) == 1) {
			rttr.addFlashAttribute("result", "success");
		}
		rttr.addAttribute("pageNum", hc.getPageNum());
		rttr.addAttribute("amount", hc.getAmount());
		rttr.addAttribute("type", hc.getType());
		rttr.addAttribute("keyword", hc.getKeyword());
		return "redirect:/board/list";
	}
}










