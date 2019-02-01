package domain;

import Helper.FileBackendHelper;
import menu.Menu;
import menu.MenuItem;

public class CreateAddress extends MenuItem{
	ManageBackend manage;
	FileBackendHelper filehelper;
	public CreateAddress(int i, String string,MenuItem menu) {
		
          super(i,string);
          this.manage=(ManageBackend)menu;
	}
	@Override
	public void doSomething() {
		
		manage.getSetHelper().create();
	}

}
