package org.hospital.domain;
/*
create table pharmacy( 
bno number(10,0) primary key,--넘버
name varchar2(200) not null,--약국이름          
address varchar2(2000) not null,--주소
phone varchar2(50) not null,--폰넘버
workday varchar2(50) not null,  -- 진료일
opentime varchar2(100) not null,--오픈시간
closetime varchar2(100) not null,--종료시간
holiday varchar(50) not null,     -- 휴무
regdate date default sysdate,
updatedate date default sysdate
);
*/
import java.util.Date;

import lombok.Data;

@Data
public class PharmacyVO {
	private String name, address, phone, 
	workday, opentime, closetime, holiday, location;
	private Long bno;
	private Date regdate, updatedate;
}
