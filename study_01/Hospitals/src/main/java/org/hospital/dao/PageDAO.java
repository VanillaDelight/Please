package org.hospital.dao;

import org.hospital.criterial.HospitalCriterial;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageDAO {
	private int startPage;
	private int endPage;
	private boolean prev,next;
	
	private int total;
	private HospitalCriterial cri;
	
	public PageDAO(HospitalCriterial cri, int total) {
		this.cri = cri;
		this.total = total;
		
		this.endPage = (int)(Math.ceil(cri.getPageNum()/10.0)) * 10;
		this.startPage = endPage-9;
		
		int readEnd = (int)(Math.ceil(total*1.0)/cri.getAmount());
		if(endPage>readEnd) {
			endPage = readEnd;
		}
		
		this.prev = this.startPage>1;
		this.next = this.endPage < readEnd;
	}
}
