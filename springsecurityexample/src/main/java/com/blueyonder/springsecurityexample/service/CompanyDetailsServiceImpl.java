package com.blueyonder.springsecurityexample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.springsecurityexample.entities.CompanyDetails;
import com.blueyonder.springsecurityexample.repositories.CompanyDetailsRepository;

@Service
public class CompanyDetailsServiceImpl implements CompanyDetailsService {
	
	@Autowired
	private CompanyDetailsRepository repo;
	
	@Override
	public Optional<CompanyDetails> getCompanyDetailsById(Integer compId) {
		return repo.findById(compId);
	}

	@Override
	public CompanyDetails addCompanyDetails(CompanyDetails compDetails) {
		return repo.save(compDetails);
	}

}
