package main.service.impl;

import main.dao.impl.StudentDaoImpl;
import main.service.StudentService;
import model.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public void creatStudent(Student student) {
		new StudentDaoImpl().addStudent(student);

	}

	@Override
	public Student getStudentById(int id) {

		return new StudentDaoImpl().fetchStudentById(id);
	}

	@Override
	public void updateStudentById(int id, String name) {
		new StudentDaoImpl().updateStudentById(id, name);

	}

	@Override
	public void deletStudentById(int id) {
		new StudentDaoImpl().deletStudentById(id);
	}

}
