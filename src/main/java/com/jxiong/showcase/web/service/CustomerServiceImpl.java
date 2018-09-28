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
