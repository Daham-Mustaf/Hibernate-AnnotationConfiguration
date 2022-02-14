package main.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import main.utils.UtilHibernate;
import model.Student;

public class Update {
	public static void main(String[] args) {
		Session session = null;

		try {
			session = UtilHibernate.getSessionFactory().openSession();
			Student student = session.get(Student.class, 1);
			if (student != null) {
				session.beginTransaction();
				student.setStudentName("Updated Student");
				session.getTransaction().commit();

			} else {
				System.out.println("Student with id is not found .. ");

			}

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
}
