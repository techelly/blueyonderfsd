package springjavaconfigexample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springjavaconfigexample.model.Address;
import springjavaconfigexample.model.Customer;

@Configuration
@ComponentScan("springjavaconfigexample")
public class AppConfig {
	
	@Bean
	public Customer getCustomerBean() {
		return new Customer();
	}
	
	@Bean(name="addressBean")
	public Address getAddressBean() {
		return new Address();
	}

}
