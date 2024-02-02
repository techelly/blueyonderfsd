package customerwebapp.service;

import customerwebapp.model.Customer;

public class CustomerServiceImpl implements CustomerService{
    @Override
    public String getGreetings() {
        return "Kya kar raha hai be";
    }

    @Override
    public Customer getCustomerById(Integer customerId) {
        Customer customer = new Customer();
        
        customer.setCustomerId(customerId);
        customer.setCustomerName("Ram");
        
        return customer;
    }
}
