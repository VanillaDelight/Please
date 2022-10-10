package org.hospital.service;

import java.util.List;

import org.hospital.domain.Criteria;
import org.hospital.domain.SelfDiagnosisEyesVO;


public interface SelfDiagnosisEyesService {
	public void register(SelfDiagnosisEyesVO vo);	
	public int modify(SelfDiagnosisEyesVO vo);		
	public int remove(Long bno);		
	public SelfDiagnosisEyesVO get(Long bno);		

	public List<SelfDiagnosisEyesVO> getList(Criteria cri);
	// 7/20
	public int getTotal(Criteria cri);

}
