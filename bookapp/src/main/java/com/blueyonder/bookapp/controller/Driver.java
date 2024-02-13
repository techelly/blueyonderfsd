package com.blueyonder.bookapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.blueyonder.bookapp.entities.Customer;

public class Driver {
	public static void main(String[] args) {
		
		RestTemplate template = new RestTemplate();
		Integer id = 1;
		String uri = "http://localhost:8080/bookapp/api/v1/customer";
		Customer cust = template.getForObject(uri+"/getcustomerbyid?id={id}", Customer.class,id);
		ResponseEntity<Customer> res = template.getForEntity(uri+"/getcustomerbyid?id={id}", Customer.class, id);
		System.out.println(cust);
		System.out.println(res.getBody());
		System.out.println(res.getStatusCode());
	}
}
