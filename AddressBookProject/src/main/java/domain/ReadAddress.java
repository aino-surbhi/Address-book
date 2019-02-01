package domain;

import Helper.FileBackendHelper;
import menu.Menu;
import menu.MenuItem;

public class ReadAddress extends MenuItem {
    ManageBackend manage;
	FileBackendHelper file;
	public ReadAddress(int i, String string, MenuItem menu) {
		 super(i,string);
         this.manage=(ManageBackend) menu;
	}

	@Override
	public void doSomething() {
		manage.getSetHelper().read();
	}

}
