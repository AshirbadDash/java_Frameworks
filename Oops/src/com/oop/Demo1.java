package com.oop;

/**
 * @oops
 * 
 *       -->object oriented system/structure OOP is a programming paradigm or
 *       methodology it follows object oriented paradigm
 * 
 *       6 main pillars of oops
 * 
 *       -->Class -->Objects and methods -->Inheritance -->Abstraction
 *       -->Polymorphism -->encapsulation
 * 
 * 
 * 
 * @class ----------------------------------------------
 * 
 *        1.class is the collection of objects 2.class is not a real world
 *        entity it is just a template or blueprint or prototype 3.class doesn't
 *        occupy memory
 * 
 *        syntax:- access-modifier ClassName
 * 
 * 
 * @method --------------------------------------------------
 * 
 *         A set of codes which performs a particular task
 * 
 *         Advantages 1.remove code redundancy 2.code optimization
 * 
 *         syntax:- access-modifier return-type method-name(list of parameters)
 * 
 * 
 * @objects ----------------------------------------------------
 * 
 *          1.object is an instance of class
 * 
 *          2.object is real world entity
 * 
 *          3.object occupies memory
 * 
 *          object consist of 1.Identity-name 2.State/Attribute:-
 *          color,breed,age 3.Behavior/methods:- eat,run
 * 
 *          how to create an object -->new keyword -->newInstance() method
 *          -->clone() -->deserialization -->factory method
 * 
 * 
 *          using new keyword object can be created in three steps
 * 
 *          1.declaration :- declare a variable ex Animal buzo;
 * 
 *          2.instantiation :- use of new keyword buzo = new
 * 
 *          3.initialization :- buzo =new buzo(); the "new" keyword is followed
 *          by a call to a constructor.this call initializes the new object
 * 
 *          syntax:- Animal buzo = new Animal();
 * 
 * 
 *          three ways to initialize the object--put the values into the object
 *          1.by using reference variable
 * 
 *          2.by using method
 * 
 *          3.by using constructor
 * 
 * 
 * 
 * 
 */

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("1");

		Animal buzo = new Animal();
		buzo.eat();

		buzo.age = 10;
		buzo.color = "red";

		run();
		buzo.setColor("blue");
		buzo.SetAge(12);

		System.out.println(buzo.age + "\n" + buzo.color);
	}

	public static void run() {
		System.out.println("i am runing");
	}

}

class Animal {
	String color;
	int age;

	public void setColor(String color) {
		this.color = color;

	}

	public void SetAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("i am eating");

	}

}
