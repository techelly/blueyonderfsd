package com.blueyonder.springwebmvcexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.blueyonder.springwebmvcexample.service.CustomerService;

@Controller
public class MessageController {

	/*
	 * @Autowired private CustomerService custService;
	 */

	/**
	 * @GetMapping("/getcustomerbyid") public ModelAndView getCustomerById() {
	 * mv.addObject("", custService); return mv; }
	 **/

	// Handler for HTTP GET Method
	// URL :-- http://localhost:8080/hello
	@GetMapping("/hello")
	public ModelAndView getMessage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		return mv;
	}

	// Handler for HTTP GET Method
	// URL :-- http://localhost:8080/greetings
	@RequestMapping(value = "/greetings", method = RequestMethod.GET)
	public ModelAndView greetings() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("greet");// greet.html is your actual view
		return mv;
	}

	// Handler for HTTP GET Method
	// URL :-- http://localhost:8080/greeting?name=Aman&surname=kumar
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public ModelAndView greetings(@RequestParam(value = "name") String name,
			@RequestParam(value = "surname") String surname) {
		ModelAndView mv = new ModelAndView();
		//Setting data or model.
		//Here data is of String type represented by name variable 
		mv.addObject("name", name);
		mv.addObject("surname",surname);
		mv.setViewName("greet");// greet.html is your actual view
		return mv;
	}
	
	// Handler for HTTP GET Method
	// URL :-- http://localhost:8080/message/Please Focus
	@RequestMapping(value="/message/{msg}",method=RequestMethod.GET)
	public ModelAndView getMessage(@PathVariable("msg")String message) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", message);
		mv.setViewName("message");
		return mv;
	}
	
	
}
