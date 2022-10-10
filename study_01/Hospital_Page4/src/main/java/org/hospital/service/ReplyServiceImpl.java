package org.hospital.service;

import java.util.List;

import org.hospital.domain.ReplyVO;
import org.hospital.mapper.HospitalsMapper;
import org.hospital.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
@Service
@Log4j
@AllArgsConstructor
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	private ReplyMapper mapper;
	
	@Autowired
	private HospitalsMapper boardMapper;
	
	@Transactional
	@Override
	public int register(ReplyVO vo) {
		return mapper.insert(vo);
	}

	@Transactional
	@Override
	public int remove(Long bno) {
		boardMapper.updateReplyCnt(bno, -1);
		return mapper.delete(bno);
	}
	
	@Override
	public ReplyVO get(Long rno) {
		return mapper.read(rno);
	}

	@Override
	public int modify(ReplyVO vo) {
		return mapper.update(vo);
	}

	@Override
	public List<ReplyVO> getList(Long bno) {
		return mapper.getList(bno);
	}


}
