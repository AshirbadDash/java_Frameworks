package com.kodnest.ll;

import java.util.PriorityQueue;

import java.util.TreeSet;

public class Treset {

	public static void main(String[] args) {
//		TreeSet ts = new TreeSet();
//		ts.add('r');
//		ts.add('t');
//		ts.add('a');
//		ts.add('r');
//		ts.add('t');
//	
//		System.out.println(ts);

//		PriorityQueue pq = new PriorityQueue();
//		pq.add(30);
//		pq.add(40);
//		pq.add(10);
//		pq.add(50);
//		pq.add(78);
//
//		System.out.println(pq);
		
		
		
		TreeSet ts = new TreeSet();
		ts.add(30);
		ts.add(40);
		ts.add(10);
		ts.add(50);
		ts.add(78);
		
		System.out.println(ts.last());
		System.out.println(ts.first());
	}

}
