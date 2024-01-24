package com.kodest.failfastfailsafe;

import java.util.Iterator; // failfast all classes inside 
import java.util.concurrent.CopyOnWriteArrayList; //failsafe ......

public class Copy_Write_ArrayList {
	public static void main(String[] args) {
		CopyOnWriteArrayList cw = new CopyOnWriteArrayList(); // copy is created and its pointing to copy
		cw.add(10);
		cw.add(20);
		cw.add(30);
		cw.add(40);

		Iterator it = cw.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			cw.add(99);

		}

		System.out.println(cw);

	}
}
