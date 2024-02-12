package com.blueyonder.bookapp.service;

import java.util.List;

import com.blueyonder.bookapp.entities.Customer;
import com.blueyonder.bookapp.exceptions.CustomerNotFoundException;

public interface CustomerService {
	//Create
	public Customer addCustomer(Customer customer);

	//Retrieve
	public Customer getCustomerById(Integer customerId)throws CustomerNotFoundException;

	// Retrieve
	public List<Customer> getCustomerByName(String customerName)throws CustomerNotFoundException;
	
	//Update 
	public Customer updateCustomer(Customer customer)throws CustomerNotFoundException;

	//Delete	
	public String deleteCustomer(Customer customer)throws CustomerNotFoundException;
}
