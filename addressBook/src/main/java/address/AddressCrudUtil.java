package address;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class AddressCrudUtil {
	
	AddressStore store=new MapAddressStore();
	AddressStore store1=new MySqlAddressStore();
	//public HashMap<String, Address> addrMap = new HashMap<String ,Address>();
	
	Scanner sc=new Scanner(System.in);
	
	
	public void read1(String name,Address address1)
	{
		//address1=new Address();
	  System.out.println("address details of hashmap");
	  	address1=store.read(name);
		//address1=addrMap.get(name);
		System.out.println("Id is :" +address1.getId());
		System.out.println("name is :" +address1.getName());
		System.out.println("city is :" +address1.getCity());
		System.out.println("country is :" +address1.getCountry());
		System.out.println("street is :" +address1.getStreet());
		System.out.println("name is :" +address1.getZip());
		
		System.out.println("address details through Database");
		Address address2=store1.read(name);
		
		System.out.println("Id is :" +address2.getId());
		System.out.println("name is :" +address2.getName());
		System.out.println("city is :" +address2.getCity());
		System.out.println("country is :" +address2.getCountry());
		System.out.println("street is :" +address2.getStreet());
		System.out.println("name is :" +address2.getZip());
		
	}
	
	public void update1(String name,Address ad1)
	{     
		ad1=store.read(name);
		//Address ad1=addrMap.get(name);
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
		store1.update(name,ad1);
		
		
	}
	public void delete1(String name)
	{
		store.remove(name);
		store1.remove(name);
		
		
		
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
		store.add(name,ad);
	//	store1.add(name, ad);
		return ad;
		
	
		
		  
		
	}

	

	

	

}
