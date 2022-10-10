package org.hospital.service;

import java.util.List;

import org.hospital.domain.Criteria;
import org.hospital.domain.DiseaseVO;
import org.hospital.mapper.DiseaseMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class DiseaseServicelmpl implements DiseaseService {
	
	private DiseaseMapper mapper;

	@Override
	public void register(DiseaseVO vo) {
		log.info("register...............................................");
		//	mapper.insert(vo);
		mapper.insertSelectKey(vo);
		
	}

	@Override
	public int modify(DiseaseVO vo) {
		return mapper.update(vo);
	}

	@Override
	public int remove(Long bno) {
		return mapper.delete(bno);
	}

	@Override
	public DiseaseVO get(Long bno) {
		return mapper.read(bno);
	}

	@Override
	public List<DiseaseVO> getList(Criteria cri) {
		return mapper.getListWithPagging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		log.info("get total count");
		return mapper.getTotalCount(cri);
	}

}