package customerwebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customerwebapp.model.Customer;
import customerwebapp.service.CustomerService;
import customerwebapp.service.CustomerServiceImpl;

@WebServlet("/customer")
public class CustomerServlet extends HttpServlet{
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CustomerService customerService = new CustomerServiceImpl();
		Customer customer = customerService.getCustomerById(15);
		req.setAttribute("customer",customer);
		RequestDispatcher dispatcher =  req.getRequestDispatcher("customer.jsp");
		dispatcher.forward(req, resp);
		
	}
}
