package org.hospital.service;

import java.util.List;

import org.hospital.domain.Criteria;
import org.hospital.domain.PharmacyVO;

public interface PharmacyService {

	public void register(PharmacyVO vo);	// 등록
	public int modify(PharmacyVO vo);		// 수정
	public int remove(Long bno);		// 삭제
	public PharmacyVO get(Long bno);		// 읽기
//	public List<BoardVO> getList();		// 전체 읽기
	public List<PharmacyVO> getList(Criteria cri);
	// 7/20
	public int getTotal(Criteria cri);			
}
