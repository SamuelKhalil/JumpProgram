package com.sat.util;

import java.util.HashMap;
import java.util.Map;

import com.sat.ser.TServe;

public class UtilClsTse {
	
	private Integer[] arr1= {41,12,31,21,25};
	private String[] arr2= "Alfred Jennifer Naina Tara Chandra".split(" ");
	private String[] arr3= "Alfredddd@gmail.com Jennifer@gmail.com Naina@gmail.com Tara@gmail.com Chandra@gmail.com".split(" ");
	
	private Map<Integer, TServe> mt=new HashMap<>();
	
	public Map<Integer, TServe> retMap(){
		for (int i = 0; i < arr1.length; i++) {
			TServe ts=new TServe(arr1[i],arr2[i],arr3[i]);
			mt.put(arr1[i], ts);
		}
		return mt;
	}
	
	

}
