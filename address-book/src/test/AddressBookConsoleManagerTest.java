

import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.junit.Test;

import main.java.com.addressbook.Menu;
import main.java.com.addressbook.MenuCrud;

public class AddressBookConsoleManagerTest {
	
	public static Logger logger= Logger.getLogger(AddressBookConsoleManagerTest.class.getName());
	public static MenuCrud menucurd;
	public static Menu menu;
    @BeforeClass public static void onceInitialize() {
    	menucurd=new MenuCrud();
    }
    
    @Test public void initialize()
    {
    	menu=menucurd.createMenu();
    	menucurd.createItem(menu);
  
    	
    	
    }




}
