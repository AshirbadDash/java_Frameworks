package com.kodnest.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
	@Id
	@Column(name = "cid")
	int cid;
	String cname;

	@ManyToMany
	@JoinColumn(name = "a")
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
