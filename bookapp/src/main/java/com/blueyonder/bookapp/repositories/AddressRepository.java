package com.blueyonder.bookapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.bookapp.entities.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

}
