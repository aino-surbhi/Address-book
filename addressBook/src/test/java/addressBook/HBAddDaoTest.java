package addressBook;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import address.Address;
import address.HBAddDao;

public class HBAddDaoTest {
	
	HBAddDaoTest hbTest=new HBAddDaoTest();
	@Test
	public void saveValuesTest() {
		Integer id;
		
		HBAddDao hbDao=new HBAddDao();
		Address address=new Address();
		address.setId(15);
		address.setStreet("kesariWada");
		address.setCity("pune");
		address.setCountry("india");
		address.setName("surbhi");
		address.setZip(10);
		
		id= (Integer) hbDao.saveValues1(address);
		assertTrue(address.getId()==id);
       // hbTest.deleteValuesTest();

	}
	@Test
	public void readValuesTest()
	{
		
		HBAddDao hbDao=new HBAddDao();
		Address user=hbDao.readValues1("surbhi");
		assertTrue(user.getId()==15);
		assertTrue(user.getCity().equals("pune"));
		
		assertTrue(user.getCountry().equals("india"));
		assertTrue(user.getName().equals("surbhi"));
		 hbTest.deleteValuesTest();
	}
	
	
	@Test
	public void updateValuesTest()
	{
        Integer id;
		Address address=new Address();
		HBAddDao hbDao=new HBAddDao();

		address.setCity("dehli");
		id= (Integer)hbDao.updateValues(address);
		assertTrue(id==1);
		hbTest.deleteValuesTest();


	}
	
	@Test
	public void deleteValuesTest()
	{
		Address address=new Address();
		HBAddDao hbDao=new HBAddDao();
		int id=hbDao.deleteValues("surbhi");
		assertFalse(id==1);
 

	}
}
