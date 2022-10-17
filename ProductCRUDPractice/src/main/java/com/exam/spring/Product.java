package com.exam.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
	int id;
	String name;
	String Brand;
	String price;
	
	public Product() {
		super();
	}

	public Product(int id) {
		super();
		this.id = id;
	}

	public Product(String name, String brand, String price) {
		super();
		this.name = name;
		Brand = brand;
		this.price = price;
	}

	public Product(int id, String name, String brand, String price) {
		super();
		this.id = id;
		this.name = name;
		Brand = brand;
		this.price = price;
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

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Brand=" + Brand + ", price=" + price + "]";
	}
	
}
