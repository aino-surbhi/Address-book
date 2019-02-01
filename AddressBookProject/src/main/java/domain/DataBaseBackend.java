package domain;

import menu.MenuItem;

public class DataBaseBackend extends MenuItem{
	ManageBackend managebackend;
	public DataBaseBackend(int i, String string,MenuItem menuitem) {
		super(i,string);
		this.managebackend=(ManageBackend)menuitem;
	}
	@Override
	public void doSomething() {
		System.out.println("hey, DataBase Selected");
	}

}