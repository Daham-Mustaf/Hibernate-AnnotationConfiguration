package main.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Song;
import model.Student;

public class UtilHibernate {
	private static Configuration configuration;
	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		// Design a singleton SessionFactory !
		if (sessionFactory == null) {
			configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(Student.class);
			sessionFactory = configuration.buildSessionFactory();
		}
		return sessionFactory;
	}

}
