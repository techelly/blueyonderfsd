package jpaexampleapp.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "department")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "deptno", length = 2)
	private Integer deptno;
	@Column(name = "dname", length = 15, nullable = false)
	private String departmentName;
	private String location;
	@OneToMany(mappedBy = "department")
	private Set<Employee> employees;
}
