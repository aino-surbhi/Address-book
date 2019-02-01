package address;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="newAddress")
public class Address {
	@Id
	public int id;
	public String name;
	public String street;
	public String city;
	public String country;
	public int zip;

	public int getId() {
		return id;
	}

	public int setId(int id) {
		return this.id = id;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public String setStreet(String street) {
		return this.street = street;
	}

	public String getCity() {
		return city;
	}

	public String setCity(String city) {
		return this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public String setCountry(String country) {
		return this.country = country;
	}

	public int getZip() {
		return zip;
	}

	public int setZip(int zip) {
		return this.zip = zip;
	}
}
