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
