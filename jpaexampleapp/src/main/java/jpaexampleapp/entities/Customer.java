package jpaexampleapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "customer_info")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@NamedQueries({ @NamedQuery(name = "getAllCustomer", query = ("SELECT C FROM Customer C")),
		@NamedQuery(name = "findByNameAndId", query = "SELECT c FROM Customer c WHERE c.custName = :name and c.custId= :id"), }

)
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer custId;// column name - Primary Key column
	@Column(name = "name")
	private String custName;
}
