//Chapter 6 - Question 37

/*
(Format an integer) Write a method with the following header to format the integer
with the specified width.
public static String format(int number, int width)
The method returns a string for the number with one or more prefix 0s. The size
of the string is the width. For example, format(34, 4) returns 0034 and format(
34, 5) returns 00034. If the number is longer than the width, the method
returns the string representation for the number. For example, format(34, 1)
returns 34.
Write a test program that prompts the user to enter a number and its width and
displays a string returned by invoking format(number, width).



*/


public class FormatInteger{

	public static void main(String[] args){

		int number=34;
		int width=5;

		System.out.println(format(number,width));
	}


	public static String format(int number, int width){

		String numberString=Integer.toString(number);
      	String zeros="";
		int numberLength=numberString.length();
	
		if(numberLength>=width){
			numberString=numberString;
		}else{
			for(int i=0;i<(width-numberLength);i++){
				zeros=zeros+"0";
			}
				numberString=zeros+numberString;

		}

		return numberString;

	}
	


}