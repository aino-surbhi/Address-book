package main.java.com.addressbook;
import java.util.Scanner;

public class Address {
	private int id;
	String name;
	String street;
	String city;
	String country;
	int zip;

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
