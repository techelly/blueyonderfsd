package com.blueyonder.springwebmvcexample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.blueyonder.springwebmvcexample.dto.CustomerDTO;
import com.blueyonder.springwebmvcexample.exceptions.CustomerNotFoundException;

@Component("customerJDBCDAO")
@Primary
public class CustomerJDBCDAOImpl implements CustomerDAO {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public CustomerDTO getCustomerById(Integer custId) throws CustomerNotFoundException {
		String sql = "select * from customer_details where custid=?";
		Object[] parameters = {custId};
		CustomerDTO customerDTO=jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(CustomerDTO.class),parameters );
		return customerDTO;
	}

	@Override
	public CustomerDTO getCustomerByName(String customerName) throws CustomerNotFoundException {
		String sql = "select * from customer_details where custname=?";
		Object[] parameters = {customerName};
		CustomerDTO customerDTO=jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(CustomerDTO.class),parameters );
		return customerDTO;
	}

	@Override
	public boolean deleteCustomerById(Integer custId) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createCustomer(CustomerDTO customerDTO) {
		 String sql = "INSERT INTO customer_details (custid, custname) "
		 		+ "VALUES (?, ?)";
	        int result = jdbcTemplate.update(sql, customerDTO.getCustId(),customerDTO.getCustName());
	         
	        if (result > 0) {
	        	
	            System.out.println("Insert successfully.");
	            return true;
	        }      
		return false;
	}

}
