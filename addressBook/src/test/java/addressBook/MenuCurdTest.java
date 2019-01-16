package addressBook;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import address.Menu;
import address.MenuCrud;
import address.MenuItem;

public class MenuCurdTest {
	
	public static MenuCrud menucurd;
	public static Menu menu;
	public static MenuItem menuitem;
	@Before public void Initialize()
	{
		
		menucurd=new MenuCrud();
	}
	
	

	@Test
	public void CreateMenutest() {
		
		String menuName;
		menuName="AddressBook";
		menu=menucurd.createMenu();
		assertTrue(menu.getName().equals(menuName));
	}
   @Test public void CreateMenuTest() {
	   
	   String menuItem;
	   menuItem="update";
	   Menu menu=new Menu(menuItem);
	   menucurd.createItem(menu);
	   assertTrue(menu.al.get(2).getName().equals(menuItem));
	   
   }
}
