package com.spring.om.controller;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.om.entities.Product;
import com.spring.om.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService = new ProductService();

	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@GetMapping("/getProductById/{productId}")
	public Product getProductById(@PathVariable UUID productId) {
		return productService.getProductById(productId);
	}

	@PostMapping("/addProduct")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}

	@Transactional
	@DeleteMapping("/deleteProductById/{productId}")
	public void deleteProductById(@PathVariable UUID productId) {
		productService.deleteProductById(productId);
	}

	//	@PutMapping("/updateProductById/{productId}")
	//	public List<Product> updateProductById(@PathVariable List<Integer> productIds, @RequestBody ) {
	//		prod
	//		return productService.updateProductById(productIds);
	//	}

}
