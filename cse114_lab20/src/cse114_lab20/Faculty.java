package cse114_lab20;

public class Faculty extends Employee{

	private String officeHours;
	private String rank;
	
	public Faculty() {
		
	}
	
	public Faculty(String officeHours, String rank) {
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String toString() {
		return "Class: Faculty " + "Name: " + getName() ;
	}
	
	public String getOfficeHours() {
		return this.officeHours;
	}
	
	public String getRank() {
		return this.rank;
	}
	
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
}
