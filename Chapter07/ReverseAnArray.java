//Chapter 7 - Question 12

/*

(Reverse an array) The reverse method in Section 7.7 reverses an array by
copying it to a new array. Rewrite the method that reverses the array passed in
the argument and returns this array. Write a test program that prompts the user to
enter ten numbers, invokes the method to reverse the numbers, and displays the
numbers.

*/

import java.util.Scanner;

public class ReverseAnArray{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ten numbers: ");

		double[] numbers=new double[10];

		for(int i=0;i<10;i++){
			numbers[i]=sc.nextDouble();

		}


		double[] newArray=new double[10];
		newArray=reverse(numbers);


		for(int j=0;j<10;j++){
			System.out.println(newArray[j]);

		}
	}



	public static double[] reverse(double[] numbers){

		double[] reverseArray=new double[10];
		int index=9;

		for(int i=0;i<10;i++){
			reverseArray[i]=numbers[index];
			index--;

		}

		return reverseArray;

	}




}