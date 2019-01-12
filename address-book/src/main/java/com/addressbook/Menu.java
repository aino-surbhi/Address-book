package main.java.com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	    int id;
	    String name;
	
	//	MenuItem m=new MenuItem();
		ArrayList<MenuItem> al=new ArrayList<MenuItem>();
	/*	public void addMenuItem(String name) {
			ArrayList al=new ArrayList();

			al.add(m.getName());
			
		}*/

	public Menu(String next) {
			this.name=name;
		}

		/*	public void deleteItem(String name1) {
			al.remove(name1);
			
		}

		public void updateItem(int pos,String name3) {
			al.set(pos,name3);
			
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

		public void addMenuItem(MenuItem mi) {
		
				al.add(mi);	
		}
		public void Menu(String name)
		{
			this.name=name;
		}
	     public void display()
        {
	    	 int i=0;
	    	 System.out.println("Enter your choice:");
        	for(MenuItem obj:al)
        	{
        		
        		System.out.println( ++i +")" +obj.name);
        		
        	}
        }

      

}
