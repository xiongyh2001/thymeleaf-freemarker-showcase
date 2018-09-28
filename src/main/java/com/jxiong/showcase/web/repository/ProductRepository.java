/*******************************************************************************
 * Copyright 2018 Jason Xiong
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/

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
