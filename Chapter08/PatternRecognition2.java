//Chapter 7 - Question 30

/*
(Pattern recognition: consecutive four equal numbers) Write the following
method that tests whether the array has four consecutive numbers with the same
value.

public static boolean isConsecutiveFour(int[] values)

Write a test program that prompts the user to enter a series of integers and displays
if the series contains four consecutive numbers with the same value. Your
program should first prompt the user to enter the input sizeói.e., the number of
values in the series.
*/

import java.util.Scanner;

public class PatternRecognition2{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values: ");
		int length=sc.nextInt();

		System.out.println("Enter the values: ");
		int[] values=new int[length];

		for(int i=0;i<length;i++){
			values[i]=sc.nextInt();
		}


		boolean isConsecutiveFour=isConsecutiveFour(values);
		if(isConsecutiveFour==true){
			System.out.println("The list has consecutive fours");
		}else{
			System.out.println("The list does not have consecutive fours");
		}
	}



	public static boolean isConsecutiveFour(int[] values){

		for(int i=0;i<values.length-3;i++){

			if(values[i]==values[i+1] && values[i]==values[i+2] && values[i]==values[i+3]){
				return true;
			}
		}

		return false;
	}

}

