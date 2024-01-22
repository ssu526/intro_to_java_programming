//Chapter 4 - Question 20

import java.util.Scanner;

public class ProcessAString{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userInput = input.nextLine();
		
		int length = userInput.length();
		char first = userInput.charAt(0);

		System.out.println("The lenght of "+userInput+" is "+length);
		System.out.println("The first character is "+first);
	}
	

}
