package address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuCrud {

	
	 

	  Scanner sc=new Scanner(System.in);
    /*  void createMenu()
      {
    	  
    	  m.setName(sc.next());
      }*/
	  public Menu createMenu()
      {
    	 
    	  System.out.println("enter the menu");
    	  String m_name = sc.next();
    	  Menu m=new Menu(m_name);
    	  m.setName(m_name);
		  return m;
   
    	
     
      }
	  
	  
	  
      public void createItem(Menu m)
      {
    	 
    	   String name1 = null;
    	   System.out.println("enter the menuitem which youwant to add");
	       name1 = sc.next();
    	   
    	   while(!(name1.equals("False")))
    	   {
    	  
    	       
    	       MenuItem mi=new MenuItem(name1);
    	       mi.setName(name1);
    	       m.addMenuItem(mi);
    	       name1=sc.next();
    	   }
      }
 
      
}
