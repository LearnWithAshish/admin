package com.demo.serviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Entity.product;
import com.demo.Repository.productRepository;
import com.demo.Service.productService;

@Service
public class productServiceImpl implements productService{
 @Autowired 
  private productRepository productRepository;
	@Override
	public product saveProduct(product product) {
		
	 product saveProduct =productRepository.save(product);
	 
		return saveProduct;
	}
	public product getProduct(Long proId) {
		product getProductbyid=productRepository.findById(proId).get();
		return getProductbyid;
	}

}
