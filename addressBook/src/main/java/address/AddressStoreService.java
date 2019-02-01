package address;

public interface AddressStoreService {
	
	public int remove(String name);

	public int add(String name, AddressSlim ad);

	public AddressSlim read(String name);

	
	public int update(AddressSlim ad1);


}
