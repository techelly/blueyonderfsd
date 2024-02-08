package jpaexampleapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaexampleapp.entities.Customer;
import jpaexampleapp.exceptions.CustomerNotFoundException;

public class CustomerDAOImpl implements CustomerDAO {
	
	
	
	@Override
	public Customer getCustomerById(Integer custId) throws CustomerNotFoundException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaexampleapp");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Customer cust = em.find(Customer.class, custId);
		em.getTransaction().commit();
		return cust;
	}

	@Override
	public Customer getCustomerByName(String customerName) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomerById(Integer custId) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createCustomer(Customer customer) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaexampleapp");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
		return true;
	}

	
}
