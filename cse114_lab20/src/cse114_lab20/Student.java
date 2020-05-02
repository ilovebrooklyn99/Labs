package cse114_lab20;

public class Student extends Person {

	private final String status;
	
	public Student(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}
	
	public String toString() {
		return "Class: Student " + "Name: " + getName() ;
	}
	
}
