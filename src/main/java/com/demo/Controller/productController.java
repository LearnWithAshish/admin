package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.product;
import com.demo.Service.productService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

//http://localhost:8081/product/get/1

@RestController
@RequestMapping(value = "/product")
public class productController {
	
	
	@Autowired
	private productService productService;
	@PostMapping("/create")
	public ResponseEntity<product>	  postMethodName(@RequestBody product product) {
	product	 createdNew=productService.saveProduct(product);
		
		return new ResponseEntity<product>(createdNew,HttpStatus.CREATED);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<product>getMethodName(@PathVariable("id") Long proId ) {
		product product=productService.getProduct(proId);
		
		return new ResponseEntity<product>(product,HttpStatus.OK) ;
	}
	
	
	

}
