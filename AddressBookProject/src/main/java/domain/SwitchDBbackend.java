package domain;

import menu.Menu;
import menu.MenuItem;

public class SwitchDBbackend extends MenuItem{
    ManageBackend manageBackend;
	public SwitchDBbackend(int i, String string, MenuItem menu) {
		super(i,string);
		this.manageBackend=(ManageBackend) menu;
	}

	@Override
	public void doSomething() {
		
		
	}

}
