package org.hospital.service;

import java.util.List;

import org.hospital.domain.Criteria;
import org.hospital.domain.InquiryVO;

public interface InquiryService {
	public void register(InquiryVO vo);	// 등록
	public int modify(InquiryVO vo);		// 수정
	public int remove(Long bno);		// 삭제
	public InquiryVO get(Long bno);		// 읽기
//	public List<BoardVO> getList();		// 전체 읽기
	public List<InquiryVO> getList(Criteria cri);
	// 7/20
	public int getTotal(Criteria cri);		
}
