package org.hospital.mapper;

import java.util.List;

import org.hospital.domain.AddressPharVO;
import org.hospital.domain.Criteria;

public interface AddressPharMapper {
	public List<AddressPharVO> getList();
	public AddressPharVO read(Long bno);
	public int insert(AddressPharVO vo);
	public List<AddressPharVO> getListWithPagging(Criteria cri);
	public int insertSelectKey(AddressPharVO vo);
	public int getTotalCount(Criteria cri);
}
