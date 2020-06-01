package com.sat.ser;

import java.util.Arrays;
import java.util.Vector;

public class UtilCls {
	private Integer[] arr1= {0,1,2,3,4};
	private String[] arr2= {"John","Abraham","Matilda","Johann","Cutler"};
	private String[] arr3={"John@yahoo.com","Abraham@yahoo.com","Matilda@yahoo.com","Johann@yahoo.com","Cutler@yahoo.com"};
	
	private Vector<Person> vp=new Vector<>();
	
	public Vector<Person> retVec(){
		Arrays.asList(arr1).stream().forEach(n->{
			int a=Integer.valueOf(n.toString());
			Person pp=new Person();
			pp.setId(a+1);
			pp.setName(arr2[a]);
			pp.setEmail(arr3[a]);
			vp.add(pp);
		});
		
//		for (int a = 0; a < arr1.length; a++) {
//			Person pp=new Person();
//			pp.setId(arr1[a]);
//			pp.setName(arr2[a]);
//			pp.setEmail(arr3[a]);
//			vp.add(pp);
//		}
		return vp;
	}
}
