package test;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Test.*;
import org.junit.Test.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.java.com.addressbook.Menu;
import main.java.com.addressbook.MenuCrud;


@RunWith(JUnit4.class)
public class MenuCrudTest1 {
	
	public static MenuCrud menucrud;
	public static Menu m;
	
	@BeforeClass
	public static void initialize() {
		
	    menucrud=new MenuCrud();
	}
	
	@Test public void TestMenu() 
	{
	
		 m=menucrud.createMenu();
		assertNotNull(menucrud);
	}
	 
	@Test public void TestMenuItem() 
	{
		menucrud.createItem(m);
		assertNotNull(menucrud);
	}
	


}
