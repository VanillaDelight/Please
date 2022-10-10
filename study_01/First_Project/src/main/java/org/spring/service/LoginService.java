package org.spring.service;

import java.util.List;

import org.spring.domain.ChartVO;
import org.spring.domain.MemberVO;

public interface LoginService {
	
	public List<ChartVO> getChart();
	
	public MemberVO LoginCheck(MemberVO vo);
	public int join(MemberVO vo);
	public int nameCheck(String name);
	public int idCheck(String id);
	public void certifiedPhoneNumber(String userPhoneNumber, int randomNumber);
	public int emailCheck(String email);
	public String find_id(String email, String phone);
	public int userCheck(MemberVO vo);
	public void update_pwd(MemberVO vo);
	public MemberVO getMember(MemberVO vo);
	public int pwdCheck(String id, String pwd);
	public void update(MemberVO vo);
}
