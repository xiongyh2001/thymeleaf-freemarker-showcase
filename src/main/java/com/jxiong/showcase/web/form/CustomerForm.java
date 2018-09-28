package com.jxiong.showcase.web.form;

import com.jxiong.showcase.web.domain.Customer;
import com.jxiong.showcase.web.domain.CustomerProfile;

public class CustomerForm {

	String name;

	String active;

	String address;

	String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
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
	
	public Customer getCustomer() {
		CustomerProfile customerProfile = new CustomerProfile(this.email, this.address);
		Customer customer =  new Customer(this.name, "Y", customerProfile);
		customerProfile.setCustomer(customer);
		
		return customer;
	}
}
