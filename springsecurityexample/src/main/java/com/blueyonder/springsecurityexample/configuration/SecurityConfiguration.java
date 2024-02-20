package com.blueyonder.springsecurityexample.configuration;

import static org.springframework.security.config.Customizer.withDefaults;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests((authorize) -> authorize
						.anyRequest().authenticated())
			.httpBasic(withDefaults())
			.formLogin(withDefaults());

		return http.build();
	}


	/*
	 * @SuppressWarnings("deprecation")
	 * 
	 * @Bean public InMemoryUserDetailsManager userDetailsService() { UserDetails
	 * user = User.withDefaultPasswordEncoder() .username("user")
	 * .password("password") .roles("USER") .build(); return new
	 * InMemoryUserDetailsManager(user); }
	 */
	/*
	 * @Bean public DataSource dataSource() { return new DriverManagerDataSource();
	 * }
	 */
	
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public UserDetailsManager users(DataSource dataSource) {
		UserDetails user = User.builder()
			.username("user")
			.password("{bcrypt}$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW")
			.roles("USER")
			.build();
		UserDetails admin = User.builder()
			.username("admin")
			.password("{bcrypt}$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW")
			.roles("USER", "ADMIN")
			.build();
		JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
		users.createUser(user);
		users.createUser(admin);
		return users;
	}
}
