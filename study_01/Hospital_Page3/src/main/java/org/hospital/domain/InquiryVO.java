package org.hospital.domain;

import java.util.Date;

import lombok.Data;

/*CREATE TABLE inquiry(
bno number(10,0) not null primary key, --넘버
title varchar2(500) not null, --제목
nickname varchar2(500) not null, --이름         
symptom2 varchar2(500) not null, --증상
text varchar2(500) not null, --본문
regdate date default sysdate,   --등록시간
updatedate date default sysdate --업데이트 시간
);*/

@Data
public class InquiryVO {
	private Long bno;
	private String title, nickname, symptom2,
	text;
	private Date regdate, updatedate;
}










