package com.jxiong.showcase.web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS_PROFILE")
public class CustomerProfile {

	@Id
	@Column(name="CUSTOMER_ID")
	long id;
	
	@Column(name="CUSTOMER_ADDRESS")
	String address;
	
	@Column(name="CUSTOMER_EMAIL")
	String email;
	
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Customer customer;

	public CustomerProfile(String address, String email) {
		this.address = address;
		this.email = email;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
}
