package customerwebapp.model;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Rahul");
		Address address = new Address();
		emp.setAddress(address);//setter based injection
		
		Employee emp1 = new Employee(address);
		emp1.setEmpId(2);
		emp1.setEmpName("Akshay");

	}

}
