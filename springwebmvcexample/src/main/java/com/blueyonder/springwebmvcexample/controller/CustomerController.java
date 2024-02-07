package com.blueyonder.springwebmvcexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping(value="/customerapp")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	//Create
	
	//Retrieve by Id
	//URL:http://localhost:8080/customerapp/getcustomer?id=1
	//@GetMapping("/getcustomer")
	@RequestMapping(value="/getcustomer",method=RequestMethod.GET)
	public ModelAndView getCustomerById(@RequestParam("id")Integer custId) {
		//Retrieving data from service layer and dao layer
		CustomerDTO customerDTO;
		Customer customer = null;
		ModelAndView mv = new ModelAndView();
		try {
			customerDTO = customerService.getCustomerById(custId);
			//convert dto to model
			customer =CustomerUtility.convertCustomerDTOToCustomerModel(customerDTO);
			//Setting model and view to ModelAndView 
			mv.addObject("customer", customer);//Model is customer 
			mv.setViewName("customerdetails");
		} catch (CustomerNotFoundException e) {
			//Setting model and view to ModelAndView 
			mv.addObject("msg", "Customer with "+custId+" doesn't exists");//Model is custId
			mv.setViewName("error");
		}
			
		return mv;
	}
	//Retrieve by customer name
	
	//Update
	
	//Delete
	
}
