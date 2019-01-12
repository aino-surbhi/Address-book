package main.java.com.addressbook;

import java.util.Scanner;
public class AddressBookConsoleManager{
	
	/*void showMenu()
	{
		System.out.println("..Menu items are...");
		System.out.println("1. Create");
		System.out.println("2. Read");
		System.out.println("3. Update");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		
	}
	
	void Menu()
	{
		Scanner sc=new Scanner(System.in);
		AddressBookConsoleManager ad=new AddressBookConsoleManager();
		ad.showMenu();
		AddressCrudUtil add=new AddressCrudUtil();
		System.out.println("enter the menu item which you want to select");
		int num=sc.nextInt();
		switch(num)
		{
			
		case 10: ad.acceptAddress();
		         add.create(sc.next());
			    break;
		case 20: add.read(sc.next());
		        break;
		case 30: ad.acceptAddress();
			    add.update(sc.next());
		        break;
		case 40: add.delete(sc.next());
		        break;
		case 50: System.exit(0);	
		        break;
		default:System.out.println("enter your valid choice");  
		        ad.showMenu();
		        break;

		 
		}	
		
	}
	void acceptAddress()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the street");
		String street=sc.next();
		System.out.println("enter the city");
		String city=sc.next();
		System.out.println("enter the country");
		String country=sc.next();	
	}
	
	public static void main(String args[])
    {
		
		Scanner sc=new Scanner(System.in);
		AddressBookConsoleManager ad=new AddressBookConsoleManager();
		AddressCrudUtil add=new AddressCrudUtil();
		System.out.println("enter the menu item which you want to select");
		int num=sc.nextInt();
		while(true)
		{
			System.out.println("..Menu items are...");
			System.out.println("1. Create");
			System.out.println("2. Read");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			
	
		switch(num)
		{
			
		case 10: ad.acceptAddress();
		         add.create(sc.next());
			    break;
		case 20: add.read(sc.next());
		        break;
		
		case 30: add.delete(sc.next());
		        break;
		case 40: System.exit(0);	
		        break;
		default:System.out.println("enter your valid choice");  
		        break;

		}
	}
		
		MenuCrud mc=new MenuCrud();
		Menu m=mc.createMenu();
		mc.createItem(m);
		m.display();
 }*/
	
	public static void main(String args[])
	{
		AddressBookConsoleManager ad=new AddressBookConsoleManager();
		AddressCrudUtil add=new AddressCrudUtil();
		Address address=null;
		MenuCrud mc=new MenuCrud();
		Menu m=mc.createMenu();
		mc.createItem(m);
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			m.display();
		   int menuItem=sc.nextInt();
		
		switch(menuItem)
		{
		case 1: address=add.createAddress();
		               break;
     	case 2 :System.out.println("enter the name you want to read"); 
		        String name=sc.next();
			    add.read(name,address);
		        break;
		case 3 : System.out.println("enter the name you want to update"); 
                 String name1=sc.next();
			     add.update(name1);
		         break;
		case 4 : System.out.println("enter the name you want to delete"); 
                 String name2=sc.next();
			     add.delete(name2);
		         break;
		
		case 5 :System.exit(0);
	           	break;
		
		
		}
		
		
		
	}
	
	}

	
	/*public void createAddress() {
		Address ad=new Address();
		AddressCrudUtil add=new AddressCrudUtil();
		Scanner sc=new Scanner(System.in);
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
	
		
	}*/
}
