package jpaexampleapp.service;

import java.util.List;

import jpaexampleapp.dao.CustomerDAO;
import jpaexampleapp.dao.CustomerDAOImpl;
import jpaexampleapp.entities.Customer;
import jpaexampleapp.exceptions.CustomerNotFoundException;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO custDAO = new CustomerDAOImpl();

	@Override
	public Customer getCustomerById(Integer custId) throws CustomerNotFoundException {

		return custDAO.getCustomerById(custId);
	}

	@Override
	public Customer getCustomerByName(String customerName) throws CustomerNotFoundException {

		return custDAO.getCustomerByName(customerName);
	}

	@Override
	public boolean deleteCustomerById(Integer custId) throws CustomerNotFoundException {

		return custDAO.deleteCustomerById(custId);
	}

	@Override
	public boolean createCustomer(Customer customer) {

		return custDAO.createCustomer(customer);

	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return custDAO.getAllCustomer();
	}

}
