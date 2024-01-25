package com.blueyonder.service;

import com.blueyonder.dao.CustomerDAO;
import com.blueyonder.dao.CustomerDAOImpl;
import com.blueyonder.exceptions.CustomerNotFoundException;
import com.blueyonder.model.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private CustomerDAO customerDAO = new CustomerDAOImpl();
    @Override
    public Customer addCustomer(Customer customer) {
        return customerDAO.addCustomer(customer);
    }

    @Override
    public Customer getCustomerById(Integer customerId) {
        return customerDAO.getCustomerById(customerId);
    }

    @Override
    public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
        return customerDAO.updateCustomer(customer);
    }

    @Override
    public String deleteCustomerById(Integer customerId) {
        return customerDAO.deleteCustomerById(customerId);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }
}
