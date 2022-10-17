package com.exam.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInterface extends JpaRepository<Product, Integer>{

}
