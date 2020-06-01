package com.str.cls;

import java.util.Vector;

public class MnCls {

	public static void main(String[] args) {
		Vector vec=new Vector();
		//Size is un-limited
		//Type is also is also unspecified
//		vec.add("gagaga");
//		vec.add(21);
//		vec.add(21.2222f);
//		vec.add(21.2222222);
		//A collection whose type is checked at design time instead of run time
//		Vector<String> vec1=new Vector<>();
//		vec1.add("21");
		
//		String a="1";
//		String b="2";
//		System.out.println(a+b);
		
		Vector<MyFace> mvec=new Vector<>();
		ChildA aa=new ChildA();
		ChildB bb=new ChildB();
		mvec.add(aa);
		mvec.add(bb);
		mvec.add(new MyFace() {
			@Override
			public void tester() {
				System.out.println("This is from anon");
			}
		});
		mvec.add(new ChildC());
		//Only reference types
		for(MyFace a:mvec) {
			a.tester();
		}
		
		Vector<ChildC> veccc=new Vector<>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
