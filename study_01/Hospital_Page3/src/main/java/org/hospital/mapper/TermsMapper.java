package org.hospital.mapper;

import java.util.List;
import java.util.Map;

import org.hospital.domain.Criteria;
import org.hospital.domain.TermsVO;

public interface TermsMapper {
	public List<TermsVO> getList();
	public TermsVO read(Long bno);
	public int delete(Long bno);
	public int insert(TermsVO vo);
	public int insertSelectKey(TermsVO vo);
	public int update(TermsVO vo);
	public List<TermsVO> getListWithPagging(Criteria cri);
	public int getTotalCount(Criteria cri);
	
	//검색조건
	public List<TermsVO> searchTest( Map<String,  Map<String,String>> map);
}
