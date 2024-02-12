package com.blueyonder.bookapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.bookapp.entities.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {

}
