package main.java.com.addressbook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class AddressCrudUtil {
	
	HashMap<String, Address> addrMap = new HashMap<>();
	//Address ad=new Address();
	Scanner sc=new Scanner(System.in);
	
	/*void create(String name,Address ad)
	{
		addrMap.put(name,ad);
		System.out.println(addrMap);
	
	}*/
	void read(String name,Address address1)
	{
		
		address1=addrMap.get(name);
		System.out.println("Id is :" +address1.getId());
		System.out.println("name is :" +address1.getName());
		System.out.println("city is :" +address1.getCity());
		System.out.println("country is :" +address1.getCountry());
		System.out.println("street is :" +address1.getStreet());
		System.out.println("name is :" +address1.getZip());
	}
	
	public void update(String name)
	{
		Address ad1=addrMap.get(name);
		System.out.println("enter the id");
		ad1.setId(sc.nextInt());
		//System.out.println("enter the name");
		//ad1.setName(sc.next());
		System.out.println("enter the street");
		ad1.setStreet(sc.next());;
		System.out.println("enter the city");
		ad1.setCity(sc.next());
		System.out.println("enter the country");
		ad1.setCountry(sc.next());
		System.out.println("enter the zipcode");
		ad1.setZip(sc.nextInt());	
		//return addrMap.put(name,ad);
		addrMap.replace(name,ad1);
		
		
	}
	void delete(String name)
	{
		
		addrMap.remove(name);
		
		
	}
	
	public Address createAddress() {
		Address ad=new Address();
		System.out.println("enter the id");
		ad.setId(sc.nextInt());
		System.out.println("enter the name");
		String name=ad.setName(sc.next());
		System.out.println("enter the street");
		ad.setStreet(sc.next());;
		System.out.println("enter the city");
		ad.setCity(sc.next());
		System.out.println("enter the country");
		ad.setCountry(sc.next());
		System.out.println("enter the zipcode");
		ad.setZip(sc.nextInt());	
		return addrMap.put(name,ad);
		
		
		  
		
	}

}
