//Chapter 7 - Question 9

/*

(Find the smallest element) Write a method that finds the smallest element in an
array of double values using the following header:

public static double min(double[] array)

Write a test program that prompts the user to enter ten numbers, invokes this
method to return the minimum value, and displays the minimum value. 

*/


import java.util.Scanner;

public class SmallestElement{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");

		double[] values = new double[10];

		for(int i=0;i<10;i++){

			values[i]=sc.nextDouble();

		}


		double smallestValue=min(values);
		System.out.println("The smallest value is "+smallestValue);
		
	}


	
	public static double min(double[] array){

		double min=array[0];

		for(int i=1;i<10;i++){
			if(array[i]<min){

				min=array[i];
			}

		}



		return min;

	}


}