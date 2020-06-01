package com.sat.ser;

public class Register {
	private int id;
	private String rname;
	private String remail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRemail() {
		return remail;
	}
	public void setRemail(String remail) {
		this.remail = remail;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" "+this.rname+" "+this.remail;
	}
}
