package com.spring.om.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.om.entities.Inventory;
import com.spring.om.services.InventoryService;

@RestController
public class InventoryController {

	@Autowired
	InventoryService inventoryService = new InventoryService();

	@GetMapping("/getInventory")
	public List<Inventory> getInventory() {
		return inventoryService.getInventory();
	}

	@GetMapping("/getInventoryById/{productId}")
	public Inventory getInventoryById(@PathVariable UUID productId) {
		return inventoryService.getInventoryById(productId);
	}

	@PostMapping("/addInventory")
	public void addInventory(@RequestBody Inventory inventory) {
		inventoryService.addInventory(inventory);
	}

}
