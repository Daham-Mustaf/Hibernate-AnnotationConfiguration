package main.test;

import org.hibernate.SessionFactory;

import main.utils.UtilHibernate;

public class Test {

	public static void main(String[] args) {
		// how to Design a singleton SessionFactory
		SessionFactory sessionFactory1 = UtilHibernate.getSessionFactory();
		SessionFactory sessionFactory2 = UtilHibernate.getSessionFactory();

		// now we have only one SessionFactory.
		if (sessionFactory1 == sessionFactory2) {
			System.out.println("Tow sessionFactories are equal ");
		}

	}

}
