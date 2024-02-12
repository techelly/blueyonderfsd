package com.blueyonder.bookapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.bookapp.entities.Role;
import com.blueyonder.bookapp.exceptions.RoleNotFoundException;
import com.blueyonder.bookapp.service.RoleService;

@RestController
@RequestMapping("/bookapp/api/v1")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	//Create
	//URL :- http://localhost:8080/bookapp/api/v1/addrole
	@PostMapping("/addrole")
	public Role addRole(@RequestBody Role role) {
		return roleService.addRole(role);
	}

	//Retrieve
	//URL :- http://localhost:8080/bookapp/api/v1/rolebyid?id=1
	@GetMapping("/rolebyid")
	public Role getRoleById(@RequestParam("id")Integer roleId)throws RoleNotFoundException{
		return roleService.getRoleById(roleId);
	}

	// Retrieve
	//URL :- http://localhost:8080/bookapp/api/v1/rolebyname?name="admin"
	@GetMapping("/rolebyname")
	public Role getRoleByName(@RequestParam("name")String roleName)throws RoleNotFoundException{
		return roleService.getRoleByName(roleName);
		
	}
	
}
