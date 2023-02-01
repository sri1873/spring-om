package com.spring.om.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.om.entities.Order;
import com.spring.om.services.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService = new OrderService();

	@GetMapping("/getAllOrders")
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}

	@GetMapping("/getOrderById/{orderId}")
	public Order getOrderById(@PathVariable int orderId) {
		return orderService.getOrderById(orderId);
	}

	@PostMapping("/placeOrder")
	public void placeOrder(@RequestBody Order order) {
		orderService.placeOrder(order);
	}

	@DeleteMapping("/cancelOrderById/{orderId}")
	public void cancelOrderById(@PathVariable int orderId) {
		orderService.cancelOrderById(orderId);
	}

}
