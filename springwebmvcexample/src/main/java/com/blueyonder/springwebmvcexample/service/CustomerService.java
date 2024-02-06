package com.blueyonder.springwebmvcexample.service;

import com.blueyonder.springwebmvcexample.exceptions.CustomerNotFoundException;
import com.blueyonder.springwebmvcexample.dto.CustomerDTO;

public interface CustomerService {
	
	public CustomerDTO getCustomerById(Integer custId) throws CustomerNotFoundException;

}
