package com.blueyonder.bookapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.bookapp.entities.Role;
import com.blueyonder.bookapp.entities.Users;
import com.blueyonder.bookapp.exceptions.RoleNotFoundException;
import com.blueyonder.bookapp.exceptions.UserNameNotFoundException;
import com.blueyonder.bookapp.exceptions.UserNotFoundException;
import com.blueyonder.bookapp.repositories.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersRepository usersRepo;
	@Override
	public Users addUsers(Users users) {
		return usersRepo.save(users);
	}

	@Override
	public Users getUsersById(Integer userId) throws UserNotFoundException {
		Optional<Users> users = usersRepo.findById(userId);
		if (users.isPresent()) {
			return users.get();
		} else {
			throw new UserNotFoundException();
		}
	}

	@Override
	public Users getUsersByName(String userName) throws UserNameNotFoundException {
		
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
