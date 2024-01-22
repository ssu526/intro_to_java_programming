//Chapter 9 - Question 1

/*
Rectangle
-----------------
width:double
height:double
-----------------
Rectangle()
Rectangel(width:double,height:double)
getArea():double
getPerimeter:double

*/

public class TestRectangle{

	public static void main(String[] args){
	
		Rectangle r1 = new Rectangle(4,10);
		Rectangle r2 = new Rectangle(3.5,35.9);

		System.out.println("Rectangle 1 has width "+r1.width+", height "+r1.height+", area "+r1.getArea()+", perimeter "+r1.getPerimeter());
		System.out.println("Rectangle 2 has width "+r2.width+", height "+r2.height+", area "+r2.getArea()+", perimeter "+r2.getPerimeter());
		
	}

}


class Rectangle{

	double width=1;
	double height=1;

	Rectangle(){

	}

	Rectangle(double width, double height){
		this.width=width;
		this.height=height;
	}

	double getArea(){
		return width*height;
	}

	double getPerimeter(){
		return (width+height)*2;
	}


}


