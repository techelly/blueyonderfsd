package com.blueyonder.bookapp.service;

import com.blueyonder.bookapp.entities.Users;

public interface UsersService {
	//Create
	public Users addUsers(Users users);

	//Retrieve
	public Users getUsersById(Integer userId);

	// Retrieve
	public Users getUsersByName(String userName);
	
	//Update 
	public Users updateUsers(Users users);

	//Delete	
	public String deleteUsers(Users users);
}
