package org.hospital.controller;

import java.util.List;

import org.hospital.domain.ReplyPageDTO;
import org.hospital.domain.ReplyVO;
import org.hospital.service.ReplyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/* 
 * 작업      URL            HTTP전송방식
 * 등록 : /replies/new  :  POST
 * 조회 : /replies/:rno    : GET
 * 삭제 : /replies/:rno   : DELETE
 * 수정 : /replies/:rno   : PUT or PATCH
 * 페이지  : /replies/pages/:bno/:page   : GET
 */

@RestController
@RequestMapping("/replies/")
@Log4j
@AllArgsConstructor
public class ReplyController {
	private ReplyService service;
	
	// 클라이언트에서 서버 전송 json, 서버에서 클라이언트 String
	// {속성:값, 속성:값} --> @RequestBody
	// {bno:값, reply:값, replyer:값} 이렇게 오는 형식을 @ResponseBody 가 (jackson-databind)
	// vo.setBno(값), vo.setReply(값), vo.setReplyer(값) 이렇게 바꿔줌
	@PostMapping(value="/new", consumes = "application/json",
			produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> create(@RequestBody ReplyVO vo) {
		log.info(vo);
		int insertCount = service.register(vo);
		
		if (insertCount == 1) {
			return new ResponseEntity<>("success", HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value="/{bno}",
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<List<ReplyVO>> getList(@PathVariable("bno") Long bno) {
		log.info("getList ======== " + bno + ", ");
		return new ResponseEntity<List<ReplyVO>>(service.getList(bno), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{rno}", produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> remove(@PathVariable("rno") Long rno) {
		if (service.remove(rno) == 1) {
			return new ResponseEntity<String>("success", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value="/get/{rno}",
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<ReplyVO> get(@PathVariable("rno") Long rno) {
		return new ResponseEntity<ReplyVO>(service.get(rno), HttpStatus.OK);
	}
	
	@RequestMapping(method = {RequestMethod.PUT, RequestMethod.PATCH},
			value="/{rno}", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> modify(@PathVariable("rno") Long rno, @RequestBody ReplyVO vo) {
		
		vo.setRno(rno);
		return service.modify(vo)==1? new ResponseEntity<String>("success", HttpStatus.OK) : 
										new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
