package org.hospital.service;

import java.util.List;

import org.hospital.domain.Criteria;
import org.hospital.domain.TermsVO;

public interface TermsService {
	public void register(TermsVO vo);	// 등록
	public int modify(TermsVO vo);		// 수정
	public int remove(Long bno);		// 삭제
	public TermsVO get(Long bno);		// 읽기
//	public List<BoardVO> getList();		// 전체 읽기
	public List<TermsVO> getList(Criteria cri);
	// 7/20
	public int getTotal(Criteria cri);		
}
