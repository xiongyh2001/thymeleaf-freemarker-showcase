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

import com.jxiong.showcase.web.domain.Customer;
import com.jxiong.showcase.web.repository.CustomersRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomersRepository repo;
	
	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repo.save(customer);
	}

	@Override
	public Iterable<Customer> findAllCustomers() {
		return repo.findAll();
	}

	@Override
	public Customer findCustomerById(long id) {
		return repo.findById(id).get();
	}


}
