package com.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	// select * from product where productBrand=?
	// public List<Product> findByProductBrand(String productBrand);
	// Using query Annotation
	@Query(value = "select * from product where product_brand=:productBrand", nativeQuery = true)
	public List<Product> findByProductBrand(String productBrand);

	// find all product from data using @Query

	/*@Query(value = "select * from Product", nativeQuery = true)
	public List<Product> getAllProducts();*/

	@Query("from Product")
	public List<Product> getProducts();

	@Query(value = "select * from product where product_price >= :productPrice", nativeQuery = true)
	public List<Product> findByProductPriceGreaterThanEqual(Double productPrice);

	@Query(value = "select * from product where product_brand =:productBrand", nativeQuery = true)
	public List<Product> findByProductBrandEquals(String productBrand);

}
