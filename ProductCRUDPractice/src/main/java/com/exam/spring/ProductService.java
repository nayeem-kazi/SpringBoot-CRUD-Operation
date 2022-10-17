package com.exam.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductInterface pi;

	public void addProduct(Product p) {
		pi.save(p);
	}

	public void updateProduct(Product p) {
		pi.save(p);
	}

	public void deleteProduct(Product p) {
		pi.delete(p);
	}

	public List<Product> allProduct() {
		return pi.findAll();
	}

}
