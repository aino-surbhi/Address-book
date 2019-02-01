package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


import java.util.HashMap;
import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;

import main.java.com.addressbook.Address;
import main.java.com.addressbook.AddressCrudUtil;

public class AddressCrudTest {
	
	 public static AddressCrudUtil acrudutil;
	 public static Address addr;
	 
	 @BeforeClass public static void OnceInitialize()
	 {
		 
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	/* HashMap<String, Address>  hMap  = new HashMap<String, Address>();
	 AddressCrudTest addc;
	// public static Scanner scanner1;
	@BeforeClass public static void initialize()
	{
		
		addr=new Address();
	}

	@Test public void TestCreateAddress()
	{
		
		 AddressCrudUtil acrudutil=new AddressCrudUtil();
		 AddressCrudTest addc=new AddressCrudTest();
		    
		/*addr=acrudutil.createAddress();
		assertNotNull(acrudutil);*/
		//acrudutil.addrMap.put("surbhi",address);
	/*	addr.id=1;
		addr.name="surbhi";
		addr.street="kesariwada";
		addr.city="pune";
		addr.country="india";
		addr.zip=1234;
		addc.hMap.put(addr.name,addr);
		
	    Address address=new Address();
		address=acrudutil.createAddress();
		assertTrue(addc.hMap.get("surbhi").city.equals(acrudutil.addrMap.get(address.name).city));
		//address.getName();
		//assertNotNull(address);
	/*	acrudutil.scanner1=mock(Scanner.class);
		
		when(scanner1.next()).thenReturn("Surbhi");
		
		 AddressCrudUtil acrudutil=new  AddressCrudUtil(scanner1);
		 
		 assertEquals("Surbhi", acrudutil.getInput());
		 verify(scanner1).nextLine();*/
	}/*
/*	@Test public void TestCreateAddress1()
	{
		
		address=acrudutil.createAddress();
		assertEquals(address.getName(),"surbhi");
		//assertNotNull(address);
		//sassertEquals(acrudutil.addrMap,address);
		//address.getName();
		//assertNotNull(address);
	/*	acrudutil.scanner1=mock(Scanner.class);
		
		when(scanner1.next()).thenReturn("Surbhi");
		
		 AddressCrudUtil acrudutil=new  AddressCrudUtil(scanner1);
		 
		 assertEquals("Surbhi", acrudutil.getInput());
		 verify(scanner1).nextLine();
	} */
    

