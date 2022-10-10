package org.hospital.service;

import java.util.List;

import org.hospital.domain.Criteria;
import org.hospital.domain.DiseaseVO;


public interface DiseaseService {
	public void register(DiseaseVO vo);	
	public int modify(DiseaseVO vo);		
	public int remove(Long bno);		
	public DiseaseVO get(Long bno);		

	public List<DiseaseVO> getList(Criteria cri);
	// 7/20
	public int getTotal(Criteria cri);
}
