package com.blueyonder.springsecurityexample.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.springsecurityexample.entities.CompanyDetails;
import com.blueyonder.springsecurityexample.service.CompanyDetailsService;

@RestController
@RequestMapping("/companydetailsapp")
public class CompanyDetailsController {
	@Autowired
	private CompanyDetailsService service;
	
	//URL: http://localhost:8080/companydetailsapp/getcompbyid?id=1
	@GetMapping("/getcompbyid")
	public Optional<CompanyDetails> getCompanyDetailsById(@RequestParam("id") Integer compId ){
		return service.getCompanyDetailsById(compId);
	}
	
	
	@PostMapping("/addcomp")
	public CompanyDetails addCompanyDetails(@RequestBody CompanyDetails compDetails ){
		return service.addCompanyDetails(compDetails);
	}
}
