package jpaexampleapp.dao;

import jpaexampleapp.entities.Customer;
import jpaexampleapp.exceptions.CustomerNotFoundException;

public interface CustomerDAO {
	
	public Customer getCustomerById(Integer custId) throws CustomerNotFoundException;
	public Customer getCustomerByName(String customerName)throws CustomerNotFoundException;
	public boolean deleteCustomerById(Integer custId)throws CustomerNotFoundException;
	public boolean createCustomer(Customer customer);
}
