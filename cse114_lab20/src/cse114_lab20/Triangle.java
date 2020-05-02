package cse114_lab20;

public class Triangle extends GeometricObject{

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
		//super() implied
	}
	
	public Triangle(double side1, double side2, double side3) {
		//super() implied
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getArea() {
		double s = (this.side1 + this.side2 + this.side3)/2;
		return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3) );
	}
	
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " + String.valueOf(this.side1) + " side2 = " + String.valueOf(this.side2)
			+ " side3 = " + String.valueOf(this.side3);
	}
	
	public double getSide1() {
		return this.side1;
	}
	
	public double getSide2() {
		return this.side2;
	}
	
	public double getSide3() {
		return this.side3;
	}
}
