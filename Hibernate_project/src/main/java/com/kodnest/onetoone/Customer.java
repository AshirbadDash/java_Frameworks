package com.kodnest.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
//	@Column(name = "customer_id")
	int id;
//	@Column(name = "customer_name")
	String name;

	@OneToOne
//	@JoinColumn(name = "product_id")
	Product product;

	public Customer(int id, String name, Product product) {
		super();
		this.id = id;
		this.name = name;
		this.product = product;
	}

	public Customer() {
		super();

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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
