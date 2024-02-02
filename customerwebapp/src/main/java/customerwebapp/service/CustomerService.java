package customerwebapp.service;

import customerwebapp.model.Customer;

public interface CustomerService {

    //Retrieve
    public String getGreetings();

    public Customer getCustomerById(Integer customerId);
}

