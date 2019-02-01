package util;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

public class HibernateUtilTest {	

	@Test
	public void getSessionFactoryTest() {
		Session session;
		session=HibernateUtil.getSessionFactory().openSession();
		assertNotNull(session);
		
		
	}

}

