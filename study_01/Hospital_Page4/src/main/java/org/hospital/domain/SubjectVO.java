package org.hospital.domain;

import java.util.Date;

import lombok.Data;

@Data
public class SubjectVO {
	private Long bno;
	private String hospitalsub, symptom;
	private Date regdate, updatedate;
}
