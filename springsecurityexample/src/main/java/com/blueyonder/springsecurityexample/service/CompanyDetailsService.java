package com.blueyonder.springsecurityexample.service;

import java.util.Optional;

import com.blueyonder.springsecurityexample.entities.CompanyDetails;

public interface CompanyDetailsService {
	
	public Optional<CompanyDetails> getCompanyDetailsById(Integer compId);
	public CompanyDetails addCompanyDetails(CompanyDetails compDetails);
}
