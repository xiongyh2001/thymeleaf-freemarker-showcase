/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Aug 16, 2018
 */

package com.jxiong.showcase.web.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jxiong.showcase.web.domain.Product;


/**
 * @Class ProductRepository
 * @author n0261886
 * <P>
 * @Description:
 * <p>
 */

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Query("SELECT a FROM Product a WHERE a.category=:category and a.price<:price")
    Iterable<Product> findProductByCategoryAndPrice(@Param("category") String category, @Param("price") double price);

    @Query("SELECT a FROM Product a WHERE a.category=:category")
    Iterable<Product> findProductByCategory(@Param("category") String category);
    
    @Query("SELECT a FROM Product a WHERE a.price<:price")
    Iterable<Product> findProductByPrice(@Param("price") double price);
    
    @Query("SELECT DISTINCT a.category FROM Product a")
    Iterable<String> findCategoryList();
}
