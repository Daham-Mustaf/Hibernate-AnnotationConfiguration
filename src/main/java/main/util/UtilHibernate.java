package main.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Song;

public class UtilHibernate {
	private static Configuration configuration;
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Song.class);
		sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
	}

}
