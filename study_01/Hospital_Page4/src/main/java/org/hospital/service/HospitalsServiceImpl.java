package org.hospital.service;

import java.util.List;

import org.hospital.domain.Criteria;
import org.hospital.domain.HospitalsVO;
import org.hospital.domain.ReplyVO;
import org.hospital.mapper.HospitalsMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class HospitalsServiceImpl implements HospitalsService {

	private HospitalsMapper mapper;
	
	public void register(HospitalsVO vo) {
		log.info("register...............................................");
		//	mapper.insert(vo);
		mapper.insertSelectKey(vo);
	}

	@Override
	public HospitalsVO get(Long bno) {
		return mapper.read(bno);
	}

	@Override
	public int modify(HospitalsVO vo) {
		return mapper.update(vo);
	}

	@Override
	public int remove(Long bno) {
		return mapper.delete(bno);
	}

	@Override
	public List<HospitalsVO> getList(Criteria cri) {
		return mapper.getListWithPagging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		log.info("get total count");
		return mapper.getTotalCount(cri);
	}

	 @Override
	   public List<ReplyVO> getReviewList(String id) {
	      return mapper.getReviewList(id);
	   }
	
}