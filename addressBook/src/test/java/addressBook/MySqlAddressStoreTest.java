package addressBook;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import address.Address;
import address.MySqlAddressStore;

public class MySqlAddressStoreTest {
	public  MySqlAddressStore msql;
	public Address address;	
	public  MySqlAddressStoreTest msql1;
	
	@Before public void Initialize(){
              msql=new MySqlAddressStore();
              address=new Address();
	}
	@Test
	public void Addtest() {
		// MySqlAddressStore msql1 = new MySqlAddressStore();
		address.id=1;
		address.name="surbhi";
		address.street="kesariwada";
		address.city="pune";
		address.country="india";
		address.zip=1234;
		int id=msql.add(address.name, address);
	    assertTrue(id==1);
	}
    
	@Test 
	public void ReadTest()
	{
		address.id=1;
		address.name="surbhi";
		address.street="kesariwada";
		address.city="pune";
		address.country="india";
		address.zip=1234;
	//	msql.add(address.name, address);
		Address ad1=msql.read(address.name);
		
		assertTrue(address.id==(ad1.id));
		assertTrue(address.name.equals(ad1.name));
		assertTrue(address.street.equals(ad1.street));
		assertTrue(address.city.equals(ad1.city));
		assertTrue(address.country.equals(ad1.country));
		assertTrue(address.zip==(ad1.zip));
		
	}
	
	@Test
	public void UpdateTest()
	{

		Address address1=new Address();
		address1.id=1;
		address1.name="surbhi";
		address1.street="NarayanPeth";
		address1.city="pune";
		address1.country="india";
		address1.zip=1234;
		
		int id=msql.update(address1.name, address1);
		assertTrue(id==1);
		
	}
	
	@Test
	public void DeleteTest() {
		Address address2=new Address();
		
		address2.name="surbhi";
		int id=msql.remove(address2.name);
		assertTrue(id==0);
		
	}

	
}
