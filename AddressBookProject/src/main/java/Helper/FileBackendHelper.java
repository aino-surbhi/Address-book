package Helper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.UnaryOperator;

import Address.Address;
import domain.Backend;
import domain.ManageBackend;

public class FileBackendHelper implements BackendHelper{

	ManageBackend manage;
	Backend current;
	Address address=new Address();

	public Backend getCurrent() {
		return current;
	}

	public void setCurrent(Backend current) {
		this.current = current;
	}

	private ArrayList<Address> addList=new ArrayList<Address>();
	public ArrayList<Address> getAddList() {
		return addList;
	}

	public void setAddList(ArrayList<Address> addList) {
		this.addList = addList;
	}

	public FileBackendHelper(ManageBackend manage) {
		this.manage=manage;
		current=manage.getCurrentBackend();
		load();
	}

	@Override
	public String toString() {
		return "FileBackendHelper [current=" + current + "]";
	}

	public void saveAddress() {
		try
		{    
			//Saving of object in a file 
			FileOutputStream file = new FileOutputStream(manage.getCurrentBackend().toString()); 
			ObjectOutputStream out = new ObjectOutputStream(file); 

			// Method for serialization of object 
			out.writeObject(addList); 

			out.close(); 
			file.close(); 

			System.out.println("Object has been serialized"); 

		} catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 

	}
	public void load() {
		try
		{   
			FileInputStream file = new FileInputStream(manage.getCurrentBackend().toString()); 
			ObjectInputStream in = new ObjectInputStream(file); 
			try {
				addList=(ArrayList<Address>)in.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
			in.close(); 
			file.close();  
		} 

		catch(IOException e) 
		{ 
			System.out.println("IOException is caught"); 
		} 
	}
	/*public void display1() {
		for(Address ad:addList) {
			System.out.println(ad);
		}
	}*/
	public void create() {
	//	Address address=new Address();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the name");
		address.setName(scanner.next());
		System.out.println("enter the emailid");
		address.setEmailId(scanner.next());
		System.out.println("enter the phone number");
		address.setPhoneNo(scanner.nextInt());
		addAddress(address);
		saveAddress();
	}
	public void addAddress(Address address) {

		addList.add(address);
	}
	public void read() {
		load();
		System.out.println("Enter The Detaiils To Read Address :");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The Name :");
		String name=scanner.next();
		for(Address address:addList)
		{
			if(name.equals(address.getName()))
			{
				System.out.println(getAddList());
			//	System.out.println(getAddList().indexOf(2));

			//	System.out.println(address.getPhoneNo());
			}
		}
	} 



	public void update() {
		load();
		System.out.println("Enter The Details To Update the Address :");

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The Name :");

		String name=scanner.next();
		for(Address address:addList){
			if(name.equals(address.getName())){
				System.out.println("Enter The Email :");

				address.setEmailId(scanner.next());
				System.out.println("Enter The PhoneNumber :");

				address.setPhoneNo((scanner.nextInt()));
			}
		}
		saveAddress();
	}

	public void delete() {
		load();
		System.out.println("Enter The Details to Delete the Address :");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The Name  :");

		String name=scanner.next();
		Address address1=null;
		for(Address address:addList){
			if(name.equals(address.getName())){
				address1=address;
			}
		}
		addList.remove(address1);
		saveAddress();
	}
}
