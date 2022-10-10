package org.hospital.domain;
/*
 * create table disease (
    bno number(10, 0) primary key,          -- 번호       // primary key
    dname varchar2(300) not null,       -- 질환명
    detail varchar(2000) not null,      -- 세부 질환
    image varchar2(2000) not null,      -- 이미지
    symptoms varchar2(2000) not null    -- 자세한 증상
);

 */

import lombok.Data;

@Data
public class DiseaseVO {

	private String dname, detail, image, symptoms; //변수
	private Long bno;
	

	}

