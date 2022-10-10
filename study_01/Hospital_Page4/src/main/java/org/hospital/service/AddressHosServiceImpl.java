package org.hospital.service;

import java.util.List;

import org.hospital.domain.AddressHosVO;
import org.hospital.domain.Criteria;
import org.hospital.mapper.AddressHosMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class AddressHosServiceImpl implements AddressHosService {
	
	private AddressHosMapper mapper;
	
	public void register(AddressHosVO vo) {
		log.info("register...............................................");
		//	mapper.insert(vo);
		mapper.insertSelectKey(vo);
	}

	@Override
	public AddressHosVO get(Long bno) {
		return mapper.read(bno);
	}

	@Override
	public List<AddressHosVO> getList(Criteria cri) {
		return mapper.getListWithPagging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		log.info("get total count");
		return mapper.getTotalCount(cri);
	}

}
