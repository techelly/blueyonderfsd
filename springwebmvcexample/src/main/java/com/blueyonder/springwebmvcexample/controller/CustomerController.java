package com.blueyonder.springwebmvcexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.blueyonder.springwebmvcexample.service.CustomerService;

@Controller
public class CustomerController {
	
	
	@Autowired
	private CustomerService custService;
	
	/**
	@GetMapping("/getcustomerbyid")
	public ModelAndView getCustomerById() {
		mv.addObject("", custService);
		return mv;
	}**/
	
	@GetMapping("/hello")
	public ModelAndView getMessage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		return mv;
	}
	
	
}
