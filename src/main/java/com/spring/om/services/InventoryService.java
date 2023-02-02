package com.spring.om.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.om.entities.Inventory;
import com.spring.om.repositories.InventoryRepository;

@Service
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;

	public List<Inventory> getInventory() {
		return inventoryRepository.findAll();
	}

	public Inventory getInventoryById(UUID productId) {
		return inventoryRepository.findByUuid(productId);
	}

	public void addInventory(Inventory inventory) {
		inventoryRepository.save(inventory);

	}

	public void cancelOrderById(UUID productId) {
		inventoryRepository.deleteByUuid(productId);
		;
	}

}
