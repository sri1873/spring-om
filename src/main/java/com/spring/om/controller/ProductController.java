package com.spring.om.controller;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.spring.om.entities.Product;
import com.spring.om.services.ProductService;
import org.springframework.web.multipart.MultipartFile;

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

	@PostMapping(value = "/addProduct",consumes = {MediaType.MULTIPART_FORM_DATA_VALUE,MediaType.APPLICATION_OCTET_STREAM_VALUE})
	public void addProduct(@RequestParam ("product") MultipartFile product,@RequestParam("data") Object json) {
		System.out.println(product);
		System.out.println(json);
//		productService.addProduct(product);
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
