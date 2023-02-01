package com.spring.om.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.om.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
