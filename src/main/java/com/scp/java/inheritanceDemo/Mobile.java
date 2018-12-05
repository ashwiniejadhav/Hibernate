package com.scp.java.inheritanceDemo;

import javax.persistence.*;

@Entity
@Table(name="Mobile_of_student")
public class Mobile extends Student {
	
	private String mobi_Name;
	private int mobi_price;
	
	public String getMobi_Name() {
		return mobi_Name;
	}
	public void setMobi_Name(String mobi_Name) {
		this.mobi_Name = mobi_Name;
	}
	public int getMobi_int() {
		return mobi_price;
	}
	public void setMobi_int(int mobi_int) {
		this.mobi_price = mobi_int;
	}
	public Mobile(String mobi_Name, int mobi_int) {
		super();
		this.mobi_Name = mobi_Name;
		this.mobi_price = mobi_int;
	}
	@Override
	public String toString() {
		return "\n Mobile [mobi_Name=" + mobi_Name + ", mobi_int=" + mobi_price + "]";
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
