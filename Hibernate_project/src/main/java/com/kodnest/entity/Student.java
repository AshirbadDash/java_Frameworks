package com.kodnest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @entity
 */
@Entity
public class Student {

	@Id
	int id;
	String name;

	public int getId() {
		return id;
	}

	public Student(int id, String name, Bike bike) {
		super();
		this.id = id;
		this.name = name;
		this.bike = bike;
	}

	public Student() {
		super();
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

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	@OneToOne
	Bike bike;

	/**
	 * override the toString method to print as per your requirement
	 * 
	 * @Override
	 */
	@Override
	public String toString() {
		return id + " " + name + " " + bike.getName() + " " + bike.getPrice();
	}

}
