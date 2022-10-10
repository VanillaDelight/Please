package org.hospital.mapper;

import java.util.List;
import java.util.Map;

import org.hospital.domain.Criteria;
import org.hospital.domain.SubjectVO;

public interface SubjectMapper {
	public List<SubjectVO> getList();
	public SubjectVO read(Long bno);
	public int delete(Long bno);
	public int insert(SubjectVO vo);
	public int insertSelectKey(SubjectVO vo);
	public int update(SubjectVO vo);
	public List<SubjectVO> getListWithPagging(Criteria cri);
	public int getTotalCount(Criteria cri);
	
	//검색조건
	public List<SubjectVO> searchTest( Map<String,  Map<String,String>> map);
}
