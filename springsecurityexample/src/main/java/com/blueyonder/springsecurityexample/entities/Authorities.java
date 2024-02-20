package com.blueyonder.springsecurityexample.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="authorities")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Authorities {
	@Id
	private String username ;
	private String authority;
	@OneToOne
	@JoinColumn(name="username")
	private Users users;
}
