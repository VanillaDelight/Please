
package org.hospital.mapper;

import java.util.List;
import java.util.Map;

import org.hospital.domain.Criteria;
import org.hospital.domain.NoticeVO;

public interface NoticeMapper {
	public List<NoticeVO> getList();
	public NoticeVO read(Long bno);
	public int delete(Long bno);
	public int insert(NoticeVO vo);
	public int insertSelectKey(NoticeVO vo);
	public int update(NoticeVO vo);
	public List<NoticeVO> getListWithPagging(Criteria cri);
	public int getTotalCount(Criteria cri);
	
	//검색조건
	public List<NoticeVO> searchTest( Map<String,  Map<String,String>> map);
}
