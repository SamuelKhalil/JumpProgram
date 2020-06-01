package com.sat.cls;

import java.util.HashMap;

public class CheckLogin {
	
	private String[] unames= {"david","daniel","suma","lily","rose"};
	private String[] pass= {"davida","daniela","sumaa","lilya","rosea"};
	private HashMap<String, String> hm=new HashMap<>();

	private void loadmap() {
		for (int i = 0; i < pass.length; i++) {
			hm.put(unames[i], pass[i]);
		}
	}
	String login="FALSE";
	
	/***
	 * This returns the status of login when user enters username and password
	 * @param uname Username
	 * @param pass Password
	 * @return the status string either true string or false string
	 */
	public String retCheck(String uname,String pass) {
		loadmap();
		
		String a=hm.get(uname.trim());
		if(a.equals(pass)) {
			login="TRUE";
		}
//		hm.keySet().stream().forEach(n->{
//			if(hm.get(n).equals(pass)) {
//				login="TRUE";
//			}
//		});
		return login;
	}
}
