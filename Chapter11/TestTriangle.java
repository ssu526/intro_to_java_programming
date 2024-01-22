/*
(The Triangle class) Design a class named Triangle that extends GeometricObject. The class contains:

	 Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
	 A no-arg constructor that creates a default triangle.
	 A constructor that creates a triangle with the specified side1, side2, and side3.
	 The accessor methods for all three data fields.
	 A method named getArea() that returns the area of this triangle.
	 A method named getPerimeter() that returns the perimeter of this triangle.
	 A method named toString() that returns a string description for the triangle.

The toString() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;

Write a test program that prompts the user to enter three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled. The program should create a Triangle object with these sides and set the color and filled properties using the input. The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
*/

import java.util.Scanner;

class TriangleFromSimpleGeometricObject extends SimpleGeometricObject{
	private double side1;
	private double side2;
	private double side3;

	public TriangleFromSimpleGeometricObject(){
		this.side1=1;
		this.side2=1;
		this.side3=1;
	}

	public TriangleFromSimpleGeometricObject(double side1, double side2,double side3, String color, boolean filled){
		super(color, filled);
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}


	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}

	public double getSide3(){
		return side3;
	}

	public double getPerimeter(){
		return side1+side2+side3;
	}

	public double getArea(){

		double s =(side1 + side2 + side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}

	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3+"\nColor: "+getColor()+"\nfilled: "+isFilled();
	}


}


public class TestTriangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double side1, side2, side3;
		String color;
		boolean filled;

		System.out.println("Enter the length of side 1");
		side1 = input.nextDouble();
		System.out.println("Enter the length of side 2");
		side2 = input.nextDouble();
		System.out.println("Enter the length of side 3");
		side3 = input.nextDouble();
		System.out.println("Enter the color of the Triangle");
		color = input.nextLine();
		color = input.nextLine();
		System.out.println("Is the triangle filled");
		filled = input.nextBoolean();

		TriangleFromSimpleGeometricObject triangle = new TriangleFromSimpleGeometricObject(side1, side2, side3, color, filled);
		System.out.println(triangle.toString());
			
	}

}
	
















