/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Aug 16, 2018
 */

package com.jxiong.showcase.web.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Class Product
 * @author n0261886
 * <P>
 * @Description:
 * <p>
 */
@Entity
@Table(name="PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String category;
	
	private String description;
	
	private String imageuri;
	
	private double price;

	/**
	 * @return the productId
	 */
	public long getProductId() {
		return id;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the imageUri
	 */
	public String getImageUri() {
		return imageuri;
	}

	/**
	 * @param imageUri the imageUri to set
	 */
	public void setImageUri(String imageUri) {
		this.imageuri = imageUri;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
