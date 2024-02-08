package jpaexampleapp.service;

import java.util.List;

import jpaexampleapp.dao.StudentDAO;
import jpaexampleapp.dao.StudentDAOImpl;
import jpaexampleapp.entities.Student;
import jpaexampleapp.exceptions.StudentNotFoundException;

public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDAO = new StudentDAOImpl();
	@Override
	public Student getStudentById(Integer studentId) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return studentDAO.getStudentById(studentId);
	}

	@Override
	public Student getStudentByName(String studentName) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return studentDAO.getStudentByName(studentName);
	}

	@Override
	public boolean deleteStudentById(Integer studentId) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return studentDAO.deleteStudentById(studentId);
	}

	@Override
	public boolean createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDAO.createStudent(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
