package com.example.demo.Model;

public class Student {
	private int id;
	private String name;
	private String Branch;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
public Student() {
		
	}
	public Student(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		Branch = branch;
	}
	
	
}
