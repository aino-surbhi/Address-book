package address;

public interface AddressStore {
	
	public int remove(String name);

	public int add(String name, Address ad);

	public Address read(String name);

	
	public int update(String name, Address ad1);


}
