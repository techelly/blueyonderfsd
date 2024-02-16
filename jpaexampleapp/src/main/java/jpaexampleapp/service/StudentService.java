package jpaexampleapp.service;

import java.util.List;

import jpaexampleapp.entities.Student;
import jpaexampleapp.exceptions.StudentNotFoundException;

public interface StudentService {
	
	public Student getStudentById(Integer studentId) throws StudentNotFoundException;
	public Student getStudentByName(String studentName)throws StudentNotFoundException;
	public boolean deleteStudentById(Integer studentId)throws StudentNotFoundException;
	public boolean createStudent(Student student);
	public List<Student> getAllStudent();
}