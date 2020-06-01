package com.str.cls;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MyCls {

	public String retStr() {
		String u="";
		String[] arr= {"Tortoise","Sea Shell","Aligator","Croc","Swan"};
		u=Arrays.toString(arr);
		return u;
	}
	
	
	
	private Integer[] arr1= {10,20,30,40,50};
	private String[] arr2= {"Sorcery","Magic","Table Turning","Alchemy","Ayurveda"};
	
	private HashMap<Integer, String> hm=new HashMap<>();
	
	public HashMap<Integer, String> retMap(){
		for (int i = 0; i < arr1.length; i++) {
			hm.put(arr1[i], arr2[i]);
		}
		return hm;
	}
	
	private Set<String> mySet=new HashSet<>();
	private String[] arr3= {"Sorcery","Magic","Table Turning","Alchemy","Ayurveda","Sorcery","Magic","Table Turning","Alchemy","Ayurveda","Sorcery","Magic","Table Turning","Alchemy","Ayurveda","Sorcery","Magic","Table Turning","Alchemy","Ayurveda","Sorcery","Magic","Table Turning","Alchemy","Ayurveda","Sorcery","Magic","Table Turning","Alchemy","Ayurveda"};
	
	public Set<String> retSet(){
		for (int i = 0; i < arr3.length; i++) {
			mySet.add(arr3[i]);
		}
		return mySet;
	}
	
	
	
	
	
	
	
	
}
