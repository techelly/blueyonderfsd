package com.blueyonder.bookapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.bookapp.entities.Role;
import com.blueyonder.bookapp.exceptions.RoleNotFoundException;
import com.blueyonder.bookapp.repositories.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleRepository roleRepo;
	@Override
	public Role addRole(Role role) {
		return roleRepo.save(role);
	}

	@Override
	public Role getRoleById(Integer roleId)throws RoleNotFoundException {
		Optional<Role> role = roleRepo.findById(roleId);
		if (role.isPresent()) {
			return role.get();
		} else {
			throw new RoleNotFoundException();
		}
	}

	@Override
	public Role getRoleByName(String roleName) throws RoleNotFoundException{
		
		return roleRepo.findByRoleName(roleName);
	}

	@Override
	public Role updateRole(Role role) throws RoleNotFoundException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteRole(Role role) throws RoleNotFoundException{
		// TODO Auto-generated method stub
		return null;
	}

}
