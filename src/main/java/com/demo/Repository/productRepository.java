package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Entity.product;

@Repository
public interface productRepository extends JpaRepository<product, Long>{
	
	
	
	
	

}
