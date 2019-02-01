package main.java.com.addressbook;

import java.util.Scanner;

public class MenuItem {
	int id;
	String name;
	/*public void showMenu()
	{
		
	
		/*System.out.println("1. add");
		System.out.println("2. update the content");
		System.out.println("3. delete the content");
		System.out.println("4. exit");
		AddressCrudUtil add=new AddressCrudUtil();
		Menu m=new Menu();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(true)
		{
			switch(num)
			{
			  case 1:System.out.println("enter the item which you want to add");
			         String name=sc.next();
			          m.addItem(name);
			         showMenu();
			         break;
			  case 2:System.out.println("enter the item which you want to update");
			   
			        String name1=sc.next();
			        System.out.println("enter the position where you want to update");
			        int no=sc.nextInt();
		            m.updateItem(no,name1);
		            showMenu();
		            break;
			  case 3:System.out.println("enter the item which you want to delete");
		            String name3=sc.next();
		            m.deleteItem(name3);
		            showMenu();
		            break;
		      case 4:System.exit(0);
		           break; 
			}
			
		}
	}
	}*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public MenuItem(String m)
	{
		
		this.name=m;
	}
	
}
