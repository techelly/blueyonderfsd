package jpaexampleapp.ui;

import jpaexampleapp.entities.Customer;
import jpaexampleapp.service.CustomerService;
import jpaexampleapp.service.CustomerServiceImpl;

public class Driver {

	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		Customer customer = new Customer();
		customer.setCustId(1);
		customer.setCustName("Linson");
		System.out.println(service.createCustomer(customer));

	}

}
