package domain;
import menu.Menu;
import menu.MenuItem;

public class GoBack extends MenuItem{
	
	
	ManageBackend manageBackend;
	public GoBack(int i, String string,Menu menu) {
		
        super(i,string);
        this.manageBackend=(ManageBackend) menu;
	}

/*	public void onClickGoBack(ManageBackend manageBackend) {
		manageBackend.doSomething();
	}*/

	public GoBack(int i, String string, MenuItem menu) {
		this.manageBackend=(ManageBackend) menu;
	}

	@Override
	public void doSomething() { 
		manageBackend.doSomething();
	}

}