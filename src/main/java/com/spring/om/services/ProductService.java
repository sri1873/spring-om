package com.spring.om.services;

import java.util.List;
import java.util.UUID;

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

	public Product getProductById(UUID productId) {
		Product prod = productRepository.findByUuid(productId);

		return prod;
	}

	public void addProduct(Product product) {
		Long nextSequenceValue = productRepository.getNextSequenceValue();
		product.setUuid("Sri-"+ nextSequenceValue);
		productRepository.save(product);

	}

	public void deleteProductById(UUID productId) {
		productRepository.deleteByUuid(productId);
		;
	}

	//	public Product updateProductById(int productId) {
	//		product
	//		return null;
	//	}

}
