package org.hospital.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

/*
RNO        NOT NULL NUMBER(10)     
BNO        NOT NULL NUMBER(10)     
REPLY      NOT NULL VARCHAR2(1000) 
REPLYER    NOT NULL VARCHAR2(50)   
REPLYDATE           DATE           
UPDATEDATE          DATE           
*/

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplyVO {
	private Long rno, bno, rate;
	private String reply, replyer, id;
	private Date replyDate, updateDate;
}
