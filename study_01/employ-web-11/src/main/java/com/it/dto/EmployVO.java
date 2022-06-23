package com.it.dto;

import java.sql.Timestamp;

/*create table employ(
	    id varchar2(10) not null,
	    pass varchar2(10) not null,
	    name varchar2(24),
	    lev char(1) default 'A',
	    enter date default sysdate,
	    gender char(1) default '1',
	    phone varchar2(30),
	    primary key(id)
	);*/

public class EmployVO {
	private String id, pass, name, lev, gender, phone;
	private Timestamp enter;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLev() {
		return lev;
	}
	public void setLev(String lev) {
		this.lev = lev;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Timestamp getEnter() {
		return enter;
	}
	public void setEnter(Timestamp enter) {
		this.enter = enter;
	}
	
	
}
