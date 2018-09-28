package com.jxiong.showcase.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.jxiong.showcase.web.domain.Purchase;


public interface PurchaseRepository extends CrudRepository<Purchase, Long> {

}
