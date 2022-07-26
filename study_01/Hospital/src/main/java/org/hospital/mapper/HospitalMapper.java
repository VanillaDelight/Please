package org.hospital.mapper;

import java.util.List;
import java.util.Map;

import org.hospital.criterial.HospitalCriterial;
import org.hospital.vo.HospitalVO;

public interface HospitalMapper {
	public List<HospitalVO> getList();
	public HospitalVO read(Long hospitalslist);
	public int delete(Long hospitalslist);
	public int insert(HospitalVO vo);
	public int insertSelectKey(HospitalVO vo);
	public int update(HospitalVO vo);
	public List<HospitalVO> getListWithPagging(HospitalCriterial hc);
	public int getTotalCount(HospitalCriterial hc);
	public List<HospitalVO> searchTest(Map<String,  Map<String,String>> map);
}
