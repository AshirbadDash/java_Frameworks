package com.kodnest.beans;

public class Trainer {
	int id;
	String name;

	public Trainer() {
		super();
		System.out.println("0-param constructor");
	}

	public Trainer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("parameterized constructor");
	}

	public int getId() {
		System.out.println("getter-id");
		return id;
	}

	public void setId(int id) {
		System.out.println("setter-id");
		this.id = id;
	}

	public String getName() {
		System.out.println("getter-name");
		return name;
	}

	public void setName(String name) {
		System.out.println("setter-name");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + "]";

	}

}
