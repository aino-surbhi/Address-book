package domain;
import menu.MenuItem;

public class Exit extends MenuItem {
	
	

	public Exit(int i, String string) {
		
        super(i,string);
	}

	@Override
	public void doSomething() {
		System.exit(0);
		
	}

}