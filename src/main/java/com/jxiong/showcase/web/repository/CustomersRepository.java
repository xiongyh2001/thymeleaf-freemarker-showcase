package com.jxiong.showcase.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.jxiong.showcase.web.domain.Customer;


public interface CustomersRepository extends CrudRepository<Customer, Long> {

}
