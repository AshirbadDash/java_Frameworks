package com.kodnest.bean;

public class Laptop {

	String name;
	String Color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setter name");
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
		System.out.println("setter color");
	}

	public Laptop(String name, String color) {
		super();
		this.name = name;
		Color = color;
		System.out.println("parameterized constructor");
	}

	public Laptop() {
		super();
		System.out.println("o-param constructor");

	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", Color=" + Color + "]";
	}

}
