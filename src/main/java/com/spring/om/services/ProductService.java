package com.spring.om.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.om.entities.Product;
import com.spring.om.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(Integer productId) {
		Optional<Product> prod = productRepository.findById(productId);
		if (prod.isEmpty())
			return null;
		return prod.get();
	}

	public void addProduct(Product product) {
		productRepository.save(product);

	}

	public void deleteProductById(int productId) {
		productRepository.deleteById(productId);
		;
	}

	//	public Product updateProductById(int productId) {
	//		product
	//		return null;
	//	}

}
