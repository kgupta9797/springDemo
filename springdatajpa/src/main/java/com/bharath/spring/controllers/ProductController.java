package com.bharath.spring.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.spring.data.entities.Product;
import com.bharath.spring.data.repos.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductRepository repository;
	@GetMapping
	public Iterable<Product> getProduct()
	{
		return repository.findAll();
	}
	
	@PostMapping
	public Product create(@RequestBody Product product)
	{
		return repository.save(product);
	}
	
	@PutMapping
	public Product update(@RequestBody Product product)
	{
		return repository.save(product);
	}

	@GetMapping("/{id}")
public Optional<Product> getProduct(@PathVariable("id") Long id)
{
return repository.findById(id);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable("id") Long id)
	{
	 repository.deleteById(id);
		}
	
}
