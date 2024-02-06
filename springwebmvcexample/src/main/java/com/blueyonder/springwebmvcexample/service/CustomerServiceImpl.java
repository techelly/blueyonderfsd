package com.blueyonder.springwebmvcexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.springwebmvcexample.dao.CustomerDAO;
import com.blueyonder.springwebmvcexample.dto.CustomerDTO;
import com.blueyonder.springwebmvcexample.exceptions.CustomerNotFoundException;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO custDAO;

	@Override
	public CustomerDTO getCustomerById(Integer custId) throws CustomerNotFoundException {

		return custDAO.getCustomerById(custId);
	}

}
