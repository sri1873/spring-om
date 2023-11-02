package com.spring.om.entities;

import java.util.UUID;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@SequenceGenerator(name = "booking-sequence-generator", sequenceName = "your_sequence_name",allocationSize = 1,initialValue = 1)
public class Product {
	@Id
	@Column(name = "productId")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "booking-sequence-generator")
	private String uuid;
	@Column(name = "prod_id")
	private String prodId;
	private String imageUrl;
	private String productName;
	private String description;
	private String uom;
}