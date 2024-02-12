package com.blueyonder.bookapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.bookapp.entities.Users;
import com.blueyonder.bookapp.exceptions.UserNameNotFoundException;
import com.blueyonder.bookapp.exceptions.UserNotFoundException;
import com.blueyonder.bookapp.repositories.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersRepository usersRepo;
	@Override
	public Users addUsers(Users users) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getUsersById(Integer userId) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getUsersByName(String userName) throws UserNameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users updateUsers(Users users) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUsers(Users users) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
