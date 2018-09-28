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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxiong.showcase.web.domain.Product;
import com.jxiong.showcase.web.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository repo;


	public Iterable<Product> findAllProduct() {
		return repo.findAll();
	}


	public Product findProductById(long id) {
		return repo.findById(id).get();
	}


	/* (non-Javadoc)
	 * @see com.lmig.nip.showcase.web.service.ProductService#findProductByCategoryAndPrice(java.lang.String, double)
	 */
	@Override
	public Iterable<Product> findProductByCategoryAndPrice(String category, double price) {
		// TODO Auto-generated method stub
		return repo.findProductByCategoryAndPrice(category, price);
	}


	/* (non-Javadoc)
	 * @see com.lmig.nip.showcase.web.service.ProductService#findProductByCategory(java.lang.String)
	 */
	@Override
	public Iterable<Product> findProductByCategory(String category) {
		// TODO Auto-generated method stub
		return repo.findProductByCategory(category);
	}


	/* (non-Javadoc)
	 * @see com.lmig.nip.showcase.web.service.ProductService#findProductByPrice(double)
	 */
	@Override
	public Iterable<Product> findProductByPrice(double price) {
		// TODO Auto-generated method stub
		return repo.findProductByPrice(price);
	}


	/* (non-Javadoc)
	 * @see com.lmig.nip.showcase.web.service.ProductService#findProductCategory()
	 */
	@Override
	public Iterable<String> findProductCategory() {
		// TODO Auto-generated method stub
		return repo.findCategoryList();
	}

}
