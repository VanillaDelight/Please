package org.hospital.service;

import java.util.List;

import org.hospital.domain.AddressPharVO;
import org.hospital.domain.Criteria;
import org.hospital.mapper.AddressPharMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class AddressPharServiceImpl implements AddressPharService {

	private AddressPharMapper mapper;

	@Override
	public void register(AddressPharVO vo) {
		log.info("register...............................................");
		//	mapper.insert(vo);
		mapper.insertSelectKey(vo);
	}

	@Override
	public AddressPharVO get(Long bno) {
		return mapper.read(bno);
	}

	@Override
	public List<AddressPharVO> getList(Criteria cri) {
		return mapper.getListWithPagging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		log.info("get total count");
		return mapper.getTotalCount(cri);
	}
	
	
}
