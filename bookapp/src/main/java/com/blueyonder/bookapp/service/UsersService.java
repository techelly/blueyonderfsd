package com.blueyonder.bookapp.service;

import com.blueyonder.bookapp.entities.Users;
import com.blueyonder.bookapp.exceptions.UserNameNotFoundException;
import com.blueyonder.bookapp.exceptions.UserNotFoundException;

public interface UsersService {
	//Create
	public Users addUsers(Users users);

	//Retrieve
	public Users getUsersById(Integer userId)throws UserNotFoundException;

	// Retrieve
	public Users getUsersByName(String userName)throws UserNameNotFoundException;
	
	//Update 
	public Users updateUsers(Users users)throws UserNotFoundException;

	//Delete	
	public String deleteUsers(Users users)throws UserNotFoundException;
}
