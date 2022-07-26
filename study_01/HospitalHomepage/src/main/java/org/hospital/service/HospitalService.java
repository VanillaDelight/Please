package org.hospital.service;

import java.util.List;

import org.hospital.criterial.HospitalCriterial;
import org.hospital.vo.HospitalVO;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

public interface HospitalService {

	public void register(HospitalVO vo);
	public int modify(HospitalVO vo);
	public int remove(Long hospitalslist);
	public HospitalVO get(Long hospitalslist);
	public List<HospitalVO> getList(HospitalCriterial hc);
	public int getTotal(HospitalCriterial hc);
}
