package com.kodnest.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @Entity is used to mark the class as an entity bean.
 * 
 * @Id specifies the primary key of an entity.
 * @OneToOne is used to specify the one-to-one relationship between two
 *           entities.
 * 
 */

@Entity
public class Product {
	@Id
//	@Column(name = "product_id")
	int pid;
//	@Column(name = "product_name")
	String pname;

	@OneToOne
//	@JoinColumn(name = "customer_id")
	Customer customer;

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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, Customer customer) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.customer = customer;
	}

}
