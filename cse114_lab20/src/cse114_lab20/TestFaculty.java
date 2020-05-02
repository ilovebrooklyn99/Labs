package cse114_lab20;

public class TestFaculty extends Faculty{

	public static void main(String[] args){
		Faculty f1 = new Faculty("11 AM to 1 PM", "Professor");
		
		f1.setName("Ryan Bentilloni");
		System.out.println(f1.toString());
		
		System.out.println(f1.getOfficeHours() );
		System.out.println(f1.getRank());
		
		f1.setAddress("1234 56th St.");
		System.out.println(f1.getAddress());
		
		f1.setExperience(5);
		System.out.println(f1.getExperience());
		
		

	}

}
