package org.zerock.mapper;

import org.apache.ibatis.annotations.Insert;

public interface Sample1Mapper {
	@Insert("insert into tbl_sample1 (cal1) values (#{data})")
	public int insertCal1(String data);
}
