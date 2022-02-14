package main.dao;

import model.Student;

public interface StudentDao {
	
	public abstract void addStudent(Student student);
	public abstract Student fetchStudentById(int id);
	public abstract void updateStudentById(int id, String name);
	public abstract void deletStudentById(int id);


}
