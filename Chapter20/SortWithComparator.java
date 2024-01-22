/*
20.21 (Use Comparator) Write the following generic method using selection sort and a comparator.

public static <E> void selectionSort(E[] list, Comparator<? super E> comparator)

Write a test program that creates an array of 10 GeometricObjects and
invokes this method using the GeometricObjectComparator introduced in
Listing 20.4 to sort the elements. Display the sorted elements. Use the following
statement to create the array.

GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
new Circle(6.5), new Rectangle(4, 5)};
*/
package Chapter20;

import java.util.*;
import java.text.*;
import Class.Rectangle;
import Class.Circle;
import Class.GeometricObject;

public class SortWithComparator{
	public static void main(String[] args){
			GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
										new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
										new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
										new Circle(6.5), new Rectangle(4, 5)};

			for(int k=0;k<list.length;k++){
				System.out.print(list[k].getArea()+" ");
			}

			System.out.println("");



			for(int i=0;i<list.length;i++){
				for(int j=i;j<list.length;j++){
					GeometricObject min = list[i];
					GeometricObject newMin= min(min, list[j], new GeometricObjectComparator());
					if(newMin != min){
						GeometricObject temp = list[i];
						list[i]=newMin;
						list[j]=temp;
					}
									
				}
			}


			for(int k=0;k<list.length;k++){
				System.out.print(list[k].getArea()+" ");
			}

			System.out.println("");
	}

	public static GeometricObject min(GeometricObject a, GeometricObject b, Comparator<GeometricObject> c){
		if(c.compare(a,b)>=0){
			return a;
		}else{
			return b;
		}
	}


}


class GeometricObjectComparator implements Comparator<GeometricObject>, java.io.Serializable{
	public int compare(GeometricObject a, GeometricObject b){
		if(a.getArea()>b.getArea()){
			return -1;
		}else if(a.getArea()<b.getArea()){
			return 1;
		}else{
			return 0;
		}
	}
}

/*
abstract class GeometricObject{
	private String color="White";
	private boolean filled;
	private java.util.Date dateCreated;

	protected GeometricObject(){
		dateCreated=new java.util.Date();
	}

	protected GeometricObject(String color, boolean filled){
		dateCreated=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color=color;
	}

	public boolean getFilled(){
		return filled;
	}

	public void setFilled(boolean filled){
		this.filled=filled;
	}

	public java.util.Date getDateCreated(){
		return dateCreated;
	}

	public String toString(){
		return "Date Created: "+dateCreated+"\nColor: "+color+"\nFilled: "+filled;
	}

	public abstract double getArea();

	public abstract double getPerimeter();	

}

class Rectangle extends GeometricObject{
	private double side1;
	private double side2;

	public Rectangle(double side1, double side2){
		this.side1=side1;
		this.side2=side2;
	}

	public double getPerimeter(){
		return side1*2+side2*2;
	}

	public double getArea(){
		return side1*side2;
	}


	public String toString(){
	    DecimalFormat df = new DecimalFormat("###.##");
		return super.toString()+"\nPerimeter: "+df.format(getPerimeter())+"\nArea: "+df.format(getArea());
		
	}	
}


class Circle extends GeometricObject{
	private double radius;

	public Circle(double radius){
		this.radius=radius;
	}

	public double getPerimeter(){
		return 2*3.14*radius;
	}

	public double getArea(){
		return 3.14*radius*radius;
	}


	public String toString(){
	    DecimalFormat df = new DecimalFormat("###.##");
		return super.toString()+"\nPerimeter: "+df.format(getPerimeter())+"\nArea: "+df.format(getArea());
		
	}	
}
*/
