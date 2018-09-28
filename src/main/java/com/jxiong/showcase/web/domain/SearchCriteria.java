/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Aug 16, 2018
 */

package com.jxiong.showcase.web.domain;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;



/**
 * @Class SearchCriteria
 * @author n0261886
 * <P>
 * @Description:
 * <p>
 */
public class SearchCriteria {
	
	private String category;
	
	@NotNull
	@Positive
	//@Pattern(regexp = "[a-z-A-Z]*", message = "Not accept characters")
	private double price;

	/**
	 * @param category
	 * @param price
	 */
	public SearchCriteria(String category, double price) {
		super();
		this.category = category;
		this.price = price;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	

}
