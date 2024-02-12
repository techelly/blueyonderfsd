package com.blueyonder.bookapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.bookapp.entities.Customer;
import com.blueyonder.bookapp.exceptions.CustomerNotFoundException;
import com.blueyonder.bookapp.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository custRepo;

	@Override
	public Customer addCustomer(Customer customer) {

		return custRepo.save(customer);
	}

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException {
		Optional<Customer> cust = custRepo.findById(customerId);
		if (cust.isPresent()) {
			return cust.get();
		} else {
			throw new CustomerNotFoundException();
		}
	}

	@Override
	public List<Customer> getCustomerByName(String customerName) throws CustomerNotFoundException {
		
		return custRepo.findByCustomerName(customerName);
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomer(Customer customer) throws CustomerNotFoundException {
		if(custRepo.existsById(customer.getCustomerId())) {
			custRepo.delete(customer);
			return "Customer deleted successfully";
		}else {
			throw new CustomerNotFoundException("customer with customer id "+customer.getCustomerId()+" doesn't exists");
			
		}
	}

	
}
