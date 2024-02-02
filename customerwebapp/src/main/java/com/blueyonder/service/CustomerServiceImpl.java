package main.java.com.blueyonder.service;

import main.java.com.blueyonder.model.Customer;

public class CustomerServiceImpl implements CustomerService{
    @Override
    public String getGreetings() {
        return "Kya kar raha hai be";
    }

    @Override
    public Customer getCustomerById(Integer customerId) {
        Customer customer = new Customer();
        customer.setCustomerId(customerId);
        customer.setCustomerName("Raju");
        return customer;
    }
}
