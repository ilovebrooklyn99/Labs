package cse114_lab20;

public class Employee extends Person {

	private String office;
	private double salary;
	private int experience;
	
	public Employee() {
		
	}
	
	public Employee(String office, double salary, int experience) {
		this.office = office;
		this.salary = salary;
		this.experience = experience;
	}
	
	public String toString() {
		return "Class: Employee " + "Name: " + getName() ;
	}
	
	public String getOffice() {
		return this.office;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public int getExperience() {
		return this.experience;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}
