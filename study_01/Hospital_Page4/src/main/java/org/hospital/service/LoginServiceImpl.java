package org.hospital.service;

import java.util.HashMap;

import org.hospital.domain.MemberVO;
import org.hospital.mapper.LoginMapper;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

@Service
@Log4j
@AllArgsConstructor
public class LoginServiceImpl implements LoginService {
	LoginMapper mapper;

	@Override
	public MemberVO LoginCheck(MemberVO vo) {
		return mapper.loginCheck(vo);
	}

	@Override
	public int join(MemberVO vo) {
		return mapper.join(vo);
	}

	@Override
	public int nameCheck(String name) {
		return mapper.nameCheck(name);
	}

	@Override
	public int idCheck(String id) {
		return mapper.idCheck(id);
	}

	public void certifiedPhoneNumber(String userPhoneNumber, int randomNumber) {
		String api_key = "NCSGYYEA9LS54TO4";
	    String api_secret = "98FEIKHCMDAKAQM0Q4AKIVLKZSN3R3BC";
	    Message coolsms = new Message(api_key, api_secret);

	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", userPhoneNumber);    // 수신전화번호
	    params.put("from", "01031379769");    // 발신전화번호. 테스트시에는 발신,수신 둘다 본인 번호로 하면 됨
	    params.put("type", "SMS");
	    params.put("text", "[TEST] 인증번호는" + "["+randomNumber+"]" + "입니다."); // 문자 내용 입력
	    params.put("app_version", "test app 1.2"); // application name and version

	    try {
	        JSONObject obj = (JSONObject) coolsms.send(params);
	        System.out.println(obj.toString());
	      } catch (CoolsmsException e) {
	        System.out.println(e.getMessage());
	        System.out.println(e.getCode());
	      }
	    
	}

	@Override
	public int emailCheck(String email) {
		return mapper.emailCheck(email);
	}

	@Override
	public String find_id(String email, String phone) {
		String result = "";
		
		try {
		 result= mapper.find_id(email, phone);
		 
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return result ;
	}

	@Override
	public int userCheck(MemberVO vo) {
		return mapper.userCheck(vo);
	}

	@Override
	public void update_pwd(MemberVO vo) {
		mapper.update_pwd(vo);
	}

	@Override
	public MemberVO getMember(MemberVO vo) {
		return mapper.getMember(vo);
	}

	@Override
	public int pwdCheck(String id, String pwd) {
		return mapper.pwdCheck(id, pwd);
	}

	@Override
	public void update(MemberVO vo) {
		mapper.update_member(vo);
	}

	@Override
	public MemberVO mypage(String id) {
		return mapper.getmypage(id);
	}

	@Override
	public void deleteMember(MemberVO vo) {
		mapper.deleteMember(vo);
	}
}