package jpaexampleapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import jpaexampleapp.entities.Customer;
import jpaexampleapp.exceptions.CustomerNotFoundException;

public class CustomerDAOImpl implements CustomerDAO {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaexampleapp");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public Customer getCustomerById(Integer custId) throws CustomerNotFoundException {
		em.getTransaction().begin();
		Customer cust = em.find(Customer.class, custId);
		em.getTransaction().commit();
		//em.close();
		return cust;
	}

	@Override
	public Customer getCustomerByName(String customerName) throws CustomerNotFoundException {
		em.getTransaction().begin();
		//TypedQuery<Customer> query =em.createQuery("SELECT c from Customer c where c.custName=:name",Customer.class);
		TypedQuery<Customer> query = em.createQuery("SELECT C FROM Customer C WHERE C.custName = :name and C.custId= :id", Customer.class);
		query.setParameter("name", customerName);
		query.setParameter("id", 2);
		Customer cust = query.getSingleResult();
		em.getTransaction().commit();
		return cust;
	}

	@Override
	public boolean deleteCustomerById(Integer custId) throws CustomerNotFoundException {
		em.getTransaction().begin();
		Customer cust = em.find(Customer.class, custId);
		em.remove(cust);
		em.getTransaction().commit();
		//em.close();
		return true;
	}

	@Override
	public boolean createCustomer(Customer customer) {
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
		//em.close();
		return true;
	}

	@Override
	public List<Customer> getAllCustomer() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("getAllCustomer");
		List<Customer> customers = query.getResultList();
		em.getTransaction().commit();
		return customers;
	}

	
}
