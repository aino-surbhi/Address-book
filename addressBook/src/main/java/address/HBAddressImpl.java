package address;

public class HBAddressImpl implements AddressStoreService{

	HBAddHelper hbhelper= new HBAddHelper();
   
	public int add(String name, AddressSlim addressSlim) {

		hbhelper.saveAddress(addressSlim);
		return addressSlim.getId();
	}
	public AddressSlim read(String name) {

		AddressSlim addressSlim=hbhelper.readAddress(name);
		return addressSlim;
	}

	public int update(AddressSlim addressSlim) {
		hbhelper.updateAddress(addressSlim);
		return addressSlim.getId();
	}

	public int remove(String name) {
		
		 AddressSlim addressSlim=new AddressSlim();

		hbhelper.deleteAddress(name);

		return addressSlim.getId();
	}

	

	
	

}
