package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import Address.Address;
import domain.Backend;
import domain.ManageBackend;


public class DBbackendHelper implements BackendHelper{
	ManageBackend manage;
	Backend current;
	Connection connection = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	Address address=new Address();
	private ArrayList<Address> addList1=new ArrayList<Address>();
	public DBbackendHelper(ManageBackend manage) {
		this.manage=manage;
		current=manage.getCurrentBackend();
		//	System.out.println(current.toString());
		DBConnection();

	}
	public DBbackendHelper() {
		super();
	}
	public void DBConnection() {
		String url=current.toString();
		String spl[]=url.split(" ");
		String url1=spl[0];
		System.out.println(url1);
		String username=spl[1];
		System.out.println(username);
		String password=spl[2];
		System.out.println(password);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Trying to connect");
			connection = (Connection) DriverManager.getConnection(url1,username,password);
			statement=(Statement) connection.createStatement();
			System.out.println("Connection Established Successfull and the DATABASE NAME IS:"
					+ connection.getMetaData().getDatabaseProductName());
		} catch (Exception e) {
			System.out.println("Unable to make connection with DB");
			e.printStackTrace();
		}


	}
	public void create() {

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the name");
		address.setName(scanner.next());
		System.out.println("enter the emailid");
		address.setEmailId(scanner.next());
		System.out.println("enter the phone number");
		address.setPhoneNo(scanner.nextInt());
		try {
			statement.executeUpdate("insert into  AddressBook values ('"+address.getName()+"','"+address.getEmailId()+"','"+address.getPhoneNo()+"')");
			System.out.println("address added successfully in database");

		} catch (SQLException e) {
			e.printStackTrace();
		}



	}

	public void read() {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name which you want to read");
		String name=sc.next();
		try {

			resultSet = statement.executeQuery("select * from AddressBook where name='"+name+"'");
			while (resultSet.next()) {
				String email=resultSet.getString("emailId");
				int phoneNo=resultSet.getInt("phoneNo");
				System.out.println(email);
				System.out.println(phoneNo);
			}
		}catch (Exception e1) {
			e1.printStackTrace();
		}

	}

	public void update() {

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the name which you want to update");
		String name=scanner.next();
		System.out.println("enter the emailid");
		address.setEmailId(scanner.next());
		System.out.println("enter the phone number");
		address.setPhoneNo(scanner.nextInt());
		String query = "UPDATE AddressBook SET emailId='"+address.getEmailId()+"',phoneNo='"+address.getPhoneNo()+"' where name='"+name+"'";
		//  PreparedStatement preparedStatement = null;
		try {
			//preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}



	}


	public void delete() {

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the name which you want to delete");
		String name=scanner.next();
		String query=" Delete from AddressBook where name='"+name+"'";
		try {
			//	preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			statement.executeUpdate(query);

		}
		catch (SQLException e) {

			e.printStackTrace();
		}



	}

}
