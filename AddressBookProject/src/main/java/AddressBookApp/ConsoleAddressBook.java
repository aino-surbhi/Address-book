package AddressBookApp;

import domain.ManageBackend;

public class ConsoleAddressBook {
		
		public static void main(String args[])
		{
			
			ManageBackend mbackend=new ManageBackend();
			System.out.println("***Welcome To new Address Book***\n");
		    mbackend.doSomething();
		}
}

