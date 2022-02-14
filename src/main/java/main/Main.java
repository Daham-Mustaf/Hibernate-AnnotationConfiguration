package main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import main.utils.UtilHibernate;

public class Main {
	public static void main(String[] args) {

		// how to Design a singleton SessionFactory
		SessionFactory sessionFactory1 = UtilHibernate.getSessionFactory();
		SessionFactory sessionFactory2 = UtilHibernate.getSessionFactory();
		// now we have only one  SessionFactory.
		
		
		System.out.println(sessionFactory1 + "  and " + sessionFactory2);

		try (Session session = UtilHibernate.getSessionFactory().openSession()) {
			// Check MySQL database version
			String sql = "select version()";
			System.out.println(" the sessionFactory "+ UtilHibernate.getSessionFactory());

			String result = (String) session.createNativeQuery(sql).getSingleResult();
			System.out.println("MySql Database Version is:::");
			System.out.println(result);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

}
