package org.hospital.service;

import java.util.List;

import org.hospital.domain.Criteria;
import org.hospital.domain.SubjectVO;
import org.hospital.mapper.SubjectMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class SubjectServiceImpl implements SubjectService {
	private SubjectMapper mapper;

	public void register(SubjectVO vo) {
		log.info("register...............................................");
		//	mapper.insert(vo);
		mapper.insertSelectKey(vo);
	}

	@Override
	public int modify(SubjectVO vo) {
		return mapper.update(vo);
	}

	@Override
	public int remove(Long bno) {
		return mapper.delete(bno);
	}

	@Override
	public SubjectVO get(Long bno) {
		return mapper.read(bno);
	}

	@Override
	public List<SubjectVO> getList(Criteria cri) {
		return mapper.getListWithPagging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		log.info("get total count");
		return mapper.getTotalCount(cri);
	}

}
