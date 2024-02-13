package com.blueyonder.bookapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin("*")
@RequestMapping("/bookapp/api/v1/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/getcustomerbyid")
	// public Customer getCustomerById(@RequestParam("id") Integer custId) throws
	// CustomerNotFoundException {
	public ResponseEntity<Customer> getCustomerById(@RequestParam("id") Integer custId) throws CustomerNotFoundException {
		Customer cust = customerService.getCustomerById(custId);
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);
	}

	@PostMapping("/addcustomer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
		Customer cust = customerService.addCustomer(customer);
		return new ResponseEntity<Customer>(cust,HttpStatus.CREATED);
	}
}
