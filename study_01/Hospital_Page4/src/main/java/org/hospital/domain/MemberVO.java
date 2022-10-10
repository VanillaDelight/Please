package org.hospital.domain;

import java.util.Date;

import lombok.Data;

//create table member (
//	    id varchar2(50) not null primary key, --아이디
//	    pwd varchar2(50) not null, --비밀번호
//	    name varchar2(50) not null, --이름
//	    email varchar2(50), --이메일
//	    join_date date default sysdate --가입날짜
//	);

@Data
public class MemberVO {
	private String id, pwd, name, email, phone, join_date_pr;
	private Date join_date;
}
