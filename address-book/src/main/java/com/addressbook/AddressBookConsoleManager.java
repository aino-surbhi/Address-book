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
	}*/
	
	public static void main(String ars[])
    {
		MenuCrud mc=new MenuCrud();
		Menu m=mc.createMenu();
		mc.createItem(m);
		m.display();
		
		
		
   }
}
