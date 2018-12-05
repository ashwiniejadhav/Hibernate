package com.scp.java.inheritanceDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.boot.model.source.spi.InheritanceType;

@Entity
@Table(name="student_info")
//@Inheritance(strategy=javax.persistence.InheritanceType.SINGLE_TABLE)
@Inheritance(strategy=javax.persistence.InheritanceType.JOINED)
public class Student {

	@Id
	private int studId;
	private String studName;
	private int marks;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int studId, String studName, int marks) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.marks = marks;
		
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", marks=" + marks + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	
}
