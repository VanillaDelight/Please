package org.hospital.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hospital.domain.ReplyVO;

public interface ReplyMapper {
	public int insert(ReplyVO vo);
	public ReplyVO read(Long rno);
	public int delete(Long rno);
	public int update(ReplyVO vo);
	public List<ReplyVO> getList(Long bno);
	public int getCountByBno(Long bno);
}
