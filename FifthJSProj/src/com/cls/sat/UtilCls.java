package com.cls.sat;

import java.util.HashMap;
import java.util.Map;

public class UtilCls {
	
	private int arr1[]= {1,2,3,4,5};
	private String arr2[]= {"George","Jennifer","Raymond","Parker","Jenkins"};
	
	private Map<Integer, Student> ms=new HashMap<Integer, Student>();
	
	public Map<Integer, Student> retM(){
		for (int i = 0; i < arr1.length; i++) {
			Student ss=new Student();
			ss.setId(arr1[i]+100);
			ss.setSname(arr2[i]);
			ms.put((i+1), ss);
		}
		return ms;
	}

}
