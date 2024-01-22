//Chapter 7 - Question 8

/*
(Average an array) Write two overloaded methods that return the average of an
array with the following headers:

public static int average(int[] array)
public static double average(double[] array)

Write a test program that prompts the user to enter ten double values, invokes this
method, and displays the average value.
*/


import java.util.Scanner;

public class AverageAnArray{

	public static void main(String[] args){

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ten values: ");

			double[] values = new double[10];
			int[] valuesInt = new int[10];
			
			for(int i =0;i<10;i++){
				values[i]=sc.nextDouble();

			}


			double doubleAverage=average(values);
			System.out.println("Double average: "+doubleAverage);


			for(int j=0;j<10;j++){
				valuesInt[j]=(int)values[j];

			}


			int intAverage=average(valuesInt);
			System.out.println("Integer average: "+intAverage);
		}


	public static int average(int[] array){
		int total=0;
		int average;

		for(int i=0;i<10;i++){
			total=total+array[i];

		}

		average=total/10;
		return average;


	}



	public static double average(double[] array){

		double total=0;
		double average;
	
		for(int i=0;i<10;i++){
			total=total+array[i];

		}
	
		average=total/10;
		return average;

	}




}

