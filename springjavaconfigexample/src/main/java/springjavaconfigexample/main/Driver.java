package springjavaconfigexample.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import springjavaconfigexample.config.AppConfig;
import springjavaconfigexample.model.Address;
import springjavaconfigexample.model.Customer;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		Customer cust=factory.getBean("customer",Customer.class);
		Address addr = factory.getBean("addressBean",Address.class);
		System.out.println(cust.getCustomerName());
		System.out.println(addr.getCountry());
		System.out.println(addr.hashCode());
		System.out.println(cust.getAddress().hashCode());
		System.out.println(cust.hashCode());
		
	}

}
