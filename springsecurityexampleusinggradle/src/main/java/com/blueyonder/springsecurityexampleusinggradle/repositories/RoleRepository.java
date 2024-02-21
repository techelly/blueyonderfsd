package com.blueyonder.springsecurityexampleusinggradle.repositories;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.springsecurityexampleusinggradle.entities.ERole;
import com.blueyonder.springsecurityexampleusinggradle.entities.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
  Optional<Role> findByName(ERole name);
}