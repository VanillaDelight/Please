package org.hospital.service;

import java.util.List;

import org.hospital.domain.AddressPharVO;
import org.hospital.domain.Criteria;

public interface AddressPharService {
	public void register(AddressPharVO vo);	// 등록
	public AddressPharVO get(Long bno);		// 읽기
	public List<AddressPharVO> getList(Criteria cri);
	public int getTotal(Criteria cri);
}
