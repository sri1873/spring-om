package com.spring.om.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.om.entities.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

	Inventory findByUuid(UUID productId);

	void deleteByUuid(UUID productId);

}
