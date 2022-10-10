package org.hospital.domain;

//create table hospital_address(
//	    bno number(10,0) primary key,
//	    centerx number(20,15) not null,
//	    centery number(20,15) not null,
//	    content varchar(200) not null,
//	    latlngx number(20,15) not null,
//	    latlngy number(20,15) not null
//);

import lombok.Data;

@Data
public class AddressHosVO {

	private String content;
	private Long bno;
	private double centerx, centery, latlngx, latlngy;
}
