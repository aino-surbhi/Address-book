package domain;
import java.util.Scanner;

import Helper.FileBackendHelper;
import menu.MenuItem;

public class FileSystemBackend extends MenuItem {

	ManageBackend manage;
	FileBackend fileBackend;
	public FileSystemBackend(int i, String string,MenuItem menuitem) {
      super(i,string);
      this.manage=(ManageBackend)menuitem;
	}
	
	
	
	public FileSystemBackend() {
		super();
	}



	public void create() {
		FileBackend fileBackend=new FileBackend();
		System.out.println("enter the path");
	    Scanner scanner=new Scanner(System.in);
	    fileBackend.setPath(scanner.nextLine());
	    System.out.println(fileBackend);
	    manage.addPathList(fileBackend);
	}

	@Override
	public void doSomething() {
		create();
		manage.save();
	}
	
	
   

}