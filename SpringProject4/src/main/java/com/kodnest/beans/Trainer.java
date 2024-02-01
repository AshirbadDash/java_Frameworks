package com.kodnest.beans;

public class Trainer {
	int id;
	String name;

	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + "]";
	}
	

}
