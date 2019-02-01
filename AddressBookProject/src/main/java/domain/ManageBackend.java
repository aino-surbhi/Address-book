package domain;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import Helper.BackendHelper;
import Helper.FileBackendHelper;
import menu.Menu;
import menu.MenuItem;

public class ManageBackend extends Menu{
    ArrayList<Backend> menuList=new ArrayList<Backend>();
    Backend currentBackend;
    BackendHelper setHelper;
    ManageBackend manage;
	public BackendHelper getSetHelper() {
		return setHelper;
	}
	public void setSetHelper(BackendHelper setHelper) {
		this.setHelper = setHelper;
	}
	
	public Backend getCurrentBackend() {
		return currentBackend;
	}
	public void setCurrentBackend(Backend currentBackend) {
		this.currentBackend = currentBackend;
	}
	public ManageBackend(){
		super(1,"Manage Backend");
		ListBackend listbackend=new  ListBackend(1,"List Backend",this);
		AddBackend addbackend=new AddBackend(2,"Add Backend",this);
		SwitchBackend switchBackend=new SwitchBackend(3,"Switch Backend",this);
		DeleteBackend select=new DeleteBackend(4,"Delete Backend");
		Exit exit=new Exit(5,"Exit");
		
		addMenuItem(listbackend);
		addMenuItem(addbackend);
		addMenuItem(switchBackend);
		addMenuItem(select);
		addMenuItem(exit);
		load();
		
	}
	public void addPathList(Backend object) {
		getMenuList().add(object);
	}
	
	
	public void save() {
		try
		{  
			
			FileOutputStream file = new FileOutputStream("/home/intern6/Documents/file1.ser");
			
			ObjectOutputStream out = new ObjectOutputStream(file); 

			// Method for serialization of object 
			out.writeObject(menuList); 

			out.close(); 
			file.close(); 

		//	System.out.println("Object has been serialized"); 

		} 

		catch(Exception ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 

	}
public void load() {
		 try
	        {   
	            FileInputStream file = new FileInputStream("/home/intern6/Documents/file1.ser"); 
	            ObjectInputStream in = new ObjectInputStream(file); 
				try {
					setMenuList((ArrayList<Backend>)in.readObject());
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} 
	            in.close(); 
	            file.close();  
	        } 
	          
	        catch(IOException ex) 
	        { 
	            System.out.println("IOException is caught"); 
	        } 
	}
	public void display() {
		for(Backend b: menuList) {
			if(b instanceof FileBackend) {
			System.out.println(b);
		  }
		}
	}
	public ArrayList<Backend> getMenuList() {
		return menuList;
	}
	public void setMenuList(ArrayList<Backend> menuList) {
		this.menuList = menuList;
	}
   
   
  

}