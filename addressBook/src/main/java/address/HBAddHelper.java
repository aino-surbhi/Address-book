package address;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class HBAddHelper {
	HBAddDao hbDao =new HBAddDao();
	AddressSlim addressSlim=new AddressSlim();
	
	public void saveAddress(AddressSlim addressSlim) {
		HBAddHelper hbAddHelper=new HBAddHelper(); 
		Address address=hbAddHelper.convertToPojo(addressSlim);
		hbDao.saveValues1(address);
	}

	public AddressSlim readAddress(String name) {
		
		HBAddHelper hbAddHelper=new HBAddHelper(); 
		Address	add=hbDao.readValues1(name);
		AddressSlim addressSlim=hbAddHelper.convertToSlim(add);
		return addressSlim;
	}
	public void updateAddress(AddressSlim addressSlim) {

		HBAddHelper hbAddHelper=new HBAddHelper(); 
		Address address=hbAddHelper.convertToPojo(addressSlim);
		hbDao.updateValues(address);
	}
	public void deleteAddress(String name) {
		hbDao.deleteValues(name);
	}
	public AddressSlim convertToSlim(Address address) {

		AddressSlim addressSlim=new AddressSlim();

		addressSlim.setId(address.getId());
		addressSlim.setName(address.getName());
		addressSlim.setCity(address.getCity());
		addressSlim.setCountry(address.getCountry());
		addressSlim.setZip(address.getZip());
		return addressSlim;
	}
	public Address convertToPojo(AddressSlim addressSlim) {

		Address address=new Address();

		address.setId(addressSlim.getId());
		address.setName(addressSlim.getName());
		address.setCity(addressSlim.getCity());
		address.setCountry(addressSlim.getCountry());
		address.setZip(addressSlim.getZip());
		return address;



	}
}
