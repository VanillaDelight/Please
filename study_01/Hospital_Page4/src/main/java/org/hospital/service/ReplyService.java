package org.hospital.service;

import java.util.List;

import org.hospital.domain.ReplyVO;


public interface ReplyService {
	public int register(ReplyVO vo);
	public ReplyVO get(Long rno);
	public int modify(ReplyVO vo);
	public int remove(Long bno);
	public List<ReplyVO> getList(Long bno);
}
