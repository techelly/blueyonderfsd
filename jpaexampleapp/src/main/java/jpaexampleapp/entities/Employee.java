package jpaexampleapp.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employee_details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
	@Id
	@Column(name = "empno", length = 4)
	private Integer empno;
	private String ename;
	@Temporal(TemporalType.DATE)
	private Date hiredate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deptno")
	private Department department;

	
}
