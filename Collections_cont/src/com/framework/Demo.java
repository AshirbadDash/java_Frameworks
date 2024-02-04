package com.framework;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add("abcde");
		al.add("a");
		al.add("a");
		al.add(null);
		System.out.println(al);
		al.remove("a");
		System.out.println(al);
		System.out.println(al.get(0));

		// add and addAll

		ArrayList cpl = new ArrayList();
		cpl.add("virat");
		cpl.add("dhoni");
		cpl.add("dravid");
		cpl.add("sehwag");

		ArrayList fpl = new ArrayList();
		fpl.add("ronaldo");
		fpl.add("messi");

		fpl.add(0, "MESSI");
		fpl.set(0, "john");

		ArrayList players = new ArrayList();
		players.add(fpl);
		players.add(cpl);

		System.out.println(fpl);
		System.out.println(cpl);
		System.out.println(players);

		players.addAll(fpl);

		players.addAll(cpl);
		System.out.println(players);

	}
}