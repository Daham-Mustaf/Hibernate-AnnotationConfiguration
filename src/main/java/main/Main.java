package main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import main.util.UtilHibernate;

public class Main {
	public static void main(String[] args) {

		try (Session session = UtilHibernate.getSessionFactory().openSession()) {
			// Check MySQL database version
			String sql = "select version()";

			String result = (String) session.createNativeQuery(sql).getSingleResult();
			System.out.println("MySql Database Version is:::");
			System.out.println(result);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

}
