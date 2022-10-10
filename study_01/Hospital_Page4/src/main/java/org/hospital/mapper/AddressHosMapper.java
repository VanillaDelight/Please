package org.hospital.mapper;

import java.util.List;

import org.hospital.domain.AddressHosVO;
import org.hospital.domain.Criteria;

public interface AddressHosMapper {
	public List<AddressHosVO> getList();
	public AddressHosVO read(Long bno);
	public int insert(AddressHosVO vo);
	public List<AddressHosVO> getListWithPagging(Criteria cri);
	public int insertSelectKey(AddressHosVO vo);
	public int getTotalCount(Criteria cri);
}
