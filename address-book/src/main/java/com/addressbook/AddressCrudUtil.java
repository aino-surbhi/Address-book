package main.java.com.addressbook;

import java.util.HashMap;

public class AddressCrudUtil {
	
	HashMap<String, Address> addrMap = new HashMap<>();
	
	
	void create(String name)
	{
		addrMap.put(name,new Address());
	
	}
	void read(String name)
	{
		
		addrMap.get(name);
	
	}
	
	void update(String name)
	{
		
		addrMap.replace(name,new Address());
		
		
	}
	void delete(String name)
	{
		
		addrMap.remove(name,new Address());
		
		
	}

}
