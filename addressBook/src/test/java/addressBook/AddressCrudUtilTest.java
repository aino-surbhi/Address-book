package addressBook;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import address.Address;
import address.AddressCrudUtil;
import address.MapAddressStore;

public class AddressCrudUtilTest {
	
	public AddressCrudUtil acrudutil;
	public Address address;
	public MapAddressStore mapstore;
	
	
	@Before public void Initialize()
	{
	    acrudutil=new AddressCrudUtil();
	    mapstore= new MapAddressStore();
		
	}

	@Test public void createAddressTest() {
		address=new Address();
		address.id=1;
		address.name="surbhi";
		address.street="kesariwada";
		address.city="pune";
		address.country="india";
		address.zip=1234;
		acrudutil.createAddress();
		assertTrue( mapstore.addrMap.get("surbhi").id==(address.id));
		assertTrue( mapstore.addrMap.get("surbhi").name.equals(address.name));
		assertTrue( mapstore.addrMap.get("surbhi").city.equals(address.city));
		assertTrue( mapstore.addrMap.get("surbhi").street.equals(address.street));
		assertTrue( mapstore.addrMap.get("surbhi").country.equals(address.country));
		assertTrue( mapstore.addrMap.get("surbhi").zip==(address.zip));		
	}
	
	@Test public void updateAddressTest()
	{
	   address= acrudutil.createAddress();	
	    String name="surbhi";
	    acrudutil.update1(name,address);
	    assertTrue( mapstore.addrMap.get("surbhi").street.equals("narayanpeth"));
	}
	@Test public void deleteTest()
	{
		
		acrudutil.createAddress();	
	    String name="surbhi";
	    acrudutil.delete1(name);
	   assertFalse( mapstore.addrMap.containsKey("surbhi"));
	}
   /* @Test public void ReadTest()
    {
    	address=acrudutil.createAddress();	
    	String name="surbhi";
    	acrudutil.read(name, address);
    	assertTrue(acrudutil.addrMap.get("surbhi").street.equals("narayanpeth"));
    	
    }*/
}
