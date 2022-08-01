package org.spring.mapper;

import org.apache.ibatis.annotations.Param;
import org.spring.domain.MemberVO;

public interface LoginMapper {
	public MemberVO loginCheck(MemberVO vo);
	public int join(MemberVO vo);
	public int nameCheck(String name);
	public int idCheck(String id);
	public int emailCheck(String email);
	public String find_id(@Param("email") String email, @Param("phone") String phone);
	public int userCheck(MemberVO vo);
	public void update_pwd(MemberVO vo);
}
