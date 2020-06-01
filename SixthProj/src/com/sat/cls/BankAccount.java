package com.sat.cls;

public class BankAccount {
	private String actid;
	public BankAccount(String actid, String bname, String loc) {
		super();
		this.actid = actid;
		this.bname = bname;
		this.loc = loc;
	}
	private String bname;
	private String loc;
	@Override
	public String toString() {
		String j=String.format("\tAccountId:%s<br>Bank Name:%s<br>Location:%s", this.actid,this.bname,this.loc);
		return j;
	}
}
