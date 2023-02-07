package com.spring.om.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.om.entities.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

	@Query(value = "SELECT * FROM product_inventory e where e.uuid == :id", nativeQuery = true)
	Inventory findByUuid(@Param("id") UUID productId);

	@Query(value = "DELETE FROM product_inventory e where e.uuid == ?1", nativeQuery = true)
	void deleteByUuid(UUID productId);

}
