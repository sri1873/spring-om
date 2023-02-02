package com.spring.om.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.om.entities.Order;
import com.spring.om.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;

	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	public Order getOrderById(UUID orderId) {
		return orderRepository.findByUuid(orderId);
	}

	public void placeOrder(Order order) {
		orderRepository.save(order);

	}

	public void cancelOrderById(UUID productId) {
		orderRepository.deleteByUuid(productId);
		;
	}

}
