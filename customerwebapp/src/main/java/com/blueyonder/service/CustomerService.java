package main.java.com.blueyonder.service;

import main.java.com.blueyonder.model.Customer;

public interface CustomerService {

    //Retrieve
    public String getGreetings();

    public Customer getCustomerById(Integer customerId);
}
