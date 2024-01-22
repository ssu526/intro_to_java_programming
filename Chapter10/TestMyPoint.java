//Chapter 10 - Question 4

class MyPoint{

	private double x;
	private double y;

	public MyPoint(){
		this(0,0);
	}

	public MyPoint(double x, double y){
		this.x=x;
		this.y=y;
	}

	
	public double distance(MyPoint point2){

		double distance;
		distance=Math.sqrt(Math.pow((x-point2.x),2)+Math.pow((y-point2.y),2));
		return distance;
	}


	public double distance(double x, double y){
		double distance;
		distance=Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y),2));
		return distance;

	}
	
}


public class TestMyPoint{

	public static void main(String[] args){
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);
		System.out.printf("%5.2f\n",point1.distance(point2));


	}

}