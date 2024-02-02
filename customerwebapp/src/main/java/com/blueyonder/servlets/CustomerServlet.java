package main.java.com.blueyonder.servlets;

import main.java.com.blueyonder.model.Customer;
import main.java.com.blueyonder.service.CustomerService;
import main.java.com.blueyonder.service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/customer")
public class CustomerServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CustomerService customerService = new CustomerServiceImpl();
        Customer customer = customerService.getCustomerById(15);
        req.setAttribute("customer",customer);
        RequestDispatcher dispatcher =  req.getRequestDispatcher("customer.jsp");
        dispatcher.forward(req, resp);

    }
}