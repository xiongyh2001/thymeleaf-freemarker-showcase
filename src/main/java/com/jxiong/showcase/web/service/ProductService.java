package com.jxiong.showcase.web.service;

import com.jxiong.showcase.web.domain.Product;

public interface ProductService {

	public Iterable<Product> findAllProduct();
	
	public Product findProductById(long id);
	
	public Iterable<Product> findProductByCategoryAndPrice(String category, double price);
	
	public Iterable<Product> findProductByCategory(String category);
	
	public Iterable<Product> findProductByPrice(double price);
	
	public Iterable<String> findProductCategory();

}
