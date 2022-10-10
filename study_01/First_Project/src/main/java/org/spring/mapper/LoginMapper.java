package org.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.domain.ChartVO;
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
	public MemberVO getMember(MemberVO vo);
	public int pwdCheck(@Param("id") String id, @Param("pwd") String pwd);
	public void update(MemberVO vo);
	public List<ChartVO> getChart();
}
