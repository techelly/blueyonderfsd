package com.blueyonder.bookapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.bookapp.entities.Customer;
import com.blueyonder.bookapp.exceptions.CustomerNotFoundException;
import com.blueyonder.bookapp.service.CustomerService;

@RestController
@RequestMapping("/bookapp/api/v1/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/getcustomerbyid")
	public Customer getCustomerById(@RequestParam("id") Integer custId) throws CustomerNotFoundException {
		return customerService.getCustomerById(custId);
	}
	
	@PostMapping("/addcustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
}
