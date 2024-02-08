package jpaexampleapp.ui;

import jpaexampleapp.entities.Address;
import jpaexampleapp.entities.Student;
import jpaexampleapp.exceptions.CustomerNotFoundException;
import jpaexampleapp.service.StudentService;
import jpaexampleapp.service.StudentServiceImpl;

public class Driver {

	public static void main(String[] args) throws CustomerNotFoundException {
		/**
		CustomerService service = new CustomerServiceImpl();
		Customer customer = new Customer();
		//customer.setCustId(11);
		//customer.setCustName("Rajesh");
		//System.out.println(service.createCustomer(customer));
		Customer cust = service.getCustomerByName("Krishna");
		System.out.println(cust);
		System.out.println(service.getAllCustomer());
		**/
		StudentService studService = new StudentServiceImpl();
		Student stud = new Student();
		//stud.setStudentId(null);
		stud.setName("Prajawal");
		stud.setAddress(new Address(null,"BLR"));
		boolean flag = studService.createStudent(stud);
		System.out.println(flag);
	}

}
