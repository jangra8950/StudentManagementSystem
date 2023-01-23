package com.stud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	private int marks;
	private String name;
	private String address;
	public Student() {
		
	}
	public Student(int no, int marks, String name, String address) {
		super();
		this.no = no;
		this.marks = marks;
		this.name = name;
		this.address = address;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
    
	
	
}
