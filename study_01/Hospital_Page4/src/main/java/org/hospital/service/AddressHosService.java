package org.hospital.service;

import java.util.List;

import org.hospital.domain.AddressHosVO;
import org.hospital.domain.Criteria;

public interface AddressHosService {
	public void register(AddressHosVO vo);	// 등록
	public AddressHosVO get(Long bno);		// 읽기
	public List<AddressHosVO> getList(Criteria cri);
	public int getTotal(Criteria cri);
}
