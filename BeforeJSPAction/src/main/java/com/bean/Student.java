package com.bean;

import java.io.Serializable;

public class Student implements Serializable{
	
	private int id;
	private String name;
	private double marks;
	
	public Student() {
		
	}
	
	public Student(int id, String name, double marks) {
		super();
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
