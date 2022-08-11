package org.zerock.domain;

import java.util.Date;

import lombok.Data;

/*
BNO        NOT NULL NUMBER(10)     
TITLE      NOT NULL VARCHAR2(200)  
CONTENT    NOT NULL VARCHAR2(2000) 
WRITER     NOT NULL VARCHAR2(50)   
REGDATE             DATE           
UPDATEDATE          DATE
 */
@Data
public class BoardVO {
	private String hosname, address, phone, 
	subject, workday, opentime, closetime, 
	holiday, holisubject, location;
	private Long bno;
	private Date regdate, updatedate;
}















