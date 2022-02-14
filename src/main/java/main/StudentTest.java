package main;

import java.util.Date;

import main.service.StudentService;
import main.service.impl.StudentServiceImpl;
import model.Student;

public class StudentTest {
	public static void main(String[] args) {

		StudentService studentService = new StudentServiceImpl();
		createStudent(studentService);
	}

	private static void createStudent(StudentService studentService) {
		studentService.creatStudent(getStudent());
	}

	private static Student getStudent() {
		Student student2 = new Student();
		student2.setStudentName("Ali Mustafa");
		student2.setEmail("Ali@gmail.com");
		student2.setDoj(new Date());
		return student2;
	}
}
