package address;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import util.HibernateUtil;

public class HBAddDao {
	
public Serializable saveValues1(Address address) {
		
		
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		Integer id=null;

		try {
			id= (Integer) session.save(address);
			 session.save(address);
			transaction.commit();

		}catch (Exception e) {
            
		}

		finally {

			session.close();
		}
		return id;

	}
 
public Address readValues1(String name) {
    Session session=getSession();
      Address user=null;
    Transaction transaction=session.beginTransaction();
    try {
        String SQL_QUERY = "from Address where name=:name";
          Query query = session.createQuery(SQL_QUERY);
          query.setParameter("name", name);
          Object queryResult = query.uniqueResult();
          user = (Address)queryResult;
         session.getTransaction().commit();
         

    }catch (Exception e) {

    }
    finally {
        session.close();
    }
    return user;
}

public int updateValues(Address address) {

	Session session=getSession();
	Transaction transaction=session.beginTransaction();

	int result = 0;


	try {
		 Query query = session.createQuery("update Address set city =:city where id= :id");
	        query.setParameter("city",address.getCity());
	     //   query.setParameter("name",address.getName());
	       query.setInteger("id", address.getId());
	         result = query.executeUpdate();
	         transaction.commit();
	      //  System.out.println("Student data Update Status=" + result);
		

	}catch (Exception e) {

	}

	finally {
		session.close();

	}
	return result;

}

public int deleteValues(String name) {

	Session session=getSession();
	 Transaction transaction=session.beginTransaction();
	 int result=0;
	try {
		
		
		Query query = session.createQuery("delete from Address where name= :name");
        query.setParameter("name",name);
        result = query.executeUpdate();
        System.out.println("Student Data Delete Status=" + result);
        transaction.commit();
        
 

	}catch (Exception e) {

	}

	finally {
		session.close();

	}

   return result;
}
	
	public Session getSession() {
		return HibernateUtil.getSessionFactory().openSession();	
	}

}
