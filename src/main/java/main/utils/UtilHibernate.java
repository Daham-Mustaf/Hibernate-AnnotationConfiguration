package main.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Song;

public class UtilHibernate {
	private static Configuration configuration;
	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(Song.class);
			sessionFactory = configuration.buildSessionFactory();
		}
		return sessionFactory;
	}

}
