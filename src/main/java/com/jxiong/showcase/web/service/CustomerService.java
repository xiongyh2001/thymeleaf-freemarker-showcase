package com.jxiong.showcase.web.service;

import com.jxiong.showcase.web.domain.Customer;

public interface CustomerService {
	
	public void saveCustomer(Customer customer);
	
	public Iterable<Customer> findAllCustomers();
	
	public Customer findCustomerById(long id);

}
