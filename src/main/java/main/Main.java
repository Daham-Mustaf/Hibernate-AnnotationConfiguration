package main;

import model.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Song.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Song song = new Song();
		song.setId(3);
		song.setSongName("you are not alone");
		song.setArtist("Michael Jackson");

		session.beginTransaction();
		session.save(song);
		session.getTransaction().commit();
		session.close();
		System.out.println("Saved ...");
	}
}
