package com.jxiong.showcase.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxiong.showcase.web.domain.Purchase;
import com.jxiong.showcase.web.repository.PurchaseRepository;



@Service
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	private PurchaseRepository repo;


	public void savePurchase(Purchase purchase) {
		repo.save(purchase);
	}

	public Iterable<Purchase> findAllPurchases() {
		return repo.findAll();
	}

	public Purchase findPurchaseById(long id) {
		return repo.findById(id).get();
	}

}
