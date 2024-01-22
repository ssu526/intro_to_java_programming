//Chapter 7 - Question 2

/*
(Reverse the numbers entered) Write a program that reads ten integers and displays
them in the reverse of the order in which they were read.
*/

import java.util.Scanner;

public class ReverseInput{

	public static void main(String[] args){

		int[] numbers = new int[10];
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 10 numbers: ");
		
		for(int j=0;j<numbers.length;j++){
			numbers[j]=input.nextInt();

		}


		for(int i=numbers.length-1;i>=0;i--){
			System.out.println(numbers[i]+" ");

		}


	}

}