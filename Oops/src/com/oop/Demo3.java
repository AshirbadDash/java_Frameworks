package com.oop;

/**
 * @Inheritance
 * 
 *              it is inheriting the properties of the parent class into child
 *              class
 * 
 *              or
 * 
 *              inheritance is the procedure by which one object acquired the
 *              properties and behaviors of a parent class
 * 
 * 
 * 
 *              ---->Inheritance creates is-a relationship
 * 
 *              parent / super class ---- child class
 * 
 * 
 * 
 *              ADVANTAGE
 * 
 *              1.code reusbility
 * 
 *              2.we can achieve polymorphism using inheritance
 * 
 * 
 *              DISADVANTAGE
 * 
 *              1.make classes tightly coupled
 * 
 * 
 *              ----------------types-----------------------------
 * 
 *              1.single
 * 
 *              2.multi-level
 * 
 *              3.hierarchical
 * 
 *              4.multiple(not supported due to code ambiguity) as a child
 *              cannot have 2 parent
 * 
 *              5.hybrid(not supported due to code ambiguity)
 * 
 * 
 * 
 *              -->constructor cannot be inherited -->private accessibility
 * 
 * 
 *              EVERY CLASS HAS A PARENT OR SUPER CLASS EXCEPT OBJECT CLASS AS
 *              IT IS A TOP LEVEL CLASS
 * 
 *              if any class is not extending then by default it will extend
 *              object class
 * 
 * 
 */

class Demo {

	void eat() {

		System.out.println("I am eating");

	}
}

public class Demo3 extends Demo {
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.eat();

	}

}
//
//class Four extends Demo3,Demo {
//	public static void main(String[] args) {
//	
//	Four four = new Four();
//	four.eat();
//	}
//}

class Five extends Demo3 {
	public static void main(String[] args) {
		Five five = new Five();
		five.eat();
	}

}