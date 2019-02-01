package main.java.com.addressbook;

import java.util.Scanner;
public class AddressBookConsoleManager{
	
	
	
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

	

}
