package org.hospital.domain;

import java.util.Date;

import lombok.Data;

@Data
public class TermsVO {
	private String title, content;
	private Long bno;
	private Date regdate, updatedate;
}
