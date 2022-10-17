package com.exam.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductPracticeApplication implements CommandLineRunner{
	@Autowired
	private ProductService ps;
	public static void main(String[] args) {
//		SpringApplication.run(ProductPracticeApplication.class, args);
		SpringApplication sa = new SpringApplication(ProductPracticeApplication.class);
		sa.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product p = new Product("Laptop","HP","50000");
		ps.addProduct(p);
//		ps.updateProduct(p);
//		ps.deleteProduct(p);
		
		for(Product pr:ps.allProduct()) {
			System.out.println(pr);
		}
	}

}
