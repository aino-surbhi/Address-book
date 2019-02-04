package domain;

import java.util.Scanner;

import Helper.DBbackendHelper;
import menu.MenuItem;

public class DataBaseBackend extends MenuItem{
	ManageBackend manage;
	DBbackendHelper dbhelper;
	public DataBaseBackend(int i, String string,MenuItem menuitem) {
		super(i,string);
		this.manage=(ManageBackend)menuitem;
		
	}
	
	public DataBaseBackend() {
		super();
	}
	@Override
	public void doSomething() {
		create();
		manage.save();
	}
    public void create() {
		DbBackend dbBackend=new DbBackend();
		dbhelper=new DBbackendHelper();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the url");
	    dbBackend.setUrl(scanner.nextLine());
	    System.out.println("enter the User Name");
	    dbBackend.setUsername((scanner.nextLine()));
	    System.out.println("enter the Password");
	    dbBackend.setPassword((scanner.nextLine()));
	    manage.addPathList(dbBackend);
	  	}
}