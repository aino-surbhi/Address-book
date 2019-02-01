package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static Configuration config;
	private static SessionFactory sessionFactory;
	
	static {
		config=new Configuration().configure("hibernate.cfg.xml"); 
	}
	
	public static SessionFactory getSessionFactory() {
		
		sessionFactory=config.buildSessionFactory();
		return sessionFactory;
	}

}
