package customerwebapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Employee {

	
	private Integer empId;
	private String empName;
	//Employee class has a dependency on Address
	private Address address;//HAS-A relationshipe
	
	//Constructor based injection
	public Employee(Address address) {
		this.address = address;
	}
	
	
}
