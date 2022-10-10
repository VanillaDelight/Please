package org.hospital.mapper;

import java.util.List;
import java.util.Map;

import org.hospital.domain.Criteria;
import org.hospital.domain.PharmacyVO;

public interface PharmacyMapper {
	public List<PharmacyVO> getList();
	public PharmacyVO read(Long bno);
	public int delete(Long bno);
	public int insert(PharmacyVO vo);
	public int insertSelectKey(PharmacyVO vo);
	public int update(PharmacyVO vo);
	public List<PharmacyVO> getListWithPagging(Criteria cri);
	public int getTotalCount(Criteria cri);
	
	//검색조건
	public List<PharmacyVO> searchTest( Map<String,  Map<String,String>> map);
}
