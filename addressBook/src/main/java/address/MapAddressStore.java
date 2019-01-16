package address;

import java.util.HashMap;

public class MapAddressStore implements AddressStore{

	public HashMap<String, Address> addrMap = new HashMap<String ,Address>();
	Address address;
	MapAddressStore mapstore;
	public int add(String name,Address ad) {
		
		addrMap.put(name,ad);
		return 0;
	}

	public int remove(String name) {
		addrMap.remove(name);
		return 0;
	}

	public int update(String name,Address address) {
	  addrMap.replace(name,address);
	  return 0;
	}

	public Address read(String name) {
		return addrMap.get(name);
		
	}

	
}
