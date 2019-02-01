package domain;

import menu.MenuItem;

public class DeleteAddress extends MenuItem{
	ManageBackend manage;
	public DeleteAddress(int i, String string, MenuItem menu) {
		 super(i,string);
		 this.manage=(ManageBackend) menu;
	}

	@Override
	public void doSomething() {
		manage.getSetHelper().delete();
		
	}

}
