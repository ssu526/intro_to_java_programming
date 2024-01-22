
/*12.5 (IllegalTriangleException) Programming Exercise 11.1 defined theTriangle class with three sides. In a triangle, the sum of any two sides isgreater than the other side. The Triangle class must adhere to this rule.Create the IllegalTriangleException class, and modify the constructorof the Triangle class to throw an IllegalTriangleException object if atriangle is created with sides that violate the rule, as follows:public Triangle(double side1, double side2, double side3)throws IllegalTriangleException {// Implement it*/

public class Triangle{ 
	private double side1; 
	private double side2; 
	private double side3; 
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{ 
		if(side1+side2<side3){ 
			throw new IllegalTriangleException(); 
		}else if(side3+side2<side1){ 
			throw new IllegalTriangleException(); 
		}else if(side1+side3<side2){ 
			throw new IllegalTriangleException(); 
		}else{} 
	} 

	public static void main(String[] args){ 
		try{ 
			Triangle t = new Triangle(1,1,3); 
		} catch(IllegalTriangleException ex){ 
			System.out.println(ex.getMessage()); 
		} 
	}
}

class IllegalTriangleException extends Exception{ 
	public IllegalTriangleException(){ super("Invalid triangle"); 
	}
} 
