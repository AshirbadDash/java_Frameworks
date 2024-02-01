package com.kodnest.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	int pid;

	String pname;
	@ManyToOne
	Customer c;

	public Product() {
		super();

	}

	public Product(int pid, String pname, Customer c) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.c = c;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Customer getC() {
		return c;
	}

	public void setC(Customer c) {
		this.c = c;
	}

}
