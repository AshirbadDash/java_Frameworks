package org.bean;

public class School {
	String name;
	String location;

	String number;

	public Employee employee;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(String name, String location, String number, Employee employee) {
		super();
		this.name = name;
		this.location = location;
		this.number = number;
		this.employee = employee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", location=" + location + ", number=" + number + ", employee=" + employee
				+ "]";
	}

}
