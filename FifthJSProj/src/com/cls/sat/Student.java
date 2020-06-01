package com.cls.sat;



public class Student {
	
	private int id;
	private String sname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return this.id+":"+this.sname;
	}
}
