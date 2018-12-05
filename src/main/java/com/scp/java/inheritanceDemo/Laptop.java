package com.scp.java.inheritanceDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Laptop_of_student")
@PrimaryKeyJoinColumn(name="STUD_ID")
public class Laptop extends Student{
	
private int lapPrice;
private String lapName;

public int getLapPrice() {
	return lapPrice;
}
public void setLapId(int lapPrice) {
	this.lapPrice = lapPrice;
}
public String getLapName() {
	return lapName;
}
public void setLapName(String lapName) {
	this.lapName = lapName;
}
public Laptop(int lapPrice, String lapName) {
	super();
	this.lapPrice = lapPrice;
	this.lapName = lapName;
}

@Override
public String toString() {
	return "\n Laptop [lapPrice=" + lapPrice + ", lapName=" + lapName + "]";
}
public Laptop() {
	super();
}




}
