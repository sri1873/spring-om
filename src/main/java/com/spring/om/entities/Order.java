package com.spring.om.entities;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
	@Id
	@Column(name = "orderId")
	private UUID uuid = UUID.randomUUID();
	private String status;
	private int quantity;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "product_id", referencedColumnName = "productId")
	private Product product;
}
