package domain;

import menu.Menu;
import menu.MenuItem;

public class AddBackend extends MenuItem{
	Menu menu1;
	AddBackend(int id, String name,Menu menu) {
		super(id,"Add Backend");
		menu1=new Menu(id,name);
	    DataBaseBackend db=new DataBaseBackend(1,"Select DataBase",menu);
	    FileSystemBackend fb=new FileSystemBackend(2,"Select FileSystem",menu);
	    GoBack goback=new GoBack(3,"Go Back",menu);
	    Exit exit=new Exit(4,"Exit");
	    menu1.addMenuItem(db);
	    menu1.addMenuItem(fb);
	    menu1.addMenuItem(goback);
	    menu1.addMenuItem(exit);
	}

	public AddBackend() {
		
       super();
	}
	@Override
	public void doSomething() {
		
		while(true) {
			System.out.println("Select The Backend...");
			menu1.displayMenuItem();
			int choice=menu1.readAndSelectedChoice();
			menu1.matchWithTheChoice(choice);
		   }
		
	}
}