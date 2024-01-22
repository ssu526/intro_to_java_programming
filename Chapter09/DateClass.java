//Chapter 9 - Question 3


/*
(Use the Date class) Write a program that creates a Date object, sets its elapsed
time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
10000000000, and 100000000000, and displays the date and time using the
toString() method, respectively.
*/


public class DateClass{

	public static void main(String[] args){

		java.util.Date date=new java.util.Date();
		/*long[] elapsedTime={10000,100000,1000000,10000000,100000000,1000000000L,10000000000L};
		
		for(int i=0;i<elapsedTime.length;i++){
			date.setTime(elapsedTime[i]);
			System.out.println(date.toString());

		}
		*/

		long elapsedTime=1000;

		for(int i=0;i<7;i++){
			date.setTime(elapsedTime*(long)Math.pow(10,i));
			System.out.println(date.toString());
		}

	}


}
