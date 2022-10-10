package org.hospital.domain;

import java.util.Date;

import lombok.Data;

@Data
public class HospitalsVO {
	private String hosname, address, phone, 
	subject, workday, opentime, closetime, 
	holiday, holisubject, location;
	private Long bno;
	private Date regdate, updatedate;
}
