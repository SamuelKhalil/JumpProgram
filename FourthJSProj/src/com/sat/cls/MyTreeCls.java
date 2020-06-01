package com.sat.cls;

import java.util.TreeMap;

public class MyTreeCls {

	private static Integer[] arr1= {501,201,101,401,301};
	private static String[] arr2= {"Alfred","Jumanji","Docker","Ansible","Chef"};
	
	private static TreeMap<Integer, String> tm=new TreeMap<>();

	static {
		for (int i = 0; i < arr1.length; i++) {
			tm.put(arr1[i], arr2[i]);
		}
	}
	
	public TreeMap<Integer, String> getTm() {
		return tm;
	}
	
	
	
	
	
}
