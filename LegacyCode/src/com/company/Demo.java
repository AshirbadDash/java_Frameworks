package com.company;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class Demo {
	public static void main(String[] args) {
		// stack

		Stack s = new Stack();
		s.add(1);

		// vector
		Vector v = new Vector();
		v.add(v);
		

		// HashTable

		Hashtable hs = new Hashtable();
		hs.put(hs, v)

		// Properties

		Properties p = new Properties();
		p.elements();
		p.put(p, v);

		// Enumeration

		Enumeration e = new Enumeration(); // interface
		e.getClass();

		// Dictioanry

		Dictionary d = new Dictionary(); // interface
		d.getClass();

	}

}
