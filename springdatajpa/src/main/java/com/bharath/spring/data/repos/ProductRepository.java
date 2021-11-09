package com.bharath.spring.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharath.spring.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
