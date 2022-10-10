package org.hospital.mapper;

import java.util.List;
import java.util.Map;

import org.hospital.domain.Criteria;
import org.hospital.domain.InquiryVO;

public interface InquiryMapper {
	public List<InquiryVO> getList();
	public InquiryVO read(Long bno);
	public int delete(Long bno);
	public int insert(InquiryVO vo);
	public int insertSelectKey(InquiryVO vo);
	public int update(InquiryVO vo);
	public List<InquiryVO> getListWithPagging(Criteria cri);
	public int getTotalCount(Criteria cri);
	
	//검색조건
	public List<InquiryVO> searchTest( Map<String,  Map<String,String>> map);
}