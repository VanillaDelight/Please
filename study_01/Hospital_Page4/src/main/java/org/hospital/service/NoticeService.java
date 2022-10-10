package org.hospital.service;

import java.util.List;

import org.hospital.domain.Criteria;
import org.hospital.domain.NoticeVO;

public interface NoticeService {
	public void register(NoticeVO vo);	// 등록
	public int modify(NoticeVO vo);		// 수정
	public int remove(Long bno);		// 삭제
	public NoticeVO get(Long bno);		// 읽기
//	public List<BoardVO> getList();		// 전체 읽기
	public List<NoticeVO> getList(Criteria cri);
	// 7/20
	public int getTotal(Criteria cri);		
}
