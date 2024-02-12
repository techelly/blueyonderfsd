package com.blueyonder.bookapp.service;

import java.util.List;

import com.blueyonder.bookapp.entities.Role;

public interface RoleService {
	//Create
	public Role addRole(Role role);

	//Retrieve
	public Role getRoleById(Integer roleId);

	// Retrieve
	public Role getRoleByName(String roleName);
	
	//Update 
	public Role updateRole(Role role);

	//Delete	
	public String deleteRole(Role role);
}
