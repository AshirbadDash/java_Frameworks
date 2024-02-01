package com.kodnest.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	int cid;
	String cname;

	@OneToMany
	List<Product> p;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Product> getP() {
		return p;
	}

	public void setP(List<Product> p) {
		this.p = p;
	}

	public Customer(int cid, String cname, List<Product> p) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.p = p;
	}

	public Customer() {
		super();

	}

}
