package com.spring.om.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.om.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	Product findByUuid(UUID uuid);

	void deleteByUuid(UUID productId);

	@Query(value = "SELECT nextval('your_sequence_name')", nativeQuery = true)
	Long getNextSequenceValue();

}
