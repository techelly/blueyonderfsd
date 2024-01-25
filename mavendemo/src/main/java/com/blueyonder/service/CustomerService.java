package com.blueyonder.service;

import com.blueyonder.exceptions.CustomerNotFoundException;
import com.blueyonder.model.Customer;

import java.util.List;

public interface CustomerService {
    //Create
    public Customer addCustomer(Customer customer);
    //Retrieve
    public Customer getCustomerById(Integer customerId);
    //Update
    public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
    //Delete
    public String deleteCustomerById(Integer customerId);

    public List<Customer> getAllCustomers();
}
