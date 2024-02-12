package com.blueyonder.bookapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.bookapp.entities.Role;
import java.util.List;


@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
	public Role findByRoleName(String roleName);
}
