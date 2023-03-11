package com.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.entity.Product;
import com.jpa.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepository productRepo = context.getBean(ProductRepository.class);
		
		//List<Product> findByProductBrand = productRepo.findByProductBrand("HP");
	
		
		
		List<Product> products = productRepo.findByProductBrand("USHA");
		products.forEach(System.out::println);
		
		List<Product> product = productRepo.findByProductPriceGreaterThanEqual(1900.0);
		product.forEach(System.out::println);
		
		List<Product> p1=productRepo.getProducts();
		p1.forEach(System.out::println);
		
		
		
	}

}
