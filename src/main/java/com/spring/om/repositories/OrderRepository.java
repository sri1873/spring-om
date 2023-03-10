package com.spring.om.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.om.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

	Order findByUuid(UUID orderId);

	void deleteByUuid(UUID productId);

}
