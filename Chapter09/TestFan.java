//Chapter 9 - Question 8

/*

Fan
-----------------
-SLOW:int
-MEDIUM:int
-FAST:int
-speed:int
-on:boolean
-radius:double
-color:String
------------------
+getSpeed():int
+getOn():boolean
+getRadius:double
+getColor:String
+setSpeed():void
+setOn():void
+setRadius:void
+setColor:void
+Fan()
+toString():String

*/



class Fan{

	private final static int SLOW=1;
	private final static int MEDIUM=2;
	private final static int FAST=3;

	private int speed=SLOW;
	private boolean on=false;
	private double radius=5;
	private String color="blue";

	
	public Fan(){

	}

	public int getSpeed(){
		return speed;
	}

	public boolean getOn(){
		return on;
	}

	public double getRadius(){
		return radius;
	}

	public String getColor(){
		return color;
	}

	
	public void setSpeed(int speed){
		this.speed=speed;
	}

	public void setOn(boolean on){
		this.on=on;
	}

  	public void setRadius(double radius){
		this.radius=radius;
	}

	public void setColor(String color){
		this.color=color;
	}

	public String toString(){
      
		if(this.on==false){
			return "fan is off";
		}else{
			return "Speed: "+speed+"; Color: "+color+"; Radius: "+radius;
		}
	}	

}


public class TestFan{

	public static void main(String[] args){
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("Yellow");
		fan1.setOn(true);

		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setOn(false);

		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}

}