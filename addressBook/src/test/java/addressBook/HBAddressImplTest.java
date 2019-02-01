package addressBook;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import address.AddressSlim;
import address.HBAddressImpl;

public class HBAddressImplTest {
	HBAddressImpl hbimpl=new HBAddressImpl();
	//Address address=new Address();
	@Test public void addTest() {
		Integer id;
		AddressSlim addressSlim=new AddressSlim();
		addressSlim.setId(1);
		addressSlim.setName("surbhi");
		addressSlim.setCity("banswara");
		addressSlim.setCountry("UK");
		addressSlim.setStreet("kesariwada");
		addressSlim.setZip(4567);
		id=hbimpl.add(addressSlim.getName(), addressSlim);
		assertTrue(addressSlim.getId()==id);
        
	}
	
	@Test public void readTest() {
		AddressSlim addressSlim=new AddressSlim();
		
		addressSlim.setId(1);
		addressSlim.setName("surbhi");
		addressSlim.setCity("banswara");
		addressSlim.setCountry("UK");
		addressSlim.setStreet("kesariwada");
		addressSlim.setZip(4567);
		hbimpl.add(addressSlim.getName(), addressSlim);
		AddressSlim user=hbimpl.read("surbhi");
	
        assertTrue(user.getCity().equals("banswara"));
		assertTrue(user.getCountry().equals("UK"));
		assertTrue(user.getName().equals("surbhi"));
		
	}
	
	@Test public void updateTest() {
		Integer id;
		AddressSlim addressSlim=new AddressSlim();
		addressSlim.setId(1);
		addressSlim.setName("surbhi");
		addressSlim.setCity("ban");
		addressSlim.setCountry("UK1");
		addressSlim.setStreet("kesariwada1");
		addressSlim.setZip(4567);
		id=hbimpl.update(addressSlim);
		assertTrue(id==1);

		
	}
	@Test public void removeTest() {
		Integer id;
		AddressSlim addressSlim=new AddressSlim();
		addressSlim.setId(1);
		addressSlim.setName("surbhi");
		addressSlim.setCity("banswara1");
		addressSlim.setCountry("UK1");
		addressSlim.setStreet("kesariwada1");
		addressSlim.setZip(4567);
		id=hbimpl.remove(addressSlim.getName());
		assertFalse(id==2);
	}
}
