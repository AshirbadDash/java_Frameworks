package com.framework;

import java.util.LinkedList;

public class Demo2 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();

		ll.add("branch1");
		ll.add("branch2");
		ll.add("branch3");
		ll.add("branch4");
		ll.add("branch5");
		ll.add("branch6");
		
		System.out.println(ll);
		
		ll.add(3, "12");
		
		ll.add(0, "2");
		System.out.println(ll);
		ll.set(0, "3");
		System.out.println(ll);
		ll.remove("3");
		System.out.println(ll);
		 

	}
 
}
