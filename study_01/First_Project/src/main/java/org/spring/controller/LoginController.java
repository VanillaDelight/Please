package org.spring.controller;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.spring.domain.MemberVO;
import org.spring.service.LoginService;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/member/*")
@Log4j
@AllArgsConstructor
public class LoginController {
	
	private JavaMailSender mailSender;
	private LoginService service;

	@GetMapping("/main.do")
	public void main() {
		log.info("--main--");
	}
	@GetMapping("/find_id.do")
	public void find_id() {
		log.info("--find_id--");
	}
	@GetMapping("/find_pwd.do")
	public void find_pwd() {
		log.info("--find_pwd--");
	}
	@GetMapping("/login.do")
	public void login() {
		log.info("--login--");
	}
	@PostMapping("/login.do")
	public String loginCheck(MemberVO vo, HttpServletRequest request) {
		HttpSession session = request.getSession();
		MemberVO user = service.LoginCheck(vo);
		if (user != null) {
			session.setAttribute("user", user);
			return "redirect:main.do";
		} else {
			return "redirect:login.do";
		}
	}
	@GetMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		log.info(session + "--logout--");
		return "redirect:main.do";
	}
	@GetMapping("/join.do")
	public void join() {
		log.info("--join--");
	}
	@PostMapping("/join.do")
	public String joining(MemberVO vo) {
		int check = service.join(vo);
		if (check != 1) {
			return "redirect:failed.do";
		} else {
			return "redirect:login.do";
		}
	}
	@PostMapping("/nameCheck.do")
	@ResponseBody
	public int nameCheck(@RequestParam("name") String name) {
		log.info("============>" + name);
		return service.nameCheck(name);
	}
	@PostMapping("/idCheck.do")
	@ResponseBody
	public int idCheck(@RequestParam("id") String id) {
		log.info("============>" + id);
		return service.idCheck(id);
	}
	@PostMapping("/emailCheck.do")
	@ResponseBody
	public int emailCheck(@RequestParam("email") String email) {
		log.info("============>" + email);
		return service.emailCheck(email);
	}
	@GetMapping("/mailCheck.do")
	@ResponseBody
	public String mailCheck(@RequestParam("email") String email) throws Exception{
	    int serti = (int)((Math.random()* (99999 - 10000 + 1)) + 10000);
	    
	    String from = "2m5@naver.com";//보내는 이 메일주소
	    String to = email;
	    String title = "회원가입시 필요한 인증번호 입니다.";
	    String content = "[인증번호] "+ serti +" 입니다. <br/> 인증번호 확인란에 기입해주십시오.";
	    String num = "";
	    try {
	    	MimeMessage mail = mailSender.createMimeMessage();
	        MimeMessageHelper mailHelper = new MimeMessageHelper(mail, true, "UTF-8");
	        
	        mailHelper.setFrom(from);
	        mailHelper.setTo(to);
	        mailHelper.setSubject(title);
	        mailHelper.setText(content, true);       
	        
	        mailSender.send(mail);
	        num = Integer.toString(serti);
	        
	    } catch(Exception e) {
	        num = "error";
	    }
	    return num;
	}
	@GetMapping("/phoneCheck.do")
	@ResponseBody
	public String sendSMS(@RequestParam("phone") String userPhoneNumber) { // 휴대폰 문자보내기
		int randomNumber = (int)((Math.random()* (9999 - 1000 + 1)) + 1000);//난수 생성

		service.certifiedPhoneNumber(userPhoneNumber,randomNumber);
		
		return Integer.toString(randomNumber);
	}
	@PostMapping("/find_id.do")
	@ResponseBody
	public String finding_id(@RequestParam("email") String email,@RequestParam("phone") String phone) {
		String result = service.find_id(email, phone);
		log.info("result ======== " + email + "||||||||||||||" + phone + "||||||||||||||" + result);
		return result;
	}
	@PostMapping("/find_pwd.do")
	public ModelAndView finding_pwd(MemberVO vo, ModelAndView mvc) {
		int userChk = service.userCheck(vo);
		mvc.addObject("userChk", userChk);
		mvc.addObject("member", vo);
		mvc.setViewName("/member/update_pwd");
		return mvc;
	}
	@GetMapping("/update_pwd.do")
	public void update_pwd(Model model) {
		log.info("--update--");
		log.info("vo========="+model);
	}
	@PostMapping("/update_pwd.do")
	public String update_pass(MemberVO vo) {
		log.info("--update_pwd--");
		log.info("vo========="+vo);
		service.update_pwd(vo);
		return "redirect:login.do";
	}
}
