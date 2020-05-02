package cse114_lab20;

public class Person {

	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	
	public Person() {
		
	}
	
	public Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String toString() {
		return "Class: Person " + "Name: " + this.name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
