package com.jxiong.showcase.web.service;

import com.jxiong.showcase.web.domain.Purchase;

public interface PurchaseService {
	public void savePurchase(Purchase purchase);
	public Iterable<Purchase> findAllPurchases();
	public Purchase findPurchaseById(long id);
}
