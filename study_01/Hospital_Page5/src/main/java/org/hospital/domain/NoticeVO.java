package org.hospital.domain;

import java.util.Date;

import lombok.Data;

/*
create table notice(
		   bno number(10,0) primary key,             -- 번호       // primary key
		   title VARCHAR2(200) not null,        -- 제목
		   content varchar2(2000) not null,     -- 내용
		   writer varchar2(20) not null,        -- 작성자
		   regdate date default sysdate,       -- 작성일
		   updatedate date default sysdate      -- 수정일
		);*/

@Data
public class NoticeVO {
	private Long bno;
	private String title, content, writer;
	private Date regdate, updatedate;
}










