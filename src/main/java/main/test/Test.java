package main.test;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import main.utils.UtilHibernate;
import model.Student;

public class Test {

	public static void main(String[] args) {
		// how to Design a singleton SessionFactory
//		SessionFactory sessionFactory1 = UtilHibernate.getSessionFactory();
//		SessionFactory sessionFactory2 = UtilHibernate.getSessionFactory();

		// now we have only one SessionFactory.
//		if (sessionFactory1 == sessionFactory2) {
//			System.out.println("Tow sessionFactories are equal ");
//		}
		try (Session session = UtilHibernate.getSessionFactory().openSession()) {
			Student student = getStudent();
			session.beginTransaction();

			// session.persist(student);
			// save is a Serializable method returns the Id
			Integer id = (Integer) session.save(student);
			System.out.println("student is created  with Id::" + id);

			session.getTransaction().commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

	private static Student getStudent() {
		Student student2 = new Student();
		student2.setStudentName("Ali Mustafa");
		student2.setEmail("Ali@gmail.com");
		student2.setDoj(new Date());
		return student2;
	}

}
