package springcoreusingannotation.model;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		String springConfigurationFile = "springconfig-annotations.xml";
		AbstractApplicationContext factory =new ClassPathXmlApplicationContext(springConfigurationFile);
		Customer cust = factory.getBean("customer", Customer.class);
		System.out.println("Got customer " + cust.getCustomerName());
		System.out.println(cust.getAddress());
		System.out.println(cust.getAddress().getCity());
		

	}

}
