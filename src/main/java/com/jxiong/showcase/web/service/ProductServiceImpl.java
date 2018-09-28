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
