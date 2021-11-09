package com.bharath.spring.data;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.spring.data.entities.Product;
import com.bharath.spring.data.repos.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringdatajpaApplicationTests {
	@Autowired
	ApplicationContext context;

	@Test
	void saveProduct() {
	ProductRepository repository=	context.getBean(ProductRepository.class);
	Product product  = new Product();
	product.setId(3L);
	product.setName("realme");
	product.setDescription("amazing");
	product.setPrice(7900d);
	repository.save(product);
	System.out.println("****"+repository.findAll());
	Optional<Product> findById = repository.findById(1L);
	
	System.out.println(findById);
	}

}
