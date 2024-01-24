package com.kodnest.al;

import java.util.Iterator;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
//			System.out.println(al);
//			al.size();
//			System.out.println(al.size());

		// using for loop
//			for (int i = 0; i < al.size(); i++) {
//				System.out.println(al.get(i) + " ");
//			}
//			
		// using while loop

//			int i=0;
//			while(i<al.size()) {
//				
//				System.out.println(al.get(i) + " ");
//				i++;
//			}

		// using do-while loop

//			int num = 0;
//			do {
//				System.out.println(al.get(num) + " ");
//				num++;
		//
//			} while (num < al.size());

		// using for-each loop

//			for (Object ele : al) {
//				System.out.println(ele);
//			}

		// ITERATOR

		Iterator it = ll.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
