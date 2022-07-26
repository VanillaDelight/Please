package org.hospital.vo;

import java.util.Date;

import lombok.Data;

//hospitalslist number(10,0),   
//hosname varchar2(200) not null,         -- 병원 이름    primary key
//address varchar2(2000) not null,        -- 주소
//phone varchar2(50) not null,            -- 전화번호
//subject varchar2(50) not null,          -- 진료과목
//workday varchar2(50) not null,          -- 진료일
//opentime varchar2(100) not null,        --진료 시간(시작)
//closetime varchar2(100) not null,       --진료 시간(종료)
//holiday varchar(50) not null,           -- 휴무
//holisubject varchar(50) not null,       -- 휴진 안내
//location varchar(50) not null           -- 병원 위치

@Data
public class HospitalVO {

	private String hosname, address, phone, 
	subject, workday, opentime, closetime, 
	holiday, holisubject, location;
	private Long hospitalslist;
	private Date regdate, updatedate;
}
















