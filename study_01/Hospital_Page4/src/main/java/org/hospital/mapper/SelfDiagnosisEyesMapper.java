package org.hospital.mapper;

import java.util.List;
import java.util.Map;

import org.hospital.domain.Criteria;
import org.hospital.domain.SelfDiagnosisEyesVO;

public interface SelfDiagnosisEyesMapper {
	public List<SelfDiagnosisEyesVO> getList();
	public SelfDiagnosisEyesVO read(Long bno);
	public int delete(Long bno);
	public int insert(SelfDiagnosisEyesVO vo);
	public int insertSelectKey(SelfDiagnosisEyesVO vo);
	public int update(SelfDiagnosisEyesVO vo);
	public List<SelfDiagnosisEyesVO> getListWithPagging(Criteria cri);
	public int getTotalCount(Criteria cri);
	
	//검색조건
	public List<SelfDiagnosisEyesVO> searchTest( Map<String,  Map<String,String>> map);
}
