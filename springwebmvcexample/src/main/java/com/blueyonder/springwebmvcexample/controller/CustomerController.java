package com.blueyonder.springwebmvcexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.blueyonder.springwebmvcexample.dto.CustomerDTO;
import com.blueyonder.springwebmvcexample.exceptions.CustomerNotFoundException;
import com.blueyonder.springwebmvcexample.model.Customer;
import com.blueyonder.springwebmvcexample.service.CustomerService;
import com.blueyonder.springwebmvcexample.utility.CustomerUtility;

@Controller
@RequestMapping(value = "/customerapp")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	// Create
	// URL http://localhost:8080/customerapp/addcustomer
	@PostMapping("/addcustomer")
	public ModelAndView addCustomer(@ModelAttribute Customer customer) {
		ModelAndView mv = new ModelAndView();
		CustomerDTO customerDTO = CustomerUtility.convertCustomerToCustomerDTO(customer);
		boolean isCustomerAdded = customerService.createCustomer(customerDTO);
		if (isCustomerAdded) {
			mv.addObject("msg", "Customer added successfully");
			mv.setViewName("success");
			return mv;
		} else {
			mv.addObject("msg", "Unable to add customer");
			mv.setViewName("error");
			return mv;
		}

	}

	// Retrieve by Id
	// URL:http://localhost:8080/customerapp/getcustomer?id=1
	// @GetMapping("/getcustomer")
	@RequestMapping(value = "/getcustomer", method = RequestMethod.GET)
	public ModelAndView getCustomerById(@RequestParam("id") Integer custId) {
		// Retrieving data from service layer and dao layer
		CustomerDTO customerDTO;
		Customer customer = null;
		ModelAndView mv = new ModelAndView();
		try {
			customerDTO = customerService.getCustomerById(custId);
			// convert dto to model
			customer = CustomerUtility.convertCustomerDTOToCustomerModel(customerDTO);
			// Setting model and view to ModelAndView
			mv.addObject("customer", customer);// Model is customer
			mv.setViewName("customerdetails");
		} catch (CustomerNotFoundException e) {
			// Setting model and view to ModelAndView
			mv.addObject("msg", "Customer with " + custId + " doesn't exists");// Model is custId
			mv.setViewName("error");
		}

		return mv;
	}

	// Retrieve by customer name
	// URL:http://localhost:8080/customerapp/getcustomerbyname?name=Aman
	// @GetMapping("/getcustomerbyname")
	@RequestMapping(value = "/getcustomerbyname", method = RequestMethod.GET)
	public ModelAndView getCustomerByName(@RequestParam("name") String custName) {
		// Retrieving data from service layer and dao layer
		CustomerDTO customerDTO;
		Customer customer = null;
		ModelAndView mv = new ModelAndView();
		try {
			customerDTO = customerService.getCustomerByName(custName);
			// convert dto to model
			customer = CustomerUtility.convertCustomerDTOToCustomerModel(customerDTO);
			// Setting model and view to ModelAndView
			mv.addObject("customer", customer);// Model is customer
			mv.setViewName("customerdetails");
		} catch (CustomerNotFoundException e) {
			// Setting model and view to ModelAndView
			mv.addObject("msg", "Customer with " + custName + " doesn't exists");// Model is custId
			mv.setViewName("error");
		}

		return mv;
	}
	// Update

	// Delete
	// URL: http://localhost:8080/customerapp/deletecustomerbyid/15
	@RequestMapping(value = "/deletecustomerbyid/{id}", method = RequestMethod.GET)
	// @DeleteMapping("/deletecustomerbyid/{id}")
	public ModelAndView deleteCustomerById(@PathVariable("id") Integer custId) {

		// Retrieving data from service layer and dao layer
		boolean isCustomerDeleted;
		ModelAndView mv = new ModelAndView();
		try {
			isCustomerDeleted = customerService.deleteCustomerById(custId);

			if (isCustomerDeleted) {
				mv.addObject("deletemsg", "Customer with " + custId + " deleted successfully");
				mv.setViewName("customerdeletemsg");
			}

		} catch (CustomerNotFoundException e) {
			// Setting model and view to ModelAndView
			mv.addObject("msg", "Customer with " + custId + " doesn't exists. Unable to delete customer");// Model is
																											// custId
			mv.setViewName("error");
		}

		return mv;
	}

}
