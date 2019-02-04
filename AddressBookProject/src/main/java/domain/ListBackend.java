package domain;
import menu.Menu;
import menu.MenuItem;

public class ListBackend extends MenuItem{
	Menu menu=new Menu();
	ManageBackend manageBackend;
	
	public ListBackend(int id, String name,Menu menu) {
		super(id,name);
	}

	public ListBackend() {
		super();
	}

	@Override
	public void doSomething() {
		manageBackend=new ManageBackend();
		System.out.println("List Of Backends");
		manageBackend.display();
	    manageBackend.display1();

	}

}