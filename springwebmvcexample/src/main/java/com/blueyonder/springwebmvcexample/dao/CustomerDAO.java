package com.blueyonder.springwebmvcexample.dao;

import com.blueyonder.springwebmvcexample.exceptions.CustomerNotFoundException;
import com.blueyonder.springwebmvcexample.dto.CustomerDTO;

public interface CustomerDAO {
	
	public CustomerDTO getCustomerById(Integer custId) throws CustomerNotFoundException;

}
