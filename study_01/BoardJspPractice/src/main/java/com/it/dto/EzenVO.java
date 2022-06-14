package com.it.dto;

import java.util.Date;

/*create table ezenboard(
	no int auto_increment,
  name varchar(34) not null,
  subject varchar(1000) not null,
  content text not null,
  pwd varchar(10) not null,
  regdate datetime,
  hit int default 0,
  primary key(no)
);*/

public class EzenVO {
	private int no, hit;
	private String name, subject, content, pwd, dbday, modday;
	private Date regdate, moddate;
	
	
	public String getModday() {
		return modday;
	}
	public void setModday(String modday) {
		this.modday = modday;
	}
	public Date getModdate() {
		return moddate;
	}
	public void setModdate(Date moddate) {
		this.moddate = moddate;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getDbday() {
		return dbday;
	}
	public void setDbday(String dbday) {
		this.dbday = dbday;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
}
