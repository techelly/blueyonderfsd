package com.blueyonder.bookapp.service;

import java.util.List;

import com.blueyonder.bookapp.entities.Role;
import com.blueyonder.bookapp.exceptions.RoleNotFoundException;

public interface RoleService {
	//Create
	public Role addRole(Role role);

	//Retrieve
	public Role getRoleById(Integer roleId)throws RoleNotFoundException;

	// Retrieve
	public Role getRoleByName(String roleName)throws RoleNotFoundException;
	
	//Update 
	public Role updateRole(Role role)throws RoleNotFoundException;

	//Delete	
	public String deleteRole(Role role)throws RoleNotFoundException;
}
