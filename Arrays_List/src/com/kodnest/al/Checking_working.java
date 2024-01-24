//package com.kodnest.al;
//
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedHashSet;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.TreeSet;
//
//public class Checking_working {
//	public static void main(String[] args) {
//
//		// ArrayList
//		ArrayList al = new ArrayList();
//		al.add(10);
//		al.add(10);
//		al.add(null);
//		al.add("String");
//
//		// for-each
//
//		for (Object o : al) {
//			System.out.println(o);
//
//		}
//		// for
//
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//
//		}
//
////		 Iterator
//		
//		Iterator it = al.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//
////		all are working
//
//		// LinkedList
//
//		LinkedList ll = new LinkedList();
//		ll.add(10);
//		ll.add(10);
//		ll.add(null);
//		ll.add("String");
//
//		// for-each
//
//		for (Object o : ll) {
//			System.out.println(o);
//
//		}
//		// for
//
//		for (int i = 0; i < ll.size(); i++) {
//			System.out.println(al.get(i));
//
//		}
//
//		Iterator it = ll.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//
//	}
////		 all are working
//
////		ArrayDeque
//		ArrayDeque al = new ArrayDeque();
//		al.add(10);
//		al.add(10);
//		al.add(null);
//		al.add("String");
//
//		// for-each
//
//		for (Object o : al) {
//			System.out.println(o);
//
//		}
//		// for
//
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//
//		}
//
//		//Iterator
//		Iterator it = al.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
////		 null for-loop and elements are not sorted not supported
//
////		 PriorityQueue
//		
//		PriorityQueue pq = new PriorityQueue();
//		pq.add(10);
//		pq.add(10);
//		pq.add(30); //order of insertion not allowed
//		pq.add(null);//not allowed
//		pq.add("String"); //not allowed
//
//		// for-each
//
//		for (Object o : pq) {
//			System.out.println(o);
//
//		}
//		// for
//
//		for (int i = 0; i < pq.size(); i++) {
//			System.out.println(pq.get(i));
//
////		} //not allowed
//
//		// Iterator
//			
//		Iterator it = pq.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//
//		}
////		 TreeSet
//
//		TreeSet ts = new TreeSet();
//		ts.add(10);
//		ts.add(10); //Duplicate not allowed
//		ts.add(30); //null not allowed
//		ts.add(null); //
//		ts.add("String");
//
//		// for-each
//
//		for (Object o : ts) {
//			System.out.println(o);
//
//		}
//		// for
//
//		for (int i = 0; i < ts.size(); i++) {
//			System.out.println(ts.get(i));
//
//		}
//
//		// Iterator
//		Iterator it = ts.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//
//
//		}
//
//		// HASHSET
//
//		HashSet hs = new HashSet();
//		hs.add(10);
//		hs.add(10); // Duplicate not allowed
//		hs.add(30); // null not allowed
//		hs.add(null); //
//		hs.add("String");
//
//		// for-each
//		
//
//		for (Object o : hs) {
//			System.out.println(o);
//
//		}
//		// for
//
//		for (int i = 0; i < hs.size(); i++) {
//			System.out.println(hs.get(i));
//
//		} //not working
//
//		// Iterator
//		Iterator it = hs.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//
//		}
//
//		// HASHSET
//
//		LinkedHashSet lhs = new LinkedHashSet();
//		lhs.add(10);
//		lhs.add(10); // Duplicate not allowed
//		lhs.add(30); // null not allowed
//		lhs.add(null); //
//		lhs.add("String");
//
//		// for-each
//
//		for (Object o : lhs) {
//			System.out.println(o);
//
//		}
//				// for
//		//
//				for (int i = 0; i < lhs.size(); i++) {
//					System.out.println(lhs.get(i));
//		//
//				} //not working
//
//		// Iterator
//		Iterator it = lhs.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//
//		}
//
//
//	}
//
//
//}
