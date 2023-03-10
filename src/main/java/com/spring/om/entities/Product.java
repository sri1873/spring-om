package com.spring.om.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Product {
	@Id
	@Column(name = "productId")
	private UUID uuid = UUID.randomUUID();
	private String imageUrl;
	private String productName;
	private String description;
	private String uom;
}