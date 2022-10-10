package org.hospital.service;

import java.util.List;

import org.hospital.domain.Criteria;
import org.hospital.domain.SubjectVO;

public interface SubjectService {
	public void register(SubjectVO vo);	// 등록
	public int modify(SubjectVO vo);		// 수정
	public int remove(Long bno);		// 삭제
	public SubjectVO get(Long bno);		// 읽기
//	public List<BoardVO> getList();		// 전체 읽기
	public List<SubjectVO> getList(Criteria cri);
	// 7/20
	public int getTotal(Criteria cri);		
}
