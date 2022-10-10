package org.hospital.domain;

import lombok.Data;

@Data
public class AddressPharVO {

	private String content;
	private Long bno;
	private double centerx, centery, latlngx, latlngy;
}
