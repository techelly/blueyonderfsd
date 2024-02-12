package com.blueyonder.bookapp.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Users {
	private Integer userId;
	private String userName;
	private String password;
	//HAS-A relationships
	//Either OneToOne or OneToMany relationship
	@OneToOne(cascade = CascadeType.ALL)//Unidirectional mapping
	private Role roles;
}
