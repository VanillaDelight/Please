package org.spring.service;

import org.spring.domain.MemberVO;

public interface LoginService {
	public MemberVO LoginCheck(MemberVO vo);
	public int join(MemberVO vo);
	public int nameCheck(String name);
	public int idCheck(String id);
	public void certifiedPhoneNumber(String userPhoneNumber, int randomNumber);
	public int emailCheck(String email);
	public String find_id(String email, String phone);
	public int userCheck(MemberVO vo);
	public void update_pwd(MemberVO vo);
}
