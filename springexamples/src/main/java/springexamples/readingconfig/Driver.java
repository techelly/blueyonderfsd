package springexamples.readingconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// configuration metadata
		String springConfigurationFile = "springconfig.xml";

		// Instantiating a Spring IoC container
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(springConfigurationFile);
		// Here using context.getBean method we are trying to get instance of Customer
		// class
		Customer cust = context.getBean("customer", Customer.class);
		// Using cust object/bean instance we are accessing the object method
		System.out.println(cust.getCustomerId());
		System.out.println(cust.getCustomerName());
		System.out.println(cust.getHomeAddress().getCity());
		System.out.println(cust.getResAddress().getCity());
		
		Address addr = context.getBean("addrBean1",Address.class);
		System.out.println(addr.getCity());
		
		//Same bean will be returned - scope of Spring Bean is singleton
		Customer cust1 = context.getBean("customer", Customer.class);
		System.out.println(cust.hashCode());
		System.out.println(cust1.hashCode());

	}

}
