package com.oop;

/**
 * @Relationship
 * 
 * 
 *               Type of relationships between classes
 * 
 *               a.is-a(inheritance) inheriting the property of the parent class
 *               into child class
 * 
 *               --extends
 * 
 *               --blood relation
 * 
 *               --tightly coupled
 * 
 *               --bottom to top
 * 
 *               ----------advantages--------------------
 * 
 *               1.code reusibility
 * 
 *               2.cost cutting
 * 
 *               3.reduce redundancy
 * 
 * 
 *               ----------------disadvantage---------------------
 * 
 *               tightly coupled
 * 
 * 
 * 
 * 
 *               b.has-a(association)
 * 
 * 
 *               --reference variable,new keyword
 * 
 *               --non blood relation
 * 
 *               --not tightly coupled
 * 
 *               --top to bottom
 * 
 *               1.aggregation (weak bonding) between classes
 * 
 *               ++++++++++++++++++++++++++++++++++
 * 
 *               if contained object is there
 * 
 *               without the existence of container object
 * 
 *               +++++++++++++++++++++++++++++++++++
 * 
 *               2.composition (strong bonding) between classes
 * 
 * 
 *               ++++++++++++++++++++++++++++++++++
 * 
 *               if contained object is also not there
 * 
 *               without the existence of container object
 * 
 *               +++++++++++++++++++++++++++++++++++
 * 
 * 
 *               car has a music player(weak)
 * 
 *               car has a engine (strong)
 * 
 * 
 * 
 */

/**
 * @Aggregation example
 */

public class Demo4 {

	public static void main(String[] args) {
		Pilot rahul = new Pilot("Rahul");

		Airlines airlines = new Airlines("Indigo", rahul);

		airlines.operate();
		airlines = null;
		rahul.fly();

		Book book = new Book(" Reading the content of the page.....");
		book.readPage();
		book = null;
		book.readPage();

	}

}

/**
 * Aggregation
 */

class Pilot {
	String name;

	void fly() {
		System.out.println(name + " is flying a plane");
	}
	
	public Pilot(String name) {
		this.name = name;

	}

}

class Airlines {
	String airName;
	Pilot pilot;

	public Airlines(String airName, Pilot pilot) {
		this.pilot = pilot;
		this.airName = airName;
	}

	void operate() {
		System.out.println(airName + " is operating.....");
		pilot.fly();
	}

}

class Page {
	String content;

	public Page(String content) {
		this.content = content;
	}

	void displayContent() {
		System.out.println(content);

	}

}

class Book {
	Page page;

	public Book(String content) {
		this.page = new Page(content);
	}

	void readPage() {
		System.out.println("The pages are");
	}
}