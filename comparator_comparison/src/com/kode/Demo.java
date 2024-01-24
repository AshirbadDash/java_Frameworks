package com.kode;

import java.util.LinkedHashMap;

public class Demo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(1, "java");
		hm.put(5, "html");
		hm.put(3, "css");
		hm.put(7, "javascript");

//		for(Object element: hm) {
//			System.out.println(hm);
//		}
//		Iterator it = hm.iterator();

		System.out.println(hm);

		for (int i = 0; i < hm.size(); i++) {
			System.out.println(hm.get(i));
			
			
			
			
			
			
		}
	}

}
