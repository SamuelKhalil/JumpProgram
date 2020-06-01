package com.sat.ser;

public class TServe {
	private int id;
	private String name;
	private String email;
	public TServe() {}
	public TServe(int a,String b,String c) {
		this.id=a;
		this.name=b;
		this.email=c;
	}
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.email;
	}
}
