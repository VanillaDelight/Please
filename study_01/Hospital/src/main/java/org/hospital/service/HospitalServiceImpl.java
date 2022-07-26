package org.hospital.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.hospital.mapper.HospitalMapper;
import org.hospital.criterial.HospitalCriterial;
import org.hospital.vo.HospitalVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class HospitalServiceImpl implements HospitalService{
	
	private HospitalMapper mapper;
	
	public void register(HospitalVO vo) {
		log.info("register------------------");
		mapper.insertSelectKey(vo);
	}

	@Override
	public HospitalVO get(Long hospitalslist) {
		return mapper.read(hospitalslist);
	}

	@Override
	public int modify(HospitalVO vo) {
		return mapper.update(vo);
	}

	@Override
	public int remove(Long hospitalslist) {
		return mapper.delete(hospitalslist);
	}


	@Override
	public List<HospitalVO> getList(HospitalCriterial hc) {
		return mapper.getListWithPagging(hc);
	}

	@Override
	public int getTotal(HospitalCriterial hc) {
		log.info("total count----------------------");
		return mapper.getTotalCount(hc);
	}

	
}
