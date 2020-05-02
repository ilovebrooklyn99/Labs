package cse114_lab20;

import java.util.Scanner;
public class TestTriangle extends Triangle {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Enter three sides of your triangle.");
		double s1 = stdin.nextDouble();
		double s2 = stdin.nextDouble();
		double s3 = stdin.nextDouble();
		
		Triangle t1 = new Triangle(s1, s2, s3);
		
		System.out.println("Enter a color for your triangle.");
		t1.setColor(stdin.next());

		System.out.println("Is your triangle filled? Input yes or no. ");
		String filled = stdin.next();
		if(filled.equals("yes") )
			t1.setFilled(true);
		else
			t1.setFilled(false);
		
		System.out.println("Area: " + t1.getArea());
		System.out.println("Perimeter: " + t1.getPerimeter());
		System.out.println("Color: " + t1.getColor());
		System.out.println("Filled? " + t1.isFilled());
		System.out.println("Date: " + t1.getDateCreated());
		System.out.println(t1.toString());
		
		
		stdin.close();
	}

}
