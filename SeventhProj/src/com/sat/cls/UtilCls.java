package com.sat.cls;

import java.util.ArrayList;
import java.util.List;

public class UtilCls {

	private int sizel;
	private List<Cars> lc=new ArrayList<Cars>();
	private List<Register> lr=new ArrayList<>();
	
	private String[] arr1= {"Cadillac","Lincoln","Ford","Chrysler","Toyota"};
	private String[] arr2= {"Xion","Continental","Fiago","SS20","Camry"};
	
	private int[] arr11= {1,2,3,4,5};
	private String[] arr21= {"David","Thornburn","Lindsey","Logan","Thackerey"};
	private String[] arr22= {"David@gmail.com","Thornburn@gmail.com","Lindsey@gmail.com","Logan@gmail.com","Thackerey@gmail.com"};
	private String[] arr23= {"98757575755","8856565656","575757575757","8787878788","979797979797"};
	
	
	public List<Cars> retList(){
		for (int i = 0; i < arr1.length; i++) {
			Cars cc=new Cars();
			cc.setCname(arr2[i]);
			cc.setCbrand(arr1[i]);
			lc.add(cc);
		}
		return lc;
	}
	
	
	public List<Register> retRR(){
		for (int i = 0; i < arr1.length; i++) {
			Register rr=new Register();
			rr.setId(arr11[i]);
			rr.setRname(arr21[i]);
			rr.setRemail(arr22[i]);
			rr.setRmobile(arr23[i]);
			lr.add(rr);
		}
		setSizel(lr.size());
		return lr;
	}


	public int getSizel() {
		return sizel;
	}


	public void setSizel(int sizel) {
		this.sizel = sizel;
	}
	
	
}
