package beanlifecycleexample.custominitanddestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(initMethod="custominit", destroyMethod = "customdestroy")
	public BookCustomBean getBookCustomBean() {
		return new BookCustomBean();
	}
}
