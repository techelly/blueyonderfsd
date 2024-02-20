package com.blueyonder.springsecurityexample.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.springsecurityexample.entities.CompanyDetails;

@Repository
public interface CompanyDetailsRepository extends CrudRepository<CompanyDetails, Integer> {

}
