package domain;

import menu.MenuItem;

public class UpdateAddress extends MenuItem {
   ManageBackend manage;
   public UpdateAddress(int i, String string, MenuItem menu) {
		super(i,string);
		this.manage=(ManageBackend) menu;
	}

	@Override
	public void doSomething() {
		manage.getSetHelper().update();

		
	}

}
