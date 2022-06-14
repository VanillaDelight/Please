package com.saeyan.dto;


/*create table product(
	    code number(5),
	    name varchar2(100),
	    price number(8),
	    pictureurl varchar2(50),
	    description varchar(100),
	    primary key(code)
	);*/
public class ProductVO {
	private int code, price;
	private String name, pictureUrl, description;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
