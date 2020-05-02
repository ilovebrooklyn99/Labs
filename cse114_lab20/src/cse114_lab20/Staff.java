package cse114_lab20;

public class Staff extends Employee{

	private String title;
	
	public Staff() {
		
	}
	
	public Staff(String title) {
		this.title = title;
	}
	
	public String toString() {
		return "Class: Staff " + "Name: " + getName() ;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
}
