package com.basic;

public class Student {
	String name;
	int mark;
	String id;
	public Student(String name,int mark,String id) {
		this.name = name;
		this.mark = mark;
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

}
