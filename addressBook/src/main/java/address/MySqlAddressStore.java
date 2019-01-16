package address;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class MySqlAddressStore implements AddressStore {
	
	 Connection connection = null;
     Statement statement = null;
	 PreparedStatement preparedStatement = null;
	 ResultSet resultSet = null;
	
	public MySqlAddressStore(){
		String url = "jdbc:mysql://localhost:3306/addressBook";
		String username ="root";
		String password = "root";

	
     try {
         Class.forName("com.mysql.jdbc.Driver");
         System.out.println("Trying to connect");
         connection = (Connection) DriverManager.getConnection(url,username,password);
         statement=(Statement) connection.createStatement();
        System.out.println("Connection Established Successfull and the DATABASE NAME IS:"
                 + connection.getMetaData().getDatabaseProductName());
     } catch (Exception e) {
           System.out.println("Unable to make connection with DB");
           e.printStackTrace();
     }
   
	}
	
	
	public int add(String name, Address ad) {
		
		
		
		/* try {
			
			  preparedStatement = (PreparedStatement) connection.prepareStatement("insert into  AddressBook values (?, ?, ?, ? ,?, ?)");
			  preparedStatement.setInt(1, ad.id);
		      preparedStatement.setString(2,ad.name );
		      preparedStatement.setString(3, ad.street);
		      preparedStatement.setString(4, ad.city);
		      preparedStatement.setString(5,ad.country);
		      preparedStatement.setInt(6, ad.zip);
		      preparedStatement.executeUpdate();
		      System.out.println("address added successfully in database");
		 
		 } catch (SQLException e) {
			e.printStackTrace();
		}*/
		
	  
		try {
	      statement.executeUpdate("insert into  AddressBook values ('"+ad.getId()+"','"+ad.getName()+"', '"+ad.getStreet()+"', '"+ad.getCity()+"' ,'"+ad.getCountry()+"','"+ad.getZip()+"')");
	      System.out.println("address added successfully in database");
	 
	 } catch (SQLException e) {
		e.printStackTrace();
	   }
		return ad.id;
		 
		
	}

	



	public int remove(String name) {
	     int id1=0;
		String query=" Delete from AddressBook where name='"+name+"'";
		try {
		//	preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			id1=statement.executeUpdate(query);
			
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return id1;
		
	}

	

	public Address read(String name1) {
	
		Address address=new Address();
		try {
				//statement = (Statement) connection.createStatement();
				resultSet = statement.executeQuery("select * from AddressBook where name='"+name1+"'");
				while (resultSet.next()) {
					address.id= resultSet.getInt("Id");
					address.name = resultSet.getString("name");
					address.street = resultSet.getString("street");
					address.city = resultSet.getString("city");
					address.country = resultSet.getString("country");
					address.zip = resultSet.getInt("zipcode");
				}
			}catch (Exception e1) {
				  e1.printStackTrace();
				}

		return address;
		}
		


	public int update(String name, Address ad1) {
		
		  String query = "UPDATE AddressBook SET id='"+ad1.getId()+"',street='"+ad1.getStreet()+"',city='"+ad1.getCity()+"',country='"+ad1.getCountry()+"',zipcode='"+ad1.getZip()+"' where name='"+name+"'";
	    //  PreparedStatement preparedStatement = null;
		  try {
			//preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			statement.executeUpdate(query);
            } catch (SQLException e) {
			 e.printStackTrace();
		}
		  return ad1.id;
	     
	      
		
	}
	

}
