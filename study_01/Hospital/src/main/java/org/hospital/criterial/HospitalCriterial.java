package org.hospital.criterial;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HospitalCriterial {

	private int pageNum;
	private int amount;
	
	private String type;
	private String keyword;
	
	public String[] getTypeArr() {
		return type == null ? new String[] {} :  type.split("");
	}
	
	public HospitalCriterial() {
		this(1, 10);
	}
	
	public HospitalCriterial(int pageNum, int amount) {
		this.pageNum  = pageNum;
		this.amount = amount;
	}
	
}
