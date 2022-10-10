package org.hospital.mapper;

import java.util.List;
import java.util.Map;

import org.hospital.domain.Criteria;
import org.hospital.domain.DiseaseVO;


public interface DiseaseMapper {
	public List<DiseaseVO> getList();
	public DiseaseVO read(Long bno);
	public int delete(Long bno);
	public int insert(DiseaseVO vo);
	public int insertSelectKey(DiseaseVO vo);
	public int update(DiseaseVO vo);
	public List<DiseaseVO> getListWithPagging(Criteria cri);
	public int getTotalCount(Criteria cri);
	
	
	public List<DiseaseVO> searchTest( Map<String,  Map<String,String>> map);

}
