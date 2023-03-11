package com.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private Integer productId;
	private String productName;
	private String productRating;
	private Double productPrice;
	private String productBrand;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductRating() {
		return productRating;
	}
	public void setProductRating(String productRating) {
		this.productRating = productRating;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	
	@Override
	public String toString() {
		return "Product --> productId=" + productId + "\t, productName=" + productName + "\t, productRating=" + productRating
				+ "\t, productPrice=" + productPrice + "\t, productBrand=" + productBrand + "]";
	}

}
