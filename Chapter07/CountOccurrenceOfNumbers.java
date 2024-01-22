//Chapter 7 - Question 3

/*
(Count occurrence of numbers) Write a program that reads the integers between 1
and 100 and counts the occurrences of each. Assume the input ends with 0.
*/

import java.util.Scanner;

public class CountOccurrenceOfNumbers{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integers between 1 and 100: ");
		String userInput = input.nextLine();

		String[] numberString=userInput.trim().split(" ");
		int length=numberString.length;
		int[] numbers=new int[length-1];

		for(int j=0;j<length-1;j++){
			numbers[j]=Integer.parseInt(numberString[j]);

		}

		
		int[] numberCount=new int[101];
		int index=0;

		for(int k=0;k<numbers.length;k++){
			index=numbers[k];
			numberCount[index]++;
		} 
		
		for(int m=1;m<=100;m++){
			if(numberCount[m]==1){
				System.out.println(m+" occurs "+numberCount[m]+" time.");
			}else if(numberCount[m]>1){
				System.out.println(m+" occurs "+numberCount[m]+" times.");
			}else{

			}
		}


	}

}





