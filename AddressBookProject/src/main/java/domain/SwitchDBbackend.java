package domain;

import java.util.Scanner;

import Helper.DBbackendHelper;
import Helper.FileBackendHelper;
import menu.Menu;
import menu.MenuItem;

public class SwitchDBbackend extends MenuItem{
    ManageBackend manage;
    Menu menu1;
	public SwitchDBbackend(int i, String string, MenuItem menu) {
		super(i,string);
		this.manage=(ManageBackend) menu;
		 menu1=new Menu(i,string);
		    CreateAddress create=new CreateAddress(1,"Create Address",menu);
			ReadAddress read=new ReadAddress(2,"Read Address",menu);
			UpdateAddress update=new UpdateAddress(3,"Update Address",menu);
			DeleteAddress delete=new DeleteAddress(4,"Delete Address",menu);
			GoBack goback=new GoBack(5,"GoBack",menu);
		    menu1.addMenuItem(create);
		    menu1.addMenuItem(read);
		    menu1.addMenuItem(update);
		    menu1.addMenuItem(delete);
	}

	@Override
	public void doSomething() {
		manage.display1();
		findInstance();
	    menu1.doSomething();
		
	}
	public void findInstance() {
		   int i=0;
		   for(Backend b:manage.getMenuList()) {
			   System.out.println(""+(i++)+"."+b);
		   }
		   System.out.println("Enter the Database which you want to select");
		   Scanner scanner=new Scanner(System.in);
		   int ch=scanner.nextInt();
		   for(Backend b:manage.getMenuList()) {
		   if(ch==manage.getMenuList().indexOf(b)) {
			 manage.setCurrentBackend(b);  
			 manage.setSetHelper(new DBbackendHelper(manage)); 
			// System.out.println(manage);
		   }
		   
	     }
	 }

}
