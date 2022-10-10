package org.hospital.service;

import java.util.List;

import org.hospital.domain.Criteria;
import org.hospital.domain.HospitalsVO;
import org.hospital.domain.ReplyVO;

public interface HospitalsService {

	public void register(HospitalsVO vo);	// 등록
	public int modify(HospitalsVO vo);		// 수정
	public int remove(Long bno);		// 삭제
	public HospitalsVO get(Long bno);		// 읽기
//	public List<BoardVO> getList();		// 전체 읽기
	public List<HospitalsVO> getList(Criteria cri);
	// 7/20
	public int getTotal(Criteria cri);
	public List<ReplyVO> getReviewList(String id);	
}
