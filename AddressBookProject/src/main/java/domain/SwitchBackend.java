package domain;
import menu.Menu;
import menu.MenuItem;

public class SwitchBackend extends MenuItem{
	
	Menu menu1;
	
	public SwitchBackend(int i, String string,Menu menu) {
		super(i,string);
     	menu1=new Menu(i,string);
	    SwitchDBbackend db=new SwitchDBbackend(1,"To DataBase",menu);
	    SwitchFileSystemBackend fb=new SwitchFileSystemBackend(2,"To FileSystem",menu);
	    GoBack goback=new GoBack(3,"Go Back",menu);
	    Exit exit=new Exit(4,"Exit");
	    menu1.addMenuItem(db);
	    menu1.addMenuItem(fb);
	    menu1.addMenuItem(goback);
	    menu1.addMenuItem(exit);
			
	}

	@Override
	public void doSomething() {
		//FileSystemBackend file=new FileSystemBackend();
		menu1.doSomething();
		//file.findInstance();
	}

}