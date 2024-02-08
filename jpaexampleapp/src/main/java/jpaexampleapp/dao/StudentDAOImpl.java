package jpaexampleapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaexampleapp.entities.Student;
import jpaexampleapp.exceptions.StudentNotFoundException;

public class StudentDAOImpl implements StudentDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaexampleapp");
	EntityManager em = emf.createEntityManager();
	@Override
	public Student getStudentById(Integer studentId) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentByName(String studentName) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudentById(Integer studentId) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createStudent(Student student) {
		em.getTransaction().begin();
		em.persist(student.getAddress());
		em.persist(student);
		em.getTransaction().commit();
		//em.close();
		return true;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
