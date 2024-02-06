package com.blueyonder.springwebmvcexample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blueyonder.springwebmvcexample.dto.CustomerDTO;
import com.blueyonder.springwebmvcexample.exceptions.CustomerNotFoundException;

@Component
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private CustomerDTO custDto;

	@Override
	public CustomerDTO getCustomerById(Integer custId) throws CustomerNotFoundException {
		//From DB you may get null values then throw exception
		if (custDto != null) {
			custDto.setCustId(15);
			custDto.setCustName("BlueYonder");
		} else {
			throw new CustomerNotFoundException();
		}
		return custDto;
	}

}
