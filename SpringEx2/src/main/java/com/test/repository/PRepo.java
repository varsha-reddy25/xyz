package com.test.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.Product;

@Repository
public interface PRepo  extends JpaRepository<Product, Integer>{

	
}
