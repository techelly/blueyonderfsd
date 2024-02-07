package com.blueyonder.springwebmvcexample.dao;

import com.blueyonder.springwebmvcexample.exceptions.CustomerNotFoundException;
import com.blueyonder.springwebmvcexample.dto.CustomerDTO;

public interface CustomerDAO {
	
	public CustomerDTO getCustomerById(Integer custId) throws CustomerNotFoundException;
	public CustomerDTO getCustomerByName(String customerName)throws CustomerNotFoundException;
	public boolean deleteCustomerById(Integer custId)throws CustomerNotFoundException;
	public boolean createCustomer(CustomerDTO customerDTO);
}
