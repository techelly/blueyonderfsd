package com.blueyonder.springwebmvcexample.utility;

import com.blueyonder.springwebmvcexample.dto.CustomerDTO;
import com.blueyonder.springwebmvcexample.model.Customer;

public class CustomerUtility {
	
	public static Customer convertCustomerDTOToCustomerModel(CustomerDTO customerDTO){
		Customer customer = new Customer();
		customer.setCustId(customerDTO.getCustId());
		customer.setCustName(customerDTO.getCustName());
		return customer;
	}
}
