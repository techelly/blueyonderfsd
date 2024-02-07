package com.blueyonder.springwebmvcexample.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blueyonder.springwebmvcexample.dto.CustomerDTO;
import com.blueyonder.springwebmvcexample.exceptions.CustomerNotFoundException;

@Component("customerDAO")
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private CustomerDTO custDto;

	private List<CustomerDTO> listOfCustomer = new ArrayList<CustomerDTO>();
	
	@Override
	public CustomerDTO getCustomerById(Integer custId) throws CustomerNotFoundException {
		//From DB you may get null values then throw exception
		if (custDto.getCustId() == null && custDto.getCustName()==null) {
			custDto.setCustId(15);
			custDto.setCustName("BlueYonder");
		} else {
			throw new CustomerNotFoundException();
		}
		return custDto;
	}

	@Override
	public CustomerDTO getCustomerByName(String customerName) throws CustomerNotFoundException {
		if(customerName != null) {
			custDto.setCustId(16);
			custDto.setCustName(customerName);
		}else {
			throw new CustomerNotFoundException();
		}
		return custDto;
	}

	@Override
	public boolean deleteCustomerById(Integer custId) throws CustomerNotFoundException {
		if(custId !=15) {
			return true;
		}else {
			throw new CustomerNotFoundException();
		}
		
	}

	@Override
	public boolean createCustomer(CustomerDTO customerDTO) {
		if(listOfCustomer.size()>=0 && listOfCustomer.size()<2) {
			listOfCustomer.add(customerDTO);
			return true;
		}else {
			return false;
		}
		
	}

}
