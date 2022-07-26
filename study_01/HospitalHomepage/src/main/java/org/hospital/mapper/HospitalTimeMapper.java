package org.hospital.mapper;

import org.apache.ibatis.annotations.Select;

public interface HospitalTimeMapper {

	@Select("select sysdate from dual")
	public String getTime();

	public String getTime2();
}
