package com.demo.Service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.demo.Entity.product;

@Service
@ComponentScan
public interface productService {
	
	
	
	public product saveProduct(product product);
		public product getProduct(Long proId);
	 
	

}
